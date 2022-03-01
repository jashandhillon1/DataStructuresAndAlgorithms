class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int length=0;
        Set<Character> hash_set=new HashSet<Character>();

        while(right<s.length()){
            if(!hash_set.contains(s.charAt(right))){
                hash_set.add(s.charAt(right++));
                length=Math.max(length,hash_set.size());
                
            }
            else{
                hash_set.remove(s.charAt(left++));
            }
            
        }
        return length;
    }
}

//Time Complexity O(2N)
//Space Complexity O(N)
//Can be optimized further