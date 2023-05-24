public class Main {
    public static void main(String[] args) {
        int n = 20;
        byte[] numall = new byte[n];
        int nprimes = 0;
        int[] primes = new int[1000000];

        // Ustawianie tablicy numall
        for (int i = 0; i < n; i++) {
            numall[i] = 1;
        }

        // Obliczanie liczb pierwszych
        for (int p = 2; p * p <= n; p++) {
            if (numall[p] == 1) {
                for (int i = p * p; i < n; i += p) {
                    numall[i] = 0;
                }
            }
        }

        // Liczenie i zapisywanie liczb pierwszych
        for (int i = 2; i < numall.length; i++) {
            if (numall[i] == 1) {
                primes[nprimes] = i;
                nprimes++;
            }
        }
        // Wyświetlanie liczb pierwszych
        for (int i = 0; i < nprimes; i++) {
            System.out.println(primes[i]);}

        System.out.println("\nIlosc liczb pierwszych: " + nprimes);


    }
}
