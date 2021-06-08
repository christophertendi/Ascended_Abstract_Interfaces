public class Main
{
    public static void main(String[] args)
    {
        BMW myBMW = new BMW("M8", "Black");
        myBMW.engine();
        myBMW.rev();
        System.out.println(myBMW.model);
        System.out.println(myBMW.color);
    }

}
