package Controller;
import Model.StudentDB;
import SimpleClasses.Student;

public class StudentController {

	public boolean AddStudent(Student std)
	{
		return StudentDB.AddStudent(std);
	}
	public boolean DelStudent(int id)
	{
		return StudentDB.DelStudent(id);
	}
	public boolean UpdateStudent(Student std)
	{
		return StudentDB.UpdateStudentInfo(std);
	}
	public void AssignCourseList(int sid,int lid)
	{
		
	}
	public int getBatch(int sid)
	{
		// Return 1 for now will update in after
		return 1;
	}
}
