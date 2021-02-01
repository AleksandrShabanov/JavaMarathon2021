package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<MusicArtist> members = new ArrayList<>();
        members.add(new MusicArtist("Jack White", 40));
        members.add(new MusicArtist("Mick Jagger", 79));
        members.add(new MusicArtist("M Kiwanuka", 35));
        MusicBand musicBand = new MusicBand("Old group", 1998, members);

        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Man", 30));
        MusicBand musicBand1 = new MusicBand("New group", 2010, members1);

        MusicBand.transferMembers(musicBand, musicBand1);

        musicBand.printMembers();
        musicBand1.printMembers();
    }
}
