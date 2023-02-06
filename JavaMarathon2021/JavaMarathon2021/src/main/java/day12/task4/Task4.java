package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>(Arrays.asList(
                new day12.task4.MusicBand("Queen", 1970, new ArrayList<>( Arrays.asList(new day12.task4.MusicBand.MembersOfBand("Freddie", "Mercury"),
                        new day12.task4.MusicBand.MembersOfBand("Brian", "May")))),

                        new day12.task4.MusicBand("The Beatles", 1960, new ArrayList<>(Arrays.asList(new day12.task4.MusicBand.MembersOfBand("John", "Lennon"),
                                new day12.task4.MusicBand.MembersOfBand("Paul", "McCartney")))),

                        new day12.task4.MusicBand("The OffSpring", 1984, new ArrayList<>( Arrays.asList(new day12.task4.MusicBand.MembersOfBand("Dexter", "Holland"),
                                new day12.task4.MusicBand.MembersOfBand("Todd", "Morse")))),

                        new day12.task4.MusicBand("Nightwish", 1996,new ArrayList<>( Arrays.asList(new day12.task4.MusicBand.MembersOfBand("Tuomas", "Holopainen"),
                                new day12.task4.MusicBand.MembersOfBand("Floor", "Jansen")))),

                        new day12.task4.MusicBand("Within Temptation", 1996, new ArrayList<>( Arrays.asList(new day12.task4.MusicBand.MembersOfBand("Sharon", "den Adel"),
                                new day12.task4.MusicBand.MembersOfBand("Robert","Westerholt")))),

                        new day12.task4.MusicBand("30 seconds to Mars", 1998,new ArrayList<>( Arrays.asList(new day12.task4.MusicBand.MembersOfBand("Jared", "Leto"),
                                new day12.task4.MusicBand.MembersOfBand("Shannon","Leto")))),

                        new day12.task4.MusicBand("My Chemical Romance", 2001, new ArrayList<>( Arrays.asList(new day12.task4.MusicBand.MembersOfBand("Gerard","Way"),
                                new day12.task4.MusicBand.MembersOfBand("Ray","Toro")))),

                        new day12.task4.MusicBand("Linkin Park", 1996,new ArrayList<>( Arrays.asList(new day12.task4.MusicBand.MembersOfBand("Chester","Bennington"),
                                new day12.task4.MusicBand.MembersOfBand("Mike", "Shinoda")))),

                        new day12.task4.MusicBand("Five Finger Death Punch", 2005,new ArrayList<>( Arrays.asList(new day12.task4.MusicBand.MembersOfBand("Zoltan","Bathory"),
                                new day12.task4.MusicBand.MembersOfBand("Ivan","Moody")))),

                        new day12.task4.MusicBand("Imagine Dragons", 2008, new ArrayList<>( Arrays.asList(new day12.task4.MusicBand.MembersOfBand("Dan","Reynolds"),
                                new day12.task4.MusicBand.MembersOfBand("Wayne","Sermon"))))));

        MusicBand.transferMembers(bands.get(0), bands.get(1));
        System.out.println(bands);
        MusicBand.printMembers(bands.get(0));
        System.out.println();
        MusicBand.printMembers(bands.get(1));
    }

}
