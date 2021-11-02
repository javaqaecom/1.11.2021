public abstract class Shape {
    //data
    public double area;
    public double hekef;
    public final double pi=3.14159;

    public Shape() {
    }

    public abstract void calcArea();

    public  abstract void calcHekef();


    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                ", hekef=" + hekef +
                ", pi=" + pi +
                '}';
    }
}
