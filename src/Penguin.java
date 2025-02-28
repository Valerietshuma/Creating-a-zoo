public class Penguin  extends Animal implements Walk, Swim{

    boolean isSwimming;
    int walkSpeed;
    int swimSpeed;

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }
    /** TODO 9(b) Solution End **/

    /** TODO 9(c) Solution: Ensure that when the default constructor of the Penguin is called,
     *                      the name of the animal Penguin is passed to the constructor of the
     *                      parent class Animal.
     **/
    public Penguin() {
        super("Penguin");
    }


    @Override
    public void eatingFood() {
        System.out.println("Penguin: I am eating delicious fish.");
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void eatingCompleted() {
        System.out.println("Penguin: I have eaten fish.");
    }
    /** TODO 9(d) Solution End **/


    @Override
    public void swim() {

    }

    /** TODO 9(e) Solution: Implement both the Walk and the Swim interfaces **/


    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed " + swimSpeed + " nautical miles per hour");
    }

    @Override
    public void walk() {

    }

    @Override
    public void walking() {
        System.out.println("Penguin: I am walking at the speed " + walkSpeed + " mph");
    }
    /** TODO 9(e) Solution End **/

}
