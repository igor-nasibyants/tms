package com.spring.my;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        Music music = context.getBean("musicBean" , Music.class);
        Music music1 = context.getBean("musicBeann" , Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
        musicPlayer1.PlayMusic();
        musicPlayer.PlayMusic();


        context.close();
    }
}
