package com.tms.homework.han.task10.task4;

public class Main extends TextFormatter {
    public static void main(String[] args) {
        String string = "Lorem Ipsum is simply. Dummy text a of the printing and typesetting industry. " +
                "Lorem Ipsum. Has been the. Asd asdf a It has survived not " +
                "only five centuries, but also the aa leap into electronic typesetting, remaining essentially " +
                "unchanged. " +
                "It was popularised. In the 1960s with. the release of. Pop Letraset sheets containing Lorem Ipsum. " +
                "Passages, " +
                ("and more recently with desktop publishing software like Aldus PageMaker including mom versions of. " +
                        "Lorem Ipsum.").toLowerCase();
        System.out.println(getNumberLines(string));
    }
}
