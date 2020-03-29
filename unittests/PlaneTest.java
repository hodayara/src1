package unittests;
import geometries.*;
import primitives.Point3D;
import primitives.Vector;

import static org.junit.Assert.*;

public class PlaneTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.Test
    public void getNormal()
    {
        Plane plane = new Plane(new Point3D(1,2,3),new Point3D(1,1,1), new Point3D(2,2,2));
        // ============ Equivalence Partitions Tests ==============
        assertEquals(plane.getNormal(new Point3D(1,2,3)),new Vector(-1,3,-2).normalize());
    }
}