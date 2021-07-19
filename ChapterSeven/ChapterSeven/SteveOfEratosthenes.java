package ChapterSeven;

public class SteveOfEratosthenes {
    public void SieveOfEratosthenes(int n){
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            prime[i] = true;
        }
        for (int j = 2; j*j <= n ; j++) {
            if (prime[j] == true) {
                for (int i = j * j; i <= n; i += j) {
                    prime[i] = false;
                }
            }
        }

        for (int i = 2; i <= n ; i++) {
            if (prime[i]==true){
                System.out.println (i + " " );
            }
        }
    }

    public static void main(String[] args) {
        int n = 1000;
        System.out.println ("the following are prime numbers smaller or equals to " + n );
        SteveOfEratosthenes steve = new SteveOfEratosthenes ();
        steve.SieveOfEratosthenes (n);
    }
}
