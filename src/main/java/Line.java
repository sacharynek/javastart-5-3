public class Line {

    private Point beginning;
    private Point end;

    public Line(Point beginning, Point end) {
        this.beginning = beginning;
        this.end = end;
    }

    public double getLenght() {
        return Math.sqrt(Math.pow(end.getX() - beginning.getX(), 2) + Math.pow(end.getY() - beginning.getY(), 2));
    }

    public Point getBeginning() {
        return beginning;
    }

    public void setBeginning(Point beginning) {
        this.beginning = beginning;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line{" +
                "beginning=" + beginning +
                ", end=" + end +
                '}';
    }
}
