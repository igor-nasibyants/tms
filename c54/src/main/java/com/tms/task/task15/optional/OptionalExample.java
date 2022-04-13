package com.tms.task.task15.optional;

import com.tms.task.task15.streamex.Role;
import com.tms.task.task15.streamex.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalExample {

    private static final Map<String, User> repository = new HashMap<>(){{
       put("1", new User(null, "Igor"));
       put("2", new User(null,"Mike"));
       put("3", new User(null,"Julia"));
    }};

    public static void main(String[] args) {
        Optional<Object> o = Optional.ofNullable(null);
        Optional<Object> empty = Optional.empty();
        Optional.of(new User(new Role("admin", Boolean.TRUE), "Igor"));

        Optional.ofNullable(repository.get("4")).ifPresent(createLog());
        Optional.of(repository.get("4")).ifPresent(createLog());
        Optional.of(repository.get("2")).ifPresent(createLog());

        Boolean present = Optional.ofNullable(repository.get("4")).isPresent();

        Optional<User> optionalUser = Optional.ofNullable(repository.get("4"));
        User user = optionalUser.isPresent() ? optionalUser.get() : new User(null, "");

        User user1 = Optional.ofNullable(repository.get("4")).orElse(new User(null, ""));
        User user2 = Optional.of(repository.get("4")).orElseThrow(() -> new RuntimeException("user with id 4 is not found"));
    }

    private static Consumer<? super User> createLog() {
        System.out.println("create log method invoked");
        return null;
    }
}
