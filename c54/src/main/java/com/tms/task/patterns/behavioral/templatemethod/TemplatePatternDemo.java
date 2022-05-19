package com.tms.task.patterns.behavioral.templatemethod;

public class TemplatePatternDemo {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

        Class c = Class.forName("com.tms.task.patterns.behavioral.templatemethod.Chess");

        Game game = new Chess();
        game = (Game) c.newInstance();
        game.play();
        System.out.println();
        game = new Soccer();
        game.play();
    }
}