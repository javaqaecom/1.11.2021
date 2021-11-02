public class Triangle extends Shape{
    //area hekef
    public double a;
    public double b;
    public double c;
    public double h;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }


    @Override
    public void calcArea() {
        this.area=a*h/2;
    }

    @Override
    public void calcHekef() {
        this.hekef=a+b+c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "area=" + area +
                ", hekef=" + hekef +
                ", pi=" + pi +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", h=" + h +
                '}';
    }
}
