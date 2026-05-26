class Solution {
    public boolean isValid(String s) {
        Stack<Character> paren = new Stack<>();

        for (char c: s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                paren.push(c);
            } else {
                if (paren.isEmpty()) return false;
                if (c == ')' && paren.peek() != '('
                    || c == ']' && paren.peek() != '['
                    || c == '}' && paren.peek() != '{') {
                    return false;
                } else {
                    paren.pop();
                }
            }
        }

        return paren.isEmpty();
    }
}
