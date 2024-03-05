import java.awt.*;
import javax.swing.*;
public class MENUEXMPLE extends JFrame{
    public MENUEXMPLE(){
        JMenuBar jMenuBar=new JMenuBar();

        JMenu jMenu= new JMenu("heavyFood");
        JMenu jMenu1= new JMenu("drinks");
        JMenu jMenu2=new JMenu("Light Food");

        JMenuItem jMenuItem= new JMenuItem("Biryani");
        JMenuItem jMenuItem2= new JMenuItem("Momo");
        JMenuItem jMenuItem3= new JMenuItem("Coke");
        JMenuItem jMenuItem4= new JMenuItem("Fanta");
        JMenuItem jMenuItem5= new JMenuItem("frenchfry");

        jMenu.add(jMenuItem);
        jMenu.add(jMenuItem2);
        jMenu1.add(jMenuItem3);
        jMenu1.add(jMenuItem4);
        jMenu2.add(jMenuItem5);

        jMenuBar.add(jMenu);
        jMenuBar.add(jMenu1);
        jMenuBar.add(jMenu2);

        JPanel jp=new JPanel();
      jp.setBackground(Color.red);

      setLayout(new FlowLayout());
       
    
        
        
        add(jMenuBar);
        add(jp);
        

        setTitle("Menu bar");
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(2);


    }
    public static void main(String[] args){
        new MENUEXMPLE();
    }
    
}
