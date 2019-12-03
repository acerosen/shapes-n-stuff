package Primitives;

/**
 * 
 * @author eytan
 *
 */

public class Ray {
	private Vector dir;
	private Point3D p0;

	// ***************** Constructors ********************** //
	/**
	 * @name Ray
	 * @param p0
	 * @param dir
	 */
	Ray(Point3D p0, Vector dir) {
		this.p0 = p0;
		this.dir = dir.getNormal();
	}

	// ***************** Getters/Setters ********************** //
	/**
	 * @name getHead
	 * @return Point3D
	 */
	public Point3D get() {
		return (dir.getHead());
	}

	// ***************** Administration ******************** //
	/**
	 * @name toString
	 * @return String
	 */
	@Override
	public String toString() {
		return "[" + p0 + dir;
	}

}
