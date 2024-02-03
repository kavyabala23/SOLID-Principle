
public class Circle implements Shape {
    private final int radius;

    public Circle(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getRadius(),2);
    }


    //circle is not 3 dimensional shape so it cannot implement this
    /*@Override
    public double volume() {
        return 0;
    }*/
}
