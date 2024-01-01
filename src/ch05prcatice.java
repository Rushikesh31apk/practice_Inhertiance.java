import java.util.Scanner;
class rectangle{
    public int s,h;
    public void set(int s,int h){
        this.s=s;
        this.h=h;
    }
    public long area(){
        return s*h;
    }
}
class square extends rectangle{

    public long area() {
        return s*s;
    }
}
public class ch05prcatice {
    public static void main(String[] args) {
        rectangle s=new square();
         s.set(6,9);
        System.out.println("Area of square: "+ s.area());
        rectangle sp= new rectangle();
        sp.set(3,6);
        System.out.println("Area of  rectangle: "+ sp.area());
    }
}
