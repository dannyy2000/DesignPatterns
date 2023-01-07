package strategyPatterns;

public class WalkFast implements WalkBehavior{
    @Override
    public String walk() {
//        System.out.println("I love to walk fast");
        return "I love to walk fast";
    }
}
