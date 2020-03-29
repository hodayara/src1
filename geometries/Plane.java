package geometries;

import primitives.*;

/**
 *class to define a plane
 */
public class Plane implements Geometry
{
    /**
     * plane value
     */
    protected Point3D _p;
    protected Vector _normal;

    /**
     *
     * @return the point3D of the plane
     */
    public Point3D get_p()
    {
        return _p;
    }

    /**
     *
     * @return the vector of the plane
     */
    public Vector get_normal()
    {
        return _normal;
    }

    /**
     * A constractor that gets 3 point3D
     * @param x
     * @param y
     * @param z
     */
    public Plane(Point3D x, Point3D y, Point3D z)
    {
        Vector other1 = new Vector(x);
        Vector other2 = new Vector(y);
        _normal = new Vector(other1.crossProduct(other2)).normalize();
        _p = new Point3D(z);

    }

    /**
     * A constractor that gets point3D and vector normal
     * @param x
     * @param normalVector
     */
    public Plane(Point3D x,Vector normalVector)
    {
        _normal=new Vector(normalVector);
        _p =new Point3D(x);
    }
    @java.lang.Override
    public Vector getNormal (Point3D p)

    {
        return _normal;
    }

    /**
     * Load a function that returns the normal to the plane
     * @return the vector
     */
    public Vector getNormal ()
    {

        return getNormal(_p);
    }

    public @Override String toString()
    {
        return String.format("plane: vector: {}, point: {}",_normal.toString(), _p.toString());
    }
}
