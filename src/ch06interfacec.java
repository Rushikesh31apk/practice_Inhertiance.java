interface race{
    void breaks(int dec);
    void speedup(int inc);
}
interface horn{
    void pop();
    void pe();
}
class multiple implements race,horn{
    @Override
    public void breaks(int dec) {
        System.out.println("Please decrease your speed");
    }

    @Override
    public void speedup(int inc) {
        System.out.println("Yeah buddy hit race button ");
    }

    @Override
    public void pop() {
        System.out.println("horn four wheeler--> poo poo poo");
    }

    @Override
    public void pe() {
        System.out.println("horn two wheeler--> pee pee pee");
    }
}

public class ch06interfacec {
    public static void main(String[] args) {
         multiple sc=new multiple();
         sc.breaks(4);
         sc.speedup(5);
         sc.pop();
         sc.pe();
    }
}
