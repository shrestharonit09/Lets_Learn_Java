import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class SERVERSIDE {

    public static void main(String[] args) {
        try{
            additionRemote ar=new additionRemote();
            Registry R1= LocateRegistry.getRegistry(9000);
            R1.rebind("addition",ar);
            System.out.println("server ready");
        }
        catch(Exception e){
            System.out.println("server fauled");
        }
    }
    
}
