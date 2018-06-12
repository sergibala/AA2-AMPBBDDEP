
package Figures;

public class AreaDoubler implements FigureVisitor {
    
    private Figure result;
    private final double scale = Math.sqrt(2.0);
    
    public Figure getFigure() {
        return this.result;
    }
    
    @Override
    public void visit(Rectangle r) {
        this.result = new Rectangle(r.getX(), r.getY(), r.getWidth()*scale, r.getHeight()*scale);
    }
    
    @Override
    public void visit(Circle c) {
        this.result = new Circle(c.getX(), c.getY(), c.getRadius()*scale);
    }
    
    @Override
    public void visit(Drawing d) {
        DrawingBuilder db = new DrawingBuilder(d.getX(), d.getY());
        for (Figure f : d.getComponents()) {
            f.accept(this);
            db.addComponent(this.getFigure());
        }
        this.result = db.build();
    }
}
