class Task
{
    public String name;
    public boolean isCompleted;

    Task(){};

    Task(this.name, this.isCompleted);

    public void setName(String name)
    {
        this.name = name;
    }

    public void isCompletedTask()
    {
        this.isCompleted = true;
    }

}