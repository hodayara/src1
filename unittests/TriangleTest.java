package unittests;

import geometries.Polygon;
import geometries.Triangle;
import org.junit.Test;
import primitives.Point3D;
import primitives.Vector;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void getNormal() {
        Triangle tr = new Triangle(new Point3D(0, 0, 1), new Point3D(1, 0, 0), new Point3D(0, 1, 0));
        double sqrt3 = Math.sqrt(1d / 3);
        // ============ Equivalence Partitions Tests ==============
        assertEquals("Bad normal to trinagle", new Vector(sqrt3, sqrt3, sqrt3), tr.getNormal(new Point3D(0, 0, 1)));

    }
}