package praktikum2;

public class Nomor02 {
    public static void main(String[] args) {
        
        double[] array1D = {91.5, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6, 7.11, 27, 9.35, 549, 2.23, 17.31, 4.25, 2.13, 83, 7, 102.4, 53.21, 3.42, 0.21, 70.02, 819.4, 6173, 4.25, 19.8, 17.35, 5.768};
        
        double max = array1D[0];
        double min = array1D[0];
        double sum = 0;
        double nilai = 0;
        
        for (int a = 0; a < array1D.length; a++) {
            System.out.print(array1D[a]+", ");
            sum += array1D[a];
            if (array1D[a] > max) {
                max = array1D[a];
            } else if (array1D[a] < min){
                min = array1D[a];
            }
            nilai++;
        }
        
        double average = sum/nilai;
        System.out.println("===========================");
        System.out.println("Nilai maksimum dari array tersebut adalah : "+max);
        System.out.println("Nilai maksimum dari array tersebut adalah : "+min);
        System.out.println("Nilai maksimum dari array tersebut adalah : "+sum);
        System.out.println("Nilai maksimum dari array tersebut adalah : "+average);
    }
}
