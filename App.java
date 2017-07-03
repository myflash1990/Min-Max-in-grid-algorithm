/**
 * Created by tahsinsyeed on 5/21/17.
 */
public class App {

    public static void main(String[] args) {

        Plant plant = new Plant();
        Tree tree = new Tree();
        Plant plant1 = tree;

        plant1.say();
        tree.say();
        plant.say();
        tree.shedLeaves();
        //Notice plant1 does not have shedLeaves method


        int arr [] [] ={{1,2,3,4},
                        {11,8,13,-14},
                       {20,30,1,50}};

        int min = arr[0][0];
        int mincol = 0;
        int k = 0;

            for (int row = 0; row < arr.length; row++){

                for (int col = 0; col<arr[row].length;col++){


                    System.out.print(arr[row][col]+"\t");

                    if (arr[row][col]<min){

                       min = arr[row][col];
                       mincol = col;

                    }


                }


                System.out.println();
            }



        int max = arr [0][mincol];

        while (k<arr.length){

            if (arr[k][mincol]>max){

                max = arr[k][mincol] ;
            }

            k++;

        }

        System.out.println("This is the min number "+min);

        System.out.println("Max number in the smallest number col is "+max);

    }
}
