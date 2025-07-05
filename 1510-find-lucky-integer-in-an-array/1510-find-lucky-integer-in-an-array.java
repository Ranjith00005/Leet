class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int lucky=-1;
        for (int key : map.keySet()) {
            if (map.get(key) == key) {
                lucky = key; 
            }
        }
        return lucky;  
    }
}