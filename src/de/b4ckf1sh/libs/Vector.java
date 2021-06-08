package de.b4ckf1sh.libs;

import de.b4ckf1sh.beziercurves.BezierCurveGUI;

/**
 * Simple vector representation in 2-dimensional space, including addition and scalar multiplication.
 *
 * @version 1.0.6
 * @author B4CKF1SH
 */
public class Vector {

    private int x;
    private int y;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static Vector multiply(Vector v, double factor) {
        return new Vector((int) (v.x * factor), (int) (v.y * factor));
    }

    public static Vector add(Vector v1, Vector v2) {
        return new Vector(v1.x + v2.x, v1.y + v2.y);
    }

    public int lengthSquared() {
        return x*x + y*y;
    }

    public double length() {
        return Math.sqrt(lengthSquared());
    }
}
