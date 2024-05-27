package buoi2.association;

public class A {
    //field
    B bRemote;

    //function, method =>behavior
    A(){//function

    }

    A(B bRemote){
        /*instance variable*/this.bRemote = bRemote/*local variable */;
    }

    void setBRemote(B bRemote){
        this.bRemote = bRemote;
    }

    public void methodA() {
        bRemote.methodB();
        
    }


}
