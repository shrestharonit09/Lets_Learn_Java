import java.awt.*;
import javax.swing.*;
public class CardLayoutExamples extends JFrame {
    CardLayoutExamples(){
        JLabel jl=new JLabel("I am a jlabel");
        JLabel jl1=new JLabel("I am a jlabel scond");
        jl.setBounds(10,10,300,100);
        jl1.setBounds(10,10,300,100);

         add(jl); 
         add(jl1);
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new CardLayoutExamples();
        
    }

    
}
