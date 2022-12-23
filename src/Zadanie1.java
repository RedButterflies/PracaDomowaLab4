public class Zadanie1 {
    public static void main(String[] args) {
        Zadanie1.tablicaLiczb();
    }
    static int [] dane = new int [100];
    static void tablicaLiczb() {
        for(int i=1;i<=100;i++)
        {
            dane[i-1]=i;
        }
        int suma=0;
        for (int a : dane) {
            suma+=a;

        }
        int j=0;
        for(int i=0;i<100;i++)
        {
            if(dane[i]<10){ System.out.print(0);}
                System.out.print(dane[i] +" ");
                j++;
                if(j==10)
                {
                    System.out.println(" ");
                    j=0;
                }

        }
        System.out.println("Suma elementow tablicy: "+suma);
    }
}
