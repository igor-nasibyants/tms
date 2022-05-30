package com.spring.my;

public class MusicPlayer {
    private Music music;

    public MusicPlayer (Music music){
        this.music = music;

    }
    public void PlayMusic (){
        System.out.println("Граеш музыка " + music.getSong());
    }
}
