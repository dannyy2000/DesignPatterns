package strategyPatterns;

public class SleepTalk implements SleepBehaviour{
    @Override
    public String sleep() {
//        System.out.println("i dont know why i sleep talk");
        return "i dont know why i sleep talk";
    }
}
