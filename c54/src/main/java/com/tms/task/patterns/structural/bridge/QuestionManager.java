package com.tms.task.patterns.structural.bridge;

public class QuestionManager {

    public String catalog;
    protected Question q;

    public QuestionManager(String catalog) {
        this.catalog = catalog;
    }

    public void next() {
        q.nextQuestion();
    }

    public void previous() {
        q.previousQuestion();
    }

    public void newOne(String quest) {
        q.newQuestion(quest);
    }

    public void delete(String quest) {
        q.deleteQuestion(quest);
    }

    public void display() {
        q.displayQuestion();
    }

    public void displayAll() {
        System.out.println("Question Paper: " + catalog);
        q.displayAllQuestions();
    }


}
