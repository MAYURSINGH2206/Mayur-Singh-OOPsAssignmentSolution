package child;
import parent.superDepartment;
public class adminDepartment extends superDepartment {

	public String departmentName;
	public String getTodaysWork;
	public String getWorkDeadline;



	public String getDepartmentName() {
		return "Welcome To Admin Department";
	}

	public String getTodaysWork() {
		return "Complete your documents submission";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";

	}


}