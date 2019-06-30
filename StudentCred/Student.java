public class Student {
	private String name;
	private String course;
	private int StudentNum;

public Student(String n, String c, int s){
	setName(n);
	setCourse(c);
	setStudentNum(s);
} 

//SETTERS
public void setName(String n) 
{
	if (n == "")
		name = "noValue";
	else
		name = n;	
}

public void setCourse(String c)
{
	if (c == "")
		course = "noValue";
	else
		course = c;
}

public void setStudentNum(int s)
{
	if (s > 0)
		StudentNum = s; 
	else
		s = 0;
}

//GETTERS

public String getName () 
{
return name;
}
 
public String getCourse()
{
return course;
}

public int getStudentNum ()
{return StudentNum;
}

public void showDetails ()
{
System.out.println ("My name is " + name + ". I am a " + course +" major student" + " and my student number is " + StudentNum);
}

}