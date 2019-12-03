package Geometries;

import Primitives.Point3D;
import Primitives.Vector;

/**
 * 
 * @author eytan
 *
 */

public class Sphere extends RadialGeometry {

	public Point3D _center;

	// ***************** Operations ******************** //
	/**
	 * @name getNormal
	 * @return Vector
	 * @description returns normal to sphere
	 */
	public Vector getNormal(Point3D point) {
		return (point.subtract(_center).normal());
}
