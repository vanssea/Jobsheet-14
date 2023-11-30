import java.util.Scanner;
public class Tugas1_28 {
    static void deretRekursif(int n){
        if(n >= 0){
            System.out.print(n + " ");
            deretRekursif(n - 1);
        }
    }
    
    static void deretIteratif(int n){
        for(int i = n; i >= 0; i--){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan awal deret : ");
        int n = sc.nextInt();

        System.out.println("Deret Descending Rekursif: ");
        deretRekursif(n);
        System.out.println();
        System.out.println("Deret Descending Iteratif: ");
        deretIteratif(n);
        
        sc.close();
    }
}
