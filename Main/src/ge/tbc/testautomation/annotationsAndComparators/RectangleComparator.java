package ge.tbc.testautomation.annotationsAndComparators;

import java.util.Comparator;

public class RectangleComparator implements Comparator<Rectangle> {

    @Override
    public int compare(Rectangle rectangle, Rectangle rectangle1) {
        if (rectangle.getArea() > rectangle1.getArea()) {
            return -1;
        } else if (rectangle.getArea() < rectangle1.getArea()) {
            return 1;
        } else {
            return 0;
        }
    }
}
