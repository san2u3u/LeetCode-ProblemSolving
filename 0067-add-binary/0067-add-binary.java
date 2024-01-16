class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder(); // String is constant object, so to dynamic memory allocate memory, use Stringbuilder
        int i = a.length() -1; 
        int j = b.length() -1; // Binary data need to be calculated from right
        int carry = 0;

        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0)sum += a.charAt(i) - '0'; // To conver char to int, use '0' (ASCII code)
            if(j>=0)sum += b.charAt(j) - '0'; // same with just before
            sb.append(sum % 2); // must get 0 or 1, so store rest of the value to valueable name 'sb'
            carry = sum / 2; // it has carry value, if 1, because 1 must go to next hole

            i--;
            j--;
        }

        if(carry != 0)sb.append(carry);
        return sb.reverse().toString();
    }
}