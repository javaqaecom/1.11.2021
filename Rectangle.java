public class Rectangle extends Shape{
    //area pi hekef
    public double a;
    public double b;


    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void calcArea() {
        this.area= a*b;
    }

    @Override
    public void calcHekef() {
        this.hekef=2*a+2*b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", area=" + area +
                ", hekef=" + hekef +
                ", pi=" + pi +
                '}';
    }
}
