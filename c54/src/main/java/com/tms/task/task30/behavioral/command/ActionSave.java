package com.tms.task.task30.behavioral.command;

public class ActionSave implements ActionListenerCommand {

    private Document doc;

    public ActionSave(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.save();
    }

}
