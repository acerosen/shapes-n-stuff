package Geometries;

import Primitives.Point3D;
import Primitives.Ray;
import Primitives.Vector;

/**
 * 
 * @author eytan
 *
 */

public class Tube extends RadialGeometry implements Geometry {

	protected Ray _axisRay;
	protected double _radius;

	// ***************** Constructors ********************** //
	/**
	 * @name Tube
	 * @param _axisRay
	 * @param _radius
	 */
	public Tube(Ray _axisRay, double _radius) {
		this._axisRay = _axisRay;
		this._radius = _radius;
	}

	// ***************** Operations ******************** //
	/**
	 * @name getNormal
	 * @return Vector
	 * @description returns normal vector to tube
	 */
	@Override
	public Vector getNormal(Point3D point) {
		double dist = _axisRay.getP0().distance2(point);
		Vector vec = _axisRay.getDir().scale(Math.sqrt(dist - _radius * _radius));
		Point3D center = _axisRay.getP0().add(vec);
		return point.subtract(center).normal();
	}

}
