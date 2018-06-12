
package Figures;

import static java.util.Collections.unmodifiableList;
import java.util.List;

/**
 *
 * @author sergibala
 */
public class Drawing extends Figure {
    
    private final List<Figure> components;
    
    public Drawing(double x, double y, List<Figure> list) {
        super(x, y);
        this.components = list;
    }
    
    public List<Figure> getComponents() {
        return unmodifiableList(this.components);
    }
}
