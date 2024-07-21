package de.dj.djm.parser.impl.attributes.custom.classes;

import de.dj.djm.parser.api.Formattable;
import de.dj.djm.parser.libs.StringPool;

public class Message implements Formattable {

    private final Number _instruction;
    private final Number _device;

    public Message(Number instruction, Number device) {
        _instruction = instruction;
        _device = device;
    }

    public Message(String value) {
        String[] values = value.split(" ");
        if(values.length != 3) {
            throw new RuntimeException("Invalid value for Message: " + value);
        }
        _instruction = Number.fromHex(values[0]);
        _device = Number.fromHex(values[1]);
    }

    @Override
    public String format() {
        return _device.getHex() + " " + _instruction.getHex() + " " + StringPool.VALUE;
    }
}
