import java.util.*;
public class prac {

    static Scanner sc= new Scanner(System.in);
    public static void add( ArrayList<Integer> tanki,int n)
    {
        int i=0;
        while(i<n)
        {
            System.out.println("Enter height of tanki");
            int k=sc.nextInt();
            tanki.add(k);
            i++;
        }
    }

    public static int[] maxal(ArrayList<Integer> list)
    {
        int k = list.get(0), j=0;
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i)>k)
            {
                k= list.get(i);
                j=i;
            }
        }
        int[] sample = {k,j};
        return sample;
    }

    public static void kis_mein_zyada_paani(ArrayList<Integer> tanki,int l, int k)
    {
        int max=0,j,h;
        for(int i=0;i<tanki.size();i++)
        {
           if(i<=k)
           j= k-i;
           else
           j=i-k;
           h=tanki.get(i);
           if(max<=(j*h))
           {
            max=j*h;
           }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        ArrayList<Integer> tanki = new ArrayList<>();
        System.out.println("Enter the No. of towers");
        int n= sc.nextInt();
        add(tanki,n);
        System.out.println(tanki);
        int[] l= maxal(tanki);
        kis_mein_zyada_paani(tanki,l[0],l[1]);
    }
}
