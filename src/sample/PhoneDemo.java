package sample;

class  Phone{

    private String name;

    private int price;

    public Phone(String name, int price) {

        this.name = name;

        this.price = price;

    }

    public String toString() {

        return ""+this.price;

    }

}

public class PhoneDemo {

    public static void main(String[] args) {

        StringBuffer sb=new StringBuffer();

        Phone [] list=new Phone[3];

        list[0]=new Phone("华为",3000);

        list[1]=new Phone("小米8",4000);

        list[2]=new Phone("vivo R10",2300);

        for(Phone p:list)

            sb.append(p);

        System.out.println(sb.toString());

    }

}