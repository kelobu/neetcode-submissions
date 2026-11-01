class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) {
            return "";
        }

        var sizes = new ArrayList<Integer>();
        for(var str : strs) {
            sizes.add(str.length());
        }

        StringBuilder result = new StringBuilder();
        for(var size : sizes) {
            result.append(size).append(",");
        }
        result.append("#");

        for(var str : strs) {
            result.append(str);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        if(str.length() == 0) {
            return new ArrayList<String>();
        }
        List<Integer> sizes = new ArrayList<Integer>();
        int index = 0;
        while(str.charAt(index) != '#') {
            StringBuilder size = new StringBuilder();
            while(str.charAt(index) != ',') {
                size.append(str.charAt(index));
                index++;
            }
            sizes.add(Integer.parseInt(size.toString()));
            index++;
        }
        index++;

        List<String> result = new ArrayList<String>();
        for(int size : sizes) {
            result.add(str.substring(index, index + size));
            index += size;
        }
        return result;
    }
}
