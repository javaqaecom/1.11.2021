public abstract class vehicle {
    //data
    public int maxSpeed;
    public int numberOfSeats;
    public double price;
    public final float tax=0.17f;

    // func


    public vehicle(int maxSpeed, int numberOfSeats, double price) {
        this.maxSpeed = maxSpeed;
        this.numberOfSeats = numberOfSeats;
        this.price = price;
    }

    public abstract void calcPrice();

    @Override
    public String toString() {
        return "vehicle{" +
                "maxSpeed=" + maxSpeed +
                ", numberOfSeats=" + numberOfSeats +
                ", price=" + price +
                ", tax=" + tax +
                '}';
    }
}
