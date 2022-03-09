public class Main
{

    public static void main(String[] args)
    {

        int [] array = {1,4, 6, 9, 7};
        for (int j : array) {
            System.out.print(j);
        }
        QuickSort.swap(array, 0,4);
        System.out.println();
        for (int j : array) {
            System.out.print(j);
        }

    }





}
