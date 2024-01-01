abstract class pen{
    abstract void write();
    abstract void refil();
}
class fountainpen extends pen{
    void changenib(){
        System.out.println("Changing nib...");
    }
    @Override
    void write() {
        System.out.println("Writing...");
    }

    @Override
    void refil() {
        System.out.println("Full refil...");
    }
}
//----------------------------------------------
class monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("biteing...");
    }
}
interface basicanimal{
    void eat();
    void drink();
}
class human extends monkey implements basicanimal{
    void sleep(){
        System.out.println("Slepping...");
    }
    @Override
    public void eat(){
        System.out.println("eating...");
    }

    @Override
    public void drink() {
        System.out.println("Drinking...");
    }
}
//----------------------------------------------
 abstract class telephone{
    abstract void ring();
    abstract void connecting();
    abstract void disconnect();
}
class smartphone1 extends telephone{
    void dial(){
        System.out.println("Dial first...");
    }
    @Override
    void ring() {
        System.out.println("Ringing.....");
    }

    @Override
    void connecting() {
        System.out.println("Connecting...");
    }

    @Override
    void disconnect() {
        System.out.println("Disconnecting...");
    }
}
public class Practice_Set_Inheritance {
    public static void main(String[] args) {
        // Q1 + Q2 answer
        System.out.println("Question Start->");
        fountainpen s= new fountainpen();
        s.changenib();
        s.refil();
        s.write();

        // Q3 + Q5 answer
        System.out.println("Question Start->");
         monkey rushi=new human();
         //rushi.drink();----> cannot access
        //rushi.sleep();------> cannot access
        // only inherited monkey class method like method dispatch or polymorphism.
        rushi.jump();
        rushi.bite();

        // human class access all methods
        human rutu=new human();
        rutu.eat();
        rutu.drink();
        rutu.sleep();
        rutu.jump();
        rutu.bite();

        // Q4
        System.out.println("Question Start->");
        telephone me= new smartphone1();
        //me.dial(); ----->throw error
        me.ring();
        me.connecting();
        me.disconnect();
    }
}
