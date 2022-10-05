package g59939.atlg3.ascii.main;

import g59939.atlg3.ascii.controller.Application;
import g59939.atlg3.ascii.model.Point;
import g59939.atlg3.ascii.model.Rectangle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Application ascii_app = new Application();
        ascii_app.start();
    }
//    public static void main(String[] args) {
//        StackList<String> stack_city = new StackList<String>();
//        StackList<Double> stack_distance = new StackList<Double>();
//        int number_of_lines = 0;
//
//
//        String nextLine;
//        String city = "";
//        double distance;
//        String[] line;
//        try {
//            BufferedReader allerFile = new BufferedReader(new FileReader("D:\\BLOC 2\\alg3\\aller.txt"));
//            while ((nextLine = allerFile.readLine()) != null) {
//
//                line = nextLine.split(" ");
//                city = line[0];
//                distance = Double.parseDouble(line[1]);
//                stack_city.push(city);
//                stack_distance.push(distance);
//                number_of_lines++;
//            }
//            allerFile.close();
//        } catch (IOException e) {
//            System.out.println("file error");
//            e.printStackTrace();
//        }
//        double last_distance = stack_distance.peek();
//        try {
//            FileWriter retourFile = new FileWriter("D:\\BLOC 2\\alg3\\retour.txt");
//
//            for (int i = 0; i < number_of_lines; i++) {
//                retourFile.write(stack_city.pop()+" "+Double.toString(last_distance - stack_distance.pop())+"\n");
//            }
//            retourFile.close();
//            System.out.println("Successfully wrote to the file.");
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//    }
}
