package Primitives;

/**
 * 
 * @author eytan
 *
 */

public class Vector {
	private Point3D _head;

	// Constructor
	Vector(Vector vector) {
		_head = new Point3D(vector._head);
	}

	public Vector(Coordinate x, Coordinate y, Coordinate z) {
		_head = new Point3D(x, y, z);
		if (Point3D.ZERO.equals(_head))
			throw new IllegalArgumentException("Zero vector");
	}

	public Vector(double x, double y, double z) {
		_head = new Point3D(x, y, z);
		if (Point3D.ZERO.equals(_head))
			throw new IllegalArgumentException("Zero vector");
	}

	// Getter
	public Point3D getHead() {
		return _head;
	}

//Operations
	// Vector Addition
	public Vector add(Vector other) {
		double x = _head.getX().get() + other._head.getX().get();
//		Result.y = _vector.y.add(_vector.other.y);
//		Result.z = _vector.z.add(_vector.other.z);
		return new Vector(x, y, z);
	}

	// Vector Subtraction
	@SuppressWarnings("null")
	public Vector vectorSubtraction(Vector _vector) {
		Vector Result = null;
		Result.x = _vector.x.subtract(_vector.other.x);
		Result.y = _vector.y.subtract(_vector.other.y);
		Result.z = _vector.z.subtract(_vector.other.z);
		return Result;
	}

	// Scaling a Vector
	@SuppressWarnings("null")
	public Vector vectorScale(double num) {
		Vector Result = null;
		Result.x = _vector.x.scale(num);
		Result.y = _vector.y.scale(num);
		Result.z = _vector.z.scale(num);
		return Result;
	}

	// Dot Product
	public double dotProduct(Vector _vector) {
		double x = _vector.x.get() * _vector.other.x.get();
		double y = _vector.y.get() * _vector.other.y.get();
		double z = _vector.z.get() * _vector.other.z.get();
		return x + y + z;
	}

	// Cross Product
	@SuppressWarnings("null")
	public Vector crossProduct(Vector _vector) {
		Vector Result = null;
		Result.x = (_vector.y.multiply(_vector.other.z)).subtract(_vector.z.multiply(_vector.other.y));
		Result.y = (_vector.z.multiply(_vector.other.x)).subtract(_vector.x.multiply(_vector.other.z));
		Result.z = (_vector.x.multiply(_vector.other.y)).subtract(_vector.y.multiply(_vector.other.x));
		return Result;
	}

	// Get Normal
	public Vector getNormal() {
		Point3D zero = null;
		Vector Result = null;
		double distance = _vector.head.getDistance(zero);
		Result = _vector.vectorScale(1 / distance);
		return Result;
	}
	
	// toString
	@Override
	public String toString() {
		return "->" + _head;
	}

}
