import java.awt.*;
import javax.swing.*;
public class GridLayoutExample extends JFrame {
    GridLayoutExample(){
        JLabel jl=new JLabel("I am a jlabel");
        JLabel jl1=new JLabel("I am a jlabel scond");
        JLabel jl2=new JLabel("I am a jlabel third");
        JLabel jl3=new JLabel("I am a jlabel fourth");

        setLayout(new GridLayout(0,2));
        
     

         add(jl); 

         add(jl1);
         add(jl2);
         add(jl3);
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new GridLayoutExample();
        
    }

    
}
