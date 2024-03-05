
import javax.swing.*;

public class Grouplayout extends JFrame {
    public Grouplayout(){
        JButton b1= new JButton("B1");
        JButton b2= new JButton("B2");
        JButton b3= new JButton("B3");
        JButton b4= new JButton("B4");

        GroupLayout gl=new GroupLayout(getContentPane());//conatiner panel ko satta ma yo more well dekhxa;
        getContentPane().setLayout(gl);// grp layout initialize vayo as other setLayout(new FlowLayout()); gareko jastao objeact ma container pass garera teslai add gareko matera hoa;
        // for horizonatal components i.e button//
        
        gl.setHorizontalGroup(
            gl.createSequentialGroup()
            .addComponent(b1).addComponent(b2)
            .addGroup(gl.createParallelGroup()
            .addComponent(b3).addComponent(b4))

        );
        gl.setVerticalGroup(
        gl.createSequentialGroup()
            .addGroup(gl.createParallelGroup()
            .addComponent(b1).addComponent(b2)
            .addComponent(b3)) .addComponent(b4)
        );
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args){
        new Grouplayout();
    }
}
