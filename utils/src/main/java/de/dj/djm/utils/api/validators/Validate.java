package de.dj.djm.utils.api.validators;

import de.dj.djm.utils.exceptions.ValidationException;

public interface Validate<T> {
    public void validate(T t) throws ValidationException;
}
