package praktikum2;
public class Nomor01 {
    public static void main(String[] args) {
        
        double[][] array2D = {
            {91.5, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6, 7.11},
            {27, 9.35, 549, 2.23, 17.31, 4.25, 2.13, 83, 7, 102.4},
            {53.21, 3.42, 0.21, 70.02, 819.4, 6173, 4.25, 19.8, 17.35, 5.768}
        };
        
        double max = array2D[0][0];
        double min = array2D[0][0];
        double sum = 0;
        double nilai = 0;
        
        for (int a = 0; a < array2D.length; a++) {
            System.out.print("[");
            for (int b = 0; b < array2D[a].length; b++) {
                if (b > 0){
                    System.out.print(", ");
                }
                System.out.print(array2D[a][b]);
                sum += array2D[a][b];
                if (array2D[a][b] > max) {
                    max = array2D[a][b];
                } else if (array2D[a][b] < min){
                    min = array2D[a][b];
                }
                nilai++;
            }
            System.out.println("]");
        }
        
        double average = sum/nilai;
        System.out.println("===========================");
        System.out.println("Nilai max dari array tersebut adalah : "+max);
        System.out.println("Nilai min dari array tersebut adalah : "+min);
        System.out.println("Nilai sum dari array tersebut adalah : "+sum);
        System.out.println("Nilai average dari array tersebut adalah : "+average);
        
    }
    
}
