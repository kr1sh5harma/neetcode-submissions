class Solution {
    public int characterReplacement(String s, int k) {
        int[] counts = new int[26];
        int l = 0;
        int maxFrequency = 0;
        int maxLength= 0;
        for (int r = 0; r < s.length(); r++) {
            counts[s.charAt(r) - 'A']++;
            
            maxFrequency = Math.max(maxFrequency, counts[s.charAt(r) - 'A']);

            while ((r - l + 1) - maxFrequency > k) {
                counts[s.charAt(l) - 'A']--;
                l++;
            }

            maxLength = Math.max(maxLength, r - l + 1);
        }

        return maxLength;
    }
}
