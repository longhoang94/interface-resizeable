import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3, "red", false);
        shapes[1] = new Square(3, "yellow", true);
        shapes[2] = new Rectangle(4, 6, "red", false);

        Random rd = new Random(100);
        int percent = rd.nextInt(50) + 1;

        for (Shape shape : shapes) {
            System.out.println("before resize: " + shape.getArea());
            System.out.println("after resize: " + shape.resize(percent));
        }
    }
}
