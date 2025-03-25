package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rIndex = new LinkedList<>();
        Queue<Integer> dIndex = new LinkedList<>();

        int n = senate.length();

        if(n == 1){
            return senate.charAt(0) == 'R' ? "Radiant" : "Dire";
        }

        for(int i = 0; i < senate.length(); i++){
            if(senate.charAt(i) == 'R'){
                rIndex.add(i);
            } else {
                dIndex.add(i);
            }
        }

        while(!rIndex.isEmpty() && !dIndex.isEmpty()){
            int rIndexPolled = rIndex.poll();
            int dIndexPolled = dIndex.poll();

            if(rIndexPolled < dIndexPolled){
                rIndex.add(rIndexPolled + n);
            } else {
                dIndex.add(dIndexPolled + n);
            }
        }
        return rIndex.isEmpty() ? "Dire" : "Radiant";
    }
}
