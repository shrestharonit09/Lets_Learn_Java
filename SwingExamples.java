
//import java.awt.*;
import java.awt.Color;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
public class SwingExamples extends JFrame{
    public SwingExamples(){
        JPanel jp= new JPanel();
        jp.setBackground(Color.red);
        JButton jb=new JButton("CLICK ME");
        JButton jb1=new JButton("RONIT");
        JLabel jl=new JLabel("i am a label");
        JTextField jt=new JTextField(20);
        JPasswordField jpf=new JPasswordField(10);
        JCheckBox jcb=new JCheckBox("I am a checkbox");
        JRadioButton jrb1=new JRadioButton("male");
        JRadioButton jrb2=new JRadioButton("female");
        JRadioButton jrb3=new JRadioButton("others");
        ButtonGroup bg=new ButtonGroup();
        String[] subject={"CSIT", "BCA" , "BIT"};
        JComboBox jcbox=new JComboBox<>(subject);
        JList jlist=new JList<>(subject);
        JTextArea jta=new JTextArea(10,20);
        String [] header={"Name","Roll no","Class"};
        String[][] content={
           { "Ram","1","6"},
           {"Ronit","2","10"}
        };
        JTable jtable=new JTable(content,header);

        DefaultMutableTreeNode menuBar=new DefaultMutableTreeNode("MenuBar ");
        DefaultMutableTreeNode Menu=new DefaultMutableTreeNode("Menu");
        DefaultMutableTreeNode MenuItem=new DefaultMutableTreeNode("MenuItem ");
        DefaultMutableTreeNode Menu2=new DefaultMutableTreeNode("Menu2 ");
        DefaultMutableTreeNode MenuItem2=new DefaultMutableTreeNode("MenuItem2 ");

        menuBar.add(Menu);
        Menu.add(MenuItem);
        Menu.add(Menu2);
        Menu2.add(MenuItem2);

        JTree jTree=new JTree(menuBar);
        jp.add(jTree);
//vertical slider 1-vertical,0 to 100 range and 77 is selected value on the range;
        JSlider jSlider=new JSlider(1,0,100,77);
    //horizontal slider 0-horizontal.......    
        JSlider jSlider1=new JSlider(0,0,100,77);
        
        jp.add(jSlider);
        jp.add(jSlider1);
        
        

        
        
        bg.add(jrb1);
        bg.add(jrb2);
        bg.add(jrb3);




        add(jp);
        jp.add(jb);
        jp.add(jb1 );
        jp.add(jl);
        jp.add(jt);
        jp.add(jpf);
        jp.add(jcb); 
        jp.add(jrb1);
        jp.add(jrb2);
        jp.add(jrb3);  
        jp.add(jcbox); 
        jp.add(jlist);
        jp.add(jta);
        jp.add(jtable);
       
    
        

        setTitle("frst swing web application");
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args){
        new SwingExamples();
    }

    
}
