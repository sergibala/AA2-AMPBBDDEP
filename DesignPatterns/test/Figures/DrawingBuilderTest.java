
package Figures;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DrawingBuilderTest {
    
    private DrawingBuilder builder;
    
    @Before
    public void setUp() {
        builder = new DrawingBuilder(20.0, 30.0);
    }

    @Test
    public void building_without_components_added() {
        Drawing d = builder.build();
        List<Figure> expected = new ArrayList<>();
        assertEquals(20.0, d.getX(), 0);
        assertEquals(30.0, d.getY(), 0);
        assertEquals(expected, d.getComponents());
    }
    
    @Test
    public void adding_component_and_building() {
        Figure f = new Rectangle(40.0, 20.0, 10.0, 15.0);
        List<Figure> list = new ArrayList<>();
        list.add(f);
        Drawing expected = new Drawing(20.0, 30.0, list);
        builder.addComponent(f);
        assertEquals(expected, builder.build());
    }
    
}
