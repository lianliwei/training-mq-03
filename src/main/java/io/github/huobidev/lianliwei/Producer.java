package io.github.huobidev.lianliwei;

@FunctionalInterface
public interface Producer<T> {
    void produce(T t);
}
