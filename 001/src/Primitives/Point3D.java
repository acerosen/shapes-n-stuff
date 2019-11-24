package Primitives;
import java.lang.Math;

public class Point3D {
	public Coordinate x;
	public Coordinate y;
	public Coordinate z;
	private Point3D _point3D;
	private Point3D other;
	
	//Constructor
	Point3D (Point3D point){
		_point3D= point._point3D;
	}
	//Getter
	public double get() {
		return (_point3D.x.get(), _point3D.y.get(), _point3D.z.get());
	}
//Operations
	//Subtract point from point to make vector
	@SuppressWarnings("null")
	public Vector makeVector (Point3D _point) {
		Vector Vec = null;
		Vec.x = _point.x.subtract(_point.other.x) ;
		Vec.y = _point.y.subtract(_point.other.y) ;
		Vec.z = _point.z.subtract(_point.other.z) ;
		return Vec;
	}
	//Get distance between two points
	public double getSquaredDistance (Point3D _point) {
		Coordinate coord1 =(_point.x.subtract(_point.other.x));
		Coordinate coord2= (_point.y.subtract(_point.other.y));
		Coordinate coord3= (_point.z.subtract(_point.other.z));
		double x = Math.pow(coord1.get(), 2);
		double y = Math.pow(coord2.get(), 2);
		double z = Math.pow(coord3.get(), 2);
		return x+y+z;
	}
	public double getDistance (Point3D _point) {
		return Math.pow(_point.getDistance(_point.other), 0.5);
	}
	
	
	
	

}
