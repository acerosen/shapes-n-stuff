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
	public double get() {
		return (_ray.get());
	}

//Check if 0
	public void checkZero() throws InvalidArgument {
		if (_ray == null)
			throw new InvalidArgument();

	}

	// toString
	@Override
	public String toString() {
		return "[" + p0 + dir;
	}

}
