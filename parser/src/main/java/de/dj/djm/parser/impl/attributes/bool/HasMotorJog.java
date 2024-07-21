package de.dj.djm.parser.impl.attributes.bool;

import de.dj.djm.parser.api.attributes.custom.BoolAttribute;
import de.dj.djm.parser.impl.attributes.custom.classes.Bool;

import static de.dj.djm.parser.api.attributes.Attributes.HAS_MOTOR_JOG;

public class HasMotorJog extends BoolAttribute {
    public HasMotorJog(boolean value) {
        this(HAS_MOTOR_JOG, new Bool(value));
    }
    protected HasMotorJog(String attributeName, Bool attributeValue) {
        super(attributeName, attributeValue);
    }
}
