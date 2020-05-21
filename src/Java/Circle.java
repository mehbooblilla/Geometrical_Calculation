package Java;

public  class Circle implements Shape {
   private double r;
    private  final double pi =3.14;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public  double area() {
         return pi*r*r;

    }

    @Override
    public double circumference() {
        return 2*pi*r;


    }
}
