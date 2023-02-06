package day12.task5;

import day12.task5.MusicBand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>(Arrays.asList(
                new day12.task5.MusicBand("Queen", 1970, new ArrayList<>( Arrays.asList(new day12.task5.MusicBand.MembersOfBand("Freddie", "Mercury", 43),
                        new day12.task5.MusicBand.MembersOfBand("Brian", "May",75)))),

                new day12.task5.MusicBand("The Beatles", 1960, new ArrayList<>(Arrays.asList(new day12.task5.MusicBand.MembersOfBand("John", "Lennon", 40),
                        new day12.task5.MusicBand.MembersOfBand("Paul", "McCartney", 80))))));

day12.task5.MusicBand.transferMembers(bands.get(0), bands.get(1));
        System.out.println(bands);
        day12.task5.MusicBand.printMembers(bands.get(0));
        System.out.println();
        day12.task5.MusicBand.printMembers(bands.get(1));
    }
}
