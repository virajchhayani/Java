//static variable and static method
class Student
{
	String name="abc";
	static String college="XYZ";
	int rollno=1;
	static void change()
	{
		college="RKU";
		
	}
	void display()
	{
		System.out.println("Student roolno" + rollno + "Name is" + name + "College name is" + college);
	}
}
class Main35
{
	public static void main(String args[])
	{
		Student s=new Student();
		Student.change();
		s.display();
	}
}
