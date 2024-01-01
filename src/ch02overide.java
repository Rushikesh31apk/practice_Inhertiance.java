class A{
    public void meth2(int x){
        System.out.println("Hey i am class A:"+x);
    }
}
class B extends A{

    public void meth2(int x) {

        System.out.println("Hey i am class B:"+x);
    }
}

public class ch02overide {
    public static void main(String[] args) {

       A b=new A();
        B a=new B();
        b.meth2(9);
        a.meth2(9);
    }
}
