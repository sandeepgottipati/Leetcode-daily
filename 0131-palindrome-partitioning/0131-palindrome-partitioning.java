class Solution {
    public List<List<String>> partition(String s) {
        if (s.length() == 0)
            return new ArrayList<>();
        List<List<String>> res = new ArrayList<>();
        helper(res, new ArrayList<>(), s);
        return res;
    }

    private void helper(List<List<String>> res, List<String> temp, String s) {

        // base case:
        if (s.length() == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 1; i <= s.length(); i++) {
            String subStr = s.substring(0, i);
            if (!isPalindrome(subStr))
                continue;

            temp.add(subStr);
            helper(res, temp, s.substring(i, s.length()));
            temp.remove(temp.size() - 1);
        }
    }

    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}