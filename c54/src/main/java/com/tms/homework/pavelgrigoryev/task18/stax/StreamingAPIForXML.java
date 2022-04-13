package com.tms.homework.pavelgrigoryev.task18.stax;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StreamingAPIForXML {
    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        XMLInputFactory factory2 = XMLInputFactory.newInstance();
        XMLStreamReader reader = factory2.createXMLStreamReader(new FileInputStream("xml//employees.xml"));
        while (reader.hasNext()) {
            int event = reader.next();
            if (event == XMLStreamConstants.START_ELEMENT) {
                System.out.println(reader.getLocalName());
            }
            if (event == XMLStreamConstants.CHARACTERS) {
                System.out.print(reader.isCharacters() + ", ");
            }
            if (event == XMLStreamConstants.END_ELEMENT) {
                System.out.println(reader.getLocation());
            }
        }
    }
}
