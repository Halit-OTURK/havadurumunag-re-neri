import java.util.Scanner;

public class etkinlikteklifi {
    //Koşullar :
    //
    //Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    //Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    //Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
    //Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
    //Ödev
    //Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz

    public static void main(String[] agrs){
    int heat;
    Scanner input= new Scanner(System.in);
        System.out.print("SICAKLIK DEĞERİNİ GİRİNİZ:");
    heat= input.nextInt();
    if(heat<=5){System.out.println("KAYAK YAPABİLİRSİNİZ");}
    if(heat>=5&&heat<=15){System.out.println("SİNEMAYA GİDEBİLİRSİNİZ");}
    if(heat>=10&&heat<=25){System.out.println("PİKNİK YAPABİLİRSİNİZ");}
    else if(heat>25) {System.out.println("YÜZMEYE GİDEBİLİRSİNİZ");}

        }
}
