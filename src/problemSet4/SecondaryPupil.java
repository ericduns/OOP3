package problemSet4;

import java.util.*;


public class SecondaryPupil extends Pupil{

        private LinkedList <String> subjects;
        public SecondaryPupil(){
                super();
        }

        public SecondaryPupil(String name,String address,String dateOfBirth,
                        String school,String pclass,LinkedList <String> subjects){
                super(name,address,dateOfBirth,school,pclass);
                setSubjects(subjects);
        }
        public void setSubjects(LinkedList<String> s){
                subjects = s;
                
        }
        public LinkedList<String> getSubjects(){
                return subjects;
        }
        public String getSList(LinkedList <String> subjects){
                String list ="";
                for(int i=0;i < subjects.size();i++){
                        list += subjects.get(i) + "\n ";
                }
                return list;
                
        }
        @Override
        public void getCathegory() {
                System.out.println("Primary School");
                
        }
        public String toString(){
                return super.toString() + "Subject list\n" + getSList(subjects);
        }
}