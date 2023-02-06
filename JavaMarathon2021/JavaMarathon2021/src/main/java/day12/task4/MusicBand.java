package day12.task4;

import java.util.List;
import java.util.function.UnaryOperator;

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

//    public String getMembers(MusicBand band){
//        for(MembersOfBand z: band.membersOfBand)
//            return band.getMembers(z);
//    }

    static class MembersOfBand{
        private String firstName;
        private String secondName;

        public MembersOfBand(String firstName, String secondName) {
            this.firstName = firstName;
            this.secondName = secondName;
        }

        @Override
        public String toString() {
            return "MembersOfBand{" +
                    "firstName='" + firstName + '\'' +
                    ", secondName='" + secondName + '\'' +
                    '}';
        }

    }


}


