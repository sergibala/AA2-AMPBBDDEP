
package Figures;

/**
 *
 * @author sergibala
 */
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
}
