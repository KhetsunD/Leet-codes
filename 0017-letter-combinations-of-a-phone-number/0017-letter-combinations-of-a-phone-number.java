import java.util.*;

class Solution {

    List<String> ans = new ArrayList<>();

    String[] map = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) {
            return ans;
        }

        dfs(0, digits, new StringBuilder());

        return ans;
    }

    private void dfs(int idx, String digits, StringBuilder curr) {

        if (idx == digits.length()) {
            ans.add(curr.toString());
            return;
        }

        String letters = map[digits.charAt(idx) - '0'];

        for (char ch : letters.toCharArray()) {

            curr.append(ch);

            dfs(idx + 1, digits, curr);

            curr.deleteCharAt(curr.length() - 1); // backtrack
        }
    }
}