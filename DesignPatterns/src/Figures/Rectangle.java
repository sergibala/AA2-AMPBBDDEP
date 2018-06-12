
package Figures;

public class Rectangle extends Figure {
    
    private final double width;
    private final double height;
    
    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
    
    public double getWidth() {
        return this.width;
    }
    
    public double getHeight() {
        return this.height;
    }
    
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Rectangle)) {
            return false;
        } else {
            Rectangle r = (Rectangle) o;
            return super.equals(o) && (this.width == r.getWidth()) && (this.height == r.getHeight());
        }
    }
    
    @Override
    public void accept(FigureVisitor fv) {
        fv.visit(this);
    }
}
