import java.lang.StringBuilder;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder mutableMag = new StringBuilder(magazine);
        try{
        for (int i=0;i<ransomNote.length();i++) {
            mutableMag.deleteCharAt(mutableMag.lastIndexOf(String.valueOf(ransomNote.charAt(i))));
        }
        }catch (Exception e) {
            return false;
        }
        return true;
    }
}
