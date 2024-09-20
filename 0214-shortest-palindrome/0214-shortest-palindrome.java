class Solution {
    public String shortestPalindrome(String s) {
        int count=kmp(new StringBuilder(s).reverse().toString(),s);
        return new StringBuilder(s.substring(count)).reverse().toString() + s;
    }
    public int kmp(String reversedString,String original){
        String modified=reversedString+"#"+original;
        int len=modified.length();
        int i=1,k=0;
        int[] lps=new int[len];
        while(i<len){
            if(modified.charAt(i)==modified.charAt(k)){
                k++;
                lps[i]=k;
                i++;

            }else{
                if(k>0){
                    k=lps[k-1];
                }else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps[len-1];
    }
}