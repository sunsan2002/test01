package sample;

import java.util.Scanner;

import static java.lang.System.exit;

public class Work {
    public static int[] nums = new int[10];
    public static int add=0;
    public static void meun(){
        System.out.println("1");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i==1){
            System.out.println("请输入成绩：");
            Scanner scanner1 = new Scanner(System.in);
            int i1 = scanner.nextInt();
            in(i1);
            meun();
        }else if(i==2){

        }else if(i==3){

        }else{

        }
        exit(0);
    }

    public static void in(int score){
        nums[add++]=score;
    }


    public static void main(String[] args) {
        meun();

    }
}
