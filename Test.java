package packe;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();
        point = new Point(4.5f,5.0f);
        System.out.println(point);
        MovablePoint move = new MovablePoint();
        move = new MovablePoint(3.5f,3.4f,6.2f,4.5f);
        System.out.println(move);
        move.setSpeed(4.6f,5.6f);
        move.move();
        System.out.println(move.toString());
    }
}
