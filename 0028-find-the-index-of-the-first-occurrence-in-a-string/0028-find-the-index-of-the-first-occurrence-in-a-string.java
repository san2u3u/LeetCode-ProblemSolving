class Solution {
    public int strStr(String haystack, String needle) {
        int hayLen = haystack.length();
        int needLen = needle.length();
        int result = -1;

        if(hayLen < needLen)
            return result;
        
        for(int i = 0; i < hayLen; i++) {
            // Find same character with needle[0]
            if(haystack.charAt(i) == needle.charAt(0)) {
                for(int c = 0; c < needLen; c++) {
                    if(needle.charAt(c) != haystack.charAt(i + c >= hayLen ? hayLen - 1 : i + c))
                        break;
                    
                    if(c == needLen - 1)
                        result = i; // store index to return
                }
                // Escape for loop because already get answer
                if(result >= 0)
                    break;
            }
        }
        
        return result;
    }
}