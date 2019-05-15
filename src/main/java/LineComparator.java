public class LineComparator {

    public static Line whichLonger(Line line1, Line line2) {
        if (line1.getLenght() - line2.getLenght() > 0) {
            return line1;
        } else if (line1.getLenght() - line2.getLenght() < 0) {
            return line2;
        } else {
            return null;
        }
    }


}
