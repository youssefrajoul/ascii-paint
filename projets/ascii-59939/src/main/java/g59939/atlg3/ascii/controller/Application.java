package g59939.atlg3.ascii.controller;

import g59939.atlg3.ascii.model.AsciiPaint;
import g59939.atlg3.ascii.model.Shape;
import g59939.atlg3.ascii.view.AsciiView;

public class Application {
    /*  -- instructions du prof atlg3--
        private model;
        private view;

        1 gerer la boucle applicative
        public start () {
            while () {
                add;
                show;
                exit;
                help;
            }
        }
        2 traduire les interactions utilisateur  en action sur le model
     */
    private AsciiPaint paint;
    private AsciiView view;

    public Application() {
        paint = new AsciiPaint(20, 20);
        view = new AsciiView();
    }

    public void start() {
        //while (true) {
        paint.newCircle(10, 10, 5, 'c');
        paint.newSquare(5, 5, 5, 's');
        paint.newRectangle(5, 5, 10, 5, 'r');
        view.displayHelp();
        view.displayDrawing(paint.getDrawing());
        //}
    }
}
