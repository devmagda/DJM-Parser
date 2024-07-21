package de.dj.djm.parser.impl.attributes.number;

import de.dj.djm.parser.api.attributes.custom.NumberAttribute;
import de.dj.djm.parser.impl.attributes.custom.classes.Number;

import static de.dj.djm.parser.api.attributes.Attributes.STEPS_PER_TURN;

public class StepsPerTurn extends NumberAttribute {
    public StepsPerTurn(int number) {
        this(STEPS_PER_TURN, new Number(number));
    }
    protected StepsPerTurn(String attributeName, Number attributeValue) {
        super(attributeName, attributeValue);
    }
}
