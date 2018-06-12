
package Figures;

public abstract class Figure {
    
    private final double x;
    private final double y;
    
    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return this.x;
    }
    
    public double getY() {
        return this.y;
    }
    
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Figure)) {
            return false;
        } else {
            Figure f = (Figure) o;
            return (this.x==f.getX()) && (this.y==f.getY());
        }
    }
}
