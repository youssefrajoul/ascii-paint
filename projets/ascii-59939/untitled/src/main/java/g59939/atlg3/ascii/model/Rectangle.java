package g59939.atlg3.ascii.model;

public class Rectangle extends ColoredShape {
    private Point upperLeft;
    private double width;
    private double height;

    public Rectangle(char color, Point upperLeft, double width, double height) {
        super(color);
        this.upperLeft = upperLeft;
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean isInside(Point p){
        Point upperRight = new Point(p.getX()+width, p.getY());
        Point lowerLeft = new Point(p.getX(), p.getY()+height);
        return p.getX() >= upperRight.getX() && p.getX() <= upperLeft.getX()
                && p.getY() >= upperRight.getY() && p.getY() <= lowerLeft.getY();
    }

    @Override
    public void move(double dx, double dy){
        upperLeft.move(dx, dy);
    }

    @Override
    public char getColor() {
        return 0;
    }
}
