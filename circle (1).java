public final class circle extends Shape {
    // pi area hekef
    public double r;



    public circle(double r) {
        this.r = r;
    }

    @Override
    public void calcArea() {
        this.area=r*r*pi;
    }

    @Override
    public void calcHekef() {
        this.hekef=2*r*pi;
    }

    @Override
    public String toString() {
        return "circle{" +
                "area=" + area +
                ", hekef=" + hekef +
                ", pi=" + pi +
                ", r=" + r +
                '}';
    }
}
