public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        cat.makeSound();
        dog.makeSound();

        cat.eat("dogfood");
        dog.eat("fish");
        cat.showMood(true);
        dog.showMood(false);
    }
}
