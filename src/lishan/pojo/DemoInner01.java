package lishan.pojo;

class Outer{
    private int outX = 10;
    public void showOut() {
        System.out.println("=====Outer中的方法调用内部类的成员变量");
        System.out.println(new Inner().innY);
    }
    class Inner{
            private int innY=99;
            public int getInnY(){
                return innY;
            }
            public void showInn(){
                System.out.println("=====inner的方法=====");
                System.out.println("外部类成员变量outX="+ Outer.this.outX);
                Outer.this.showOut();
            }
        }
}
public class DemoInner01 {
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner inner = out.new Inner();
        inner.showInn();
    }
}
