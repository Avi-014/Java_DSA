public class Fibonacci_Recursion {
    public static void main(String[] args) {
        System.out.println(fibo(7));
        System.out.println("\n");
        System.out.println(fiboformula(92));
    }
    static long fiboformula(int  n){
       return (long)((Math.pow(((1+Math.sqrt(5)) / 2), n)/Math.sqrt(5))-(Math.pow(((1-Math.sqrt(5)) / 2), n)/Math.sqrt(5)));
//        You can use only ((Math.pow(((1+Math.sqrt(5)) / 2), n)/Math.sqrt(5)) for n>=8
    }
    static int fibo(int n){
        if (n<2){
            return n;
        }
        return (fibo(n-1)+fibo(n-2)); //time complexity is {(root 5 + 1)/2}^n
    }
}
