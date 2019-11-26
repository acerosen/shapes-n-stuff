package Geometries;

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

//Constructor

	public Polygon(Point3D... _points) {
		super();
		this._points = _points;
	}

//Operations

	@Override
	public Vector getNormal(Point3D point) {
		return _plane.getNormal();
	}

}
