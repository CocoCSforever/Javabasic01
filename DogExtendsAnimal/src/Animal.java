/*  Superclass representing an Animal
    To be extended by specific types of animals
    @author Yijia Ma
 */
public class Animal {
    //greeting method that would be inherited by the subclass
    //of the animal class
    public void greeting(){
        System.out.println("I am an animal");
    }
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.greeting();
    }
}
