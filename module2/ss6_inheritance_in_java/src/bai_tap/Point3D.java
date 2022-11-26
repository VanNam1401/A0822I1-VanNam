package bai_tap;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] temps = new float[3];
        temps[0] = super.getX();
        temps[1] = super.getY();
        temps[2] = this.z;
        return temps;
    }

    public String toString() {
        return '(' + this.getX() + ", " + this.getY() + ", " + this.getZ() + ')';
    }
}
