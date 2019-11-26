package Primitives;

public class Ray {
	public Vector Ray;
	private Ray _ray;
	
//Constructor
	Ray (Ray ray){
		_ray = ray._ray;
    }
//Getter
	public double get() {
		return (_ray.get());
	}
//Check if 0
	public void checkZero () throws InvalidArgument {
		if (_ray == null)
			throw new InvalidArgument(); 
					
	}
	//toString
	@Override
	public String toString() {
		return "Ray [Ray=" + Ray + "]";
	}
	

	
}
