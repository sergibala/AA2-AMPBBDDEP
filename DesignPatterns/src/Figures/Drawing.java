
package Figures;

import static java.util.Collections.unmodifiableList;
import java.util.List;

public class Drawing extends Figure {
    
    private final List<Figure> components;
    
    public Drawing(double x, double y, List<Figure> list) {
        super(x, y);
        this.components = list;
    }
    
    public List<Figure> getComponents() {
        return unmodifiableList(this.components);
    }
    
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Drawing)) {
            return false;
        } else {
            Drawing d = (Drawing) o;
            return super.equals(o) && this.components.equals(d.getComponents());
        }
    }
    
    @Override
    public void accept(FigureVisitor fv) {
        fv.visit(this);
    }
}
