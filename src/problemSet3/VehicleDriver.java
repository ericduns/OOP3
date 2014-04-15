package problemSet3;

import javax.swing.*;
import java.util.*;

public class VehicleDriver {
        
        private static ArrayList <Vehicle>list;
        private static int i;
        private static Vehicle v;
        private static String text;
        public static void main(String[] args) {
                
                list = new ArrayList<Vehicle>();
                
                for(i=0;i < 3;i++){
                        
                String choice = JOptionPane.showInputDialog("Enter the type of vehicle <car tank or train");
                
                try{
                        if(choice.equals("car")){
                                createCar();
                                }
                                else if(choice.equals("tank")){
                                        createTank();
                                        }
                                        else if(choice.equals("train")){
                                                createTrain();
                                                }
                       }catch(Exception s){
                              message("Invalid data entered");
                        	}
                }
                        for(Vehicle s : list){
                                text += s.toString() + "\n";
                                }
                                message(text);
        }
        	public static void createCar(){     
                double price = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of the car"));
                double length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the car"));
                double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter the width of the car"));
                String model  = JOptionPane.showInputDialog("Enter the model of car");
                int passangers = Integer.parseInt(JOptionPane.showInputDialog("Enter the Number of Passangers"));
                String reg = JOptionPane.showInputDialog("Enter the reg of the vehicle");
                v = new Car(price,length,weight,model,passangers,reg);
                list.add(v);
        	}
        
       		 public static void createTank(){       
                double price = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of the tank"));
                double length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the Tank"));
                double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter the width of the tank"));
                String model  = JOptionPane.showInputDialog("Enter the model of tank");
                boolean armoured = Boolean.parseBoolean(JOptionPane.showInputDialog("Is the tank armoured <true or false>"));
                v = new Tank(price,length,weight,model,armoured);
                list.add(v);
        	}
        
        	public static void createTrain(){ 
                double price = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of the Train"));
                double length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the Train"));
                double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter the width of the Train"));
                String model  = JOptionPane.showInputDialog("Enter the model of tank");
                int passangers = Integer.parseInt(JOptionPane.showInputDialog("Enter the Number of Passangers"));
                int noCarrages = Integer.parseInt(JOptionPane.showInputDialog("Enter the Number of Carrages"));
                v = new Train(price,length,weight,model,passangers,noCarrages);
                list.add(v);
        	}
        
        	public static void message(String m){
                JOptionPane.showMessageDialog(null, m);
        	}

}