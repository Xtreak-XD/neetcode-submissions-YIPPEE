class TimeMap {
    Map<String, List<String[]>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)){
            map.put(key, new ArrayList<>());
        }

        map.get(key).add(new String[]{value, Integer.toString(timestamp)});
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)){
            return "";
        }

        List<String[]> list = map.get(key);
        int low = 0;
        int high = list.size() - 1;

        while (high >= low){
            int mid = low + (high - low) / 2;
            String[] val = list.get(mid);
            int midTimestamp = Integer.parseInt(val[1]);

            if (midTimestamp == timestamp) return val[0];
            else if (midTimestamp > timestamp) high = mid - 1;
            else low = mid + 1;
        }

        if (high >= 0) {
            return list.get(high)[0];
        }

        return "";
    }
}