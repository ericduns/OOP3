package problemSet2;

public class Car extends Vehicle{

        private int maxPassangers;
        private String registrationNumber;
        
        public Car(){
                setNPassanger(0);
                setReg("No Reg Supplied");
        }
        public Car(double price,double length,double weight,String model,int maxPassangers,String registrationNumber){
                super(price,length,weight,model);
                setNPassanger(maxPassangers);
                setReg(registrationNumber);
        }
        
        public void setNPassanger(int maxPassangers) {
                this.maxPassangers = maxPassangers;
        }
        
        public void setReg(String registrationNumber){
                this.registrationNumber = registrationNumber; 
        }
        public int getNPassangers(){
        	return maxPassangers;
        	}
        
        public String getReg(){
        	return registrationNumber;
        	}
        
        public String toString(){
                return  "\nNumber of Passangers " + getNPassangers() + "\nReg Number " + getReg()
                	+ super.toString();
        }
}