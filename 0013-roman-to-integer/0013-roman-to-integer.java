class Solution {
    public int romanToInt(String s) {
 
        int total = 0;
        int value = 0;
        
        // 간단한 for 루프 사용
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            
            switch (s.charAt(i)) {
                case 'I':
                    if (i+1 >= s.length()) {
                        value = 1;
                    }
                    else if (s.charAt(i+1) == 'V') {
                        value = 4;
                        i++;
                    }
                    else if (s.charAt(i+1) == 'X') {
                        value = 9;
                        i++;
                    }
                    else {
                        value = 1;
                    }
                    break;
                case 'X':
                    if (i+1 >= s.length()) {
                        value = 10;
                    }
                    else if (s.charAt(i+1) == 'L') {
                        value = 40;
                        i++;
                    }
                    else if (s.charAt(i+1) == 'C') {
                        value = 90;
                        i++;
                    }
                    else {
                        value = 10;
                    }
                    break;
                case 'C':
                    if (i+1 >= s.length()) {
                        value = 100;
                    }
                    else if (s.charAt(i+1) == 'D') {
                        value = 400;
                        i++;
                    }
                    else if (s.charAt(i+1) == 'M') {
                        value = 900;
                        i++;
                    }
                    else {
                        value = 100;
                    }
                    break;
                case 'V':
                    value = 5;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;
            }
            
            total += value;
        }
        
        return total;
    }
}