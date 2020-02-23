public class CircleTest {
    public static void main(String[] args) {

        Circle circle0 = new Circle(1);
        Circle circle1 = new Circle(2);
        Circle circle2 = new Circle(3, "indigo",false);
        Circle circle3 = new Circle(4,"black",false);
Circle[] circle = new Circle[4];

        circle[0] = circle0;
        circle[1] = circle1;
        circle[2] = circle2;
        circle[3] = circle3;

        System.out.println("before change radius: ");
        for (int i =0; i < circle.length; i++){
            System.out.println("Area of circle "+i + " is: " +circle[i].getArea());
        }
        //Circle[] circles = {circle0,circle1,circle2,circle3};
        for (Circle circles: circle) {
                Resizeable circless = (Circle) circles;
                circless.resize(50);
        }
        System.out.println("\n after change radius: ");
        for (int i =0; i < circle.length; i++){
            System.out.println("Area of circle "+i + " is: " +circle[i].getArea());
        }
    }
}
