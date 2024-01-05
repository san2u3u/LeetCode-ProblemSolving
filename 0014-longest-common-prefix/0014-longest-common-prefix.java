class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix="";
        
        // If length is zero
        if(strs.length == 0) 
            return prefix;
        
        // Compare str[0] with other strs(1 ~ )
        prefix = strs[0];
        for(int i=1; i<strs.length; i++){
            String cur = strs[i];
            
            // Compare character
            while(cur.indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        
        return prefix;
    }
}