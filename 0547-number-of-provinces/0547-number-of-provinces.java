class Solution {
    void dfs(int curr, boolean []visited, int [][]isConnected){

        int []arr = isConnected[curr];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 1 && !visited[i]){
                visited[i] = true;
                dfs(i, visited, isConnected);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        boolean []visited = new boolean[isConnected.length];
        
        for(int i = 0; i<isConnected.length; i++){
            if(!visited[i]){
                dfs(i, visited, isConnected);
                count++;
            }
        }

        return count;
    }
}