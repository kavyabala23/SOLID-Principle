import java.util.List;

public class ShapesPrinter {
//so here we breaking Dependency Inversion Principle
    /*Two problems here,one is if we make a change of areacalculator here then we are breaking
    the Open_close principle but also we are depending on the actual concrete clas not the abstraction
     */

    //Solve this go to AreaCalculator


  //step1
  // private AreaCalculator areaCalculator =new AreaCalculator();

    //After step 2
    private final IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(List<Shape> shapes){

        return "{Shapes sum: %s}".formatted(areaCalculator.sum(shapes));
    }
    public String csv(List<Shape> shapes){

        return "Shapes sum,%s".formatted(areaCalculator.sum(shapes));
    }
}
