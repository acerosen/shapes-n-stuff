package Geometries;
import Primitives.Point3D;
import Primitives.Vector;

/**
 * 
 * @author eytan
 *
 */

public class Triangle {
	public Plane _plane;
	public Point3D _p1;
	public Point3D _p2;
	public Point3D _p3;
	public Triangle _triangle;
	
	
	
	
public Triangle(Point3D _p1, Point3D _p2, Point3D _p3) {
		super();
		this._p1 = _p1;
		this._p2 = _p2;
		this._p3 = _p3;
	}




//Operations
	
	//Get Normal Vector
	@SuppressWarnings("null")
	public Vector getNormal () {
		Vector Result = null;
		Vector Vec1= null;
		Vector Vec2= null;
		Vec1= _p2.makeVector(_p1);
		Vec2= _p3.makeVector(_p2);
		Result.x = (Vec1.y.multiply(Vec2.z)).subtract(Vec1.z.multiply(Vec2.y));
		Result.y = ((Vec1.x.multiply(Vec2.z)).subtract(Vec1.z.multiply(Vec2.x)).scale(-1));
		Result.z = ((Vec1.x.multiply(Vec2.y).subtract(Vec1.x.multiply(Vec2.y))));
		return Result;
	}

}
