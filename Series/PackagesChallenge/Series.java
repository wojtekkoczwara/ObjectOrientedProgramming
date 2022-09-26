package PackagesChallenge;

public class Series {
    public static void main(String[] args) {

    }

    public static int nSum(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static long factorial(int n){
        if( n == 0){
            return 1;
        }
        long factorial = 1;
        for (int i = 1; i <= n ; i++) {
            factorial *=i;
        }
        return factorial;
    }

    public static long fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        long fib = 0;
        long nMinus2 = 0;
        long nMinus1 = 1;
        for (int i = 1; i < n; i++) {
            fib = (nMinus2 + nMinus1);
            nMinus2 = nMinus1;
            nMinus1 = fib;
        }
        return fib;
    }
}
