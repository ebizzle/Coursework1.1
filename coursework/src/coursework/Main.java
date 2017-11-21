
package coursework;

import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author M00609897
 */
public class Main {
   
    public static void main(String[] args){
        
        final LinkedList<Shape> shapes = new LinkedList();
        
       
        shapes.add(new Rectangle("Rectangle 1", 15, 8) {});
       
        Client c = new Client("localhost",8000);
        c.start();
        
    }
}
