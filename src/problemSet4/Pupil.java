package problemSet4;

public abstract class Pupil implements Child{

        private String name;
        private String address;
        private String dateOfBirth;
        private String school;
        private String pClass;
        
        public Pupil(){
                this("No Name","Nop Address","No Date Of Birth","No School","No Class");
        }
        public Pupil(String name,String address,String dateOfBirth,String school,String pClass){
                this.name = name;
                this.address = address;
                this.dateOfBirth = dateOfBirth;
                this.school = school;
                this.pClass = pClass;
        }
        @Override
        public String getName() {
                return name;
        }

        @Override
        public String getAddress() {
                return address;
        }

        @Override
        public String getDateOfBirth() {
                return dateOfBirth;
        }
        public String getSchool(){
                return school;
        }
        public String getPClass(){
                return pClass;
        }

        @Override
        public void setName(String n) {
                this.name = n;        
        }

        @Override
        public void setAddress(String a) {
                this.address = a;
        }

        @Override
        public void setDateOfBirth(String d) {
                this.dateOfBirth = d;
        }
        public void setSchool(String s){
                school = s;
        }
        public void setPClass(String p){
                pClass = p;
        }
        public abstract void getCathegory();

        public String toString(){
                return String.format("\n%-20s%s\n%-20s%s\n%-20s%s\n%-20s%s\n%s\n",
                                "Name: ",getName(),"Address: ",getAddress(),"Date of Birth ",
                                getDateOfBirth(),"School",getSchool(),getPClass());
        }
}