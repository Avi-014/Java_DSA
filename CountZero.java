public class CountZero {
    static int count=0;
    public static void main(String[] args) {
        Zeroes1(1002);
        System.out.println(count);
        System.out.println(Zeroes(10000200));
    }
    static int Zeroes(int n){
        if (n==0){
            return count;
        }
        int digits = n%10;
        if(digits == 0){
            count = count+1;
            return Zeroes(n/10);
        }
        return Zeroes(n/10);
    }

// OR
    static void Zeroes1(int n){
        int digits = n%10;
        if(digits == 0){
            if (n==0){
                return;
            }
            count++;
        }
        Zeroes1(n/10);
    }
}
