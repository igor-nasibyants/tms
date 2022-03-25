# ФУНКЦИОНАЛЬНЫЕ ИНТЕРФЕЙСЫ

---

Predicate<T> проверяет соблюдение некоторого условия. Если оно соблюдается, то возвращается значение true.
В качестве параметра лямбда-выражение принимает объект типа T:

public interface Predicate<T> {
boolean test(T t);
}


BinaryOperator<T> принимает в качестве параметра два объекта типа T, выполняет над ними бинарную операцию
и возвращает ее результат также в виде объекта типа T:

public interface BinaryOperator<T> {
T apply(T t1, T t2);
}


UnaryOperator<T> принимает в качестве параметра объект типа T, выполняет над ними операции и возвращает
результат операций в виде объекта типа T:

public interface UnaryOperator<T> {
T apply(T t);
}


Function<T,R> представляет функцию перехода от объекта типа T к объекту типа R:

public interface Function<T, R> {
R apply(T t);
}


Consumer<T> выполняет некоторое действие над объектом типа T, при этом ничего не возвращая:

public interface Consumer<T> {
void accept(T t);
}


Supplier<T> не принимает никаких аргументов, но должен возвращать объект типа T:

public interface Supplier<T> {
T get();
}

