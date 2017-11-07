
package coursework1;

/**
 *
 * @author M00609897
 */
public abstract class Rectangle extends Shape2d {
    
    private final double _height;
    private final double _width;
    
    public Rectangle(String name, double height, double width){
        super(name);
        _height = height;
        _width = width;
        
    }
    
    @Override
    public void displayDescription(){
        super.displayDescription();
        System.out.println("\tI'm also a rectangle");
    }
    
    @Override
    public double getArea(){
        return _height * _width;
    }
    
    @Override
    public double getPerimeter(){
        return (_height + _width) * 2;
        
        
    }
}
