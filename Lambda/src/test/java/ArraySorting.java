public class ArraySorting {
    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();
      //  as.sort();
        QuickSort qs = new QuickSort(); // Is the beahiour gaining form quick sort class
        BubleSort bs = new BubleSort();
        as.sort(bs);
        as.sort(qs);

           Sorting noLambda = new QuickSort();
           noLambda.sort();

           Sorting quicksort= ()-> System.out.println("quick sort");
           as.sort(quicksort);

            Sorting bublesort= ()-> System.out.println("buble sort");
            as.sort(bublesort);

            as.sort(()-> System.out.println("buble sort"));

    }
    private void sort( Sorting sorting){
        sorting.sort();
    }


}
