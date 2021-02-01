package day12.task5;

import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    private List<MusicArtist> musicArtists;


    public MusicBand(String name, int year, List<MusicArtist> musicArtists) {
        this.name = name;
        this.year = year;
        this.musicArtists = musicArtists;
    }


    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
            musicBand2.getMembers().addAll(musicBand1.getMembers());
            musicBand1.getMembers().clear();
        }

    public void printMembers() {
        System.out.println(musicArtists.toString());
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

    public List<MusicArtist> getMembers() {
        return musicArtists;
    }
}
