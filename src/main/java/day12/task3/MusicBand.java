package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    List<MusicBand> list = new ArrayList<>();


    public MusicBand(String name, int year){
        this.name = name;
        this.year = year;
    }




    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String toString(){
        return "Название группы: " + name + "; Год основания: " + year;
    }
}
