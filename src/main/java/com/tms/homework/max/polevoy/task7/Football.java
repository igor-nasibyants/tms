package com.tms.homework.max.polevoy.task7;

public interface Football extends Sport, TVProgram {
    void homeTeamScored(int points);

    void visitingTeamScored(int points);

    void endOfQuarter(int quarter);
}
