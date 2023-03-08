package br.com.madeira.services;

public class Service {


    public  void ticoTeco(){
        for(int c=1 ; c <= 100; c++){
            if(c % 3 == 0 && c % 5 == 0){
                System.out.println ("TicoTeco");
            } else if(c % 3 == 0){
                System.out.println("Tico");
            }else if(c % 5 == 0){
                System.out.println("Teco");
            } else System.out.println(c);
        }
    }



    public boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int i = 0, j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }
}
