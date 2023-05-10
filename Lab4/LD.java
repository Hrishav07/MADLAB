class LD extends Duck implements Flyable,Quackable{
    public void swim(){
        super.swim();
    }
    public void quark(){
       System.out.println("LD quacks"); 
    }
    public void fly(){
        System.out.println("LD can fly");

    }
    
}