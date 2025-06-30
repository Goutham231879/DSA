



   
 import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n =sc.nextInt();
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }

        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(2).add(1);
        graph.get(2).add(4);
        graph.get(3).add(1);
        graph.get(3).add(5);
        graph.get(4).add(2);
        graph.get(5).add(3);

        boolean[] vis = new boolean[n+1];
        bfs(graph , vis , 4 , n);



        
    }

    public static void bfs(Map<Integer , ArrayList<Integer>> gp ,boolean[] vis , int s , int n){

      if(gp == null) return;
      if(s<1 || s>n) return;
      Queue<Integer> q = new LinkedList<>();
      q.add(s);
      vis[s]=true;

      while(!q.isEmpty()){
        int temp = q.poll();
        System.out.println(temp+" ");

        for(int x:gp.get(temp)){
          if(!vis[x]){
             vis[temp] =true;
            q.add(x);
          }
        }
      }

    }
}

