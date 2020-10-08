package PCtest;
public class PC {
    private CPU cpu;
    private HardDisk HD;
    PC(CPU cpu){
        setCPU(cpu);
    }
    PC(HardDisk HD){
        setHardDisk(HD);
    }
    public void setCPU(CPU cpu){
        this.cpu = cpu;
    }
    public void setHardDisk(HardDisk HD){
        this.HD = HD;
    }
    void show(){
        System.out.println("CPU的速度:"+cpu.getSpeed());
        System.out.println("CPU的种类:"+cpu.getType());
        System.out.println("硬盘的容量:"+HD.getAmount());
        System.out.println("硬盘的内存:"+HD.getMemory());
    }
}
