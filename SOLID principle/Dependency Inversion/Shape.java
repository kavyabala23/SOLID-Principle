
public interface Shape {
    double area();
    //now we introduce new function called "volume" which cannot be implemented by circle
    //So here the Interface Segregation Principle is broke
    // double volume();  so we have created a smaller interface called "ThreeDimensionalShape"
}
