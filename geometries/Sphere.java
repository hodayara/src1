package geometries;

import primitives.*;

/**
 *class to define a sphere
 */
public class Sphere extends RadialGeometry implements Geometry
{
    /**
     *sphere value
     */
    protected Point3D _center;

    /**
     *
     * @return point3D of the sphere
     */
    public Point3D get_center()

    {
        return _center;
    }
    public @Override String toString()
    {
        return String.format("sphere: point center: {}", _center.toString());
    }

    /**
     *A constractor that gets point3D
     * @param p
     */
    public Sphere(Point3D p, double radus)
    {
        super(radus);
        _center = new Point3D(p);
    }

    /**
     * a function to find normal in a given point
     * @param p
     * @return
     */
    @java.lang.Override
    public Vector getNormal(Point3D p)
    {
        return new Vector(_center.subtract(p).normalize());
    }

}
