/*  Represents a Dog
    @author Yijia Ma
 */
public class Dog extends Animal{
    @Override
    public void greeting() {
        super.greeting();
        //call the overridden greeting method in superclass Animal
        //super can be second or anywhere because it is a call to the constructor in the superclass
        System.out.println("I am a dog.");
    }
}
