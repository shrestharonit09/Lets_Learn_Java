import javax.swing.*; // for swing operation like JFrame
import java.awt.event.*;// for event hndling like ActionListener
import java.awt.*;// for layout manager like flow layout
public class addition2 extends JFrame{
    public addition2(){
        JLabel jl1= new JLabel("First Value");
        JTextField jt1= new JTextField(20);
        JLabel jl2= new JLabel(" Second value is");
        JTextField jt2= new JTextField(20);
        JLabel jl3= new JLabel("result is");
        JTextField jt3= new JTextField(20);
        JButton jb1= new JButton("Add");
        JButton jb2= new JButton("Substract");

        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String a= jt1.getText();
                String b=jt2.getText();
                int sum= Integer.valueOf(a)+Integer.valueOf(b);
                jt3.setText(""+sum);

            }
        });
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String a= jt1.getText();
                String b=jt2.getText();
                int minus= Integer.valueOf(a)-Integer.valueOf(b);
                jt3.setText(""+ minus);

            }
        });

        setLayout(new FlowLayout());

        add(jl1);
        add(jt1);
        add(jl2);
        add(jt2);
        add(jl3);
        add(jt3);
        add(jb1);
        add(jb2);

        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(2);
    }
    public static void main( String[] args){
        new addition2();
    }
    
}
