import java.util.Vector;

public class main {

    public static void main(String[] args) {

       // Shape p1= new Shape() ;
        Shape[] shapes= new Shape[5];
        shapes[0] = new Triangle(5,7,9,12);
        shapes[1] = new circle(5);
        shapes[2] = new Rectangle(12,7);
        shapes[3] = new Square(7,7);
        shapes[4] = new Triangle(15,21,28,21);

        for (Shape s:shapes) {
            s.calcHekef();
            s.calcArea();
            System.out.println(s);
        }

        float f= 0.17f;
        double d=13.44d;
    }
}
