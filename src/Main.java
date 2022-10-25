public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Animal a1 = new Animal();
        Amphibian newt = new Amphibian();
        newt.setDiet("Insects, river plants");
        a1.consumeFood();
        newt.consumeFood();

        Bird kite = new Bird();
        Fish trout = new Fish();
        Mammal weasel = new Mammal();
        Reptile turtle = new Reptile();

        kite.setDiet("Small mammals");
        trout.setDiet("Aquatic plants, smaller fish");
        weasel.setDiet("Small mammals");
        turtle.setDiet("Aquatic plants");

        Animal[] animalArray = {kite, trout, weasel, turtle, newt};

        for (int i = 0; i < animalArray.length; i++){
            animalArray[i].consumeFood();
        }

        kite.setName("kite");

        newt.isPredator(kite);

        newt.setName("Newt");
        newt.setSciName("Pleurodelinae");
        System.out.println(newt.toString());

    }
}