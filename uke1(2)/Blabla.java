class Blabla{

    public static void main(String[] args) {
        String str = "alskjdhfkjashf";
        int[] a1 = new int[10];
        int[][] a2 = new int[5][10];
        System.out.println(a2.length);
        for(int i = 0; i< 10; i++){
            a1[i] = i;
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 10; j++){
                a2[i][j] = 10 * i + j + 1;
            }
        }

        for (int i = 9; i > -1; i--) {
            System.out.println(a1[i]);
        }


    }   


}