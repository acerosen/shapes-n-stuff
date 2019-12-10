package geometries;

import primitives.Point3D;
import primitives.Vector;

/**
 * 
 * @author eytan
 *
 */

public class Plane implements Geometry {
	private Point3D _p;
	private Vector _normal;

	// ***************** Constructors ********************** //
	/**
	 * @name Plane
	 * @param p
	 * @param normal
	 */
	public Plane(Point3D p, Vector normal) {
		this._p = p;
		_normal = normal.normal();
	}

	/**
	 * @name Plane
	 * @param p1
	 * @param p2
	 * @param p3
	 */
	public Plane(Point3D p1, Point3D p2, Point3D p3) {
		_p = p1;
		this._normal = p1.subtract(p2).cross(p1.subtract(p3));
	}

	// ***************** Operations ******************** //

	/**
	 * @name getNormal
	 * @return _normal
	 * @description returns normal to plane
	 */
	public Vector getNormal() {
		return _normal;
	}

	/**
	 * @name getNormal
	 * @return _normal
	 * @description returns normal to plane
	 */
	@Override
	public Vector getNormal(Point3D point) {
		return _normal;
	}

}
