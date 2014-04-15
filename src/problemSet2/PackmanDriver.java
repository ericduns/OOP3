package problemSet2;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class PackmanDriver extends JFrame implements ActionListener{

        private JPanel panel;
        private JTextArea area;
        private JButton btn_1,btn_2;
        private PackmanPlayer p;
        private JScrollPane pane;
        
        public PackmanDriver(){
                super("Packman");
                setSize(300,300);
                setLocation(300,300);
                setLayout(new BorderLayout());
                panel = new JPanel();
                btn_1 = new JButton("looseLife");
                btn_1.addActionListener(this);
                panel.add(btn_1);
                btn_2 = new JButton("Query");
                btn_2.addActionListener(this);
                panel.add(btn_2);
                display();
                add(panel);
        }
        public static void main(String [] args){
                PackmanDriver d = new PackmanDriver();
                d.setDefaultCloseOperation(EXIT_ON_CLOSE);
                d.setVisible(true);
                
                d.addWindowListener(new WindowAdapter(){
                        
                        public void windowIconified(WindowEvent e){
                                message("Minimising the window");
                        }
                        public void windowDeiconified(WindowEvent e){
                                message("Maximising the window");
                        }
                        
                });
        }

        @Override
        public void actionPerformed(ActionEvent e) {
                if(e.getSource()== btn_1){
                        p.loseALife();
                        if(p.getLives()< 0){
                                message("Player is Dead Game Over");
                                System.exit(0);
                        }
                        else{
                        area.append(p.toString());
                        }
                }
                else if(e.getSource()== btn_2){
                        
                        area.append("\n" + p.getLives() + " Lives left");
                }
                
        }
        public void display(){
                p = new PackmanPlayer();
                p.setName("Mike");
                area = new JTextArea(15,30);
                area.setFont(new Font("monospaced",Font.PLAIN,12));
                pane = new JScrollPane(area);
                panel.add(pane);
                p.getLives();
                
                area.setText(p.toString());
        }
        public static void message(String s){
                JOptionPane.showMessageDialog(null,s);
        }
        public static void message(JTextArea a){
                JOptionPane.showMessageDialog(null,a);
        }
}