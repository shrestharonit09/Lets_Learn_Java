import java.awt.*;
import javax.swing.*;
public class FlowLayoutExample extends JFrame {
    FlowLayoutExample(){
        JLabel jl=new JLabel("I am a jlabel");
        JLabel jl1=new JLabel("I am a jlabel scond");
        
        setLayout(new FlowLayout());
        
         add(jl); 
         add(jl1);
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new FlowLayoutExample();
        
    }

    
}
