package de.dj.djm.parser.api.reader;

import de.dj.djm.parser.Parser;

import static de.dj.djm.parser.libs.StringPool.*;

public class Line {
    private final String _line;

    public String getLine() {
        return _line;
    }

    public Line(String line) throws IllegalArgumentException {
        if("".equals(line)) throw new IllegalArgumentException("Line must not be empty ..");
        if(line == null) throw new RuntimeException("Line must not be null ..");
        line = line.trim();
        this._line = line;
    }

    public boolean isDocType() {
        return _line.contains(DOC_TYPE);
    }

    public boolean isSelfClosing() {
        return _line.contains(TAG_CLOSE_END);
    }

    public boolean isInner() {
        return !_line.startsWith(TAG_OPEN);
    }

    public boolean isParentStart() {
        return
                !_line.contains(TAG_CLOSE_START) &&
                !_line.contains(TAG_CLOSE_END) &&
                 _line.contains(TAG_OPEN) &&
                 _line.contains(TAG_CLOSE_SINGLE);
    }

    public boolean isParentEnd() {
        return
                _line.contains(TAG_CLOSE_START) &&
                _line.contains(TAG_CLOSE_SINGLE);
    }

    @Override
    public String toString() {
        String format = "isInner? %s | isDocType? %s | isSelfClosing? %s | %s";
        return String.format(format, isInner(), isDocType(), isSelfClosing(), _line);
    }

    public Parser.ParsingResult classify() {
        if(isDocType())     return Parser.ParsingResult.docType;
        if(isParentStart()) return Parser.ParsingResult.parentStart;
        if(isParentEnd())   return Parser.ParsingResult.parentEnd;
        if(isSelfClosing()) return Parser.ParsingResult.selfClosing;
        if(isInner())       return Parser.ParsingResult.inner;

        throw new RuntimeException("Could not classify Line: " + _line);
    }
}
