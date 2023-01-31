
package lishan.pojo;

public class Student{
    // public static String school = "吉首大学";//定义公有化静态数据成员
    private static String school = "吉首大学";//私有化静态数据成员
    private String name;
    private char sex;

    public Student(String s, String name, int i, char sex) {
        this.name = name;
        this.sex = sex;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    public static String getSchool() {
        return Student.school;
    }

    public void printStudent(){
        System.out.println("姓名："+this.name+",性别："+this.sex+"，学校名："+Student.school);
    }


}



