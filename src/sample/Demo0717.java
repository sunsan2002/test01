package sample;

public class Demo0717 {
    public static void main(String[] args) {
        Battery bat = Battery.getInstance();
        bat.fire("导弹");
        bat.fire("手榴弹");
    }
}
