import java.util.ArrayList;
import java.lang.Integer;

class Solution {
    public int romanToInt(String s) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case 'I': numbers.add(1);
                    break;
                case 'V': numbers.add(5);
                    break;
                case 'X': numbers.add(10);
                    break;
                case 'L': numbers.add(50);
                    break;
                case 'C': numbers.add(100);
                    break;
                case 'D': numbers.add(500);
                    break;
                case 'M': numbers.add(1000);
                    break;
            }
        }
        int total = 0;
        int last = 0;
        for (int i=numbers.size()-1;i>=0;i--){
            if (numbers.get(i)<last) {
                total -= numbers.get(i);
            } else {
                total += numbers.get(i);
            }
            last = numbers.get(i);
        }
        //System.out.println(numbers.toString());
        
        return total;
    }
}