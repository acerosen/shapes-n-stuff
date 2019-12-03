package Geometries;

import Primitives.*;

public class Cylinder extends Tube {

	public double _height;

	// ***************** Constructors ********************** //
	/**
	 * @name Cylinder
	 * @param _radius
	 * @param _height
	 * @param _axis
	 */
	Cylinder(double _radius, double _height, Ray _axis) {
		super(_axis, _radius);
		if (_height > 0)
			this._height = _height;
		else
			throw new IllegalArgumentException("Radius is smaller than 0");
	}

	// ***************** Operations ******************** //
	/**
	 * @name getNormal
	 * @return Vector
	 * @description returns normal vector to cylinder
	 */
	public Vector getNormal() {
		return null;
	}

}
