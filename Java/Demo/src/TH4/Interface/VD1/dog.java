package TH4.Interface.VD1;
interface Animal
{
    void sound();     
    void eat();
}


interface Pet {
    void play();
}

class Dog implements Animal,Pet{
    public void eat()
    {
        System.out.println("Dogs eat bones");
    }

    public void play()
    {
        System.out.println("Dog plays with ball");
    }

    public void sound(){
        System.out.println("Dog barks");
    }
}   