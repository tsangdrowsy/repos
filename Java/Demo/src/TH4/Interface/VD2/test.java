interface I {
    void methodI();
}

interface J extends I {
    void methodJ();
}

class A implements I,J{
    public void methodI()
    {
        System.out.println("Method from I");
        
    }
    public void methodJ()
    {
        System.out.println("Method from J");
    }
}

class B extends A implements I,J{
    public void methodI()
    {
        System.out.println("B overrides methodI()");
    }
}
