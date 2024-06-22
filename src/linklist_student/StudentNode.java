package linklist_student;

public class StudentNode {
	private Student s;
	StudentNode next;
	
	public StudentNode()
	{}
	public StudentNode(Student s1)
	{
		s=new Student();
		s.setName(s1.getName());
		s.setRoll(s1.getRoll());
		next=null;
	}
	
	public Student getS() {
		return s;
	}
	public void setS(Student s) {
		this.s = s;
	}
	public StudentNode getNext() {
		return next;
	}
	public void setNext(StudentNode next) {
		this.next = next;
	}
	
	

}
