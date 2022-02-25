package com.tms.homework.han.task10.task4;

public class Main extends TextFormatter {
    public static void main(String[] args) {
        String stringBuilder = "Lorem Ipsum is simply. Dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum. has been the. asd asdf a. It has survived not " +
                "only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " +
                "It was popularised. In the 1960s with. the release of pop Letraset sheets containing Lorem Ipsum passages, " +
                "and more recently with desktop publishing software like Aldus PageMaker including versions of. Lorem Ipsum.".toLowerCase();
        System.out.println(filterString(stringBuilder));
    }
}
