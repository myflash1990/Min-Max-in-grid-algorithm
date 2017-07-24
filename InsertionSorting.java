public class InsertionSorting {
    public static int[] one;

    public static void matrix(int m[][]){
        //https://stackoverflow.com/questions/28305359/how-to-convert-2d-array-into-1d
        int newArray [] = new int[m.length*m[0].length];

         int min = m[0][0];
         int key = 0;
         int minrow = 0;

        for (int row = 0; row< m.length;row++) {

            for (int col = 0; col < m[row].length; col++) {

                key = m[row][col];


                //   System.out.println(key);

                if (key < min) {

                    min = key;
                    minrow = row;

                }
                int k = 0;
                int max = m[0][minrow];

                while(k<minrow){

                    if (minrow>key){

                        max = key;
                        k++;
                    }
                }

                System.out.println(max);
            }
        }
//54 is the expected result

        System.out.println(min);


    }


    public static int[] sort(int list[]){

        int i,j,key;

        for (i=1; i<list.length;i++){

            key = list[i];


            j = i - 1;

            while(j>=0&&key<list[j]){


                list[j+1]=list[j];
                list[j] = list[j + 1];
                j--;
            }

            list[j+1]=key;

        }



        return list;
    }


    public static void print(int list[]){


        for (int i = 0; i < list.length; i++){


            System.out.println(list[i]);

        }

    }

    public static void main(String[] args) {

//        int [] list = {8,23,43,54,12,4,9,16,43,23,78};
//
//        print(sort(list));

        int mat[][] = {  {122,13,14,0}
                        ,{90,-2,43,90},
                         {43,54,76,45}

    };
        matrix(mat);
        print(sort(one));


    }
}
