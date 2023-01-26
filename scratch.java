
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Scratch {



    public static void main(String[] args) {

        int[] aw = {1,34,5,6};
        int[] aww = {1,34,5,6};

        System.out.println(aw);
        System.out.println(aww);

        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        System.out.println(matrix);
       // System.out.println(Arrays.stream(arr).max().getAsInt());
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(2);
        arr.add(4);
        arr.add(7);
        System.out.println(arr);
        if(arr.contains(7)){
            System.out.println("Contains");
        }

       int[] new_arr = arr.stream().mapToInt(i->i).toArray();

        System.out.println(new_arr);

        int[] arr2 = {2,4,56,6};

        List<Integer> arr4 = Arrays.stream(arr2).boxed().toList();


        ArrayList<Integer> list = IntStream.of(arr2)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(list);

        String str = "asasasasa";

        str.replaceAll("s","q");

        System.out.println(str);

         StringBuilder ans = new StringBuilder();

    }
}
