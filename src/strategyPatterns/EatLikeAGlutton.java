package strategyPatterns;

public class EatLikeAGlutton implements EatBehavior{
    @Override
    public String eat() {
//        System.out.println("i eat like a glutton");
        return "i eat like a glutton";
    }
}
