/**
 * Author: Bayarjargal Jargalsaikhan
 * Date:2024.07.04
 * Time:16:20
 */

package lab1;

import java.util.ArrayList;
import java.util.List;

public class Subset {

    public static List<Integer> subsetsum(List<Integer> S, int k) {
        List<Integer> result = new ArrayList<>();
        if (findSubset(S, k, 0, result)) {
            return result;
        } else {
            return null;
        }
    }

    private static boolean findSubset(List<Integer> S, int k, int index, List<Integer> result) {
        if (k == 0) {
            return true;
        }
        if (index == S.size() || k < 0) {
            return false;
        }

        result.add(S.get(index));
        if (findSubset(S, k - S.get(index), index + 1, result)) {
            return true;
        }

        result.remove(result.size() - 1);
        if (findSubset(S, k, index + 1, result)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        List<Integer> S = new ArrayList<>();
        S.add(3);
        S.add(34);
        S.add(4);
        S.add(12);
        S.add(5);
        S.add(2);

        int k = 9;
        List<Integer> subset = subsetsum(S, k);

        if (subset != null) {
            System.out.println("Subset found that sums to " + k + ": " + subset);
        } else {
            System.out.println("No subset found that sums to " + k);
        }
    }
}
