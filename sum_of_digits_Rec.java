public class sum_of_digits_Rec {
    public static void main(String[] args) {
        System.out.println(SOD(0X9000));
    }
    static int SOD(int n){
        if(n==0) {
            return 0;
        }
        return (n%10)+SOD(n/10);
    }
}
