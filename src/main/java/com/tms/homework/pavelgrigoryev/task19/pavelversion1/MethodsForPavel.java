package com.tms.homework.pavelgrigoryev.task19.pavelversion1;

import jakarta.xml.bind.JAXBException;

public interface MethodsForPavel {
    void newGameOrLoading();

    void opening();

    void leftDoor();

    void rightDoor();

    void leftHand();

    void rightHand();

    void jumpIntoTheHole();

    void stayInTheRoomBehindTheRightDoor();

    void error();

    void leftDoorSaveToXml() throws JAXBException;

    void rightDoorSaveToXml() throws JAXBException;

    void loadSaveLeftDoor() throws JAXBException;

    void loadSaveRightDoor() throws JAXBException;
}
