package by.astakhnovich.patterns.generating.prototype;

public class Main {
    public static void main(String[] args) {
        Prototype prototype = new Prototype("1", "2", "3");
        Prototype anotherPrototype = new Prototype(prototype);
        Prototype clonePrototype = null;
        try {
            clonePrototype = (Prototype) prototype.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }


        System.out.println(prototype == anotherPrototype);
        System.out.println(prototype.equals(anotherPrototype));

        System.out.println();

        System.out.println(prototype == clonePrototype);
        System.out.println(prototype.equals(clonePrototype));

        System.out.println();

        System.out.println(prototype.toString());
        System.out.println(anotherPrototype.toString());
        System.out.println(clonePrototype.toString());
    }
}
