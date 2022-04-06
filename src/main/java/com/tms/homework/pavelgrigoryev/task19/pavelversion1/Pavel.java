package com.tms.homework.pavelgrigoryev.task19.pavelversion1;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.util.Scanner;

public class Pavel extends TextForPavel implements MethodsForPavel {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Pavel PAVEL = new Pavel();

    public static void main(String[] args) throws InterruptedException {
        PAVEL.newGameOrLoading();
    }

    public void newGameOrLoading() {
        textForLoading();
        while (SCANNER.hasNextInt()) {
            int loading = SCANNER.nextInt();
            if (loading == 1) {
                opening();
                break;
            } else if (loading == 2) {
                try {
                    loadSaveLeftDoor();
                    leftDoor();
                    break;
                } catch (JAXBException e) {
                    e.printStackTrace();
                }
            } else if (loading == 3) {
                try {
                    loadSaveRightDoor();
                    rightDoor();
                    break;
                } catch (JAXBException e) {
                    e.printStackTrace();
                }
            } else {
                error();
            }
        }
    }

    public void opening() {
        textForOpening();
        while (SCANNER.hasNextInt()) {
            int openingChoice = SCANNER.nextInt();
            if (openingChoice == 1) {
                System.out.println("Павел выбрал левую дверь\n");
                leftDoor();
                break;
            } else if (openingChoice == 2) {
                System.out.println("Павел выбрал правую дверь\n");
                rightDoor();
                break;
            } else {
                error();
            }
        }
    }

    public void leftDoor() {
        textForLeftDoor();
        while (SCANNER.hasNextInt()) {
            int leftDoorChoice = SCANNER.nextInt();
            if (leftDoorChoice == 1) {
                System.out.println("Павел выбрал левую руку\n");
                leftHand();
                break;
            } else if (leftDoorChoice == 2) {
                System.out.println("Павел выбрал правую руку\n");
                rightHand();
                break;
            } else if (leftDoorChoice == 3) {
                try {
                    leftDoorSaveToXml();
                } catch (JAXBException e) {
                    e.printStackTrace();
                }
            } else {
                error();
            }
        }
    }

    public void rightDoor() {
        textForRightDoor();
        while (SCANNER.hasNextInt()) {
            int rightDoorChoice = SCANNER.nextInt();
            if (rightDoorChoice == 1) {
                System.out.println("Павел выбрал прыгнуть в яму...\n");
                jumpIntoTheHole();
                break;
            } else if (rightDoorChoice == 2) {
                System.out.println("Павел выбрал остаться в комнате...\n");
                stayInTheRoomBehindTheRightDoor();
                break;
            } else if (rightDoorChoice == 3) {
                try {
                    rightDoorSaveToXml();
                } catch (JAXBException e) {
                    e.printStackTrace();
                }
            } else {
                error();
            }
        }
    }

    public void leftHand() {
        textForLeftHand();
        fin();
    }

    public void rightHand() {
        textForRightHand();
        fin();
    }

    public void jumpIntoTheHole() {
        textForJumpIntoTheHole();
        fin();
    }

    public void stayInTheRoomBehindTheRightDoor() {
        textForStayInTheRoomBehindTheRightDoor();
        fin();
    }

    public void error() {
        System.err.println("Вы ввели за Павла совсем не то что вас просили !!!");
    }

    public void leftDoorSaveToXml() throws JAXBException {
        System.out.println("Сохраняемся...\n");
        String filePath = "xml//saveLeftDoorPavel.xml";
        StaminaOfPavel staminaOfPavel = new StaminaOfPavel();
        staminaOfPavel.setName("LeftDoorStamina");
        staminaOfPavel.setStamina(75);
        JAXBContext context = JAXBContext.newInstance(StaminaOfPavel.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(staminaOfPavel, new File(filePath));
    }

    public void rightDoorSaveToXml() throws JAXBException {
        System.out.println("Сохраняемся...\n");

        String filePath = "xml//saveRightDoorPavel.xml";
        StaminaOfPavel staminaOfPavel = new StaminaOfPavel();
        staminaOfPavel.setName("RightDoorStamina");
        staminaOfPavel.setStamina(80);

        JAXBContext context = JAXBContext.newInstance(StaminaOfPavel.class);
        Marshaller marshaller = context.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(staminaOfPavel, new File(filePath));
    }

    public void loadSaveLeftDoor() throws JAXBException {
        System.out.println("Загружаемся ...\n");
        File file = new File("xml//saveLeftDoorPavel.xml");
        JAXBContext context = JAXBContext.newInstance(StaminaOfPavel.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        StaminaOfPavel staminaOfPavel = (StaminaOfPavel) unmarshaller.unmarshal(file);
        System.out.println(staminaOfPavel + "\n");
    }

    public void loadSaveRightDoor() throws JAXBException {
        System.out.println("Загружаемся ...\n");
        File file = new File("xml//saveRightDoorPavel.xml");
        JAXBContext context = JAXBContext.newInstance(StaminaOfPavel.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        StaminaOfPavel staminaOfPavel = (StaminaOfPavel) unmarshaller.unmarshal(file);
        System.out.println(staminaOfPavel + "\n");
    }
}
