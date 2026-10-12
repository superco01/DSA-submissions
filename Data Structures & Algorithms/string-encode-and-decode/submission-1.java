class Solution {
    char delimiter = '\u2603';
    public String encode(List<String> strs) {
        var sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str);
            sb.append(delimiter);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        var sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch == delimiter) {
                result.add(sb.toString());
                sb = new StringBuilder();
            } else {
                sb.append(ch);
            }
        }

        return result;
    }
}
