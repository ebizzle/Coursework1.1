
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
   
    ObjectOutputStream outputToServer = null;
    ObjectInputStream fromServer = null;
    WriteFile x = new WriteFile();

    
        int port = 8000;
        String host = "localhost";
        Socket socket;
        
 public void display_menu(){
    Scanner s = new Scanner (System.in);
    System.out.println("Welcome");
    System.out.println("Choose from these choices");
    System.out.println("---------------------\n");
    System.out.println("(1) Create 2d Shapes\n (2) Create 3d Shapes\n (3)Exit");
    int choice = s.nextInt();
    System.out.println( "Selection: ");
 }
  
 public Client(){
     
     Scanner in = new Scanner (System.in);
    
     display_menu();
     switch (in.nextInt()){
         case 1:
             choice==1; 
             System.out.println("Create 2d Shapes");
             
     }
        
        

        try {
            socket = new Socket(host, port);
            outputToServer = new ObjectOutputStream(socket.getOutputStream());
            fromServer = new ObjectInputStream(socket.getInputStream());
        } catch (IOException ex) {
            taxMessage.setText(ex.toString() + '\n');
        }

       
                try {
                    ArrayList In = new ArrayList();
                    double income = Double.parseDouble(totalField.getText());
                    In.add(income);
                    String name = nameField.getText();
                    In.add(name);
                    outputToServer.writeObject(In);
                    outputToServer.flush();

                    In = (ArrayList) fromServer.readObject();

                    double taxRate = (double) In.get(2);
                    double niRate = (double) In.get(3);

                    double tax = income * taxRate;
                    tax = Math.round(tax * 100.0) / 100.0;
                    double taxPerMonth = tax / 12;
                    taxPerMonth = Math.round(taxPerMonth * 100.0) / 100.0;
                    double ni = income * niRate;
                    ni = Math.round(ni * 100.0) / 100.0;
                    double niPerMonth = ni / 12;
                    niPerMonth = Math.round(niPerMonth * 100.0) / 100.0;
                    double monthlyIncome = (income - tax - ni) / 12;
                    monthlyIncome = Math.round(monthlyIncome * 100.0) / 100.0;

                    x.writetofile(income, name, tax, ni, taxPerMonth, niPerMonth, monthlyIncome);
                    taxMessage.setText("Name: " + name + "\n" + "Income: " + income + "\n" + "Tax: " + tax + "\n" + "NI: " + ni + "\n" + "Tax Per Month: " + taxPerMonth + "\n" + "NI Per Month:" + niPerMonth + "\n" + "Monthly income: " + monthlyIncome);
                } catch (IOException ex) {
                    System.err.println(ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TaxCalculator4.class.getName()).log(Level.SEVERE, null, ex);
                }
           
      
    }

    
    public static void main(String[] args) {

        
    }

}
