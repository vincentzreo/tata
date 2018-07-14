package com.zzq;

public class Burrito {
    public enum Spiciness{
        NOT,MILD,MEDIUM,HOT,FLAMING
    }
    Spiciness degree;
    public Burrito(Spiciness degree){this.degree = degree;}
    public void describe(){
        System.out.print("This burrito is ");
        switch (degree){
            case NOT:
                System.out.println("not spicy at all");
                break;
            case MILD:
            case MEDIUM:
                System.out.println("a little hot");
                break;

            case FLAMING:
            default:
                System.out.println("maybe to hot");

        }
    }

    public static void main(String[] args) {
        Burrito
                plain = new Burrito(Spiciness.NOT),
                greenChile = new Burrito(Spiciness.HOT),
                jalapeno = new Burrito(Spiciness.HOT);
        plain.describe();
        greenChile.describe();
        jalapeno.describe();
    }
}
