package child;
import parent.superDepartment;


public class hrDepartment extends superDepartment {

	public String departmentName;
	public String getTodaysWork;
	public String getWorkDeadline;
	public String doActivity;


	public String getDepartmentName() {
		return "Welcome To HR Department";
	}

	public String getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";

	}

	public String getDoActivity() {
		return "Team Lunch";

	}


}