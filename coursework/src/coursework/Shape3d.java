
package coursework;

/**
 *
 * @author M00609897
 */
public abstract class Shape3d extends Shape {
    
    public Shape3d(String name){
        super(name);
    }
    
    public abstract double getVolume();
    
    public abstract double getSurfaceArea();
    
    public void displayDescription(){
        super.displayDescription();
        System.out.println("I'm a 3D shape");
    }
}
