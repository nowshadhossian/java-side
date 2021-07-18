package main.java.priorityqueue;

import java.util.*;

/**
 * https://leetcode.com/problems/top-k-frequent-elements/
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Using PriorityQueue to solve frequent count. CHeck PriorityQueue comparable method, the magic happens
 */
public class TopKFrequestElements {

        public int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap();
            for(int num: nums){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            PriorityQueue<Integer> q = new PriorityQueue<>((a1, a2) -> {
                return map.get(a2) - map.get(a1);
            });

            for(Map.Entry<Integer, Integer> entry: map.entrySet()){
                q.add(entry.getKey());
            }

            List<Integer> list = new ArrayList();
            for(int i=1;i<=k; i++){
                list.add(q.poll());
            }
            return list.stream().mapToInt(a -> a).toArray();
        }

}
