class RHD extends Duck implements Flyable,Quackable{
    public void swim(){
        super.swim();
    }
    public void quark(){
        System.out.println("RHD quacks");
    }
    public void fly(){
        System.out.println("RHD can fly");
    }
} 