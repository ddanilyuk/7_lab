public class Jewel {
    private String name;
    private int mass;
    private int costPerCarat;
    private double purity;
    private int totalCost;

    public Jewel(String name, int mass, int costPerCarat, double purity) {
        this.name = name;
        this.mass = mass;
        this.costPerCarat = costPerCarat;
        this.purity = purity;
        this.totalCost = mass * costPerCarat;
    }

    @Override
    public String toString() {
        return "Name: " + name + " |"
                + " mass: " + mass + " |"
                + " costPerCarat: " + costPerCarat + " |"
                + " purity: " + purity + " |"
                + " total cost: " + totalCost;
    }


    public String getName() {
        return name;
    }

    public int getMass() {
        return mass;
    }

    public int getCostPerCarat() {
        return costPerCarat;
    }

    public double getPurity() {
        return purity;
    }

    public int getTotalCost() {
        return totalCost;
    }
}
