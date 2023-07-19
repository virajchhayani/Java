class Student
{
	int roll,sem;
	String name;

	Student(int r,int s,String n)
	{
		roll=r;
		sem=s;
		name=n;
	}
	Student(int r,String n)
	{
		roll=r;
		name=n;
	}
	void display()
	{
		System.out.println("Student roll " +roll);
		System.out.println("Student name " +name);
		System.out.println("Student sem is " +sem);
	}
}
class consover
{
	public static void main(String args[])
	{
		Student s=new Student(1,3,"abc");
		Student s1=new Student(2,"pqr");
		s.display();
		s1.display();
	}
}