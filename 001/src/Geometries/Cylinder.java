package geometries;

import primitives.*;

/**
 * 
 * @author eytan
 *
 */

public class Cylinder extends Tube {

	public double _height;

	// ***************** Constructors ********************** //
	/**
	 * @name Cylinder
	 * @param _radius
	 * @param _height
	 * @param _axis
	 */
	public Cylinder(double _radius, double _height, Ray _axis) {
		super(_axis, _radius);
		if (_height > 0)
			this._height = _height;
		else
			throw new IllegalArgumentException("Radius is smaller than 0");
	}

	// ***************** Operations ******************** //
	/**
	 * @name getNormal
	 * @param p
	 * @return Vector
	 * @description returns normal vector to cylinder
	 */
	public Vector getNormal(Point3D p) {
        Point3D p0 = _axisRay.getP0();
        Vector v = _axisRay.getDir();
        Vector u = p.subtract(p0); // vector from p0 to p
        double t = v.dot(u); // size of projection of vector u on the ray
        // point on the ray and plane crossing P and orthogonal to the ray
        if ((t)==0 || (t - this._height)==0)
            return v;
        return p.subtract(p0.add(v.scale(t))).normal();
    }

}
