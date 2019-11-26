package Geometries;

import Primitives.Point3D;
import Primitives.Vector;

/**
 * 
 * @author eytan
 *
 */

public class Plane implements Geometry {
	private Point3D _p;
	private Vector _normal;

	// Constructor

	public Plane(Point3D p, Vector normal) {
		this._normal = normal.getNormal();
	}

	public Plane(Point3D p1, Point3D p2, Point3D p3) {
		_p = p1;
		this._normal = p1.subtract(p2).crossProduct(p1.subtract(p3));
	}

	//Operations

	// Get Normal Vector
	public Vector getNormal() {
		return _normal;
	}

	@Override
	public Vector getNormal(Point3D point) {
		return _normal;
	}

}
