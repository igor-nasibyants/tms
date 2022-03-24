package com.tms.task.task18;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;

public class Main {

    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); //создали фабрику строителей, сложный и грамосткий процесс (по реже выполняйте это действие)
        // f.setValidating(false); // не делать проверку валидации
        DocumentBuilder db = dbf.newDocumentBuilder(); // создали конкретного строителя документа
        Document doc = db.parse(new File("sample.xml")); // стооитель построил документ
        //Document - тоже является нодом, и импленментирует методы
        visit(doc, 0);
    }

    public static void visit(Node node, int level) {
        NodeList list = node.getChildNodes();
        for (int i = 0; i < list.getLength(); i++) {
            Node childNode = list.item(i); // текущий нод
            process(childNode, level + 1); // обработка
            visit(childNode, level + 1); // рекурсия
        }
    }

    public static void process(Node node, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print('\t');
        }
        System.out.print(node.getNodeName());
        if (node instanceof Element) {
            Element e = (Element) node;
            // работаем как с элементом (у него есть атрибуты и схема)
        }
        System.out.println();
    }

    // Создание документа
//    public static void main(String[] argv) throws Exception {
//        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder builder = factory.newDocumentBuilder();
//        DOMImplementation impl = builder.getDOMImplementation(); // более сложный, но и более гибкий способ создания документов
//        Document doc = impl.createDocument(null, // namespaceURI
//                null, // qualifiedName
//                null); // doctype
//        Element e1 = doc.createElement("api");
//        doc.appendChild(e1);
//        Element e2 = doc.createElement("java");
//        e2.setAttribute("url", "http://www.quizful.net");
//        e1.appendChild(e2);
//    }
}