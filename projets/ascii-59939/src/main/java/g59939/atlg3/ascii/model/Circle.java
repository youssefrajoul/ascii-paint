package g59939.atlg3.ascii.model;

public class Circle extends ColoredShape {
    private Point center;
    private double radius;

    public Circle(char color, Point center, double radius) {
        super(color);
        this.center = center;
        this.radius = radius;
    }

    @Override
    public boolean isInside(Point p){
        return true;
    }

    @Override
    public void move(double dx, double dy){

    }
}
