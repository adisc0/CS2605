public class TestStudent{

    public static void main (String[] args){

        Student a = new Student("Alken Dimacale","BSCS", 9332);
		Student b = new Student("","", 9335);
		Student c = new Student("Seamus Moore","BSCS", -9234);
		
		a.showDetails();
		b.showDetails();
		c.showDetails();
        //System.out.println ("my name is " + b.getName() + " i am a " + b.getCourse() +" major student" + " student id is " + b.getID());
		//System.out.println ("my name is " + c.getName() + " i am a " + c.getCourse() +" major student" + " student id is " + c.getID());
    }
}