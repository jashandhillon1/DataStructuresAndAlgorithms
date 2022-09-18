import java.util.HashMap;

class LongestSubstringWithKDistinctCharacters{

    public static int solution(int k,String s){
        HashMap<Character,Integer> map=new HashMap<>();
        int start=0;
        int maxlength=0;
        for(int end=0;end<s.length();end++){
            Character ch=s.charAt(end);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()>k){
                char left=s.charAt(start);
                map.put(left,map.get(left)-1);
                if(map.get(left)==0){
                    map.remove((left));
                }
                start++;

            }
            maxlength=Math.max(maxlength,end-start+1);


        }
        return maxlength;


    }
    public static void main(String[] args){
        LongestSubstringWithKDistinctCharacters.solution(2,"aracci");

    }


}
