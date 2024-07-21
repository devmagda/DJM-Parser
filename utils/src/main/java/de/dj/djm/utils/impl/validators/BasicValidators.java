package de.dj.djm.utils.impl.validators;

import de.dj.djm.utils.exceptions.ValidationException;

public class BasicValidators {
    public static void notNull(Object object) throws ValidationException {
        if(object == null) {
            throw new ValidationException("Object");
        }
    }
}
