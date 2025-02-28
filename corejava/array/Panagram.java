package corejava.array;

import java.util.Arrays;

//Problem Statement: check if the sentence is pangram.
public class Panagram {
    private static boolean pangram(String av){
        char[] a=av.toCharArray();
        char ch='a';
        boolean[] fo=new boolean[26];
        char[] az=new char[26];
        int i=0;
        while (ch<='z') {
            az[i]=ch;
            i++;
            ch++;
        }
        for (int j = 0; j < a.length; j++) {
            for (int k = 0; k < az.length; k++) {
                if (a[j]==az[k]){
                    fo[j]=true;
                    k=az.length;
                }
            }
        }
        for (Boolean b:fo){
            if (!b){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a="qwertyuiopasdfghjklzxcvbnm";
        System.out.println(pangram(a));
    }
}
