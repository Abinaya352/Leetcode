class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        int i, j;
        HashMap<String, Integer> map1 = new HashMap<>();
        // ArrayList<String>list=new ArrayList<>();
        for (String s : words1) {
            map1.put(s, map1.getOrDefault(s, 0) + 1);

        }
        for (String t : words2) {
            if (!map1.containsKey(t)) {
                map1.put(t, map1.getOrDefault(t, 0) + 1);
            } else {
                int tem = map1.getOrDefault(t, 0);
                if (tem == 1) {
                    map1.put(t, -1);
                } else if(tem==0) {
                    map1.put(t, tem + 1);
                }
            }
        }
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }

        return result.toArray(new String[0]);
    }
}