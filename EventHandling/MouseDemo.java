import javax.swing.*; // for swing operation like JFrame
import java.awt.event.*;// for event hndling like ActionListener
import java.awt.*;// for layout manager like flow layout
public class MouseDemo extends JFrame {
    public MouseDemo(){
        JButton jb1=new JButton("click me");
        
        jb1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("mouse was clicked");

            }
            @Override
            public void mousePressed(MouseEvent e){
               System.out.println("mouse was pressed"); 
            }
            @Override
            public void mouseEntered(MouseEvent e){
                System.out.println("mouse was enetered");
                
            }
            @Override
            public void mouseReleased(MouseEvent e){
                System.out.println("mouse was released");
                
            }
            @Override
            public void mouseExited(MouseEvent e){
                System.out.println("mouse was exited");
                
            }
            
        });
        setLayout(new FlowLayout());
        add(jb1);

    setVisible(true);
    setSize(500,500);
    setDefaultCloseOperation(2);

}
        public static void main( String[] args){
            new MouseDemo();
        }

    
}
