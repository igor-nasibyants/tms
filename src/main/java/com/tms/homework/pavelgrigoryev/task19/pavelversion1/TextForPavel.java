package com.tms.homework.pavelgrigoryev.task19.pavelversion1;

import java.util.stream.Stream;

public class TextForPavel {
    public static void textForOpening() {
        Stream.of("\nЭта история о человеке по имени Павел!\n",
                        "Он работал в одной компании, занимающей огромное здание.\n",
                        "Каждый день он совершал одни те же действия," +
                                "как по циклу прописанным кем то.\n",
                        "Но вдруг случилось не что примечательное, что изменило его навсегда!\n",
                        "Там на выходе, вместо одной двери, было две!\n",
                        "Какую дверь он выбрал ?\n",
                        "Введите int:\n \"1\" - левая дверь.\n \"2\" - правая дверь.\n")
                .forEach(x -> {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        System.out.println(x);
                    }
                });
    }

    public static void textForLeftDoor() {
        Stream.of("За левой дверью была комната, в которой стоял человек державший за спиной свои руки ...\n",
                        "Он сжимал, не что странное в каждой руке\n",
                        "Он предложил Павлу выбрать руку! Введите int:\n \"1\" - левая рука. \n \"2\" - правая рука.\n")
                .forEach(x -> {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        System.out.println(x);
                    }
                });
    }

    public static void textForRightDoor() {
        Stream.of("За правой дверью была комната с бездонной ямой. Дверь за Павлом захлопнулась," +
                                " и стены начали сужаться!\n",
                        "Павел решил прыгнуть в яму или остаться в комнате?\n",
                        "Введите int:\n \"1\" - прыгнуть в яму. \n \"2\" - остаться в комнате.\n")
                .forEach(x -> {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        System.out.println(x);
                    }
                });
    }

    public static void textForLeftHand() {
        Stream.of("В левой руке у человека был нож\n",
                        "Он зарезал им Павла :(\n",
                        "В каком то смысле смерть Павла делала счастливее этого человека\n",
                        "Странный человек заулыбался :)\n")
                .forEach(x -> {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        System.out.println(x);
                    }
                });
    }

    public static void textForRightHand() {
        Stream.of("В правой руке у человека была бутылка\n",
                        "Они раскатили её вместе...\n",
                        "Вот оно счастье - в алкоголизме! \n")
                .forEach(x -> {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        System.out.println(x);
                    }
                });
    }

    public static void textForJumpIntoTheHole() {
        Stream.of("Пока Павел летел в яме, он думал о том : сколько не решённых загадок осталось позади, " +
                                "не ужели это всё ?\n",
                        "Но вдруг он спокойно приземлился в большущей комнате с большими дверьми... " +
                                "дверь начала потихоньку открываться ...\n",
                        "Вот солнечный свет залил всё вокруг и Павел отбросил от себя все мысли.\n",
                        "Ему не нужны были знания или власть. Он хотел только счастья.\n",
                        "Он не искал понимания - он искал избавления.\n",
                        "Павел вышел из здания... \n",
                        "Легкое дуновение ветра принесло ощущение полной свободы." +
                                " Перед Павлом лежал новый неизведанный путь.\n",
                        "Этот момент был именно таким которым он должен был быть." +
                                " Павел был счастлив, возможно в первые )\n")
                .forEach(x -> {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        System.out.println(x);
                    }
                });
    }

    public static void textForStayInTheRoomBehindTheRightDoor() {
        Stream.of("Оставшись в комнате, Павел заметил...\n",
                        "Что это не стены сужались, а его сознание... " +
                                "Он стал понимать:\n",
                        "Ведь если каждый твой путь был создан за ранее - смерть становится абсолютно бессмысленной," +
                                " так же как и сама жизнь\n",
                        "Начинаешь понимать, что с начала жизни ты был уже мёртв.\n",
                        "Он так и остался стоять как вкопанный в этой комнате, сжав за спиной руки!\n")
                .forEach(x -> {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        System.out.println(x);
                    }
                });
    }

    public static void fin() {
        Stream.of("Но не ужели это конец ? Не хотите ли вы знать, что бы было если бы выбрали что то другое ?\n",
                        "Перезапустите main!!!!")
                .forEach(x -> {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        System.out.println(x);
                    }
                });
    }
}
