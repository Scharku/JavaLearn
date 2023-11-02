package p4;
import p1.*;
import static p1.p2.B.*;
import p1.p2.p3.*;
import p4.p5.*;

public class D {
    
    public static void main(String[] args) {
        A A = new A();
        C C = new C();
        E E = new E();
        int K = A.aa + bb + C.cc * E.ee;
        System.out.println(K);
    }
}
