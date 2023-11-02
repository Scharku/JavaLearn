package Lesson9;

/* class Test1 { // работать не будет, потому что две переменные с одним названием.
    int a = 1;
    static int a = 2;
    
    void abc(int a){
        System.out.println(a);
        System.out.println(this.a);
    }
    
    public static void main(String[] args) {
        Test 1 t = new Test1();
        t.abc(3);
    }
} */

class Test2 { // 5 2
    int a = 1;
    static int b = 2;
    
    static void abc(final int a){
        System.out.println(a);
        System.out.println(Test2.b);
    }
    
    public static void main(String[] args) {
        abc(5);
    }
}

class Test3 { // 2 4 1 2
    int a = 1;
    static int b = 2;
    
    void abc(int a){
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Test3.b);
    }
    
    public static void main(String[] args) {
        Test3 t = new Test3();
        t.abc(4);
    }
}