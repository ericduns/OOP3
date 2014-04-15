package problemSet2;

public class Vehicle {

        private double price;
        private double length;
        private double weight;
        private String model;
        
        public Vehicle(){
                this(0.0,0.0,0.0,"No Model");
        }
        public Vehicle(double price,double length,double weight,String model ){
                this.price = price;
                this.length = length;
                this.weight = weight;
                this.model = model;
        }
        public void setPrice(double price){
                this.price = price;
        }
        public void setLength(double length){
                this.length = length;
        }
        public void setWeigth(double weight){
                this.weight = weight;
        }
        public void setModel(String model){
                this.model = model;
        }
        public double getPrice(){return price;}
        public double getLength(){return length;}
        public double getWeight(){return weight;}
        public String getModel(){return model;}
        
        public String toString(){
                return  "\n" + getClass()  + "\nPrice €" + getPrice() + "\nLength " +getLength() +
                                "\nWeight " + getWeight() + "\nModel " + getModel();                                                
        }
}