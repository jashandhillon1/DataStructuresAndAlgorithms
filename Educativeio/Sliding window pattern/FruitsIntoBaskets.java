import java.util.HashMap;

class FruitIntoBasket{
    public static int solution(char[] arr){
        HashMap<Character,Integer> map=new HashMap<>();
        int start=0;
        int maxsize=0;
        for(int end=0;end<arr.length;end++){
            char right=arr[end];
            map.put(right,map.getOrDefault(right,0)+1);
            while(map.size()>2){
                char left=arr[start];
                map.put(left,map.get(left)-1);
                if(map.get(left)==0){
                    map.remove(left);
                }
                start++;

            }
            maxsize=Math.max(maxsize,end-start+1);
        }

        return maxsize;

    }
    //adding comment
    public static void main(String[] args){
        FruitIntoBasket.solution(new char[] {'A','B','A','C'});

    }
}