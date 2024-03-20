package praktikum2;
import java.util.Vector;
public class Nomor03 {
    public static void main(String[] args) {
        Vector<Double> nilai = new Vector<>();
        nilai.add(91.5);
        nilai.add(4.72);
        nilai.add(26.0);
        nilai.add(3.5);
        nilai.add(8.0);
        nilai.add(61.0);
        nilai.add(65.36);
        nilai.add(12.0);
        nilai.add(5.6);
        nilai.add(7.11);
        nilai.add(27.0);
        nilai.add(9.35);
        nilai.add(549.0);
        nilai.add(2.23);
        nilai.add(17.31);
        nilai.add(4.25);
        nilai.add(2.13);
        nilai.add(83.0);
        nilai.add(7.0);
        nilai.add(102.4);
        nilai.add(53.21);
        nilai.add(3.42);
        nilai.add(0.21);
        nilai.add(70.02);
        nilai.add(819.4);
        nilai.add(6173.0);
        nilai.add(4.25);
        nilai.add(19.8);
        nilai.add(17.35);
        nilai.add(5.768);
        
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0;
        double average;
        
        for (int a = 0; a < nilai.size(); a++) {
            if (nilai.get(a) < min) {
                min = nilai.get(a);
            }
            if (nilai.get(a) > max) {
                max = nilai.get(a);
            }
            sum += nilai.get(a);
        }
        
        average = sum / nilai.size();
        System.out.println("===========================");
        System.out.println("Nilai : "+nilai);
        System.out.println("Nilai minimum dari Vector tersebut adalah : "+min);
        System.out.println("Nilai maximum dari Vector tersebut adalah : "+max);
        System.out.println("Nilai sum dari Vector tersebut adalah : "+sum);
        System.out.println("Nilai average dari Vector tersebut adalah : "+average);
    }
}
