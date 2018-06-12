
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
    
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Circle)) {
            return false;
        } else {
            Circle c = (Circle) o;
            return super.equals(o) && (this.r == c.getRadius());
        }
    }
}
