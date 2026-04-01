class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        for (int n : nums){
            ht.put(n, ht.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : ht.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int r = 0;

        for (int i = freq.length - 1; i > 0; i--){
            for (int n : freq[i]){
                res[r] = n;
                r++;
                if ( r == k){
                    return res;
                }
            }
        }

        return res;

    }
}
