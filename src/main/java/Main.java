public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(10,0);
        Point p3 = new Point(0, 10);

        Line l1 = new Line(p1,p2);
        Line l2 = new Line(p1,p3);

        System.out.println(l1.getLenght());
        System.out.println(l2.getLenght());
    }

}
