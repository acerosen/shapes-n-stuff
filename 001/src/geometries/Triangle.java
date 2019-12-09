package geometries;

import primitives.Point3D;

/**
 * 
 * @author eytan
 *
 */

public class Triangle extends Polygon {

	// ***************** Constructors ********************** //
	/**
	 * @name Triangle
	 * @param _p1
	 * @param _p2
	 * @param _p3
	 */
	public Triangle(Point3D _p1, Point3D _p2, Point3D _p3) {
		super(_p1, _p2, _p3);
	}

	// ***************** Administration ******************** //
	/**
	 * @name toString
	 */
	@Override
	public String toString() {
		return "△[" + _points + "]";
	}

}
