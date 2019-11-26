package Primitives;

import java.lang.Math;

/**
 * 
 * @author eytan
 *
 */

public class Point3D {
	public static Point3D ZERO = new Point3D(0, 0, 0);

	private Coordinate _x;
	private Coordinate _y;
	private Coordinate _z;

	// Constructor
	Point3D(Point3D point) {
		_x = new Coordinate(point._x);
		_y = new Coordinate(point._y);
		_z = new Coordinate(point._z);
	}

	public Point3D(Coordinate x, Coordinate y, Coordinate z) {
		_x = new Coordinate(x);
		_y = new Coordinate(y);
		_z = new Coordinate(z);
	}

	public Point3D(double x, double y, double z) {
		_x = new Coordinate(x);
		_y = new Coordinate(y);
		_z = new Coordinate(z);
	}

	// Getter

	public Coordinate getX() {
		return _x;
	}

	public Coordinate getY() {
		return _y;
	}

	public Coordinate getZ() {
		return _z;
	}

	// Operations
	// Subtract point from point to make vector
	public Vector subtract(Point3D other) {
		double x = _x.get() - other._x.get();
//		Vec.y = _point._y.subtract(_point.other._y);
//		Vec.z = _point._z.subtract(_point.other._z);
		return new Vector(x, y, z);
	}

	// Get distance between two points
	public double getSquaredDistance(Point3D _point) {
		Coordinate coord1 = (_point._x.subtract(_point.other._x));
		Coordinate coord2 = (_point._y.subtract(_point.other._y));
		Coordinate coord3 = (_point._z.subtract(_point.other._z));
		double x = (coord1.multiply(coord1)).get();
		double y = (coord2.multiply(coord2)).get();
		double z = (coord3.multiply(coord3)).get();

		return x + y + z;
	}

	public double getDistance(Point3D _point) {
		return Math.sqrt(getDistance(_point.other));
	}

	// toString
	@Override
	public String toString() {
		return "(" + _x + "," + _y + "," + _z + ")";
	}

}
