package com.tms.homework.max.polevoy.task7;

import com.tms.homework.max.polevoy.task7.sport.Sport;

public interface Football extends Sport, TVProgram {
    void homeTeamScored(int points);

    void visitingTeamScored(int points);

    void endOfQuarter(int quarter);
}
