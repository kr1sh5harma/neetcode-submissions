class Solution {
    public boolean isAnagram(String s, String t) {
        int x = s.length();
        int y = t.length();
        if(x!=y) return false;
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
}
