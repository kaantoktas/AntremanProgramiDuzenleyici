public class idman {

    private int burpeeSayisi;
    private int pushupSayisi;
    private int situpSayisi;
    private int squatSayisi;

     public idman(int burpeeSayisi,int pushupSayisi,int situpSayisi,int squatSayisi){
         this.burpeeSayisi = burpeeSayisi;
         this.pushupSayisi=pushupSayisi;
         this.situpSayisi=situpSayisi;
         this.squatSayisi=squatSayisi;
     }

    public int getBurpeeSayisi() {
        return burpeeSayisi;
    }

    public int getPushupSayisi() {
        return pushupSayisi;
    }

    public int getSitupSayisi() {
        return situpSayisi;
    }

    public int getSquatSayisi() {
        return squatSayisi;
    }

    public void setBurpeeSayisi(int burpeeSayisi) {
        this.burpeeSayisi = burpeeSayisi;
    }

    public void setPushupSayisi(int pushupSayisi) {
        this.pushupSayisi = pushupSayisi;
    }

    public void setSitupSayisi(int situpSayisi) {
        this.situpSayisi = situpSayisi;
    }

    public void setSquatSayisi(int squatSayisi) {
        this.squatSayisi = squatSayisi;
    }
    public void HareketYap(String hareketTuru,int sayi){

         if(hareketTuru.equals("burpee")){

             burpeeYap(sayi);
         }
         else if (hareketTuru.equals("pushup")) {

             pushupYap(sayi);
         }
         else if (hareketTuru.equals("situp")) {

             situpYap(sayi);
         }
         else if (hareketTuru.equals("squat")) {

             squatYap(sayi);
         }
         else {
             System.out.println("gecersiz hareket ");

         }
     }
        public void burpeeYap(int sayi){

         if(burpeeSayisi==0){
             System.out.println("yapıcak burpee kalmadi");
         }
        if (sayi < burpeeSayisi){
            System.out.println("tebrikler fazla bile yaptiniz");
            burpeeSayisi=0;
        }
        else {
            burpeeSayisi -= sayi;

            System.out.println("kalan burpee sayisi" + burpeeSayisi);
        }
     }
    public void pushupYap(int sayi){

        if(pushupSayisi==0){
            System.out.println("yapıcak pushup kalmadi");
        }
        if (sayi < pushupSayisi){
            System.out.println("tebrikler fazla bile yaptiniz");
            pushupSayisi=0;
        }
        else {
            pushupSayisi -= sayi;

            System.out.println("kalan pushup sayisi" + pushupSayisi);
        }
     }

    public void situpYap(int sayi){

        if(situpSayisi==0){
            System.out.println("yapıcak situp kalmadi");
        }
        if (sayi < situpSayisi){
            System.out.println("tebrikler fazla bile yaptiniz");
            situpSayisi=0;
        }
        else {
            situpSayisi -= sayi;

            System.out.println("kalan situp sayisi" + situpSayisi);
        }
     }
    public void squatYap(int sayi){

        if(squatSayisi==0){
            System.out.println("yapıcak squat kalmadi");
        }
        if (sayi < squatSayisi){
            System.out.println("tebrikler fazla bile yaptiniz");
            squatSayisi=0;
        }
        else {
            squatSayisi -= sayi;
            System.out.println("kalan squat sayisi" + squatSayisi);
        }
     }
        public boolean idmanbittimi(){

         return (burpeeSayisi == 0) && (pushupSayisi == 0) && (situpSayisi == 0) && (squatSayisi == 0);
        }


}
