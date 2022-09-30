package g59939.atlg3.ascii.model;

import java.util.*;

public class Circle extends ColoredShape {
    private Point center;
    private double radius;

    public Circle(char color, Point center, double radius) {
        super(color);
        this.center = new Point(center.getX(), center.getY());
        this.radius = radius;
    }

    @Override
    public boolean isInside(Point p) {
        return center.distanceTo(p) <= radius;
    }

    @Override
    public void move(double dx, double dy) {

    }
}
