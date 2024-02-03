

import java.util.List;
public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube();

        ShapesPrinter printer = new ShapesPrinter();
        //Liskov Substitution Principle is broke here  ->This means that every subclass or derived class should be substitutable for their base or parent class
        NoShape noShape = new NoShape();
        List<Shape> shapes= List.of(
               //noshape   -we need to remove this
                circle,
                square,
                cube);
        int sum = areaCalculator.sum(shapes);

        System.out.println(printer.json(sum));
        System.out.println(printer.csv(sum));


    }
}