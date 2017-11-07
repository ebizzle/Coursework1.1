
package course;

/**
 *
 * @author M00609897
 */
public abstract class Circle extends Shape2d {
    
    private final double _radius;
    
    public Circle(String name, double radius){
        super(name);
        _radius = radius;
        
    }
    
    @Override
    public void displayDescription(){
        super.displayDescription();
        System.out.println("I'm also a circle");
        
    }
    
    @Override
    public double getArea(){
        return Math.PI * Math.pow(_radius, 2);
      
    }
    
    @Override
    public double getPerimeter(){
        return Math.PI * (_radius * 2);
    }
}
