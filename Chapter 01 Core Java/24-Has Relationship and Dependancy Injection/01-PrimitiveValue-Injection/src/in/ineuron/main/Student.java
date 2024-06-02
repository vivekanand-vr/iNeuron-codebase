package in.ineuron.main;

public class Student {

	// instance variables
	private String sname;
	private int sage;
	private int sid;

	// Constructor to set a value
	public Student(String sname, int sage, int sid) {
		super();
		this.sname = sname;
		this.sage = sage;
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sage=" + sage + ", sid=" + sid + "]";
	}
}
