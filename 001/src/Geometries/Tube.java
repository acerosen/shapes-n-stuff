package Geometries;

import Primitives.Ray;
import Primitives.Vector;

/**
 * 
 * @author eytan
 *
 */

public class Tube extends RadialGeometry implements Geometry {

	public Ray _axisRay;
	private double _radius;

	// ***************** Constructors ********************** //
	/**
	 * @name Tube
	 * @param _axisRay
	 * @param _radius
	 */
	Tube(Ray _axisRay, double _radius) {
		this._axisRay = _axisRay;
		this._radius = _radius;
	}

	// ***************** Operations ******************** //
	/**
	 * @name getNormal
	 * @return Vector
	 * @description returns normal vector to tube
	 */
	public Vector getNormal() {
		return null;
	}

}
