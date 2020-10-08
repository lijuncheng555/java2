package PCtest;
public class Test {
    public static void main(String[] args) {
        CPU cpu = new CPU(1.8);
        HardDisk HD = new HardDisk(1024);
        PC pc = new PC(HD);
        
        cpu.setType("intel");
        HD.setMemory(8);
        
        pc.setCPU(cpu);
        pc.setHardDisk(HD);
        pc.show();

    }
}