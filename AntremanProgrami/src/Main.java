import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("idman programina hosgeldiniz");

        String hareketler = "1.burpee\n"
                        +"2.pushup\n"
                        +"3.situp\n"
                        +"4.squat\n";

        System.out.println(hareketler);

        System.out.println("bir idman olusturun");

        System.out.println("burpee sayisi");
        int burpee = scanner.nextInt();
        System.out.println("pushup sayisi");
        int pushup = scanner.nextInt();
        System.out.println("situp sayisi");
        int situp = scanner.nextInt();
        System.out.println("squat sayisi");
        int squat = scanner.nextInt();
        scanner.nextLine();

        idman idman = new idman(burpee,pushup,situp,squat);

        System.out.println("idmaniniz basliyor");

        while(idman.idmanbittimi() == false){

            System.out.println("hareket turu(burpee,pushup,situp,squat) : ");
                String tur = scanner.nextLine();
            System.out.println("tekrar sayisini giriniz: ");
                int sayi = scanner.nextInt();
                scanner.nextLine();
                idman.HareketYap(tur,sayi);

        }
    }
}