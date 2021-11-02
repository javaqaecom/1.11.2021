public class car extends vehicle{
    public String brand;

    public car(int maxSpeed, int numberOfSeats, double price, String brand) {
        super(maxSpeed, numberOfSeats, price);
        this.brand = brand;
    }

    @Override
    public void calcPrice() {
        this.price= this.price+this.price*tax;
    }

    @Override
    public String toString() {
        return "car{" +
                "brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", numberOfSeats=" + numberOfSeats +
                ", price=" + price +
                ", tax=" + tax +
                '}';
    }
}


