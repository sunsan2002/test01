package sample;

public class Battery {
    private static Battery bat;
    private Battery(){

    }
    public static Battery getInstance(){
        if(bat==null)
            bat = new Battery();
        return bat;
    }
    public void fire(String bomb){
        System.out.println("发射"+bomb);
    }
}
