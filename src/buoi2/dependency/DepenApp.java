package buoi2.dependency;

public class DepenApp {

    public static void main(String[] args) {
        B bRemote = new B();

        //A aRemote = new A(bRemote);

        A aRemote = new A();
        aRemote.setBRemote(bRemote);

       // aRemote.methodA();;
        
    }

}
