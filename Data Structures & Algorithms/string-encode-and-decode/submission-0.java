class Solution {
    public String encode(List<String> strs) {
        String result = "";
        for (String str : strs) {
            result += str.length() + "#" + str;
        }
        return result;
    }

    public List<String> decode(String str) {
        int startIndex = 0;
        String result = "";
        List<String> results = new ArrayList<>();

        while (startIndex < str.length()) {
            int separatorIndex = str.indexOf("#", startIndex);
            int subStringLength = Integer.parseInt(str.substring(startIndex, separatorIndex));
            int endIndex = separatorIndex + subStringLength + 1;
            startIndex = separatorIndex + 1;
            result = str.substring(startIndex, endIndex);
            results.add(result);

            startIndex = endIndex;
        }

        return results;
    }
}
