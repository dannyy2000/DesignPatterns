package strategyPatterns;

public class Human {
    private WalkBehavior walkBehavior;
    private SleepBehaviour sleepBehaviour;
    private EatBehavior eatBehavior;

    public Human(WalkBehavior walkBehavior, SleepBehaviour sleepBehaviour, EatBehavior eatBehavior) {
        this.walkBehavior = walkBehavior;
        this.sleepBehaviour = sleepBehaviour;
        this.eatBehavior = eatBehavior;
    }



    public String walking(WalkBehavior walkBehavior){
       return walkBehavior.walk();
    }

    public String eating(EatBehavior eatBehavior){
        return eatBehavior.eat();
    }

    public String sleeping(SleepBehaviour sleepBehaviour){
      return sleepBehaviour.sleep();
    }





    //    @Override
//    public String toString() {
//        return "Human{" +
//                "walkBehavior=" + walkBehavior.walk() +
//                ", sleepBehaviour=" + sleepBehaviour.sleep() +
//                ", eatBehavior=" + eatBehavior.eat() +
//                '}';
//    }
}
