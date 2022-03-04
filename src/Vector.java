import java.lang.Math;
import java.util.Random;

public class Vector {
    private double X;
    private double Y;
    private double Z;

    public Vector (double X, double Y, double Z) {
        this.X = X;
        this.Y = Y;
        this.Z = Z;
    }

    public double length() {
        return Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2) + Math.pow(Z, 2));
    }

    public double scalarProduct(Vector vector) {
        return (X * vector.getX() + Y * vector.getY() + Z * vector.getZ());
    }

    public Vector vectorProduct(Vector vector) {
        double newCoordinateX = Y * vector.getZ() - Z * vector.getY();
        double newCoordinateY = Z * vector.getX() - X * vector.getZ();
        double newCoordinateZ = X * vector.getY() - Y * vector.getX();
        return (new Vector(newCoordinateX, newCoordinateY, newCoordinateZ));
    }

    public double angleBetweenVector(Vector vector) {
        return scalarProduct(vector) / (length() * vector.length());
    }

    public Vector sumWithVector(Vector vector) {
        return new Vector(X + vector.getX(), Y + vector.getY(), Z + vector.getZ());
    }

    public Vector differenceWithVector (Vector vector) {
        return new Vector(X - vector.getX(), Y - vector.getY(), Z - vector.getZ());
    }

    public static Vector[] generateVectorArray (int arraySize) {
        Vector[] vectorArray = new Vector[arraySize];
        Random random = new Random();
        for (int i = 0; i < vectorArray.length; i++) {
            vectorArray[i] = new Vector(random.nextDouble() * 100, random.nextDouble() * 100, random.nextDouble() * 100);
        }
        return vectorArray;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public double getZ() {
        return Z;
    }
}
