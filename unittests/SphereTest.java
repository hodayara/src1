package unittests;

import org.junit.Test;
import geometries.*;
import primitives.*;


import static org.junit.Assert.*;

public class SphereTest {

    @Test
    public void getNormal()
    {
        Sphere s = new Sphere(new Point3D(0,0,0),1);
        Point3D p =new Point3D(1,0,0);
        // ============ Equivalence Partitions Tests ==============
        assertEquals("getNormal() result is not good",s.getNormal(p),new Vector(1,0,0));
    }
}