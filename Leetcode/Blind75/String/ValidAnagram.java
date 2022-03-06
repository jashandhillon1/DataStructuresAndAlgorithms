class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            int count=map.getOrDefault(s.charAt(i),0);
            map.put(s.charAt(i),count+1);
        }
        for(int j=0;j<t.length();j++){
            char c=t.charAt(j);
            if (map.containsKey(c)){         
                map.put(c,map.get(c).intValue()-1);
            }
            else{
                return false;
            }
            
        }
        for(char key:map.keySet()){ 
            if(map.get(key)!=0){
                return false;
            }
        }
        return true;
    }
}