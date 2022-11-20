public class Pilot {

    private String name;
    private int rank;
    private int licenceNo;

    public Pilot (String name, int rank, int licenceNo) {
        this.name = name;
        this.rank=rank;
        this.licenceNo=licenceNo;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public int getLicenceNo() {
        return licenceNo;
    }

    public String fliesPlane(){
        return "Commencing ascent";
    }
}
