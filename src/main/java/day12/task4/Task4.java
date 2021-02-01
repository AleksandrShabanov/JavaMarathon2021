package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> members = new ArrayList<>();
        members.add("Jack White");
        members.add("No Name");
        members.add("No Name2");
        MusicBand musicBand = new MusicBand("White Stripes", 1998, members);

        List<String> members1 = new ArrayList<>();
        members1.add("New Man");
        MusicBand musicBand1 = new MusicBand("NoName", 2010, members1);

        MusicBand.transferMembers(musicBand, musicBand1);

        musicBand.printMembers();
        musicBand1.printMembers();

    }
}
