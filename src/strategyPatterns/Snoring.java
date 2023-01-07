package strategyPatterns;

public class Snoring implements SleepBehaviour{
    @Override
    public String sleep() {
//        System.out.println("Snoring is fun");
        return "Snoring is fun";
    }
}
