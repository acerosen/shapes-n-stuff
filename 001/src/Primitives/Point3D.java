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

	// ***************** Constructors ********************** //
	/**
	 * @name Point3D
	 * @param point
	 */
	Point3D(Point3D point) {
		_x = new Coordinate(point._x);
		_y = new Coordinate(point._y);
		_z = new Coordinate(point._z);
	}
	/**
	 * @name Point3D
	 * @param x
	 * @param y
	 * @param z
	 */
	public Point3D(Coordinate x, Coordinate y, Coordinate z) {
		_x = new Coordinate(x);
		_y = new Coordinate(y);
		_z = new Coordinate(z);
	}
	/**
	 * Point3D
	 * @param x
	 * @param y
	 * @param z
	 */
	public Point3D(double x, double y, double z) {
		_x = new Coordinate(x);
		_y = new Coordinate(y);
		_z = new Coordinate(z);
	}

	// ***************** Getters/Setters ********************** //
	/**
	 * @name getX
	 * @return Coordinate
	 */
	public Coordinate getX() {
		return _x;
	}
	/**
	 * @name getY
	 * @return Coordinate
	 */
	public Coordinate getY() {
		return _y;
	}
	/**
	 * @name getZ
	 * @return Coordinate
	 */
	public Coordinate getZ() {
		return _z;
	}

	// ***************** Operations ******************** //
	/**
	 * @name subtract
	 * @param point
	 * @return: Vector
	 * @description Subtracts Point from This to create vector
	 */

	// Subtract point from point to make vector
	public Vector subtract(Point3D point) {
		double x = _x.get() - point._x.get();
		double y = _y.get() - point._y.get();
		double z = _z.get() - point._z.get();
		return new Vector(x, y, z);
	}

	/**
	 * @name getSquaredDistance
	 * @param _point
	 * @return double
	 * @description Gets distance (without sqrt) between 2 points
	 */
	public double getSquaredDistance(Point3D _point) {
		Coordinate coord1 = new Coordinate(_x.subtract(_point._x));
		Coordinate coord2 = new Coordinate(_y.subtract(_point._y));
		Coordinate coord3 = new Coordinate(_z.subtract(_point._z));
		double x = (coord1.multiply(coord1)).get();
		double y = (coord2.multiply(coord2)).get();
		double z = (coord3.multiply(coord3)).get();

		return x + y + z;
	}

	/**
	 * @name getDistance
	 * @param _point
	 * @return double
	 * @description returns distance with sqrt
	 */
	public double getDistance(Point3D _point) {
		return Math.sqrt(getSquaredDistance(_point));
	}

	// ***************** Administration ******************** //
	/**
	 * @name equals
	 * @param _point
	 * @return boolean
	 * @description checks if two points are equal
	 */
	public boolean equals(Point3D _point) {
		if (this == _point)
			return true;
		if (_point == null)
			return false;
		if (getClass() != _point.getClass())
			return false;
		Point3D other = (Point3D) _point;
		if (_x == null) {
			if (other._x != null)
				return false;
		} else if (!_x.equals(other._x))
			return false;
		if (_y == null) {
			if (other._y != null)
				return false;
		} else if (!_y.equals(other._y))
			return false;
		if (_z == null) {
			if (other._z != null)
				return false;
		} else if (!_z.equals(other._z))
			return false;
		return true;
	}

	/**
	 * @name toString
	 * @return String
	 */
	@Override
	public String toString() {
		return "(" + _x + "," + _y + "," + _z + ")";
	}

}
