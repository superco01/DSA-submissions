class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            var chars = strs[i].toCharArray();
            Arrays.sort(chars);
            var key = new String(chars);
            // if (map.get(key) != null) {
                var list = map.getOrDefault(key, new ArrayList<String>());
                list.add(strs[i]);
                map.put(key, list);
                // System.out.println(key);
                // System.out.println(map);
            // }
            // map.put(key, value);
        }

        return new ArrayList(map.values());
    }
}
