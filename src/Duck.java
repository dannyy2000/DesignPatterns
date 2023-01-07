public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void performQuack(){
        quackBehaviour.quack();
    }
//    abstract void swim();
    abstract void display();
    public void performFly(){
        flyBehaviour.fly();
    }

}
