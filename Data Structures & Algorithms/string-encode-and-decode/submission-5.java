class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder("");
        for(String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<String>();
        int index = 0;
        while(index < str.length()) {
            int idxDel = str.indexOf('#', index);
            int length = Integer.parseInt(str.substring(index, idxDel));
            result.add(str.substring(idxDel + 1, idxDel + 1 + length));
            index = idxDel + 1 + length;
        }
        return result;
    }
}
