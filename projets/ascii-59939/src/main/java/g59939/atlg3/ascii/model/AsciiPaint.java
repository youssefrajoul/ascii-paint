package g59939.atlg3.ascii.model;

public class AsciiPaint {
    private Drawing drawing;

    public AsciiPaint() {
        // Default parameters
        this.drawing = new Drawing(50, 50);
    }

    public AsciiPaint(int height, int width) {
        this.drawing = new Drawing(height, width);
    }
    public void newCircle(int x,int y, double radius, char color) {
        Point point = new Point(x, y);
        Circle circle = new Circle(point, radius, color);
        drawing.addShape(circle);
    }

    public void newRectangle(int x, int y, double width, double height, char color) {
        Point point = new Point(x, y);
        Rectangle rectangle = new Rectangle(point, width, height, color);
        drawing.addShape(rectangle);
    }

    public void newSquare(int x, int y, double side, char color) {
        Point point = new Point(x, y);
        Square square = new Square(point, side, color);
        drawing.addShape(square);
    }

    public Drawing getDrawing(){
        return this.drawing;
    }

    public void clearShapesList(){
        drawing.clearShapes();
    }
}
