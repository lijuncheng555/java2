package PCtest;
public class HardDisk {
    private int hdamount;
    private double hdmemory;

    HardDisk(int amount){
        setAmount(amount);
    }
    HardDisk(double memory){
        setMemory(memory);
    }
    public int getAmount() {
        return hdamount;
    }
    public double getMemory() {
        return hdmemory;
    }

    public void setAmount(int amount) {
        if (amount >= 256 && amount <= 1024) {
            this.hdamount = amount;
        }
        else{
            System.out.println("ÊäÈë´íÎó");
        }
    }
    public void setMemory(double memory) {
        if (memory >=8 && memory <= 32) {
            this.hdmemory = memory;
        }
        else{
            System.out.println("ÊäÈë´íÎó");
        }
    }

}