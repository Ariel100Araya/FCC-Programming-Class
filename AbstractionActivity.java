

public class AbstractionActivity {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 4);
        Shape circle = new Circle(3);
        Shape triangle = new Triangle(4, 6);

        rect.display();
        System.out.println("Area of rectangle: " + rect.area());

        circle.display();
        System.out.println("Area of circle: " + circle.area());

        triangle.display();
        System.out.println("Area of triangle: " + triangle.area());
    }
}
