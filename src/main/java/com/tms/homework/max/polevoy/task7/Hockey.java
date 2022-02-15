package com.tms.homework.max.polevoy.task7;

public interface Hockey extends Sport {
    void homeGoalScored();

    void visitingGoalScored();

    void endOfPeriod(int period);

    void overtimePeriod(int ot);
}