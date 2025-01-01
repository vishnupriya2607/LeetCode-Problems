class Solution {
    public int repeatedStringMatch(String a, String b) {
        int c = 1; 
        StringBuilder rA = new StringBuilder(a);
        while (rA.length() < b.length()) {
            rA.append(a);
            c++;
        }
        if (rA.indexOf(b) != -1) {
            return c;
        }
        rA.append(a);
        c++;
        if (rA.indexOf(b) != -1) {
            return c;
        }
        return -1;
    }
}
