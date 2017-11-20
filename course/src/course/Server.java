
package course;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author M00609897
 */
public class Server {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            try{
                int port = 8000;
                ServerSocket serverSocket = new ServerSocket(port);
               
                

                    Socket socket = serverSocket.accept();
                    ObjectOutputStream toClient = new ObjectOutputStream(socket.getOutputStream());
                    ObjectInputStream fromClient = new ObjectInputStream(socket.getInputStream());
                    ArrayList <Shape2d>shapes = (ArrayList) fromClient.readObject();
                    ArrayList out = new ArrayList();
                        for (Shape2d TwoD:shapes){
                            TwoD.displayDescription();
                            if (TwoD instanceof Circle){
                                out.add(TwoD.getArea());
                                out.add(TwoD.getPerimeter());
                            }
                            else if (TwoD instanceof Rectangle){
                                out.add(TwoD.getArea());
                                out.add(TwoD.getPerimeter());
                            }
                            else if (TwoD instanceof Triangle){
                                out.add(TwoD.getArea());
                                out.add(TwoD.getPerimeter());
                            }
                            toClient.writeObject(out);
                            toClient.flush();

                        }
                        ArrayList <Shape3d> shapes1 = (ArrayList) fromClient.readObject();
                        for (Shape3d ThreeD:shapes1){
                            if(ThreeD instanceof Cylinder){
                                out.add(ThreeD.getVolume());
                                out.add(ThreeD.getSurfaceArea());
                            }
                            else if(ThreeD instanceof Sphere){
                                out.add(ThreeD.getVolume());
                                out.add(ThreeD.getSurfaceArea());
                            }
                            toClient.writeObject(out);
                            toClient.flush();
                        }
                }
            
            catch(IOException ex){
                System.err.println(ex);
            } catch(ClassNotFoundException ex){
                System.err.println(ex);
            }
            
       

    }
}
