package Java;


public class Main {

    public static void main(String[] args) {
        //Area of circle:
        Circle circle=new Circle(5.5);
        double area=circle.area();
        System.out.println("Area of circle="+ area);
        double circum=circle.circumference();
        System.out.println("circumference ="+ circum);
        // Area of Triangle:
        Triangle triangle=new Triangle(3.2,2.2);
       double areaTriangle= triangle.area();
        System.out.println("Area of Triangle="+ areaTriangle);
        //Area of Square:
        Square square=new Square(5);
        double areaSquare=square.area();
        System.out.println("Area of Square="+ areaSquare);
        //Area of Rectangle:
        Rectangle rectangle=new Rectangle(5,3);
        double areaRectangle=rectangle.area();
        System.out.println("Area of Rectangle="+ areaRectangle);




    }
}
