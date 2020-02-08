abstract class shape
{
    abstract void drawShape(); 

    public void shapePlusPlus()
    {
        System.out.println("Ploygon");
    }

}

class AbstractShape extends shape {
    void drawShape() {
        System.out.println("Square,Circle,Rectangle");
    }
}