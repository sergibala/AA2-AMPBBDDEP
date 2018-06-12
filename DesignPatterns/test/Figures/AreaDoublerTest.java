/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figures;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergi
 */
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
}
