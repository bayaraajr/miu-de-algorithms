/**
 * Author: Bayarjargal Jargalsaikhan
 * Date:2024.07.07
 * Time:13:24
 */

package lab2;

public class MergeArrays {
    public int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }

        while(i < a.length) c[k++] = a[i++];
        while(j < b.length) c[k++] = b[j++];
        return c;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9};
        int[] c= new MergeArrays().merge(a, b);
        for(int i: c) {
            System.out.print(i + "\n");
        }
    }
}
