package g59939.atlg3.ascii.model;

import java.util.*;

public class Drawing {
    private ArrayList<Shape> shapes;
    private int height;
    private int width;


    public Drawing() {

    }

    public Drawing(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public Shape getShapeAt(Point point) {
        for(Shape element : shapes) {
            if (element.isInside(point))
                return element;
        }
        return null;
    }

    public int getHeight(){
        return height;
    }

    public int getWidth(){
        return width;
    }
}
