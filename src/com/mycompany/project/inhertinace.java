package com.mycompany.project;

class animal{

    String name;
    void eat(){
        System.out.println(name + " is eating");
    }

     void bark() {
        System.out.println(name + " is barking");

    }
}nnn

class dog extends animal{
}

 class inhertinace{
     public static void main (String[] args){
        dog mydog= new dog();

        mydog.name="doggy";

        mydog.bark();

        mydog.eat();

    }

}
