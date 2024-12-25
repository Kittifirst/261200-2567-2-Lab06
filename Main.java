public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal(); -- error
        Cow cow = new Cow();
        Duck donald = new Duck("โดนัลด์");
        Duck daisy = new Duck("เดซี่");
        Pig pig = new Pig();
        Owl owl = new Owl();
        PekingDuck fourseasons = new PekingDuck("4ss");
        cow.sound();
        donald.sound();
        pig.sound();
        owl.sound();
        System.out.println();

        donald.clean(daisy);
        donald.fly();
        donald.glide();
        System.out.println();

        fourseasons.clean(daisy);
        fourseasons.fly();;
        fourseasons.beCrispy();
    }
}