package decoratorPattern;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza=new ExtraCheese(new Margherita());
        System.out.println("the cost of pizza is: "+pizza.cost());
        BasePizza pizza1=new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println(pizza1.cost());

    }
}
