package com.tms.homework.nikitaelenski.mytodo;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class MyToDoList{
    String myfile = "c54\\src\\main\\java\\com\\tms\\homework\\nikitaelenski\\mytodo\\ my-business.txt";

    void creat() {
            try {
                List<String> list = new ArrayList<>(Files.readAllLines(Paths.get(myfile)));
                Scanner scanner = new Scanner(System.in);
                System.out.println("Что вы хотите сделать " +
                        "\n 1 создать новое задание " +
                        "\n 2 Пометить как сделанное " +
                        "\n 3 Отменить не сделанное   " +
                        "\n 4 распечать все задания  " +
                        "\n 5 выход ");
                if (scanner.hasNextInt()) {
                    switch (scanner.nextInt()) {
                        case 1 -> {
                            AddList(list);
                            AddMyTxt(list);
                            list.forEach(System.out::println);
                        }
                        case 2 -> {
                            CompletedTasks(list, myfile);
                        }
                        case 3 -> {
                            CancelExecution(list, myfile);
                        }
                        case 4 -> {
                            FilePrint(list, myfile);
                        }
                        case 5 -> {
                            System.exit(0);
                        }
                    }
                }else {
                    System.err.println("Ошибка попробуйте цифровое значение");
                }

            } catch (IOException e) {
                System.out.println("ошибка");
            }
        }

    private static void AddList(List<String> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите задание");
        String s = scanner.nextLine();
        list.add(s);
    }

    private void AddMyTxt(List<String> list) {
        Path file = Path.of(myfile);
        String lastElement = list.get(list.size() - 1);
        try {
            Files.write(file, (list.size() + "-" + lastElement + "\n").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void FilePrint(List<String> list,String myfile){
        try (FileReader fileReader = new FileReader(myfile)) {
            int c;
            while ((c = fileReader.read()) != -1) {
                System.out.print((char) c);
            }
            } catch(IOException e){
                throw new RuntimeException(e);
            }
    }
    private void CompletedTasks(List<String> list , String myfile){
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите из списка что вы хотите удалить цыфрой от 1 до " + list.size());
        int in = scan.nextInt();
        if (list.get(in-1).contains(" Complited")) {
            list.set(in - 1, list.get(in - 1));
        }else{
            list.set(in - 1, list.get(in - 1) + " Complited");
        }
        AppDateFIle(list, myfile);


            }
    private void AppDateFIle(List<String> list , String myfile){
        try {
            new FileOutputStream(myfile)
                .close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        list.forEach(v-> {
        try {
            Files.write(Path.of(myfile), (v + "\n").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
            }
        });
    }
    private void CancelExecution(List<String> list , String myfile) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите из списка что вы хотите отменить цыфрой от 1 до " + list.size());
        int in = scan.nextInt();
        if (list.get(in-1).contains(" Complited")) {
            list.set(in - 1, list.get(in - 1).replaceAll(" Complited" , ""));
        }else{
            list.set(in - 1, list.get(in - 1));
        }
        AppDateFIle(list, myfile);
    }
}

