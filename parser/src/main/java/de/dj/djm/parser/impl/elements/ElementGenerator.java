package de.dj.djm.parser.impl.elements;

import de.dj.djm.parser.api.attributes.Attribute;
import de.dj.djm.parser.api.elements.Element;
import de.dj.djm.parser.impl.attributes.bool.*;
import de.dj.djm.parser.impl.attributes.custom.Incremental;
import de.dj.djm.parser.impl.attributes.custom.Load;
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
import static de.dj.djm.parser.api.elements.Elements.*;
import static de.dj.djm.parser.libs.CharPool.EQUALS;
import static de.dj.djm.parser.libs.CharPool.QUOTES;

public class ElementGenerator {
    public static Element getElementFromString(String attribute) {
        if(attribute.contains(MIDI_DEVICE)) return new MidiDevice();
        if(attribute.contains(MIDI_MAP)) return new MidiMap();
        if(attribute.contains(MIDI)) return new Midi();
        if(attribute.contains(MAP)) return new Map();
        if(attribute.contains(HELP_URL)) return new HelpUrl();
        if(attribute.contains(DECKS)) return new Decks();
        if(attribute.contains(DECK)) return new Deck();
        // No doctype, we filter it out earlier for better error handling
        if(attribute.contains(LSBIT_INPUT)) return new LsbInput();
        if(attribute.contains(INPUT)) return new Input();
        if(attribute.contains(ONEXIT)) return new Onexit();
        if(attribute.contains(ONSTART)) return new Onstart();
        if(attribute.contains(OUTPUT)) return new Output();
        if(attribute.contains(PICTURE)) return new Picture();
        if(attribute.contains(SOUNDCARD)) return new Soundcard();
        if(attribute.contains(COLORS_LIST)) return new ColorsList();
        if(attribute.contains(COLOR)) return new Color();
        if(attribute.contains(CONTROL)) return new Control();
        throw new RuntimeException("Could not determine element: " + attribute);
    }
}