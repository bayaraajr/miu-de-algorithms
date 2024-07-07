/**
 * Author: Bayarjargal Jargalsaikhan
 * Date:2024.07.07
 * Time:14:02
 */

package lab2;

import java.util.*;

public class PowerSet<E> {
    public List<Set<E>> powerSet(List<E> X) {
        List<Set<E>> P = new ArrayList<>();
        Set<E> S = new HashSet<>();

        P.add(S);

        Set<E> T;

        while (!X.isEmpty()) {
            E f = X.remove(0);

            List<Set<E>> currentSubsets = new ArrayList<>(P);
            for (Set<E> x : currentSubsets) {
                T = new HashSet<>(x);
                T.add(f);
                P.add(T);
            }
        }

        return P;
    }

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        PowerSet<Integer> powerSetAlgorithm = new PowerSet<>();
        List<Set<Integer>> subsets = powerSetAlgorithm.powerSet(input);
        for (Set<Integer> subset : subsets) {
            System.out.println(subset);
        }
        List<String> inputStrings = new ArrayList<>(Arrays.asList("A", "B", "C"));
        PowerSet<String> powerset = new PowerSet<>();
        List<Set<String>> stringSubsets = powerset.powerSet(inputStrings);
        for (Set<String> subset : stringSubsets) {
            System.out.println(subset);
        }
    }
}
