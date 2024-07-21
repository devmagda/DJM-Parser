package de.dj.djm.parser.impl.elements;

import de.dj.djm.parser.api.attributes.Attribute;
import de.dj.djm.parser.api.elements.ElementBase;
import de.dj.djm.parser.api.elements.Elements;
import de.dj.djm.parser.impl.attributes.text.Url;

import java.util.List;

import static de.dj.djm.parser.api.elements.Elements.HELP_URL;

public class HelpUrl extends ElementBase<HelpUrl> {
    public HelpUrl() {
        super(HELP_URL);
    }

    @Override
    public boolean isSelfClosing() {
        return true;
    }
}
