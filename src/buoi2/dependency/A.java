package buoi2.dependency;

public class A {
    //field
    

    //function, method =>behavior
    A(){//function
        B bRemote = new B();
        bRemote.methodB();
    }

    A(B bRemote){
        bRemote.methodB();
    }

    void setBRemote(B bRemote){
        bRemote.methodB();
    }

    public void methodA() {
        B bRemote = new B();
        bRemote.methodB();
        
    }


}
