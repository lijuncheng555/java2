一、实验目的：

要求 Java 应用程序有4个类,名字分别是 PC、CPU 、HardDisk 业和Test，其中 Test 是主类。

学会并使用类与对象

学会并使用构造方法与对象的创建

学会并使用this关键字

学会并使用访问权限

二、实验要求：

1.CPU 类要求getSpeed返回 speed的值,要求 setSpeed（int m )方法将参数m的值赋值给 speed；

2.HardDisk 类要求getAmount返回 amount 的值,要求 setAmount（int m)方法将参数 m 的值赋值给amount；

3.PC 类要求 setCPU（CPU c)将参数 c 的值赋值给cpu，要求 setHardDisk ( HardDisk h）方法将参数 h 的值赋值给 HD .

4.要求 show（）的方法能显示cpu的速度和硬盘的容量。

5.主类Tesk的要求：

(1)main 方法中创建一个 CPU 对象 cpu , cpu 将自己的 speed 设置为2200。

(2)main 方法中创建一个 HardDisk 对象 disk , dis 将自飞的 amount 设置为200。

(3)main 方法中创建一个 PC 对象 pc。

(4)pc 调用 setCPU（CPU cpu）方法,调用时实参是 cpu。

(5)pc 调用 setHardDisk ( HardDisk h )方法,调用时实参是 disk。

(6)pc 调用 show（）方法。

附加要求：

a)类中定义不少于两个构造方法； 每个类定义不少于2个属性，且属性的类型应该多样化；

b)根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；

c)且定义的方法内应该有符合常理的逻辑判断；

d)尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。

三、操作过程：

1.首先构造了4个类，CPU、HardDisk、PC、Test4个类。

2.4个类中各定义了2个构造方法，定义了两个不同的属性，使属性的类型多样化。并且使用了修饰符private。

3.在主类Test中通过创建了3个对象（cpu、disk、pc），并通过调用set将变量赋值。调用show（）方法输出。

4.调用show（）方法，通过get将变量的值输出。

四、核心代码：

这两段代码是我认为这次实验中的核心代码，它通过调用CPU与HardDisk，赋予了变量的值，体现了如何创建类和对象，类与对象的定义和使用等知识。
```java
        CPU cpu = new CPU(1.8);
        HardDisk HD = new HardDisk(1024);
        PC pc = new PC(HD);
        
        cpu.setType("intel");
        HD.setMemory(8);
        
        pc.setCPU(cpu);
        pc.setHardDisk(HD);
        pc.show();

```
```java
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
```
    
    五、实验结果：
    ![实验结果截图](https://github.com/lijuncheng555/java-/blob/main/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20201008211721.png)
    
    
