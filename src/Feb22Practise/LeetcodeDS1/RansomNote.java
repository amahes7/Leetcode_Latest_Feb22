package Feb22Practise.LeetcodeDS1;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length()< ransomNote.length()) return false;
        int[] arr = new int [26];
        for (char ch: magazine.toCharArray()) arr[ch-'a']++;
        for (char ch:ransomNote.toCharArray()){
            arr[ch-'a']--;
            if (arr[ch-'a']<0) return false;
        }
        return true;
    }
}
