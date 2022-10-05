package g59939.atlg3.ascii.controller;

import g59939.atlg3.ascii.model.AsciiPaint;
import g59939.atlg3.ascii.model.Shape;
import g59939.atlg3.ascii.view.AsciiView;

import java.io.*;
import java.util.*;

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
        paint = new AsciiPaint(20, 50);
        view = new AsciiView();
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        int quit = 0;
        while (quit == 0) {
            paint.clearShapesList();
            askInputs();
            view.displayDrawing(paint.getDrawing());
            System.out.println("To Quit enter 1 to continue drawing enter 0");
            quit = scan.nextInt();
        }
    }

    private void askInputs() {
        String nextLine;
        String[] inputs;
        String shape = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (!(nextLine = br.readLine()).equals("show")) {
                inputs = nextLine.split(" ");
                shape = inputs[1];
                whichShape(shape, inputs);
            }

        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

    private void whichShape(String shape, String[] inputs) {
        if (shape.equals("circle")) {
            paint.newCircle(Integer.parseInt(inputs[2]),
                    Integer.parseInt(inputs[3]),
                    Double.parseDouble(inputs[4]),
                    inputs[5].charAt(0));
        }
        if (shape.equals("rectangle")) {
            paint.newRectangle(Integer.parseInt(inputs[2]),
                    Integer.parseInt(inputs[3]),
                    Double.parseDouble(inputs[4]),
                    Double.parseDouble(inputs[5]),
                    inputs[6].charAt(0));
        }
        if (shape.equals("square")) {
            paint.newSquare(Integer.parseInt(inputs[2]),
                    Integer.parseInt(inputs[3]),
                    Double.parseDouble(inputs[4]),
                    inputs[5].charAt(0));
        }
    }
}
