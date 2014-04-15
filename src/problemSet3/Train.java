package problemSet3;

public class Train extends Vehicle{

        private int noCarrages;
        private int maxPassangers;
        
        public Train(){
                setNoCarrages(0);
                setMaxPassangers(0);
        }
        public Train(double price,double length,double weight,String model,int maxPassangers,int noCarrages){
                super(price,length,weight,model);
                setMaxPassangers(maxPassangers);
                setNoCarrages(noCarrages);
        }

        public int getNoCarrages() {
                return noCarrages;
        }

        public void setNoCarrages(int noCarrages) {
                this.noCarrages = noCarrages;
        }
        public int getMaxPassangers() {
                return maxPassangers;
        }
        public void setMaxPassangers(int maxPassangers) {
                this.maxPassangers = maxPassangers;
        }
        public String toString(){
                
                return "\nNumber of Passangers: " + getMaxPassangers() + "\nNumber of carrages: " + getNoCarrages() +
                                super.toString();
        }
}