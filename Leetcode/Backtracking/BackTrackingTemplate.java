class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> arr=new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();
        backtrack(n,k,arr,list,1);
        return list;
    }
    public void backtrack(int n,int k,List<Integer> arr,List<List<Integer>> list,int start){
        if(arr.size()==k){
            list.add(new ArrayList<>(arr));
        }
        else{
            for(int i=start;i<=n;i++){
                if(arr.contains(i)) continue;
                arr.add(i);
                backtrack(n,k,arr,list,i+1);
                arr.remove(arr.size()-1);
            
            }
        }
    }
    
}