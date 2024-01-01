class emp{
    int x;
    emp(int x) {
        System.out.println("I am constructor and i ytake value:" + x);
    }
}
class emp2 extends emp{
    emp2(int x){
        super(x);
        System.out.printf(" i am chile of emp");
    }
}
public class ch01 {
    public static void main(String[] args) {
        emp2 e= new emp2(6);
    }
}
