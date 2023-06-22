//class solution{
//    public ArrayList<Integer> bfs(int v, ArrayList<ArrayList<Integer>> adj){
//        ArrayList bfs<Integer> =new ArrayList<Integer>();
//        boolean vis[]=new boolean[v-1];
//
//        for(int i=0;i<=v;i++){
//            if(vis[i]==false){
//                Queue<Integer> queue=new LinkedList<>();
//
//                queue.add(i);
//                vis[i]=true;
//                while(!queue.isEmpty()){
//                    Integer node=queue.poll();
//                    bfs.add(node);
//
//
//                    for(int it:adj.get(node)){
//                        if(vis[it]==false){
//                            vis[it]==true;
//                            queue.add(it);
//                        }
//                    }
//                }
//            }
//        }
//
//        return bfs;
//    }
//}