class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        char c = 'a';
        HashMap<List<Integer>, List<String>> map = new HashMap<>();

        for (String str: strs) {
            List<Integer> frequencyCount = new ArrayList<Integer>(Collections.nCopies(26, 0));
            for (char a: str.toCharArray()) {
                int indexChar = a - c;
                frequencyCount.set(indexChar, frequencyCount.get(indexChar) + 1);
            }
            List<String> anagramGroup = map.get(frequencyCount);
            if (anagramGroup == null) {
                anagramGroup = new ArrayList<String>();
                anagramGroup.add(str);
            } else { 
                anagramGroup.add(str);
            }
            map.put(frequencyCount, anagramGroup);
        }

        List<List<String>> result = new ArrayList<>();
        for (Map.Entry<List<Integer>, List<String>> entry: map.entrySet()) {
            List<String> subAnagram = entry.getValue();
            result.add(subAnagram);
        }

        return result;
    }
}
