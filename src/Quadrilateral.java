package lab4;

public class Quadrilateral {
    Point A, B, C, D;

    public Quadrilateral(Point A, Point B, Point C, Point D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    public boolean isRhombus() {
        return false;
    }

    public boolean isParallelogram() {
        return false;
    }
}
