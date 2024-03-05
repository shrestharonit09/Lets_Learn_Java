import javax.swing.JOptionPane;

public class sumExampleinDialog {
    public static void main(String[] args){
        String a=JOptionPane.showInputDialog("enter the fsrt number");
        System.out.println(a);
        int numA=Integer.parseInt(a);
       String b= JOptionPane.showInputDialog("enter the second number");
       System.out.println(b);
       int numB=Integer.parseInt(b);
       int sum=numA+numB;
       JOptionPane.showMessageDialog(null,"the sum of two number is" +sum);
        
    }
    
}
