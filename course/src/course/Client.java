
package course;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author M00609897
 */
public class Client {
   

    private int port;
    private String host;

   Client(String host, int port) {
        this.port = port;
        this.host = host;
    }

    public void start() {
        int option = 0;

        System.out.println("Shapes Application");

        while (option != 3) {

            System.out.println("Enter an option");
            System.out.println("1. 2D Shapes");
            System.out.println("2. 3D Shapes");
            System.out.println("3. Exit");
            Scanner scanner = new Scanner(System.in);

            option = scanner.nextInt();

            if (option == 1) {
                System.out.println("You have chosen 2D Shapes");
                System.out.println("");
                
                System.out.println("Enter an option: ");
                System.out.println("1. Create Triangle :");
                System.out.println("2. Create Circle   :");
                System.out.println("3. Create Rectangle:");
                System.out.println("4. Exit");
                String twoDOption = scanner.next();

                if (twoDOption.equals("1")) {
                    System.out.println("Enter Shape's Name:");
                    String name = scanner.next();
                    System.out.println("Enter values for Triangle");
                    System.out.println("Side 1: ");
                    double s1 = scanner.nextDouble();
                    System.out.println("Side 2:");
                    double s2 = scanner.nextDouble();
                    System.out.println("Height:");
                    double s3 = scanner.nextDouble();
                    double s4 = scanner.nextDouble();

                    Triangle triangle = new Triangle(name, s1, s2, s3, s4) {};

                    triangle.displayDescription();

                    System.out.println("Area     :" + triangle.getArea());

                    System.out.println("Perimeter:" + triangle.getPerimeter());

                    //Calculate the area and perimeter and then store in ArrayList<Shape>
                    System.out.println("Send the triangle " + name + " to the server");
                    System.out.println("Select y for yes and n for no");
                    String response = scanner.next();
                    //Based on user input, either send the triangle to the server or not.

                } else if (twoDOption.equals("2")) {
                    System.out.println("Enter Shape's Name:");
                    String name = scanner.next();
                    System.out.println("Enter Dimentions of Circle");
                    System.out.println("Radius");
                    double radius = scanner.nextDouble();

                    Circle circle = new Circle(name, radius) {};

                    circle.displayDescription();

                    System.out.println("Area     :" + circle.getArea());

                    System.out.println("Perimeter:" + circle.getPerimeter());

                    //Calculate the area and perimeter and then store in ArrayList<Shape>
                    System.out.println("Send the Circle " + name + " to the server");
                    System.out.println("Select y for yes and n for no");
                    String response = scanner.next();
                    //Based on user input, either send the circle to the server or not.      

                } else if (twoDOption.equals("3")) {
                    System.out.println("Enter Shape's Name:");
                    String name = scanner.next();
                    System.out.println("Enter Dimetions of rectangle");
                    System.out.println("Height");
                    int height = scanner.nextInt();
                    System.out.println("Width");
                    int width = scanner.nextInt();

                    Rectangle rectangle = new Rectangle(name, height, width) {};

                    rectangle.displayDescription();

                    System.out.println("Area     :" + rectangle.getArea());

                    System.out.println("Perimeter:" + rectangle.getPerimeter());

                    //Calculate the area and perimeter and then store in ArrayList<Shape>
                    System.out.println("Send the rectangle " + name + " to the server");
                    System.out.println("Select y for yes and n for no");
                    String response = scanner.next();
                    //Based on user input, either send the rectangle to the server or not.   

                } else {
                    System.out.println("You have not entered a valid letter corresponding to the 2D shape you wish to create.");
                }
                System.exit(0);
            } else if (option == 2) {
                System.out.println("3D Shapes");

               

                System.out.println("Enter an option:");
                System.out.println("1. Cylinder   :");
                System.out.println("2. Sphere     :");
                System.out.println("To exit, enter anything else");
                String threeDOption = scanner.next();

                if (threeDOption.equals("1")) {
                    System.out.println("Enter Shape's Name:");
                    String name = scanner.next();
                    System.out.println("Enter Dimetions of cylinder");
                    System.out.println("Radius");
                    int radius = scanner.nextInt();
                    System.out.println("Height");
                    int height = scanner.nextInt();

                    Cylinder cylinder = new Cylinder(name, radius, height) {};

                    cylinder.displayDescription();

                    System.out.println("Surface Area:" + cylinder.getSurfaceArea());

                    System.out.println("Volume      :" + cylinder.getVolume());

                    //Calculate the surface area and volume and then move to ArrayList<Shape>
                    System.out.println("Send the cylinder " + name + " to the server");
                    System.out.println("Select y for yes and n for no");
                    String response = scanner.next();
                    //Based on user input, either send the cylinder to the server or not.

                } else if (threeDOption.equals("2")) {
                    System.out.println("Enter Shape's Name:");
                    String name = scanner.next();
                    System.out.println("Enter Dimetions of sphere");
                    System.out.println("Radius");
                    int radius = scanner.nextInt();

                    Sphere sphere = new Sphere(name, radius) {};

                    sphere.displayDescription();

                    System.out.println("Surface Area:" + sphere.getSurfaceArea());

                    System.out.println("Volume      :" + sphere.getVolume());

                    //Calculate surface area and volume and then move to ArrayList<Shape>
                    System.out.println("Send the sphere " + name + " to the server");
                    System.out.println("Select y for yes and n for no");
                    String response = scanner.next();
                    //Based on user input, either send the sphere to the server or not.

                } else {
                    System.out.println("Invalid Entry for 3D Shapes");
                }
                System.exit(0);

            
            } else if (option == 3) {
                System.exit(0);

            } else {
                System.out.println("Please enter a valid input");
                System.out.println();
            }
        }

    }

}
