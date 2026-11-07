package com.epam.mjc;

import java.util.List;

@FunctionalInterface
public interface Operation<T> {

    T apply(T arg);
}
