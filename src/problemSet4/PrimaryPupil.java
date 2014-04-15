package problemSet4;

public class PrimaryPupil extends Pupil{

        private String teacher;
        
        public PrimaryPupil(){
                super();
        }
        public PrimaryPupil(String name,String address,String dateOfBirth,
                        String teacher,String school,String pclass){
                super(name,address,dateOfBirth,school,pclass);
                setTeacher(teacher);
        }
        public void setTeacher(String t){
                teacher = t;
        }
        public String getTeacher(){
                return teacher;
        }
        @Override
        public void getCathegory() {
                System.out.println("Primary School");
        }
        public String toString(){
                return super.toString() + String.format("%-20s%s\n","Teachers name",getTeacher());
        }

}