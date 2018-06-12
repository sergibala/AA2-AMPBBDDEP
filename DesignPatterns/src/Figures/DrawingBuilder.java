
package Figures;

import java.util.ArrayList;
import java.util.List;

public class DrawingBuilder {
    
    private final double x;
    private final double y;
    private final List<Figure> components = new ArrayList<>();
    
    public DrawingBuilder(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public DrawingBuilder addComponent(Figure f) {
        this.components.add(f);
        return this;
    }
    
    public Drawing build() {
        return new Drawing(this.x, this.y, this.components);
    }
}
