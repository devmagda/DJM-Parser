package de.dj.djm.parser.impl.attributes.number;

import de.dj.djm.parser.api.attributes.custom.NumberAttribute;
import de.dj.djm.parser.impl.attributes.custom.classes.Number;

import static de.dj.djm.parser.api.attributes.Attributes.CELLS;

public class Cells extends NumberAttribute {
    public Cells(int number) {
        this(CELLS, new Number(number));
    }
    protected Cells(String attributeName, Number attributeValue) {
        super(attributeName, attributeValue);
    }
}
