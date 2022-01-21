import java.util.*;

class Solution {
    public boolean isPalindrome(int x) {
        int[] arr = new int[String.valueOf(x).length()];
        int[] arr2 = new int[String.valueOf(x).length()];


        for(int i=0;i<String.valueOf(x).length();i++) {
            arr[i] = String.valueOf(x).charAt(i) - '0';
        }
        int chk =0;
        for(int i=String.valueOf(x).length();i<=1;i--) {
            arr2[chk] = String.valueOf(x).charAt(i) - '0';
            chk++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        return true;

    }
}