package in.ineuron.bean;

//Target Object
public class Student {

	private String sid;
	private String sname;
	private String saddr;

	// HAS-A variable
	private Course[] course;

	// Constructor Injection
	public Student(String sid, String sname, String saddr, Course[] course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
		this.course = course;
	}

	public void getStudentDetails() {
		System.out.println("STUDENT DETAILS ARE:: ");
		System.out.println("SID   IS  :: " + sid);
		System.out.println("SNAME IS  :: " + sname);
		System.out.println("SADDR IS  :: " + saddr);
		System.out.println("COURSE DETAILS ARE:: ");
		for (Course c : course) {
			System.out.println("CID   IS  :: " + c.cid);
			System.out.println("CNAME IS  :: " + c.cname);
			System.out.println("COST  IS  :: " + c.ccost);
		}
		System.out.println("-------------------------------------");
	}

}
