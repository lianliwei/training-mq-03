package io.github.huobidev.lianliwei;

import java.util.List;

@FunctionalInterface
public interface Consumer<T> {
    List<T> consume();
}
