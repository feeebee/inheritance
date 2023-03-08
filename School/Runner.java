package School;

public class Runner {
    public static void main (String args[]){
    Schools school = new Schools(true, false);
    school.isOpen();
    school.toString();
    Underclassmen hi = new Underclassmen(true, true, 83.5);
    System.out.println(hi.getGrade());
    }
}
