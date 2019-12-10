package primitives;

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
	public Ray(Point3D p0, Vector dir) {
		this.p0 = p0;
		this.dir = dir.normal();
	}

	// ***************** Getters/Setters ********************** //
	/**
	 * @name getHead
	 * @return Point3D
	 */
	public Point3D get() {
		return (getDir().getHead());
	}	
	/**
	 * @name getP0
	 * @return p0
	 */
	public Point3D getP0() {
		return p0;
	}
	/**
	 * @name getDir
	 * @return dir
	 */
	public Vector getDir() {
		return dir;
	}
	// ***************** Administration ******************** //
	/**
	 * @name toString
	 * @return String
	 */
	@Override
	public String toString() {
		return "[" + getP0() + getDir();
	}





}
