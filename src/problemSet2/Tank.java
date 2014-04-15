package problemSet2;

public class Tank extends Vehicle{

        private boolean armoured;
        
        public Tank(){
                super();
                setArmoured(false);
        }
        public Tank(double price,double length,double weight,String model,boolean armoured){
                super(price,length,weight,model);
                setArmoured(armoured);
        }
        public void setArmoured(boolean armoured){
                this.armoured = armoured;
        }
        public boolean getArmoured(){
                return armoured;
                }
        public String toString(){
                String text = "";
                if(getArmoured() == true){
                        text+="Armoured ";
                }
                else{
                        text+="Not Armoured ";
                }
                return  "\nArmor status " + text + super.toString() ;
        }
}