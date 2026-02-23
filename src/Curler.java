public class Curler {

    private String name;
    private int points;
    private double stoneWeight;

    public Curler (String name, int points, double weight) {
        this.name = name;
        this.points = points;
        stoneWeight = weight;
    }

    public String toString() {
        return "name: " + name + ", points: " + points + ", stone weight: " + stoneWeight;
    }
}
