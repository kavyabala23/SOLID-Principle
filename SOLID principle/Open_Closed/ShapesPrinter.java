package Open_Closed;

public class ShapesPrinter {

    //Note - Here i am not passing an object just the sum
    public String json(int sum){
        return "{Shapes sum: %s}".formatted(sum);
    }
    public String csv(int sum){
        return "Shapes sum,%s".formatted(sum);
    }
}
