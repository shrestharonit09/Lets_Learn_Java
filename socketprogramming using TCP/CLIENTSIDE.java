import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CLIENTSIDE {
    public static void main(String[] args) {
        try{
            Registry R= LocateRegistry.getRegistry(9000);
            addition A=(addition) R.lookup("add");

            int value=A.add(3,5);
            System.out.println(value);
        }
        catch(Exception e){
            System.out.println("failed sorry");
        }
    }
    
}
