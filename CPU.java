package PCtest;
public class CPU {
    private double cpuspeed;
    private String cputype;
    CPU(double speed){
        setSpeed(speed);
    }
    CPU(String type){
        setType(type);
    }
    public double getSpeed() {
        return cpuspeed;
    }
    public String getType() {
        return cputype;
    }
    
    public void setSpeed(double speed) {
        if (speed >= 1.0 && speed <= 4.0) {
            this.cpuspeed = speed;
        }
        else{
            System.out.println("ÊäÈë´íÎó");
        }
    }
    public void setType(String type) {
        if (type =="AMD" || type =="intel") {
            this.cputype = type;
        }
        else{
            System.out.println("ÊäÈë´íÎó");
        }
    }
}