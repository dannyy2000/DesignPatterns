package strategyPatterns;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        WalkBehavior walkBehavior = new WalkFast();
        SleepBehaviour sleepBehaviour = new SleepTalk();
        EatBehavior eatBehavior = new EatLikeAGlutton();
        WalkBehavior walkBehavior1 = new WalkLikeAChicken();
//        EatBehavior eatBehavior1 = new EatResponsibly();
        Human boy = new Human(walkBehavior1 , sleepBehaviour, eatBehavior);
        System.out.println(boy.eating(eatBehavior));
        System.out.println(boy.sleeping(sleepBehaviour));
        System.out.println(boy.walking(walkBehavior1));
//        System.out.println(boy);


    }
}
