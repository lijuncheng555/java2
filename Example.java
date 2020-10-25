package School;
import java.util.Scanner;
public class Example{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Teacher A= new Teacher("111","A", "女", "数学","高数");
        Teacher B= new Teacher("122", "B", "男", "计算机","Java");
        Choose C= new Choose("1","A","7:50", "教101", "高数");
        Choose D= new Choose("2","B","13:30","教303", "Java");
        Student S1 = new Student("2019311000", "小李", "男","2","C");
        System.out.println("课程基本信息：");
        System.out.println("课程1：" + C);
        System.out.println("课程2：" + D);
        System.out.println("请输入课程编号：");
        int j= in.nextInt();
        switch (j) {
            case 1:
                S1.setScourse("C");
                break;
            case 2:
                S1.setScourse("D");
                break;

            default:
                System.out.println("选课异常");
                return;
        }
        System.out.println("选课成功，您选择了" + j + "号课程,课程信息：");
        System.out.println(S1);
        System.out.println("退课不？（退课请输入0，确认不需要退课请输入1）");
        int k = in.nextInt();
        if (k == 0) {
            S1.setScourse(null);
            System.out.println("不允许退课");
            System.out.println(S1);

        } else {
            System.out.println("选课成功！");
        }
}
}
