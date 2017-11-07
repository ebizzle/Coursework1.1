
package coursework1;

/**
 *
 * @author M00609897
 */
public abstract class Shape2d extends Shape {

    public Shape2d(String name){
        super(name);
    }
    
    @Override
    public abstract double getArea();
    
    @Override
    public abstract double getPerimeter();
    
    @Override
    public void displayDescription(){
        super.displayDescription();
        
        System.out.println("I'm a 2D shape");
    }
    
}
