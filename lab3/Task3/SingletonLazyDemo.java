class SingletonLazy
{
    public static SingletonLazy singletoninstance = null;

    private SingletonLazy(){}

    public static SingletonLazy getInstance()
    {
        if(singletoninstance == null)
        {
            singletoninstance = new SingletonLazy();
        }
        return singletoninstance;
    }

    public void getOutput()
    {
        System.out.println("Singleton Lazy Initialization");
    }
}

class SingletonLazyDemo
{
    public static void main(String args[])
    {
        SingletonLazy singleton = SingletonLazy.getInstance();
        singleton.getOutput();
    }
}