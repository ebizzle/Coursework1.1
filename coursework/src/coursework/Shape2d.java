
package coursework;

/**
 *
 * @author M00609897
 */
public abstract class Shape2d extends Shape {

    public Shape2d(String name){
        super(name);
    }
    

    public abstract double getArea();
    

    public abstract double getPerimeter();
    
    @Override
    public void displayDescription(){
        super.displayDescription();
        
        System.out.println("I'm a 2D shape");
    }
    
}
