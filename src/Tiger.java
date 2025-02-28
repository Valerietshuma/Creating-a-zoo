public class Tiger extends Animal implements Walk{

    // property for stripes on tiger
    int numberOfStripes;

    // property for speed of tiger during walking or running
    int speed;

    // property for sound level when tiger roars
    int soundLevel;


    public Tiger(){
        super("Tiger");
    }

    @Override
    public void makeSound() {

    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
    }

    /** TODO 3 Solution :implement the unimplemented methods of
     *                   "Eat" interface in the class
     *                   "Tiger" class created in the TODO 1
     *                   and also in the
     *                  "Dolphin" class created in TODO 2.
     */
    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat.");
    }
    /** TODO 3 Solution End **/


    @Override
    public void walk() {

    }

    /** TODO 5 Solution implementing the methods**/
    @Override
    public void walking() {
        System.out.println("Tiger: I am moving at the speed " + speed);
    }
    /** TODO 5 Solution End **/
}
