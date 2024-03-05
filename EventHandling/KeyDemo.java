import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class KeyDemo extends JFrame {
    public KeyDemo(){
        JTextField jt1= new JTextField(20);
    jt1.addKeyListener(new KeyListener() {
        @Override
        public void keyPressed(KeyEvent e){
            System.out.println("key is pressed");

        }
        @Override
        public void keyReleased(KeyEvent e){
            System.out.println("key is Released");

        }
        @Override
        public void keyTyped(KeyEvent e){
            System.out.println("key is typed");

        }
    });
    setLayout(new FlowLayout());
    add(jt1);

    setTitle("Key event handling");
    setVisible(true);
    setSize(500,500);
    setDefaultCloseOperation(2);


    }
    public static void main(String[] args){
        new KeyDemo();
    }
    
}
