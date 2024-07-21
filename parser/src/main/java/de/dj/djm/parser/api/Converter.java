package de.dj.djm.parser.api;

public interface Converter<From, To> {
    To convert(From from);
}
