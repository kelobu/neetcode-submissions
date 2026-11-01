class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "";

        StringBuilder result = new StringBuilder();
        List<Integer> sizes = new ArrayList<Integer>();
        for(String s : strs) {
            sizes.add(s.length());
        }
        for(int s : sizes) {
            result.append(s).append(",");
        }
        result.append("#");
        for(String s : strs) {
            result.append(s);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        if(str.isEmpty()) return List.of(); 

        List<Integer> sizes = new ArrayList<Integer>();
        List<String> result = new ArrayList<String>();

        int i = 0;
        while(str.charAt(i) != '#') {
            StringBuilder length = new StringBuilder();
            while(str.charAt(i) != ',') {
                length.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(length.toString()));
            i++;
        }
        
        i++;
        for(int size : sizes) {
            result.add(str.substring(i, i + size));
            i += size;
        }

        return result;   
    }
}
