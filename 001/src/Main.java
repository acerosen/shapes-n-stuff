import Primitives.Vector;
import Primitives.Point3D;
import Primitives.Ray;
import Primitives.Coordinate;

import Geometries.Triangle;




public class Main {

	@SuppressWarnings("null")
	public static void main(String[] args) {
	
	//Primitives Tests
		
		//Point3D Tests
		
		//Vector Test
		Point3D _p2
		_p2.x = new Coordinate(1);
		_p2.y = new Coordinate(1);
		_p2.z = new Coordinate(1);
		Point3D _p3 = null;
		_p3.x = new Coordinate(2);
		_p3.y = new Coordinate(2);
		_p3.z = new Coordinate(2);
		Vector vec = _p2.makeVector(_p3);
		vec.toString();
		
		
		
		
	
	}

}
