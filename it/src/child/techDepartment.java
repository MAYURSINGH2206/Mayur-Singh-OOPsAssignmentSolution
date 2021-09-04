package child;
import parent.superDepartment;
public class techDepartment extends superDepartment {


	public String departmentName;
	public String getTodaysWork;
	public String getWorkDeadline;
	public String getTechStackInformation;




	public String getDepartmentName() {
		return "Welcome To Tech Department";
	}

	public String getTodaysWork() {
		return "Complete coding of module 1";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";

	}

	public String getTechStackInformation() {
		return "core Java";
	}

}