package problemSet4;

public class Cylinder extends Circle{

  private double height; 
  private final double PI = 3.142;
  public Cylinder() {
            setRadius(0);
   }
 
  public Cylinder(double r,double h) {
             setRadius(r);
             setHeight(h);   
    }
        public void setHeight(double height){
                this.height = height;
        }
        public double getHeight(){
                return height;
        }
        public double area(){
                double area =(Math.sqrt(PI*Math.pow(getRadius(),2) + 
                (PI *Math.pow(height,2)*(Math.pow(getRadius(),2)))));
                return  area;
                }
                public String toString(){
                        return "\nThe Height of the Cylinder is: " + getHeight() + "\nThe radius is: " + getRadius();
                }
                public String getName(){
                         return "\nCylinder";
        }                 
}