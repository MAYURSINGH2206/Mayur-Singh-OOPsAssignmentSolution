package driver;
import parent.superDepartment;
import child.adminDepartment;
import child.hrDepartment;
import child.techDepartment;

public class driverClass {

	public static void main(String[] args) {

		superDepartment x = new superDepartment();
		System.out.println(x.getDepartmentName());
		System.out.println(x.getTodaysWork());
		System.out.println(x.getWorkDeadline());
		System.out.println(x.isTodayAHoliday()+"\n");

		adminDepartment a = new adminDepartment();
		System.out.println(a.getDepartmentName());
		System.out.println(a.getTodaysWork());
		System.out.println(a.getWorkDeadline());
		System.out.println(a.isTodayAHoliday()+"\n");

		hrDepartment b = new hrDepartment();
		System.out.println(b.getDepartmentName());
		System.out.println(b.getDoActivity());
		System.out.println(b.getTodaysWork());
		System.out.println(b.getWorkDeadline());
		System.out.println(b.isTodayAHoliday()+"\n");


		techDepartment c = new techDepartment();
		System.out.println(c.getDepartmentName());
		System.out.println(c.getTodaysWork());
		System.out.println(c.getWorkDeadline());
		System.out.println(c.isTodayAHoliday());
	}

}
