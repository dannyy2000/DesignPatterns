package strategyPatterns;

public class EatResponsibly implements EatBehavior{
    @Override
    public String eat() {
//        System.out.println("Eating responsibly is good for me");
        return "Eating responsibly is good for me";
    }
}
