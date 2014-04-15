package problemSet4;

import javax.swing.*;
import java.awt.*;
import java.util.*;
public class SchoolDriver {

        public static void main(String[] args) {
                
                int i;
                PrimaryPupil p;
                SecondaryPupil s;
                LinkedList <Pupil> pupil;
                pupil = new LinkedList<Pupil>();
                JTextArea area = new JTextArea(20,30);
                area.setFont(new Font("monospaced",Font.PLAIN,12));
                
                LinkedList <String>course;
                course = new LinkedList<String>();
                try{
                        String name = JOptionPane.showInputDialog(null,"Enter the pupils name");
                        String address = JOptionPane.showInputDialog(null,"Enter the pupils address");
                        String dateOfBirth = JOptionPane.showInputDialog(null,"Enter the pupils Date Of Birth");
                        String teacher = JOptionPane.showInputDialog(null,"Enter the teachers name");
                        String pclass = JOptionPane.showInputDialog(null,"Enter the pupils class");
                        String school = JOptionPane.showInputDialog(null,"Enter the pupils class");
                        p = new PrimaryPupil(name,address,dateOfBirth, teacher,school,pclass);
                        pupil.add(p);
                
                        String name2 = JOptionPane.showInputDialog(null,"Enter the pupils name");
                        String address2 = JOptionPane.showInputDialog(null,"Enter the pupils address");
                        String dateOfBirth2 = JOptionPane.showInputDialog(null,"Enter the pupils Date Of Birth");
                        String pclass2 = JOptionPane.showInputDialog(null,"Enter the pupils class");
                        String school2 = JOptionPane.showInputDialog(null,"Enter the pupils School");
                        int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of subjects taken "));
                        
                        for(i=0;i < choice;i++){
                                String c = JOptionPane.showInputDialog(null,"Enter the subjects taken");
                                if(c.equals("")){
                                        break;
                                }
                                course.add(c);
                                }
                                s = new SecondaryPupil(name2,address2,dateOfBirth2,school2,pclass2,course);
                                pupil.add(s);
                        }        
                                catch(Exception e){
                                                message("Data entered did not validate");
                                }
                                        area.setText(String.format("%18s", "Pupil Details"));
                                        
                                        for(Pupil s1: pupil){
                                                area.append("\n" + s1.getClass() +""+ s1.toString() + "\n");
                                        }
                                                JOptionPane.showMessageDialog(null,area );
                }
        public static void message(String m){
                JOptionPane.showMessageDialog(null,m);
        }
}