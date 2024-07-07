/**
 * Author: Bayarjargal Jargalsaikhan
 * Date:2024.07.04
 * Time:13:18
 */

package lab1;

public class GCDAlgorithm {
    public int gcd(int m, int n) {
        if (n == 0) return m;
        return gcd(n, m % n); // Corrected the recursive call
    }

    public static void main(String[] args) {
        GCDAlgorithm gcdAlgorithm = new GCDAlgorithm();
        System.out.println(gcdAlgorithm.gcd(9, 6)); // This should print 3
    }
}