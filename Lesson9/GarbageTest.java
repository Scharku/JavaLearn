package Lesson9;

public class GarbageTest {
    int Obj;
}

class Test {
    public static void main(String[] args) {
        GarbageTest GT1 = new GarbageTest();
        GarbageTest GT2 = new GarbageTest();
        GarbageTest GT3 = new GarbageTest();
        GarbageTest GT4 = new GarbageTest();
        GarbageTest GT5 = new GarbageTest();
        GarbageTest GT6 = new GarbageTest();
        GarbageTest GT7 = new GarbageTest(); // останется
        GarbageTest GT8 = new GarbageTest(); // останется
        GT1 = null; GT2 = null; 
        GT3 = null; GT4 = null;
        GT5 = null; GT6 = null;
        GT8.Obj = 5;
    }
}
