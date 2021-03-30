package TugasMatriks;
public class SoalNo3 {
    public static void main (String[] args){
    int[][] A = {
        {2, 6, 4},
        {3, 7, 5}
    };
    int[][]B = {
        {2, 4},
        {1, 5},
        {4, 6}
    };
    
    if (A[0].length == B.length){
        
        int[][] C = new int[A.length] [B[0].length];
        for(int i=0; i<A.length; i++) {
            for(int j=0; j<B[0].length; j++) {
                for(int k=0; k<A[0].length; k++){
                    C[i][j] += A[i][j] * B[k][j];
                
                }
            }
        }
        for (int[] c: C){
            for(int i: c){
                System.out.print(i+" ");
            }
            System.out.println();
        }
          System.out.println();
        System.out.println("Ayikwati Muhfiyati");
    }
    else {
        System.out.println("Ukuran kolom A tidak sama dengan baris B");

    }
  }
}
