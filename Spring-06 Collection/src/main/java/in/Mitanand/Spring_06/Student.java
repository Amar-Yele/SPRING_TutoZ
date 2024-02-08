package in.Mitanand.Spring_06;

import java.util.Set;
import java.util.List;
import java.util.Map;

public class Student {
	
	private int studentId;
	private String studentName;
	private List studentPhone;
	private Set studentAddress;
	private Map studentCourses;
	

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("Student.setStudentId()");
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("Student.setStudentName()");
		this.studentName = studentName;
	}
	public List getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(List studentPhone) {
		this.studentPhone = studentPhone;
	}

	public Set getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(Set studentAddress) {
		System.out.println("Student.setStudentAddress()");
		this.studentAddress = studentAddress;
	}


	public Map getStudentCourses() {
		return studentCourses;
	}

	public void setStudentCourses(Map studentCourses) {
		System.out.println("Student.setStudentCourses()");
		this.studentCourses = studentCourses;
	}
	@Override
	public String toString() {
		return "*****Student Information***** \n[studentId=" + studentId + ", \nStudent Name=" + studentName + ", \nStudent Phone=" + studentPhone
				+ ", \nStudent Address=" + studentAddress + ", \nStudent Courses=" + studentCourses + "]";
	}

	
}
