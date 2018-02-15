package Exc_2;

public class Run
{
    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        list.add(3);
        list.add(7);
        list.add(12);
        list.add(0);
        list.set(0,9);
        System.out.println(list);
        System.out.println(list.min());
    }
}
