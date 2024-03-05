import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class additionRemote extends UnicastRemoteObject implements addition {
    public additionRemote() throws RemoteException{
        super();
    }
   public int add( int a,int b){
        return a+b;}
    
    
}
