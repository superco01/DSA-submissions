class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            var chars = strs[i].toCharArray();
            Arrays.sort(chars);
            var key = new String(chars);
            var list = map.getOrDefault(key, new ArrayList<String>());
            list.add(strs[i]);
            map.put(key, list);
        }

        return new ArrayList(map.values());
    }
}
