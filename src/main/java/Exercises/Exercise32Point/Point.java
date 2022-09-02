package Exercises.Exercise32Point;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

//    d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
    public double distance(){
        Double dX = (double) this.x;
        Double dY = (double) this.y;
        double sqrt = Math.sqrt(Math.pow(dX, 2) + Math.pow(dY, 2));
        return sqrt;
    }

    public double distance(int x, int y){
        Double dX = (double) this.x;
        Double dY = (double) this.y;
        Double dX2 = (double) x;
        Double dY2 = (double) y;

        double sqrt = Math.sqrt(Math.pow(dX - dX2, 2) + Math.pow(dY -dY2, 2));
        return sqrt;
    }

    public double distance(Point point){
        Double dX = (double) this.x;
        Double dY = (double) this.y;
        Double dX2 = (double) point.getX();
        Double dY2 = (double) point.getY();

        double sqrt = Math.sqrt(Math.pow(dX - dX2, 2) + Math.pow(dY -dY2, 2));
        return sqrt;
    }


}
