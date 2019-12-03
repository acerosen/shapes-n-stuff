package Geometries;

import java.util.ArrayList;
import java.util.List;

import Primitives.Point3D;
import Primitives.Vector;

/**
 * 
 * @author eytan
 *
 */

public class Polygon implements Geometry {
	protected List<Point3D> _points;
	protected Plane _plane;

	// ***************** Constructors ********************** //
	/**
	 * @name Polygon
	 * @param points
	 */
	public Polygon(Point3D... points) {
		_points = new ArrayList<>();
		_plane = new Plane(points[0], points[1], points[2]);
		Vector normal = _plane.getNormal(null);
		for (int i = 0; i < points.length; ++i) {
			_points.add(points[i]);
			if (i > 2 && !isZero(points[0].subtract(points[i]).dot(normal)))
				throw new IllegalArgumentException();
		}
	}

	// ***************** Operations ******************** //
	/**
	 * @name getNormal
	 * @return Vector
	 * @description returns normal to polygon
	 */
	@Override
	public Vector getNormal(Point3D point) {
		return _plane.getNormal();
	}

}
