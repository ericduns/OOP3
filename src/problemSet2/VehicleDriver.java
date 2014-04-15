package problemSet2;

import javax.swing.*;

public class VehicleDriver {
        
        private static Vehicle fleet[];
        private  static Vehicle v;
        private static int i;
        public static void main(String [] args){
                
                String text = "";
                 String choice = "";
                 
                fleet = new Vehicle[3];
                 
                 for(i=0;i < 3 ;i++){
                
                     choice = JOptionPane.showInputDialog("Enter the type of vehicle");
                                
                        try{ 
                                if(choice.equals("car")){
                                        newCar();
                                        }
                                        else {
                                                newTank();                
                                        } 
                                }
                                catch(Exception e){
                                        message("Invalid data entered ");
                        }
                        
                }
                 
                 for(Vehicle s:fleet){
                                text+= s.toString() + "\n";
                        }
                        JOptionPane.showMessageDialog(null,text);
        }
        public static void  newCar(){
                double price = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of the car"));
                double length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the car"));
                double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter the width of the car"));
                String model  = JOptionPane.showInputDialog("Enter the model of car");
                int passangers = Integer.parseInt(JOptionPane.showInputDialog("Enter the Number of Passangers"));
                String reg = JOptionPane.showInputDialog("Enter the reg of the vehicle");
                
                v = new Car(price,length,weight,model,passangers,reg);
                fleet[i] = v;
        }
        
        public static void newTank(){
                double price = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of the tank"));
                double length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the Tank"));
                double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter the width of the tank"));
                String model  = JOptionPane.showInputDialog("Enter the model of tank");
                boolean armoured = Boolean.parseBoolean(JOptionPane.showInputDialog("Is the tank armoured <yes or no>"));

                v = new Tank(price,length,weight,model,armoured);
                fleet[i] = v;
        }
        public static void message(String s){
                JOptionPane.showMessageDialog(null,s);
        }
}
