# 一、实验目的：
1.Java 应用程序有4个类,分别为 PC、CPU 、HardDisk 类和主类Test。
2.学习并使用类并构造对象。
3.学习并使用构造方法，在类中构建对象。
4.学习并使用this关键字。
5.学习并使用访问权限
# 二、实验要求：
1.CPU类：getSpeed返回 speed的值,要求 setSpeed（int m )方法将参数m的值赋值给 speed；

2.HardDisk类：getAmount返回 amount 的值,要求 setAmount（int m)方法将参数 m 的值赋值给amount；

3.PC类： setCPU（CPU c)将参数 c 的值赋值给cpu，要求 setHardDisk ( HardDisk h）方法将参数 h 的值赋值给 HD .

4.要求 show（）的方法能显示cpu的速度和类型，以及硬盘的容量与内存。

5.主类Tesk的要求：

(1)main 方法中创建一个 CPU 对象 cpu , cpu 将自己的 speed 设置为2200。

(2)main 方法中创建一个 HardDisk 对象 disk , dis 将自飞的 amount 设置为200。

(3)main 方法中创建一个 PC 对象 pc。
(4)pc 调用 setCPU（CPU cpu）方法,调用时实参是 cpu。

(5)pc 调用 setHardDisk ( HardDisk h )方法,调用时实参是 disk。

(6)调用 show（）方法。

注：对于四种类必须包含的要求：

a)类中定义不少于两个构造方法； 每个类定义不少于2个属性，且属性的类型应该多样化；

b)根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；

c)且定义的方法内应该有符合常理的逻辑判断；

d)尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。

# 三、操作过程：

1.首先构造了4个类，CPU、HardDisk、PC、主类Test4个类。

2.每个类中各定义了2个构造方法以及两个不同的属性，选取了对象特有的一些属性。CPU选取了速度与类型，HardDisk选取了容量与内存。

3.在主类Test中通过创建了3个对象（cpu、disk、pc）。

4.调用set对变量赋值。

5.调用show（）方法。

6.通过get将变量的值输出。

7.使用了修饰符private设置访问权限。

# 四、核心代码：

本次实验中的核心代码如下所示，它通过调用CPU与HardDisk，赋予了变量的值，体现了如何创建类和对象，类与对象的定义和使用等知识。
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
# 五、实验结果：
![](https://github.com/lijuncheng555/java-/blob/main/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20201008233023.png)
# 六、实验感想：

1.此次实验我学会了创建类和对象，基本掌握类与对象的定义和使用，基本掌握了Java的编程规则、知识要点和一些编程的注意事项，例如一些编程风格。

2.初次编程总是遇到诸多问题，在解决问题中找到了学习java的正确方法。

3.在于同学的探讨中，也为学习增添了许多乐趣。
