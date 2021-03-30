package TugasMatriks;
public class SoalN02 {
    public static void main (String[] args){
    int[][] A = {
        {6, 5},
        {3, 4},
        {5, 2}
    };
    
    int[][] B = {
        {5, 2},
        {1, 3},
        {2, 1}
            
    };
 
            if((A.length == B.length) && (A[0].length == B[0].length)){
        int[][] C = new int[A.length][A[0].length];
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                C[i][j] = A[i][j] - B[i][j];
            }
        }
        for(int[] c: C){
            for(int q: c){
                System.out.print(q+" ");
            }
            System.out.println();
        }
          System.out.println();
        System.out.println("Ayikwati Muhfiyati");
      }
      else {
        System.out.println("Ukuran matriks tidak sama");
    }
  }
}