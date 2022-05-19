package com.tms.task.patterns.behavioral.command;

public class ActionSave implements ActionListenerCommand {

    private final Document doc;

    public ActionSave(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.save();
    }

}
