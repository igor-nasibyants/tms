package com.tms.homework.pavelgrigoryev.task18.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.IOException;

public class SimpleAPIForXML {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, XMLStreamException {
        DefaultHandler handler = new DefaultHandler() {
            @Override
            public void startElement(String uri, String localName, String qName, Attributes attributes) {
                String name = attributes.getValue("id");
                if (name != null && !name.isEmpty()) {
                    System.out.println(name);
                }
            }

            @Override
            public void characters(char[] ch, int start, int length) {
                StringBuilder str = new StringBuilder();
                for (int i = 0; i < length; i++) {
                    str.append(ch[start + i]);
                }
                System.out.print(str);
            }
        };

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        parser.parse(new File("xml//employees.xml"), handler);
    }
}
