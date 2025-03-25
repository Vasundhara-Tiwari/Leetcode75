package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls {
    class RecentCounter {

        Queue<Integer> request;

        public RecentCounter() {
            this.request = new LinkedList<>();
        }

        public int ping(int t) {
            request.add(t);
            while (request.peek() < t-3000){
                request.poll();
            }
            return request.size();
        }
    }
}
