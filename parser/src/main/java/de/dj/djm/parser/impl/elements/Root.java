package de.dj.djm.parser.impl.elements;

import de.dj.djm.parser.api.elements.Element;
import de.dj.djm.parser.api.elements.ElementBase;

import java.util.ArrayList;
import java.util.stream.Collectors;

import static de.dj.djm.parser.libs.StringPool.DOCUMENT_ROOT;

public class Root extends ElementBase {
    public Root() {
        super(DOCUMENT_ROOT, new ArrayList<>());
    }

    @Override
    public boolean isSelfClosing() {
        return true;
    }

    @Override
    public String getText() {
        return getChildren().stream().map(child -> child.getText()).collect(Collectors.joining("\n"));
    }

    @Override
    public String format() {
        return getChildren().stream()
                .map(Element::format)
                .collect(Collectors.joining("\n"));
    }
}
