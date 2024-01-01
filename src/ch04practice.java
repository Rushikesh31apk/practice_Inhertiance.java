import java.util.Scanner;

class value{
    public float r;
    public float h;
    public double area;
    public void set(float r,float h){
        this.r=r;
        this.h=h;
    }
    public float get() {
        return r;
    }
}
class areafinder extends value{
    public double areaci(){
        area=(3.14*get()*get());
        return area;
    }
    public double areacy(){
        area= (2*3.14*r*h)+2*3.14*r*r;
        return area;
    }
}
public class ch04practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter redius:");
        float r= sc.nextFloat();
        System.out.println("Enter height: ");
        float h=sc.nextFloat();
        areafinder s=new areafinder();
        s.set(r,h);
        System.out.println("Area of cirle: "+ s.areaci());
        System.out.println("Area of cirle: "+ s.areacy());
    }
}
