package day12.task3;

//3.*Выполнять в подпапке task3 в day12*

//  Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year (название музыкальной
//  группы и год основания). Создать 10 или более экземпляров класса MusicBand , добавить их в
//  список (выбирайте такие музыкальные группы, которые были созданы как до 2000 года, так и после,
//  жанр не важен). Перемешать список. Создать статический метод в классе Task3:
//  public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)

//  Этот метод принимает список групп в качестве аргумента и возвращает новый список,
//  состоящий из групп, основанных после 2000 года. Вызвать метод groupsAfter2000(List<MusicBand> bands)
//  в методе main() на вашем списке из 10 групп. Вывести в консоль оба списка (оригинальный и с группами,
//  основанными после 2000 года).

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> list = new ArrayList<>();

        list.add(new MusicBand("The Beatles", 1960));
        list.add(new MusicBand("Muse", 1994));
        list.add(new MusicBand("Hot Chip", 2000));
        list.add(new MusicBand("Childish Gambino", 2011));
        list.add(new MusicBand("Michael Kiwanuka", 2011));
        list.add(new MusicBand("The Killers", 2001));
        list.add(new MusicBand("Arctic Monkeys", 2002));
        list.add(new MusicBand("Radiohead", 1985));
        list.add(new MusicBand("Red Hot Chili Peppers", 1982));

        Collections.shuffle(list);

        System.out.println(list);
        System.out.println();
        System.out.println(groupsAfter2000(list));


    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {

        List<MusicBand> newList = new ArrayList<>();

        for (int i = 0; i < bands.size(); i++) {
            if (bands.get(i).getYear() > 2000)
                newList.add(bands.get(i));
        }

        return newList;
    }

}
