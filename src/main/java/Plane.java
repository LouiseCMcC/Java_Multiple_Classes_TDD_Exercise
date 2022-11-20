public class Plane {
    public String planeType;
    public int capacity;
    public int totalWeight;

    public Plane(String planeType, int capacity, int totalWeight){
        this.planeType=planeType;
        this.capacity=capacity;
        this.totalWeight=totalWeight;
    }


    public int getTotalWeight() {
        return totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getPlaneType() {
        return planeType;
    }
}
