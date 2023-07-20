package in.ineuron.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer sid;
    private String sname;
    private String saddress;
    private Integer sage;
    
    public Student() {
    	System.out.println("hibernate uses constructor");
    }
	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getsaddress() {
		return saddress;
	}

	public void setsaddress(String eaddress) {
		this.saddress = eaddress;
	}

	public Integer getsage() {
		return sage;
	}

	public void setsage(Integer eage) {
		this.sage = eage;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", eaddress=" + saddress + ", eage=" + sage
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
    
}
