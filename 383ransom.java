class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap <Character,Integer> map = new HashMap<>();
        for(char ch :magazine.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        boolean result = true;
        for(char ch :ransomNote.toCharArray()){
            if(!map.containsKey(ch)||map.get(ch)==0){
                result = false;
                break;
            }
            map.put(ch,map.get(ch)-1);
        }
        return result;

    }
}
