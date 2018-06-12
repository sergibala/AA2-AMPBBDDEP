
package Figures;

public class Circle extends Figure {
    
    private final double r;
    
    public Circle(double x, double y, double radius) {
        super(x, y);
        this.r = radius;
    }
    
    public double getRadius() {
        return this.r;
    }
}
