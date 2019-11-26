package Geometries;

import Primitives.Point3D;
import Primitives.Vector;

/**
 * 
 * @author eytan
 *
 */

public interface Geometry {
	Vector getNormal(Point3D point);
}
