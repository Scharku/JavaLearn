package Lesson6;
public class Sum {
    
    int Sum(int a, int b, int c, int d){
        return (a + b + c + d);
    }
    
    int Sum(int a, int b, int c){
        return(a + b + c);
    }
    
    int Sum(int a, int b){
        return(a + b);
    }
    
    int Sum(int a){
        return(a);
    }
    
    int Sum(){
        return(0);
    }
}

class SumTest {
    public static void main(String[] args) {
        Sum s1 = new Sum();
        int k = s1.Sum(1, 2, 3, 4);
        int k2 = s1.Sum(1, 3, 6);
        int k3 = s1.Sum(5, 12);
        int k4 = s1.Sum(5);
        int k5 = s1.Sum();
                
        System.out.println(k + " " + k2 + " " + k3 + " " + k4 + " " + k5);
    }
}