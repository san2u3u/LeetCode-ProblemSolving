class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        
        // 양 끝의 값만 비교하므로, 절만 까지만 반복문 동작
        int end = str.length();
        for (int i = 0; i < end / 2; i++) {
            char left = str.charAt(i);
            char right = str.charAt(end - 1 - i);
            
            if (left != right)
                return false;
        }
        
        return true;
    }
}