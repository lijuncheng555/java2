package School;

public class Teacher extends Member{
	String Tmajor;
	String Teachcourse;
	Teacher(String number,String name,String gender,String Tmajor,String Teachcourse){
		super(number,name,gender);
		setTmajor(Tmajor);
		set(Teachcourse);
		}
	public String getTmajor() {
        return Tmajor;
    }
    public void setTmajor(String Tmajor) {
        this.Tmajor= Tmajor;
    }
	public void set(String Teachcourse) {
		this.Teachcourse=Teachcourse;
	}
	public String get() {
		return Teachcourse;
	}
	public String toString(){
		return "学号:"+number+",姓名:"+name+"，性别："+gender+",专业:"+Tmajor+",课程:"+Teachcourse;
	}
	}