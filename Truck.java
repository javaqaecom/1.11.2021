public final class Truck extends vehicle{
    //DATA
    public String brand;

    // func


    public Truck(int maxSpeed, int numberOfSeats, double price, String brand) {
        super(maxSpeed, numberOfSeats, price);
        this.brand = brand;
    }

    @Override
    public void calcPrice() {
        this.price= this.price-tax*this.price;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", numberOfSeats=" + numberOfSeats +
                ", price=" + price +
                ", tax=" + tax +
                '}';
    }
}
