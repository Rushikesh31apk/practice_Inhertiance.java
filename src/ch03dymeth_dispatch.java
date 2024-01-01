import java.util.Scanner;
class phone{
    public void time(){
        System.out.println("Now timing is 7 AM...");
    }
    public void on(){
        System.out.println("phone is starting...");
    }
}
class smartphone extends phone{
    public void on(){
        System.out.println("smart phone is starting...");
    }
    public void music(){
        System.out.println("starts music...");
    }
}
public class ch03dymeth_dispatch {
    public static void main(String[] args) {
        phone obj=new smartphone();
        obj.time();
        obj.on();
        //obj.music();---> not allowed
        //smartphone obj=new phone;---->not allowed
    }
}
