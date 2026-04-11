class TimeMap {
    private HashMap<String ,String> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.put(key,value);
    }
    
    public String get(String key, int timestamp) {
        return map.get(key);
    }
}
