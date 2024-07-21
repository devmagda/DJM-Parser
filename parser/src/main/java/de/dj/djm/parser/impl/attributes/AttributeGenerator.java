package de.dj.djm.parser.impl.attributes;

import de.dj.djm.parser.api.attributes.Attribute;
import de.dj.djm.parser.impl.attributes.bool.*;
import de.dj.djm.parser.impl.attributes.*;
import de.dj.djm.parser.impl.attributes.custom.Incremental;
import de.dj.djm.parser.impl.attributes.custom.Load;
import de.dj.djm.parser.impl.attributes.custom.classes.Color;
import de.dj.djm.parser.impl.attributes.custom.color.Max;
import de.dj.djm.parser.impl.attributes.custom.color.Min;
import de.dj.djm.parser.impl.attributes.custom.color.Off;
import de.dj.djm.parser.impl.attributes.custom.color.On;
import de.dj.djm.parser.impl.attributes.custom.message.Message;
import de.dj.djm.parser.impl.attributes.number.Cells;
import de.dj.djm.parser.impl.attributes.number.Channels;
import de.dj.djm.parser.impl.attributes.number.Id;
import de.dj.djm.parser.impl.attributes.number.StepsPerTurn;
import de.dj.djm.parser.impl.attributes.text.*;

import static de.dj.djm.parser.api.attributes.Attributes.*;

import static de.dj.djm.parser.libs.CharPool.EQUALS;
import static de.dj.djm.parser.libs.CharPool.QUOTES;

public class AttributeGenerator {
    public static Attribute getAttributeFromString(String attribute) {
        String[] values = attribute.split(EQUALS + "");
        String name = "";
        String value = "";

        try {
            name = values[0];
            value = values[1].replace(QUOTES + "", "");
        } catch (Exception e) {
            System.out.println("");
        }

        if(CUE_2_MIX.equals(name)) return new Cue2Mix(Boolean.valueOf(value));
        if(FX.equals(name)) return new Fx(Boolean.valueOf(value));
        if(GAIN.equals(name)) return new Gain(Boolean.valueOf(value));
        if(HAS_MOTOR_JOG.equals(name)) return new HasMotorJog(Boolean.valueOf(value));
        if(HEADPHONES.equals(name)) return new Headphones(Boolean.valueOf(value));
        if(MASTER.equals(name)) return new Master(Boolean.valueOf(value));
        if(MIXER.equals(name)) return new Mixer(Boolean.valueOf(value));
        if(REC.equals(name)) return new Rec(Boolean.valueOf(value));
        if(VOLUME.equals(name)) return new Volume(Boolean.valueOf(value));
        if(MAX.equals(name)) return new Max(new Color(value));
        if(MIN.equals(name)) return new Min(new Color(value));
        if(OFF.equals(name)) return new Off(new Color(value));
        if(ON.equals(name)) return new On(new Color(value));
        if(MESSAGE.equals(name)) return new Message(value);
        if(INCREMENTAL.equals(name)) return new Incremental(Boolean.valueOf(value));
        if(LOAD.equals(name)) return new Load();
        if(CELLS.equals(name)) return new Cells(Integer.valueOf(value));
        if(CHANNELS.equals(name)) return new Channels(Integer.valueOf(value));
        if(ID.equals(name)) return new Id(Integer.valueOf(value));
        if(STEPS_PER_TURN.equals(name)) return new StepsPerTurn(Integer.valueOf(value));
        if(ACTION.equals(name)) return new Action(value);
        if(DESCRIPTION.equals(name)) return new Description(value);
        if(HW_IN_MIX_OFF.equals(name)) return new HwInMixOff(value);
        if(HW_IN_MIX_ON.equals(name)) return new HwInMixOn(value);
        if(MAP_NAME.equals(name)) return new MapName(value);
        if(MODE.equals(name)) return new Mode(value);
        if(NAME.equals(name)) return new Name(value);
        if(SYSEX.equals(name)) return new Sysex(value);
        if(TYPE.equals(name)) return new Type(value);
        if(URL.equals(name)) return new Url(value);
        if(VERSION.equals(name)) return new Version(value);

        throw new RuntimeException("Could not determine attribute: " + attribute);
    }
}