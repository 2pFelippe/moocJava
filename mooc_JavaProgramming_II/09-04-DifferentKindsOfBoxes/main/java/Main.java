
public class Main {

    public static void main(String[] args) {
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 5));
        coffeeBox.add(new Item("Pirkka", 5));
        coffeeBox.add(new Item("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInBox(new Item("Saludo"))); //true
        System.out.println(coffeeBox.isInBox(new Item("Pirkka"))); //true
        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak"))); //false

        OneItemBox obox = new OneItemBox();
        obox.add(new Item("Saludo", 5));
        obox.add(new Item("Pirkka", 5));

        System.out.println(obox.isInBox(new Item("Saludo"))); //true
        System.out.println(obox.isInBox(new Item("Pirkka"))); //false

        MisplacingBox mbox = new MisplacingBox();
        mbox.add(new Item("Saludo", 5));
        mbox.add(new Item("Pirkka", 5));

        System.out.println(mbox.isInBox(new Item("Saludo"))); //false
        System.out.println(mbox.isInBox(new Item("Pirkka"))); //false
    }
}
