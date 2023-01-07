package strategyPatterns;

public class WalkSlowly implements WalkBehavior{
    @Override
    public String walk() {
//        System.out.println("I love to walk slowly");
        return "I love to walk slowly";
    }
}
