package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    private List<String> members;


    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }


    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
            musicBand2.getMembers().addAll(musicBand1.getMembers());
            musicBand1.getMembers().clear();
        }

    public void printMembers() {
        System.out.println(members.toString());
    }


    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return "Название группы: " + name + "; Год основания: " + year + "; \n" + getMembers();
    }

    public List<String> getMembers() {
        return members;
    }
}
