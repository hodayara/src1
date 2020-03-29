package geometries;

import primitives.*;

/**
 *class to define a triangle
 */
public class Triangle extends Polygon implements Geometry
{
    /**
     *A constractor that gets 3 point3D
     * @param a
     * @param b
     * @param c
     */
    public Triangle(Point3D a,Point3D b,Point3D c)
    {
        super(a,b,c);
    }
    public @Override String toString ()
    {
        return String.format("point 1: {}\npoint2: {}\npoint3: {})", _vertices.get(0),_vertices.get(1),_vertices.get(2));
    }

    /**
     * a function to find normal in a given point
     * @param point
     * @return
     */
    @Override
    public Vector getNormal(Point3D point)
    {
        return super.getNormal(point);
        //return null;
    }
}
