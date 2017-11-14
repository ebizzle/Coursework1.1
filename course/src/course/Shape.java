
package course;

/**
 *
 * @author M00609897
 */
    public abstract class Shape {

    private String _name;
    
    public Shape(String name) {
        _name = name;
        
    }
 
    public void displayDescription() {
        System.out.println("I'm a shape named " + _name);
    }
}


