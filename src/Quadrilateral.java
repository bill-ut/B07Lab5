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
        return (A.distance(B) == B.distance(C) && B.distance(C) == C.distance(D) && A.distance(D) == C.distance(D));
    }

    public boolean isParallelogram() {
        double sumOfLengths = Math.pow(A.distance(B), 2) + Math.pow(B.distance(C), 2) + Math.pow(C.distance(D), 2) + Math.pow(A.distance(D), 2);
        double sumOfDiagonals = Math.pow(A.distance(D), 2) + Math.pow(B.distance(D), 2);

        return sumOfLengths == sumOfDiagonals;
    }
}
