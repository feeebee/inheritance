package School;
public class Schools{
        boolean publicSchool;
        boolean open = true;
        public void isOpen(){
            if (open ==true){
                System.out.println("School is in session");
            }
            else{
                System.out.println("School is out");
            }
        }
        public void speak(){
            System.out.println("I am at school");
        }
        public Schools(){

        }
        public Schools(boolean publicSchool, boolean open){
            this.publicSchool= publicSchool;
            this.open = open;
        }
        public String toString(){
            return "This is a school";
        }
}
