class Solution {
    public int countSegments(String s) {
        String[] res = ("x "+s).split("\\s+");
        return res.length-1;
    }
}
