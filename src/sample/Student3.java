package sample;

public class Student3 {

     {
 System.out.println("普通构造块1，输出数据成员name（定义之前）："+this.name);
}
 String name="xxx";
{
 System.out.println("普通构造块2，输出数据成员name（定义之后）："+this.name);
 }
 static {
      System.out.println("静态构造块1，count=（定义之前）"+Student3.count);
 }
 static int count;
 static {
      System.out.println("静态构造块2，count=（定义之后）"+Student3.count);
 Student3.count++;
 }
 public Student3(String name){
 System.out.println("构造方法，给成员变量赋值之前："+this.name);
 this.name=name;
 System.out.println("构造方法，给成员变量之后："+this.name);
 }
}