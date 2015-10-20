package Controller;
import java.util.Date;
import Model.StudentDB;
import SimpleClasses.Student;

public class StudentController {

	public static boolean AddStudent(Student std)
	{
		std.setRollNo(generateId());
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
	
	public static String generateId()
	{
		String rollNo = StudentDB.getUniqueId()+"";
		
		for(int i=rollNo.length();i<4;i++)
			rollNo = "0"+rollNo;
		
		Date date = new Date(new Date().getTime());
		String roll = (date.getYear()+"").substring(1,3)+""+rollNo;
		return roll;
	}
}
