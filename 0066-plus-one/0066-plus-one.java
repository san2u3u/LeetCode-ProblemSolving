class Solution {
    public int[] plusOne(int[] digits) {
        int digitLength = digits.length;
        int[] buffer = new int[digitLength + 1];
        
        for(int i = digitLength - 1; i >= 0; i--) {
            // add only 1's digit
            if(i == digitLength - 1)
                digits[i] += 1;

            // if carry exists
            if(digits[i] >= 10) {
                // if carry is highest digit
                if(i == 0) {
                    digits[i] -= 10;
                    // get a new larger size array(index + 1)
                    buffer[0] = 1;
                    // copy all other datas
                    for(int j = 0; j < digitLength; j++) {
                        buffer[j + 1] = digits[j];
                    }
                    // end function
                    return buffer;
                }
                // move carry
                digits[i] -= 10;
                digits[i - 1] += 1;
            }
            else
                break;
        }
        return digits;
    }
}