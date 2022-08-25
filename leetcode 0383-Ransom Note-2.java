class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] noteLetters = new int[26];
        int[] magLetters = new int[26];
        
        for (int i=0;i<ransomNote.length();i++) {
           noteLetters[ransomNote.charAt(i)-97]++;
        }
        for (int i=0;i<magazine.length();i++) {
           magLetters[magazine.charAt(i)-97]++;
        }
        for (int i=0; i<26; i++) {
            if (noteLetters[i] > magLetters[i]) {
                return false;
            }
        }
        return true;
        
    }
}
