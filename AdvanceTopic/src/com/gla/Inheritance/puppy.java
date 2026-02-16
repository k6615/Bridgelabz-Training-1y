package com.gla.Inheritance;

public class puppy {
    public void look(){
        System.out.println("good");
    }
    public static void main(String[] args){
        puppy a = new puppy();
        System.out.println("Animal");
        a.walk();
        System.out.println("dog");
        a.sound();
        System.out.println("puppy");
        a.look();
    }
}
