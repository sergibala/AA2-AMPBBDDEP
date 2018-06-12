
package Figures;

/**
 *
 * @author sergibala
 */
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
}
