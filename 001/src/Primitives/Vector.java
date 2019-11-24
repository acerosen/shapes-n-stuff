package Primitives;
import Point3D;
public class Vector {
	public Point3D head;
	public Coordinate x;
	public Coordinate y;
	public Coordinate z;
	private Vector _vector;
	private Vector other;
	
	//Constructor
	Vector (Vector vector){
		_vector = vector._vector;
	}
	//Check if 0
	public void checkZero () throws InvalidArgument {
		if (_vector == null)
			throw new InvalidArgument(); 
				
	}
	Point3D Head (Vector vector) {
		Point3D Head = null;
		Head.x = vector.x;
		head.y = vector.y;
		head.z = vector.z;
		return Head;
	}
	//Getter
	public double get() {
		return (_vector.head.get());
	}
	
//Operations
	//Vector Addition
	@SuppressWarnings("null")
	public Vector vectorAddition (Vector _vector) {
		Vector Result = null;
		Result.x = _vector.x.add(_vector.other.x);
		Result.y = _vector.y.add(_vector.other.y);
		Result.z = _vector.z.add(_vector.other.z);
		return Result;
	}
	//Vector Subtraction
	@SuppressWarnings("null")
	public Vector vectorSubtraction (Vector _vector) {
		Vector Result = null;
		Result.x = _vector.x.subtract(_vector.other.x);
		Result.y = _vector.y.subtract(_vector.other.y);
		Result.z = _vector.z.subtract(_vector.other.z);
		return Result;
	}
	//Scaling a Vector
	@SuppressWarnings("null")
	public Vector vectorScale (double num) {
		Vector Result = null;
		Result.x = _vector.x.scale(num);
		Result.y = _vector.y.scale(num);
		Result.z = _vector.z.scale(num);
		return Result;
	}
	//Dot Product
	public double dotProduct (Vector _vector) {
		double x =_vector.x.get() * _vector.other.x.get();
		double y =_vector.y.get() * _vector.other.y.get();
		double z =_vector.z.get() * _vector.other.z.get();
		return x+y+z;
	}
	
	//Cross Product
	@SuppressWarnings("null")
	public Vector crossProduct (Vector _vector) {
		Vector Result = null;
		Result.x = ( _vector.y.multiply(_vector.other.z)).subtract(_vector.z.multiply(_vector.other.y));
		Result.y = (_vector.z.multiply(_vector.other.x)).subtract(_vector.x.multiply(_vector.other.z));
	    Result.z = (_vector.x.multiply(_vector.other.y)).subtract(_vector.y.multiply(_vector.other.x));
	    return Result;
	}
	//Get Normal
	public Vector getNormal () {
		Point3D zero = null;
		Vector Result = null;
		double distance = _vector.head.getDistance(zero);
		Result = _vector.vectorScale(1/distance);
		return Result;
	}

}
