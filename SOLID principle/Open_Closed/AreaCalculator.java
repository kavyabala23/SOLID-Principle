package Open_Closed;

import java.util.List;
public class AreaCalculator {
    public int sum(List<Shape> shapes){
        int sum =0;
        for(int i=0;i< shapes.size();i++){
            sum+= shapes.get(i).area();

           /* now we can remove this from this class
            if(shape instanceof Square){

                sum+=Math.pow(((Square) shape).getLength(),2);
            }
            if(shape instanceof Circle){
                sum += Math.PI * Math.pow(((Circle)shape).getRadius(),2);
            } */
            //so when the shapes get increased i cant just insert if statment that is not the best option
            //Here open-closed is not followed so we create a Interface called Shape
           /* if(shape instanceof Open_Closed.Cube){

            } */
        }
        return sum;
    }

}
