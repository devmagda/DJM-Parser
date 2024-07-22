/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package de.dj.djm.app;

import de.dj.djm.parser.Parser;
import de.dj.djm.parser.api.elements.Element;
import de.dj.djm.parser.data.Examples;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class App {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, URISyntaxException {
        ClassLoader classLoader = App.class.getClassLoader();
        Parser djmParser = new Parser();
        Element document = djmParser.parse(classLoader.getResourceAsStream("hercules_420_custom.djm"));

        String text = document.getText();
        System.out.println(text);
    }
}
