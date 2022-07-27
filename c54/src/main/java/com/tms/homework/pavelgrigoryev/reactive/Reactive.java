package com.tms.homework.pavelgrigoryev.reactive;

import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;

public class Reactive {
    public static void main(String[] args) throws InterruptedException {

        Flux.range(1, 5).subscribe(System.out::println);
        System.out.println();
        Flux.fromIterable(Arrays.asList(1, 2, 3)).subscribe(System.out::println);

        Flux.<String>generate(synchronousSink -> synchronousSink.next("hello"))
                .delayElements(Duration.ofMillis(500))
                .take(4)
                .subscribe(System.out::println);

        Flux<Object> telegramProducer = Flux
                .generate(
                        () -> 2354,
                        (state, sink) -> {
                            if (state > 2366) {
                                sink.complete();
                            } else {
                                sink.next("Step: " + state);
                            }
                            return state + 3;
                        }
                );

        Flux<Object> objectFlux = Flux
                .create(fluxSink -> {
                    telegramProducer.subscribe(new BaseSubscriber<>() {
                        @Override
                        protected void hookOnNext(Object value) {
                            fluxSink.next(value);
                        }

                        @Override
                        protected void hookOnComplete() {
                            fluxSink.complete();
                        }
                    });
                    fluxSink.onRequest(r -> fluxSink.next("DB returns: " + telegramProducer.blockFirst()));
                });

        objectFlux.subscribe(System.out::println);

        Flux<String> second = Flux
                .just("World", "coder")
                .repeat();

        Flux<String> sumFlux = Flux
                .just("hello", "dru", "java", "Linus", "Asia", "java")
                .zipWith(second, (f, s) -> String.format("%s %s", f, s));

        sumFlux
                .delayElements(Duration.ofMillis(1300))
                .timeout(Duration.ofSeconds(1))
                // .retry(3)
                // .onErrorReturn("Too slow")
                .onErrorResume(throwable ->
                        Flux
                                .interval(Duration.ofMillis(300))
                                .map(String::valueOf)
                )
                .skip(2)
                .take(3)
                .subscribe(System.out::println);

        Thread.sleep(5000);

        Flux<Integer> ints = Flux.range(1, 4)
                .map(i -> {
                    if (i <= 3) return i;
                    throw new RuntimeException("Got to 4");
                });
        ints.subscribe(System.out::println,
                error -> System.err.println("Error: " + error));

        Flux.interval(Duration.ofMillis(250))
                .map(input -> {
                    if (input < 3) return "tick " + input;
                    throw new RuntimeException("boom");
                })
                .retry(1)
                .elapsed()
                .subscribe(System.out::println, System.err::println);

        Thread.sleep(2100);
    }
}
