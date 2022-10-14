public class Cylinder extends Circle{
    private double heights;

    public Cylinder(double radius, double heights) {
        super(radius);
        if(heights<0){
            this.heights = 0;
        }
        this.heights = heights;
    }
    public double getHeights(){
        return heights;
    }
    public double getVolume(){
        return getArea() * heights;
    }
}
