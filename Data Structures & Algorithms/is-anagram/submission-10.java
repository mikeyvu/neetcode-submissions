class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapS = new HashMap<Character, Integer>();
        HashMap<Character, Integer> mapT = new HashMap<Character, Integer>();

        for (char c: s.toCharArray()) {
            mapS.put(c, mapS.getOrDefault(c, 0) + 1);
        }

        for (char c: t.toCharArray()) {
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : mapS.entrySet()) {
            char key = entry.getKey();
            if (!mapS.get(key).equals(mapT.get(key))) {
                System.out.println("S key: " + key);
                System.out.println("S value: " + mapS.get(key));
                System.out.println("T value: " + mapT.get(key));
                System.out.println("Different key value error");
                return false;
            }

            if (!mapT.containsKey(key)) {
                System.out.println("No key contains error");
                return false;
            }
        }

        if (mapS.size() != mapT.size()) {
            System.out.println("Different size error");
            return false;
        }

        return true;
    }
}
