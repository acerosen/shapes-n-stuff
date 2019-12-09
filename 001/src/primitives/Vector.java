package primitives;

/**
 * 
 * @author eytan
 *
 */

public class Vector {
	private Point3D _head;

	// ***************** Constructors ********************** //
	/**
	 * @param vector
	 * @return Vector
	 */

	Vector(Vector vector) {
		_head = new Point3D(vector._head);
	}

	/**
	 * @name Vector
	 * @param x
	 * @param y
	 * @param z
	 * @return Vector
	 */

	public Vector(Coordinate x, Coordinate y, Coordinate z) {
		_head = new Point3D(x, y, z);
		if (Point3D.ZERO.equals(_head))
			throw new IllegalArgumentException("Zero vector");
	}
	/**
	 * @name Vector
	 * @param x
	 * @param y
	 * @param z
	 */

	public Vector(double x, double y, double z) {
		_head = new Point3D(x, y, z);
		if (Point3D.ZERO.equals(_head))
			throw new IllegalArgumentException("Zero vector");
	}

	// ***************** Getters/Setters ********************** //
	/**
	 * @name getHead
	 * @return _head
	 */
	public Point3D getHead() {
		return _head;
	}

	// ***************** Operations ******************** //
	/**
	 * @name add
	 * @param vec
	 * @return Vector
	 * @description adds 2 vectors and returns result vector
	 */
	public Vector add(Vector vec) {
		double x = _head.getX().get() + vec._head.getX().get();
		double y = _head.getY().get() + vec._head.getY().get();
		double z = _head.getZ().get() + vec._head.getZ().get();
		return new Vector(x, y, z);
	}

	/**
	 * @name vectorSubtraction
	 * @param _vector
	 * @return Vector
	 * @description adds 2 vectors and returns result vector
	 */
	public Vector subtract(Vector _vector) {
		return new Vector((_head.getX().subtract(_vector._head.getX())), (_head.getY().subtract(_vector._head.getY())),
				(_head.getZ().subtract(_vector._head.getZ())));
	}

	/**
	 * @name scale
	 * @param num
	 * @return Vector
	 * @description scales vector by scalar and returns result vector
	 */
	public Vector scale(double num) {
		return new Vector((_head.getX().scale(num)), (_head.getY().scale(num)), (_head.getZ().scale(num)));
	}

	/**
	 * @name dot
	 * @param _vector
	 * @return double
	 * @description returns dot product of vector
	 */
	public double dot(Vector _vector) {
		double x = _head.getX().get() * _vector._head.getX().get();
		double y = _head.getY().get() * _vector._head.getY().get();
		double z = _head.getZ().get() * _vector._head.getZ().get();
		return x + y + z;
	}

	/**
	 * @name cross
	 * @param _vector
	 * @return Vector
	 * @description returns dot product of vector
	 */
	public Vector cross(Vector _vector) {
		Double x = (_head.getY().get()) * (_vector._head.getZ().get())
				- (_head.getZ().get()) * (_vector._head.getY().get());
		Double y = (_head.getZ().get()) * (_vector._head.getX().get())
				- (_head.getX().get()) * (_vector._head.getZ().get());
		Double z = (_head.getX().get()) * (_vector._head.getY().get())
				- (_head.getY().get()) * (_vector._head.getX().get());
		return new Vector(x, y, z);
	}

	/**
	 * @name getNormal
	 * @return Vector
	 * @description returns normalized vector
	 */
	public Vector normal() {
		return (scale(1 / _head.distance(new Point3D(0, 0, 0))));
	}

	// ***************** Administration ******************** //
	/**
	 * @name equals
	 * @param vec
	 * @return boolean
	 * @description checks if two vectors are equal
	 */
	public boolean equals(Vector vec) {
		return (_head.equals(vec._head));
	}

	/**
	 * @name toString
	 * @return String
	 */
	@Override
	public String toString() {
		return "->" + _head;
	}

}
