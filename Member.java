package School;

public class Member{
	String number;
	String name;
	String gender;
	Member(String number,String name,String gender){
		this.number=number;
		this.name=name;
		this.gender=gender;
		}
	public void setnumber(String number) {
	    this.number = number;
	}
	public String getnumber() {
	    return number;
	}
	
	public void setname(String name) {
	    this.name = name;
	}
	public String getname() {
	    return name;
	}
	
	public void setgender(String gender) {
	    this.gender = gender;
	}
	public String getgender() {
	    return gender;
	}
	}