class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean []visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0] = true;

        while(q.size()>0){
            int node = q.poll();
            
            List<Integer> list = rooms.get(node);
            for(int i = 0; i<list.size(); i++){
                if(!visited[list.get(i)]){
                    visited[list.get(i)] = true;
                    q.add(list.get(i));
                }
            }
        }

        for(int i = 0; i<n; i++){
            if(!visited[i]){
                return(false);
            }
        }

        return(true);
    }
}