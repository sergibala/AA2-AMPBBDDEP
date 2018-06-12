
package Figures;

public interface FigureVisitor {
  
    public void visit(Rectangle r);
    public void visit(Circle c);
    public void visit(Drawing d);
    
}
