package student;

import student.MarksException;

public class Student {
	
	private int studentId;
	private String StudentName;
	private int marks;
	
	public Student(int m) throws MarksException{
		if(m > 100 || m < 0) {
			throw new MarksException("");
		}
	}
	public int getMarks() {
		return marks;
	}
}
