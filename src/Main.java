import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,k,total=1,deger=1,sonuc;
        System.out.print("n ve k degerleri girin:(n>k olmalı)");
        Scanner input=new Scanner(System.in);
        n= input.nextInt();
        k= input.nextInt();
        for(int i=1;i<=n;i++){
            total=total*i;
        }
        for(int r=1;r<=k;r++){
            deger=deger*r;
        }
        sonuc=total/(deger*(n-k));
        System.out.print("Sonuc:"+sonuc);


    }
}