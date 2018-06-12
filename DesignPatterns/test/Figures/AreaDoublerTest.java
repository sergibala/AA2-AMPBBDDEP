
package Figures;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AreaDoublerTest {

    private AreaDoubler ad;
    private final double scale = Math.sqrt(2.0);
    
    @Before
    public void setUp() {
        ad = new AreaDoubler();
    }

    @Test
    public void test_rectangle_AreaDoubler() {
        Rectangle r = new Rectangle(40.0, 20.0, 10.0, 15.0);
        r.accept(ad);
        Rectangle expected = new Rectangle(40.0, 20.0, 10.0*scale, 15.0*scale);
        Rectangle result = (Rectangle) ad.getFigure();
        assertEquals(expected, result);
    }

    @Test
    public void test_circle_AreaDoubler() {
        Circle c = new Circle(10.0, 60.0, 5.0);
        c.accept(ad);
        Circle expected = new Circle(10.0, 60.0, 5.0*scale);
        Circle result = (Circle) ad.getFigure();
        assertEquals(expected, result);
    }

    @Test
    public void test_drawing_AreaDoubler() {
        Figure fr = new Rectangle(40.0, 20.0, 10.0, 15.0);
        Figure frScaled = new Rectangle(40.0, 20.0, 10.0*scale, 15.0*scale);
        Figure fc = new Circle(10.0, 60.0, 5.0);
        Figure fcScaled = new Circle(10.0, 60.0, 5.0*scale);
        Drawing d = new DrawingBuilder(25.0, 15.0).addComponent(fr).addComponent(fc).build();
        d.accept(ad);
        Drawing expected = new DrawingBuilder(25.0, 15.0).addComponent(frScaled).addComponent(fcScaled).build();
        Drawing result = (Drawing) ad.getFigure();
        assertEquals(expected, result);
    }

    @Test
    public void test_drawing_with_drawingcomponent() {
        Figure fr = new Rectangle(40.0, 20.0, 10.0, 15.0);
        Figure frScaled = new Rectangle(40.0, 20.0, 10.0*scale, 15.0*scale);
        Figure fc = new Circle(10.0, 60.0, 5.0);
        Figure fcScaled = new Circle(10.0, 60.0, 5.0*scale);
        List<Figure> list = new ArrayList<>();
        list.add(fr);
        list.add(fc);
        Drawing drawingNoBuilder = new Drawing(15.0, 35.0, list);
        Drawing d = new DrawingBuilder(10.0, 30.0).addComponent(drawingNoBuilder).build();
        d.accept(ad);
        Drawing result = (Drawing) ad.getFigure();
        
        List<Figure> listScaled = new ArrayList<>();
        listScaled.add(frScaled);
        listScaled.add(fcScaled);
        Drawing drawingScaled = new Drawing(15.0, 35.0, listScaled);
        Drawing expected = new DrawingBuilder(10.0, 30.0).addComponent(drawingScaled).build();
        assertEquals(expected, result);
    }
}
