package sample;

public class Person {
    private String num;
    private String name;
    private int sex;
    private int age;
    private String type;
    private String area;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Person(String num, String name, int sex, int age, String type, String area) {
        this.num = num;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.type = type;
        this.area = area;
    }

    public Person() {
    }

    public void eating(String food){
        System.out.println(name+"吃"+food);
    }
    public void shopping(String goods){
        System.out.println(name+"买"+goods);
    }
    public void sleeping(int time){
        System.out.println(name+"睡了"+time+"分钟");
    }

    public void printPerson() {
        System.out.println("Person{" +
                "num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", type='" + type + '\'' +
                ", area='" + area + '\'' +
                '}');
    }
}
