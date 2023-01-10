package com.food.ordering.system.domain.valueobject;

public abstract class BaseId<T> {

    private final T value;

    protected BaseId(final T value) {
        this.value = value;
    }

}
