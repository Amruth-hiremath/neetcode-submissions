class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        int n1 = s.length();
        int n2 = t.length();

        if(n1 != n2) return false;

        for(int i = 0; i < n1; i++){
            int index = s.charAt(i) - 'a';
            arr1[index]++;
        }
        for(int i = 0; i < n2; i++){
            int index = t.charAt(i) - 'a';
            arr2[index]++;
        }
        for(int i = 0; i < 26; i++){
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}
