package lishan.pojo;

public class Cat {
    private String type;
    private String color;
    private int age;
    private int weight;

    public Cat(String type, String color, int age, int weight) {
        this.type = type;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public Cat() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void printCat(){
        System.out.println("这只猫的种类是"+this.type+'\n'+"颜色是"+this.color+'\n'+this.age+'\n'+this.weight);
    }
    public void yelling(){
        System.out.println("猫发出叫声");
    }
    public void playing(String toy){
        System.out.println("猫玩"+toy);
    }
    public void playing(Cat cat){
        System.out.println("猫与"+cat+"玩");
    }
}

