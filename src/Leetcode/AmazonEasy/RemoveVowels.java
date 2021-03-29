package Leetcode.AmazonEasy;

public class RemoveVowels {
    public static String removeVowels(String S) {
        return S.replaceAll("[a,A,E,I,O,U,e,i,o,u]","");

    }

    public static void main (String[] args){
        System.out.println(removeVowels("AbHijeEt"));
    }


}
