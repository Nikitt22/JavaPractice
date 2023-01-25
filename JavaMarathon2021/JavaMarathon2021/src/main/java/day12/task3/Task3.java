package day12.task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> bands = new ArrayList<>(Arrays.asList(new MusicBand("Queen", 1970),
                new MusicBand("The Beatles", 1960),
                new MusicBand("The OffSpring", 1984),
                new MusicBand("Nightwish", 1996),
                new MusicBand("Within Temptation", 1996),
                new MusicBand("30 seconds to Mars", 1998),
                new MusicBand("My Chemical Romance", 2001),
                new MusicBand("Linkin Park", 1996),
                new MusicBand("Five Finger Death Punch ", 2005),
                new MusicBand("Imagine Dragons ", 2008)));

        Collections.shuffle(bands);
        System.out.println(bands);
        groupsAfter2000(bands);
    }
    static List<MusicBand> bandAfter2000 = new ArrayList<>();
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        for (MusicBand band : bands)
            if (band.getYear() > 2000)
                bandAfter2000.add(band);
        System.out.println(bandAfter2000);
        return bands;
    }
}
