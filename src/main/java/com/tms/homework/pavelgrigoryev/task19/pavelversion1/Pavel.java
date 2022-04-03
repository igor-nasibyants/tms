package com.tms.homework.pavelgrigoryev.task19.pavelversion1;

import java.util.Scanner;

public class Pavel extends TextForPavel implements MethodsForPavel {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Pavel PAVEL = new Pavel();

    public static void main(String[] args) throws InterruptedException {
        PAVEL.opening();
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

}
