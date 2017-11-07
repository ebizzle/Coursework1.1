
package course;

/**
 *
 * @author M00609897
 */
public abstract class Cylinder extends Shape3d {
    
    private final double _radius;
    private final double _height;
    
    public Cylinder(String name, double radius, double height){
        super(name);
        _radius = radius;
        _height = height;
        
    }
      
    @Override
    public double getVolume(){
        return Math.PI * Math.pow(_radius, 2) * _height;
    }
     @Override
    public  double getSurfaceArea(){
        return 2 * Math.PI * _radius * (_radius + _height);
     }
    }

