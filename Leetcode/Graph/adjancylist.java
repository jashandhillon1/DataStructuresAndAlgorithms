import java.io.*;
import java.util.*;


class graph{
    public static void main(String[] args){
        int n=3,m=3;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<Integer>();

        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<Integer>());
        }


        //edge 1---2
        adj.get(1).add(2);
        adj.get(2).add(1);


        //edge 2--3
        adj.get(2).add(3);
        adj.get(3).add(2);



        ///To print the list
        for(int i=0;i<=n;i++){
            for(int j=1;j<adj.get(i).size();j++){
                System.out.println(adj.get(i).get(j) + " ")
            }
        }
    }
}