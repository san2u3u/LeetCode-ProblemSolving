class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        
        while(!set.contains(n)) {
            set.add(n);
            
            int temp = n;
            n = 0;
            
            while(temp != 0) {
                n += (temp % 10) * (temp % 10);
                temp /= 10;
            }
            
            if(n == 1)
                return true;
        }
        return false;
    }
}