class SingletonEarly
{
    public static SingletonEarly singletoninstance = new SingletonEarly();

    private SingletonEarly(){}

    public static SingletonEarly getInstance()
    {
       return singletoninstance;
    }

    public void getOutput()
    {
        System.out.println("Singleton Early Initialization");
    }
}

class SingletonEarlyDemo
{
    public static void main(String args[])
    {
        SingletonEarly instance = SingletonEarly.getInstance();
        instance.getOutput();
    }
}