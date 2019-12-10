package geometries;

import java.util.ArrayList;

import primitives.*;

public class Geometries implements Intersectable {

	private ArrayList<Intersectable> Intersections;

	public Geometries(ArrayList<Intersectable> intersections) {
		super();
		Intersections = intersections;
	}

	public Geometries (Intersectable... geometries) {
		
	}
	
	
	
	public void add(Intersectable... geometries) {
		
	}
	
	public ArrayList<Point3D> findIntersections(Ray ray) {
		return null;
	}

}
