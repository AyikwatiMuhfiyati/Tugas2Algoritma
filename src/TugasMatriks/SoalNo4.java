package TugasMatriks;
public class SoalNo4 {
    public static void main (String[] args){
        int [][] matriks = {{2, 1, -5},{3, 4, 2}};
        int i,j,k;
        System.out.println("Matriks sebelum Transpose");
        for (i=0; i<2; i++){
            for (j=0; j<2; j++){
                for (k=0; k<2; k++){
                System.out.print(matriks [i][j] +"\t");
            }
            System.out.println();
        }
        System.out.println("\nMatriks setelah Transpose");
        for (i=0; i<2; i++){
            for (j=0; j<2; j++){
                for (k=0; k<2; k++){
            }
                System.out.print(matriks [j][i] +"\t");
            }
            System.out.println();
        }
         System.out.println();
        System.out.println("Ayikwati Muhfiyati");
       }
    }
}
