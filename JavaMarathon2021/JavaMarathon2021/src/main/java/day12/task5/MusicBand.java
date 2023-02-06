package day12.task5;

import java.util.List;

public class MusicBand {
    private String nameBand;
    private int year;
     private List<MembersOfBand> membersOfBand;

    public MusicBand(String nameBand, int year, List<MembersOfBand> membersOfBand) {
        this.nameBand = nameBand;
        this.year = year;
        this.membersOfBand = membersOfBand;
    }

    public String getNameBand() {
        return nameBand;
    }

    public List<MembersOfBand> getMembersOfBand() {
        return membersOfBand;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "nameBand='" + nameBand + '\'' +
                ", year=" + year +
                ", membersOfBand=" + membersOfBand +
                '}';
    }

    public static void transferMembers(MusicBand bands, MusicBand bands2){
          for (MembersOfBand x: bands.getMembersOfBand()){
               bands2.membersOfBand.add(x);
             }
        for (MembersOfBand y: bands2.getMembersOfBand()){
            bands.membersOfBand.remove(y);
          }

    }
   public static void printMembers(MusicBand band){
            for(MembersOfBand y: band.membersOfBand){
                System.out.println(y);
            }
    }


    static class MembersOfBand{
        private String firstName;
        private String secondName;
        private int age;

        public MembersOfBand(String firstName, String secondName, int age) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
        }

        @Override
        public String toString() {
            return "MembersOfBand{" +
                    "firstName='" + firstName + '\'' +
                    ", secondName='" + secondName + '\'' +
                    ", age=" + age +
                    '}';
        }
    }


}


