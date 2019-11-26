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
		Point3D _p2 = new Point3D(new Coordinate(1), new Coordinate(1), new Coordinate(1));
		Point3D _p3 = new Point3D(new Coordinate(2), new Coordinate(2), new Coordinate(2));
		Vector vec = _p3.subtract(_p2);
		vec.toString();
		// Distance Test
		double Dist = _p2.getDistance(_p3);
		double sqrDist = _p2.getSquaredDistance(_p3);
		System.out.println("Distance: " + Dist);
		System.out.println("Squared dstance: " + sqrDist);

		// Vector Tests

		// Zero Test
		try {
			vec.checkZero();
		} catch (InvalidArgument e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Addition
		Vector vec2 = new Vector(new Coordinate(5), new Coordinate(5), new Coordinate(5));
		vec.add(vec2).toString();
		// Subtraction
		vec2.vectorSubtraction(vec).toString();
		// Scale
		vec2.vectorScale(10).toString();
		// Dot Product
		System.out.println(vec.dotProduct(vec2));
		// Cross Product
		vec.crossProduct(vec2).toString();
		// Get Normal
		vec.getNormal().toString();

		// Geometries Test

		// Triangle Tests

		// Get Normal
		Point3D _p1 = new Point3D(new Coordinate(0.0), new Coordinate(0), new Coordinate(0));
		List<Point3D> points = new ArrayList<Point3D>();
		points.add(_p1);
		points.add(_p2);
		points.add(_p3);
		Triangle tri = new Triangle(points);
		tri.getNormal().toString();

	}

}
