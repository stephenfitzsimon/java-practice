import java.io.Serializable;

public class Engine implements Serializable{
    private double liters;
    private int cylinders;

    public Engine(double liters, int cylinders) {
        this.liters = liters;
        this.cylinders = cylinders;
    }

    public double getLiters() {
        return liters;
    }

    public void setLiters(double liters) {
        this.liters = liters;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public String toString() {
        return String.format("Liters: %f, Cynlinders: %d", this.liters, this.cylinders);
    }
}
