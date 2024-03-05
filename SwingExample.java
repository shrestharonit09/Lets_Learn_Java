import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingExample extends JFrame{
    public SwingExample(){//constructor vaihlayo
        JPanel jp=new JPanel(); //euta object banako;// different components show garxa pannal banayera garyo vane natra over lap garxa like on cards.
        jp.setBackground(Color.red);//bg color set gareko;

        JButton jb=new JButton("click me");//euta button vanne object create gareko jasma click me vanne arg pass gareko xa;

        jp.add(jb);//jpannel ko object ma euta button vanne add gareko;
        add(jp);// add garena vane show gardaina;
        setTitle("hello this is my frst swing application");
        setVisible(true);// show the content under frame;
        setSize(400,400);//size of the frame;
        setDefaultCloseOperation(2);


    }
    public static void main(String[] args){
        new SwingExample();//Constructorcall gareko;
    }
    
}
