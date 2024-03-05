import javax.swing.*;
import java.awt.*;
public class JMenuExample extends JFrame{
    JMenuExample(){
        JMenuBar JMB= new JMenuBar();
        JMenu JM=new JMenu("file");
        JMenu JM1=new JMenu("View");
        JMenu JM2=new JMenu("save as");
        
        JMenuItem JMI= new JMenuItem("open");
        JMenuItem JMI1= new JMenuItem("save");
        JMenuItem JMI2= new JMenuItem("pdf");
        JMenuItem JMI3= new JMenuItem("png");

        JM2.add(JMI2);
        JM2.add(JMI3);

        JM.add(JMI);
        JM.add(JMI1);
        JM.add(JM2);

        JMB.add(JM);
        JMB.add(JM1);


       
       setLayout(new FlowLayout());
        add(JMB);
     
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args){
        new JMenuExample();
    }
    
}
