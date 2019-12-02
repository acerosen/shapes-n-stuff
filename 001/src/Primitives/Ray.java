package Primitives;

/**
 * 
 * @author eytan
 *
 */

public class Ray {
	private Vector dir;
	private Point3D p0;

//Constructor
	Ray(Point3D p0, Vector dir) {
		this.p0 = p0;
		this.dir = dir.getNormal();
	}

//Getter
	public Point3D get() {
		return (dir.getHead());
	}

	// toString
	@Override
	public String toString() {
		return "[" + p0 + dir;
	}

}
