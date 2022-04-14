package com.tms.homework.pavelgrigoryev.task18.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tms.homework.astakhnovich.task1to19.task17.User;
import com.tms.homework.han.task18.hero.IronMan;
import com.tms.homework.nikitaelenski.task14.Houses;
import com.tms.homework.pavelgrigoryev.task16.ironforged.Dwarf;
import com.tms.homework.pavelgrigoryev.task16.ironforged.Role;
import com.tms.homework.pavelgrigoryev.task18.jaxb.Gnome;
import com.tms.homework.pavelgrigoryev.task6.Tank;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MichaelJackson {

    public static void toJackson() throws IOException {
        Gnome gnome = new Gnome();
        gnome.setId(20);
        gnome.setName("Shtepsel");
        gnome.setAge(48);

        ArrayList<Object> stupidList = new ArrayList<>();
        stupidList.add(gnome);
        stupidList.add(new Dwarf("Brann", "BronzeBeard", 17, 35, Role.MELEE_DAMAGE_DEALER));
        stupidList.add(new Tank("T-14", "Армата", 2015, "military", 159644948965.46465));
        stupidList.add(new IronMan("Tony Stark", 48, 1, "Money", 1000));
        stupidList.add(new User(11, "Lolka", "lolka1576-13.lolka@apple.com", "lolk35aLOL1567"));
        stupidList.add(new Houses(6, 99, 13, 70, "Переулок.Святого Антона"));

        ObjectMapper mapper = new ObjectMapper();
        String stupidListToJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(stupidList);
        System.out.println(stupidListToJson);

        FileWriter fileWriter = new FileWriter("json//MichaelJackson.json");
        fileWriter.write(stupidListToJson);
        fileWriter.close();
    }

    public static void main(String[] args) throws IOException {
        toJackson();
    }
}
