class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        String sortedS1 = new String(arr1);
        for(int i=0;i<s2.length();i++){
            for(int j=i;j<s2.length();j++){
                char[] subStrArr = s2.substring(i, j+1).toCharArray();
                Arrays.sort(subStrArr);
                String sortedSubStr = new String(subStrArr);
                if(sortedSubStr.equals(sortedS1)){
                    return true;
                }
            }
        }
        return false;
    }
}
