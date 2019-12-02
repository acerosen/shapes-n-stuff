import Primitives.Vector;
import Primitives.Point3D;
import Primitives.Ray;
import Primitives.Coordinate;
import Primitives.InvalidArgument;

import java.util.ArrayList;
import java.util.List;

import Geometries.Triangle;

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
		double Dist = _p2.getDistance(_p3);
		double sqrDist = _p2.getSquaredDistance(_p3);
		System.out.println("Distance: " + Dist);
		System.out.println("Squared dstance: " + sqrDist);

		// Vector Tests

		// Addition
		Vector vec = new Vector(1, 1, 1);
		Vector vec2 = new Vector(5, 5, 5);
		System.out.println("Add: " + (vec.add(vec2).toString()));
		// Subtraction
		System.out.println("Sub: " + vec2.vectorSubtraction(vec).toString());
		// Scale
		System.out.println("Scale: " + vec2.vectorScale(10).toString());
		// Dot Product
		System.out.println("Dot: " + vec.dotProduct(vec2));
		// Cross Product
		System.out.println("Cross: " + vec.crossProduct(vec2).toString());
		// Get Normal
		System.out.println("Normal: " + vec.getNormal().toString());


	}
}
