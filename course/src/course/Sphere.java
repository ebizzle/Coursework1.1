
package course;

/**
 *
 * @author M00609897
 */
public abstract  class Sphere extends Shape3d {
    
    private final double _radius;
    public Sphere(String name, double radius){
        super(name);
        _radius = radius;
        
    }
    
   @Override
    public double getVolume(){
        return 4/3 * Math.PI * Math.pow(_radius, 3);
        
    }
    
    @Override
    public double getSurfaceArea(){
        return 4 * Math.PI * Math.pow(_radius, 2);
    }
    
}
