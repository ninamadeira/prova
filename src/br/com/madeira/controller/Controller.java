package br.com.madeira.controller;

import br.com.madeira.services.Service;

public class Controller {
    public static void main(String[] args){
        Service service = new Service();
        service.ticoTeco();
        if (service.isPalindrome("Deleveled"))
            System.out.print("Sim, é uma palindrome");
    }

}
