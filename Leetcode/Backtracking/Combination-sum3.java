class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list=new ArrayList<>();
        backtrack(list,new ArrayList<>(), n, k,1);
        return list;
        
    }
    public void backtrack(List<List<Integer>> list,List<Integer> templist,int remain,int k,int start){
        if(remain<0) return;
        else if(templist.size()==k && remain==0){
            list.add(new ArrayList<>(templist));
        }
        else{
            for(int i=start;i<=9;i++){
                templist.add(i);
                backtrack(list,templist,remain-i,k,i+1);
                //remove this from templist as we are backtracking so at each backtrack the elements in templist should be equal elements which are supposed at that level.
                templist.remove(templist.size()-1);
                
            }
        }
    }
}