import java.util.PriorityQueue;

public class Last_Stone_Weight_1046 {
    public static void main(String args[]){
        int []stones = {2,7,4,1,8,1};

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int stone : stones) {
            pq.offer(stone);
        }

        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();

            if (first != second) {
                pq.offer(first - second);
            }
        }

        System.out.println(pq.isEmpty() ? 0 : pq.poll());
    }
}
