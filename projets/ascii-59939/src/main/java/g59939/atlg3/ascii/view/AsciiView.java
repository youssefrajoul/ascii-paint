package g59939.atlg3.ascii.view;

import g59939.atlg3.ascii.model.Drawing;
import g59939.atlg3.ascii.model.Point;

public class AsciiView {

    public AsciiView(){

    }

    public void displayDrawing(Drawing drawing) {
        for (int i = 0; i < drawing.getHeight(); i++) {
            System.out.print("|");
            for (int j = 0; j < drawing.getWidth(); j++) {
                Point point = new Point(j, i);
                if (drawing.getShapeAt(point) != null) {
                    System.out.print(drawing.getShapeAt(point).getColor());
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("|");
            System.out.println("");
        }
    }

    public void displayHelp() {
        System.out.println("input examples:\n" + "add circle 5 3 1 c\n" + "add rectangle 10 10 5 20 r\n" + "show");
    }
}
