import javax.swing.*;
public class ConfirmDialogExample {
    public static void main(String[] args){
      
        int choice= JOptionPane.showConfirmDialog(null,"Do you want to exit?");// integer value ma hune vara dailog lai int vairaible le initialize gareko;
        System.out.println(choice);//yes-o, no-1 cancel-2
    }



    
}
