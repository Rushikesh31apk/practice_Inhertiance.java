import java.util.Random;
import java.util.Scanner;
class guess{
    private int num;
    public guess(int n){
        num=n;
    }
    public static int takenum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your guess:");
        int n=sc.nextInt();
        return n;
    }
    public static int checknum(){
        Random s=new Random();
        int p=s.nextInt(100);
        return p;
    }
    public  void check(){
        int guess=checknum();
        int cnt=1;
        do{
            if(num< guess)
            {
                System.out.println("Enter element less than guess element");
                System.out.println("please re-enter");
                cnt++;
                num=takenum();
            }
            else{
                System.out.println("Enter element grater than guess element");
                System.out.println("please re-enter");
                cnt++;
                num=takenum();
            }
            if(num== guess)
            {
                System.out.println("++++++---------WIN---------++++++");
                System.out.println("you have guess correct in attempt:---> "+cnt);
                break;
            }
        }while (num !=guess);
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome in guess number game ");
        guess s=new guess(guess.takenum());
        s.check();
    }
}
