package com.tms.homework.nikitaelenski.task18;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        ObjectMapper obj = new ObjectMapper();

        ArrayList<AngryBirds> angryBirdsList = new ArrayList<>();
        ArrayList<BossPig> bossPigList = new ArrayList<>();
        ArrayList<AngryBirds> angry = new ArrayList<>();
        ArrayList<BossPig> boss = new ArrayList<>();

        Random rand = new Random();

        angryBirdsList.add(new AngryBirds("Ред", "Боевой клич", new String[]{"Пират", "Космонавт", "Фуражка"}, 100));
        angryBirdsList.add(new AngryBirds("Блюз", "Возможность, утраиваться", new String[]{"Пират", "Космонавт", "Фуражка"}, 399));
        angryBirdsList.add(new AngryBirds("Чак", "Лучше всего против дерева, и получает дополнительное ускорение при нажатии экрана", new String[]{"Пират", "Космонавт", "Фуражка"}, 300));
        angryBirdsList.add(new AngryBirds("Матильда", "Бросает яичную бомбу и запускает себя", new String[]{"Пират", "Космонавт", "Фуражка"}, 125));
        angryBirdsList.add(new AngryBirds("Серебрянка", "Хорошо разрушает камень, а при постукивании образует петлю", new String[]{"Пират", "Космонавт", "Фуражка"}, 178));
        angryBirdsList.add(new AngryBirds("Бомба", "Взрывается, когда Вы нажимаете экран или контактируете с чем-то другим", new String[]{"Пират", "Космонавт", "Фуражка"}, 200));
        angryBirdsList.add(new AngryBirds("Теренс", "Он большой, плохой, смелый", new String[]{"Пират", "Космонавт", "Фуражка"}, 500));

        bossPigList.add(new BossPig("Жора", "Мечь", 600));
        bossPigList.add(new BossPig("Света", "Копье", 256));
        bossPigList.add(new BossPig("Влад", "Щит", 256));
        bossPigList.add(new BossPig("Якут", "Ничего", 10));


        angry.add(angryBirdsList.get(rand.nextInt(angryBirdsList.size())));
        boss.add(bossPigList.get(rand.nextInt(bossPigList.size())));

        String result = obj.writerWithDefaultPrettyPrinter().writeValueAsString(angry);
        String pigBoses = obj.writerWithDefaultPrettyPrinter().writeValueAsString(boss);


        System.out.printf("Птичка %s бьет с силой %s Cвинку %s c силой %s", angry.get(0).getBirdName(), angry.get(0).getPower(), boss.get(0).getPigName(), boss.get(0).getPower());
        System.out.println(" ");
        if (boss.get(0).getPower() < angry.get(0).getPower()) {
            System.out.println("Птичка победила");
            System.out.println(result);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream("json//WhoHasWon.json");
                fileOutputStream.write(result.getBytes(StandardCharsets.UTF_8));
                fileOutputStream.close();
            } catch (IOException x) {
                System.out.println("Ошибочка");
            }
        } else {
            System.out.println("Свинка птичка");
            System.out.println(pigBoses);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream("json//WhoHasWon.json");
                fileOutputStream.write(pigBoses.getBytes(StandardCharsets.UTF_8));
                fileOutputStream.close();
            } catch (IOException x) {
                System.out.println("Ошибочка");
            }

        }
        ArrayList<Object> win = obj.readValue(new File("json//WhoHasWon.json"), new TypeReference<ArrayList<Object>>() {
        });
        win.stream().forEach(x -> System.out.print(x));

    }
}
