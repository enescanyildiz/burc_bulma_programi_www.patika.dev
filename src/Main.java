import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int gun,ay;
        System.out.println("Lütfen Ayı Giriniz: ");
        ay=input.nextInt();
        System.out.println("Lütfen Günü Giriniz: ");
        gun=input.nextInt();

        if((gun<=31)&&(gun>=1))
        {
            if(ay==1)
            {
                if(gun<=21)
                {
                    System.out.println("Oğlak Burcu");
                }
                else
                {
                    System.out.println("Kova Burcu");
                }

            }
        }else
        {
        System.out.println("Yanlış Gün Girildi.");
        }
//----------------------------------------------------------------
        if((gun<=29)&&(gun>=1))
        {
            if(ay==2)
            {
                if(gun<=19)
                {
                    System.out.println("Kova Burcu");
                }
                else
                {
                    System.out.println("Balık Burcu");
                }

            }
        }else
        {
            System.out.println("Yanlış Gün Girildi.");
        }
//----------------------------------------------------------------
        if((gun<=31)&&(gun>=1))
        {
            if(ay==3)
            {
                if(gun<=20)
                {
                    System.out.println("Balık Burcu");
                }
                else
                {
                    System.out.println("Koç Burcu");
                }

            }
        }else
        {
            System.out.println("Yanlış Gün Girildi.");
        }
//----------------------------------------------------------------
        if((gun<=30)&&(gun>=1))
        {
            if(ay==4)
            {
                if(gun<=20)
                {
                    System.out.println("Koç Burcu");
                }
                else
                {
                    System.out.println("Boğa Burcu");
                }

            }
        }else
        {
            System.out.println("Yanlış Gün Girildi.");
        }
//----------------------------------------------------------------
        if((gun<=31)&&(gun>=1))
        {
            if(ay==5)
            {
                if(gun<=21)
                {
                    System.out.println("Boğa Burcu");
                }
                else
                {
                    System.out.println("İkizler Burcu");
                }

            }
        }else
        {
            System.out.println("Yanlış Gün Girildi.");
        }
//----------------------------------------------------------------
        if((gun<=30)&&(gun>=1))
        {
            if(ay==6)
            {
                if(gun<=22)
                {
                    System.out.println("İkizler Burcu");
                }
                else
                {
                    System.out.println("Yengeç Burcu");
                }

            }
        }else
        {
            System.out.println("Yanlış Gün Girildi.");
        }
//----------------------------------------------------------------
        if((gun<=31)&&(gun>=1))
        {
            if(ay==7)
            {
                if(gun<=22)
                {
                    System.out.println("Yengeç Burcu");
                }
                else
                {
                    System.out.println("Aslan Burcu");
                }

            }
        }else
        {
            System.out.println("Yanlış Gün Girildi.");
        }
//----------------------------------------------------------------
        if((gun<=30)&&(gun>=1))
        {
            if(ay==8)
            {
                if(gun<=23)
                {
                    System.out.println("Aslan Burcu");
                }
                else
                {
                    System.out.println("Başak Burcu");
                }

            }
        }else
        {
            System.out.println("Yanlış Gün Girildi.");
        }
//----------------------------------------------------------------
        if((gun<=31)&&(gun>=1))
        {
            if(ay==9)
            {
                if(gun<=23)
                {
                    System.out.println("Başak Burcu");
                }
                else
                {
                    System.out.println("Terazi Burcu");
                }

            }
        }else
        {
            System.out.println("Yanlış Gün Girildi.");
        }
//----------------------------------------------------------------
        if((gun<=30)&&(gun>=1))
        {
            if(ay==10)
            {
                if(gun<=23)
                {
                    System.out.println("Terazi Burcu");
                }
                else
                {
                    System.out.println("Akrep Burcu");
                }

            }
        }else
        {
            System.out.println("Yanlış Gün Girildi.");
        }
//----------------------------------------------------------------
        if((gun<=31)&&(gun>=1))
        {
            if(ay==11)
            {
                if(gun<=21)
                {
                    System.out.println("Akrep Burcu");
                }
                else
                {
                    System.out.println("Yay Burcu");
                }

            }
        }else
        {
            System.out.println("Yanlış Gün Girildi.");
        }
//----------------------------------------------------------------
        if((gun<=30)&&(gun>=1))
        {
            if(ay==12)
            {
                if(gun<=21)
                {
                    System.out.println("Yay Burcu");
                }
                else
                {
                    System.out.println("Oğlak Burcu");
                }

            }
        }else
        {
            System.out.println("Yanlış Gün Girildi.");
        }
//----------------------------------------------------------------
    }
}