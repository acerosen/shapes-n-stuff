package geometries;

import primitives.Point3D;
import primitives.Vector;

/**
 * 
 * @author eytan
 *
 */

public interface Geometry extends Intersectable {
	Vector getNormal(Point3D point);
}
