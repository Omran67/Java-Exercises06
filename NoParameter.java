package de.habelitz.uebung06;

public class NoParameter {
    public static void main(String[] args) {
       // lambda expression with return type 
      NoParameterInterface message = () -> {
      		return "Hello World with No Parameter";
      	};
          System.out.println( message.helloWorld( ));
    }
  }
  @FunctionalInterface
  interface NoParameterInterface {
    //Here is a method with no parameter and return type as String
      public String helloWorld();
  }