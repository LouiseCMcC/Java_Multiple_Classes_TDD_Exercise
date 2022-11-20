public class CabinCrewMember {
    private String name;
    private int rank;

    public CabinCrewMember (String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public String speakToPassengers(){
        return "exits are here";
    }

}
