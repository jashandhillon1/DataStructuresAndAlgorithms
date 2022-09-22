import java.util.HashMap;

class LongestSubstringWithNoRepeatingCharacters{
    public static int solution(String s){
        int start=0;
        int maxlength=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int end=0;end<s.length();end++){
            char right=s.charAt(end);
            map.put(right,map.getOrDefault(right,0)+1);
            while(map.get(right)>1){
                map.put(s.charAt(start),map.get(s.charAt(start))-1);
                start++;

            }
            maxlength=Math.max(maxlength,end-start+1);


        }
        return maxlength;


    }



    public static void main(String[] args){
        LongestSubstringWithNoRepeatingCharacters.solution("aabcdef");

    }
}