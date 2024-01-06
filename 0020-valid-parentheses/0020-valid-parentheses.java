class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        Stack<Character> stack = new Stack<>();
        
        // If the length of String isn' even number, then it must be odd number
        if(len % 2 != 0) {
            return false;
        }
        
        for(int i = 0; i < len; i++) {
            char curn = s.charAt(i);
            
            if(curn == '(' || 
               curn == '{' || 
               curn == '[') {
                stack.push(curn);
            }
            
            // Opend but not Closed
            else if(stack.size() == 0) {
                return false;
            }
            
            else if(curn == ')') {
                if(stack.pop() != '(') {
                    return false;
                }
            }
            else if(curn == '}') {
                if(stack.pop() != '{') {
                    return false;
                }
            }
            else if(curn == ']') {
                if(stack.pop() != '[') {
                    return false;
                }
            }
        }
        
        return stack.size() == 0;
    }
}