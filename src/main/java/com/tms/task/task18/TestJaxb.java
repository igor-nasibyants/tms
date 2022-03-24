package com.tms.task.task18;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import javax.xml.transform.Result;
import java.io.StringReader;

public class TestJaxb {
    private static String TEST_XML="<?xml version = \"1.0\" ?>" +
            "<result xmlns=\"http://foobar.com\">" +
            "<code>NOK</code>" +
            "<description>abc</description></result>";

    public static void main(String[] args) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance("com.tms.task.task17");
        Unmarshaller unmarshaller = jc.createUnmarshaller();

        Result result = (Result)
                unmarshaller.unmarshal(new StringReader(TEST_XML));

        System.out.println(result);
    }
}