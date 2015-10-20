package Controller;
import java.util.Date;

import Model.StudentDB;
import SimpleClasses.Student;

public class StudentController {

	public static boolean AddStudent(Student std)
	{
		generateId(std.getID());
		return StudentDB.AddStudent(std);
	}
	public static boolean DelStudent(int id)
	{
		return StudentDB.DelStudent(id);
	}
	public static boolean UpdateStudent(Student std)
	{
		return StudentDB.UpdateStudentInfo(std);
	}
	public static void AssignCourseList(int sid,int lid)
	{
		
	}
	public static int getBatch(int sid)
	{
		// Return 1 for now will update in after
		return 1;
	}
	
	public static String generateId(int id)
	{
		Date date = new Date(new Date().getTime());
		String roll = date.getYear()+" "+id;
		System.out.println("Generated roll no. is "+ roll);
		return "Nabeel";
	}
}
