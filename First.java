// java program to fina a prime number
public class First{

    // main method
    public static void main(String[] args) {
        int n = 1000000000;
        for(int i=2;i<=n;i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // method to check if a number is prime
    public static boolean isPrime(int n) {
        // check if n is a multiple of 2
        if (n%2==0) return false;
        // if not, then just check the odds
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }



}