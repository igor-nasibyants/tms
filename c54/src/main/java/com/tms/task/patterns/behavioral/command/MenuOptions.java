package com.tms.task.patterns.behavioral.command;

public class MenuOptions {

    private final ActionListenerCommand openCommand;
    private final ActionListenerCommand saveCommand;

    public MenuOptions(ActionListenerCommand open, ActionListenerCommand save) {
        this.openCommand = open;
        this.saveCommand = save;
    }

    public void clickOpen() {
        openCommand.execute();
    }

    public void clickSave() {
        saveCommand.execute();
    }


}
