package Model;

import java.sql.SQLException;

import com.mysql.jdbc.ResultSet;

import SimpleClasses.Student;
import sql.MySqlJdbc;

public class StudentDB {
	
	private static MySqlJdbc db = new MySqlJdbc(); 
	
	public static boolean AddStudent(Student std)
	{
		String query= "INSERT INTO `student`(`name`, `mName`, `fName`, `rollNo`, `batch`, `dob`) VALUES (\""+std.getName()+"\",\""+std.getMiddleName()+"\",\""+std.getFName()+"\",\""+std.getRollNo()+"\","+std.getBatch()+",\""+std.getDOB()+"\")";

		db.execute(query);

		return true;
		//return db.execute("select scope_identity()");
		
	}
	public static boolean DelStudent(int sId)
	{
		return true;
	}
	public static boolean UpdateStudentInfo(Student std)
	{
		return true;
	}
	public static void AssignCourseList(int sid,int lid)
	{
		
	}
	public static int getBatch(int sId)
	{
		return 1;
	}
	public static int getUniqueId()
	{
		try
		{
			String query= "SELECT COUNT(*) as count FROM `student` where 1";
			ResultSet rs = (ResultSet) db.executeSelect(query);
			if(rs.next())
				return rs.getInt("count")+1;
		}
		catch(Exception e)
		{
			System.out.println("Got an Error : "+e.getMessage());
		}
		return 1;
	}
}
