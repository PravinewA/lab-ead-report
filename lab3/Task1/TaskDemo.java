class TaskDemo
{
    public static void main(String args[])
    {
        Task task1 = new Task();
        task1.setName("Pravinewa 1");
        task1.isCompletedTask();
        System.out.println("Name = " + task1.name);
        System.out.println("Task status = " + task1.isCompleted);

        Task task2 = new Task("Pravinewa 2", true);
        System.out.println("Name = " + task2.name);
        System.out.println("Task status = " + task2.isCompleted);

    }
}