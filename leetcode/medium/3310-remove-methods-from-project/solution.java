class Solution {
    private void dfs(int node,List<List<Integer>> adj,boolean[] sus) {
        if(sus[node]) return;
        sus[node]=true;
        for(int next: adj.get(node))
            dfs(next,adj,sus);
    }
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) {
            adj.add(new ArrayList<>());
        }
        for(int[] e: invocations)
            adj.get(e[0]).add(e[1]);
        boolean[] sus=new boolean[n];
        dfs(k,adj,sus);
        for(int[] e: invocations) {
            int u=e[0],v=e[1];
            if(!sus[u] && sus[v]) {
                List<Integer> ans=new ArrayList<>();
                for(int i=0;i<n;i++)
                    ans.add(i);
                return ans;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++) {
            if(!sus[i]) {
                ans.add(i);
            }
        }
        return ans;
    }
}