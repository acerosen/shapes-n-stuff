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
		double y = _head.getY().get() + other._head.getY().get();
		double z = _head.getZ().get() + other._head.getZ().get();
		return new Vector(x, y, z);
	}

	// Vector Subtraction
	public Vector vectorSubtraction(Vector _vector) {
		return new Vector((_head.getX().subtract(_vector._head.getX())), (_head.getY().subtract(_vector._head.getY())),
				(_head.getZ().subtract(_vector._head.getZ())));
	}

	// Scaling a Vector
	public Vector vectorScale(double num) {
		return new Vector((_head.getX().scale(num)), (_head.getY().scale(num)), (_head.getZ().scale(num)));
	}

	// Dot Product
	public double dotProduct(Vector _vector) {
		double x = _head.getX().get() * _vector._head.getX().get();
		double y = _head.getY().get() * _vector._head.getY().get();
		double z = _head.getZ().get() * _vector._head.getZ().get();
		return x + y + z;
	}

	// Cross Product
	public Vector crossProduct(Vector _vector) {
		Double x = (_head.getY().get()) * (_vector._head.getZ().get())
				- (_head.getZ().get()) * (_vector._head.getY().get());
		Double y = (_head.getZ().get()) * (_vector._head.getX().get())
				- (_head.getX().get()) * (_vector._head.getZ().get());
		Double z = (_head.getX().get()) * (_vector._head.getY().get())
				- (_head.getY().get()) * (_vector._head.getX().get());
		return new Vector(x, y, z);
	}

	// Get Normal
	public Vector getNormal() {
		Vector zero = new Vector (0, 0, 0);
		double distance = _head.getDistance(zero._head);
		return (vectorScale(1 / distance));
	}

	// toString
	@Override
	public String toString() {
		return "->" + _head;
	}

}
