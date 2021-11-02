public class Square extends Rectangle {
    //area hekef pi

    public Square(double a, double b) {
        super(a, b);
    }



    @Override
    public void calcArea() {
        this.area= a*a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                ", b=" + b +
                ", area=" + area +
                ", hekef=" + hekef +
                ", pi=" + pi +
                '}';
    }
}
