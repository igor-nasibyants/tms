package com.tms.homework.maria.varabyova.task2;

import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        double rateUSD = 78;
        double rateEUR = 85;
        double rateJPY = 0.74;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD \uFFFD\uFFFD\uFFFD\uFFFD\uFFFD \uFFFD \uFFFD\uFFFD\uFFFD \uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD \uFFFD\uFFFD \uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD?");
        double moneyBeforeSalary = scanner.nextDouble();

        System.out.println("������� ���� �� ��������?");
        int daysBeforeSalary = scanner.nextInt();

        System.out.println("������� �������. ��������� �������: convert � advice.");
        String command = scanner.next();

        if (command.equals("convert")) {

            System.out.println("� ����� ������ ������ �������������� �����? ��������� ��������: USD, EUR, JPY.");
            String currency = scanner.next(); // �������� ��� �������� � ������� scanner
            if (currency.equals("USD")) {
                System.out.println("���� ���������� � ��������: " + moneyBeforeSalary / rateUSD);
            } else if (currency.equals("EUR")) {
                System.out.println("���� ���������� � ����: " + moneyBeforeSalary / rateEUR);
            } else if (currency.equals("JPY")) {
                System.out.println("���� ���������� � �����: " + moneyBeforeSalary / rateJPY);
            } else {
                System.out.println("������ �� ��������������.");
            }

        } else if (command.equals("advice")) {
            if (moneyBeforeSalary < 3000) {
                System.out.println("������� ����� ������ ����. ���������, � �� �������� �� ��������!");
            } else if (moneyBeforeSalary < 10000) {
                if (daysBeforeSalary < 10) {
                    System.out.println("����, ���� � ������!");
                } else {
                    System.out.println("������� ����� ������ ����. ���������, � �� �������� �� ��������!");
                }
            } else if (moneyBeforeSalary < 30000) {
                if (daysBeforeSalary < 10) {
                    System.out.println("�������! ��������� �������� � ������� ��������� � �������� �����. :)");
                } else {
                    System.out.println("����, ���� � ������!");
                }
            } else {
                if (daysBeforeSalary < 10) {
                    System.out.println("�������! ����������� ������!");
                } else {
                    System.out.println("�������! ��������� �������� � ������� ��������� � �������� �����. :)");
                }
            }
        } else {
            System.out.println("��������, ����� ������� ���� ���.");
        }
    }
}
