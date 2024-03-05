import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.*;

public class JTREEEXAMPLE extends JFrame {
   public  JTREEEXAMPLE(){
    JPanel jPanel=new JPanel();
    jPanel.setBackground(Color.red);
    
 //Jtree use garnu vnda agadi defaultmutuabletreenode use garnu parxa ani sabai tesmai pass garne ani last ma jtree ko euta instance banayuera tesma tesko ibject pass garera jpanel ma add garne raiuxa hahaha sidai jtree banauna paudaina raixa;   
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
    jPanel.add(jTree);
    add(jPanel);

    setTitle("Lets make a JTree using Swing in java");
    setVisible(true);
    setSize(500,500);
    setDefaultCloseOperation(2);
   }
   public static void main(String[] args){
    new JTREEEXAMPLE();
   }
    
}
