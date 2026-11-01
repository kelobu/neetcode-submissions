class Solution {

    // public String encode(List<String> strs) {

    //     String result = "";
    //     for(String s : strs) {
    //         for(char c : s.toCharArray()) {
    //             result += " ";
    //             result += String.valueOf(Integer.toHexString(c));
    //         }
    //     }
    //     return result.stripLeading();
    // }

    // public List<String> decode(String str) {
    //     List<String> result = new ArrayList<String>();
    //     String value = "";
    //     for(char c : str.toCharArray()) {
    //         if(c == ' ') {
    //             result.add(value);
    //             value = "";
    //         } else {
    //             value += c;
    //         }
    //     }
    //     result.add(value);
    //     return result;
    // }
    public String encode(List<String> strs) {
        String result = "";
        for(var s : strs) {
            for(char c : s.toCharArray()) {
                result += c;
            }
            result += "ż";
        }
        return result;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<String>();
        String value = "";
        for(var c : str.toCharArray()) {
            if(c == 'ż') {
                result.add(value);
                value = "";
            } else {
                value += c;
            }
        }
        // result.add(value);
        return result;
    }
}
