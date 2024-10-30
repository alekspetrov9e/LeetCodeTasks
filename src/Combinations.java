import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res,new ArrayList<>(),n,k, 1);
        return res;
    }
    public void backtrack(List<List<Integer>> res, List<Integer> comb, int n, int k, int start) {
        if (comb.size() == k){
            res.add(new ArrayList<>(comb));
            return;
        }
        for (int i = start; i <= n; i++) {
            comb.add(i); // Choose number i
            backtrack(res, comb, n, k, i + 1); // Recurse with next starting number
            comb.remove(comb.size() - 1); // Undo the choice
        }

    }

    public static void main(String[] args) {
        Combinations combinations = new Combinations();
        List<List<Integer>> res = combinations.combine(3, 2);
        System.out.println(res);
    }
}
