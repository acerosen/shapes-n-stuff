import geometries.*;
import primitives.*;

/**
 * 
 * @author eytan
 *
 */

public class Main {

	public static void main(String[] args) {

		// Primitives Tests

		// Point3D Tests

		// Vector Test
		Point3D _p2 = new Point3D(1, 1, 1);
		Point3D _p3 = new Point3D(2, 2, 2);
		System.out.println("Sub: " + _p3.subtract(_p2).toString());
		// Distance Test
		double Dist = _p2.distance(_p3);
		double sqrDist = _p2.distance2(_p3);
		System.out.println("Distance: " + Dist);
		System.out.println("Squared distance: " + sqrDist);

		// Vector Tests

		// Addition
		Vector vec = new Vector(1, 2, 3);
		Vector vec2 = new Vector(5, 5, 5);
		Vector vec3 = new Vector(5, 5, 5);
		System.out.println("Add: " + (vec.add(vec2).toString()));
		// Subtraction
		System.out.println("Sub: " + vec2.subtract(vec).toString());
		// Scale
		System.out.println("Scale: " + vec2.scale(10).toString());
		// Dot Product
		System.out.println("Dot: " + vec.dot(vec2));
		// Cross Product
		System.out.println("Cross: " + vec.cross(vec2).toString());
		// Get Normal
		System.out.println("Normalized: " + vec2.normal().toString());
		// Equals
		System.out.println("Equals (expected false): " + vec.equals(vec2));
		System.out.println("Equals (expected true): " + vec2.equals(vec3));

		Tube tube = new Tube(new Ray(new Point3D(0, 0, 0), new Vector(0, 1, 0)), 1);
		System.out.println("Normal to Tube: " + tube.getNormal(new Point3D(1, 1, 0)).toString());

		Cylinder cylinder = new Cylinder(1, 2, (new Ray(new Point3D(0, 0, 0), new Vector(0, 1, 0))));
		System.out.println("Normal to Cylinder: " + cylinder.getNormal(new Point3D(1, 1, 0)).toString());

		// radius = 1
		// center = 0,0,0
		// dir = 0,1,0
		// point = 1,1,0
		// result = 1,0,0
	}
}
