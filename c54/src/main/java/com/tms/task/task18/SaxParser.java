package com.tms.task.task18;

import org.xml.sax.AttributeList;
import org.xml.sax.HandlerBase;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SaxParser extends HandlerBase {
    private final PrintWriter out;
    private int elements;
    private int attributes;
    private int characters;
    private int ignorableWhitespace;
    private final String url;

    public SaxParser(String url_str) {
        url = url_str;
        try {
            out = new PrintWriter(new OutputStreamWriter(System.out, "koi8-r"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e); // нет вывода - нет работы!
        }
    }

    // =======================================================
// Обработка XML документа
// ========================
//public class SaxSample {
    public static void main(String[] argv) {
        try {
            SaxParser sample = new SaxParser("sample.xml");
            // так не правельно
            // Parser parser = ParserFactory.makeParser("com.ibm.xml.parsers.SAXParser");
            // parser.setDocumentHandler(sample);
            // parser.setErrorHandler(sample);
            // parser.parse(argv[0]);

            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            saxParser.parse("sample.xml", sample);
            sample.printInfo();
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    // =======================================================
    // Обработчики событий. Методы интерфейса DocumentHandler
    // ========================
    // Начало документа
    public void startDocument() {
        // Статистика
        elements = 0;
        attributes = 0;
        characters = 0;
        ignorableWhitespace = 0;
        // Процессорные инструкции
        out.println("");
    }

    // Конец документа
    public void endDocument() {
        out.flush();
    }

    // Встретился открывающий тэг элемента //
    public void startElement(String name, AttributeList attrs) {
        elements++;
        if (attrs != null) {
            attributes += attrs.getLength();
        }
        // Печать тэга элемента вместе со списком его атрибутов,
        // например,
        out.print('<');
        out.print(name);
        if (attrs != null) {
            int len = attrs.getLength();
            for (int i = 0; i < len; i++) {
                out.print(' ');
                out.print(attrs.getName(i));
                out.print("=\"");
                out.print(attrs.getValue(i));
                out.print('"');
            }
        }
        out.println('>');
    }

    // Встретился закрывающий тэг элемента
    public void endElement(String name) {
        out.println("");
    }

    // Текстовые символы
    public void characters(char[] ch, int start, int length) {
        characters += length;
        out.println(new String(ch, start, length));
    }

    // Не обрабатываемые символы(например, содержимое секции CDATA)
    public void ignorableWhitespace(char[] ch, int start, int length) {
        characters(ch, start, length);
    }

    public void processingInstruction(String target, String data) {
        out.print(" ");
        out.print(' ');
        out.print(data);
        out.print("?>");
    }

    // ===================================================
    // Методы интерфейса ErrorHandler
    // ===============================
    // Последнее предупреждение
    public void warning(SAXParseException ex) {
        System.err.println("Warning at " + ex.getLineNumber() + " . " + ex.getColumnNumber() + "  -  "
                + ex.getMessage());
    }

    // Произошла ошибка
    public void error(SAXParseException ex) {
        System.err.println("Error at {" + ex.getLineNumber() + "." + ex.getColumnNumber() + "  -  " + ex.getMessage());
    }

    // Такие ошибки исправить уже нельзя
    public void fatalError(SAXParseException ex) throws SAXException {
        System.err.println("Fatal error at {" + ex.getLineNumber() + " . " + ex.getColumnNumber() + "  -  "
                + ex.getMessage());
        throw ex;
    }

    // =======================================================
    // Вывести информацию о документе
    // ===============================
    public void printInfo() {
        System.out.println();
        System.out.println("Документ " + url + " был успешно обработан");
        System.out.println("Элементов : " + elements);
        System.out.println("Атрибутов : " + attributes);
        System.out.println("Символов  : " + characters);
    }
}