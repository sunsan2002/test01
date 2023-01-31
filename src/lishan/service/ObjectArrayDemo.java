package lishan.service;

class Person{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Person() {
    }
    public String getPerson(){
        return "姓名"+this.name+",年龄"+this.age;
    }
}
public class ObjectArrayDemo {
    public static void main(String[] args) {
        Person[] group = new Person[5];
        group[0] = new Person("张无忌",18);
        group[1]=new Person("刘德华",22);
        group[2] =new Person("周润发",21);
        group[3] = new Person("周星驰",20);
        group[4] = new Person("吴孟达",25);
        for(Person p:group){
            System.out.println(p.getPerson());
        }
        Person max = group[0];
        Person min = group[0];
        for(int i=1;i<group.length;i++){
            if(group[i].getAge()>max.getAge())
                max=group[i];
            else if(group[i].getAge()<min.getAge())
                min=group[i];
        }
        System.out.println("年龄最大的是"+max.getPerson());
        System.out.println("年龄最小的是"+min.getPerson());
    }
}
