import java.awt.*;//for layout
import javax.swing.*;//for swing components

public class BorderLayoutExample  extends JFrame {
    public BorderLayoutExample(){
        JButton jb1=new JButton("RonitButton1");
        JButton jb2=new JButton("RonitButton2");
        JButton jb3=new JButton("RonitButton3");
        JButton jb4=new JButton("RonitButton4");
        JButton jb5=new JButton("RonitButton5");
        setLayout(new BorderLayout());
        add(BorderLayout.NORTH,jb1);
        add(BorderLayout.SOUTH,jb2);
        add(BorderLayout.EAST,jb3);
        add(BorderLayout.WEST,jb4);
        add(BorderLayout.CENTER,jb5);
         
        setVisible(true);
        setTitle("BorderLayout Demo re hahahaha sai ho");
        setSize(500,500);
        setDefaultCloseOperation(2);
        
        
    }
    public static void main(String[] args){
        new BorderLayoutExample();
    }
    
}
