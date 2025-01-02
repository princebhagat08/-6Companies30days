class Solution {
    public static int[][] imageSmoother(int[][] img) {
        int r = img.length;
        int c = img[0].length;

        int [][] result = new int[r][c];

        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                int sum = 0;
                int count = 0;

                if(i-1 >= 0){
                    if(j-1 >= 0){
                        sum += img[i-1][j-1];
                        count++;
                    }

                    sum += img[i-1][j];
                    count++;

                    if(j+1< c){
                        sum += img[i-1][j+1];
                        count++;
                    }
                }


                if(j-1 >=0){
                    sum += img[i][j-1];
                    count++;
                }

                sum+= img[i][j];
                count++;

                if(j+1<c){
                    sum += img[i][j+1];
                    count++;
                }

                if(i+1 < r){
                    if(j-1 >= 0){
                        sum += img[i+1][j-1];
                        count++;
                    }

                    sum += img[i+1][j];
                    count++;

                    if(j+1<c){
                        sum += img[i+1][j+1];
                        count++;
                    }
                }

                result[i][j] =(int) Math.floor((double) sum / count);

            }
        } 

        return result;
        
    }


    public static void main(String[] args) {
         int[][] img = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int [][] result = imageSmoother(img);

        for(int i = 0; i<img.length; i++){
            for(int j = 0; j<img[0].length; j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }



    }

}