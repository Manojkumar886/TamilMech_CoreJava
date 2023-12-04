package fundamentaljava.Arrays;

public class CreatingAnArray 
{

    public static void main(String[] args) 
    {
        String MobileBrands []={"One plus","Oppo","Vivo","Realme","Redmi","Samsung","Iq","Nokia"};
        
        // System.out.println(MobileBrands.length);

        char  [] Gender=new char[5];
        Gender[4]='M';
        Gender[1]='F';
        Gender[2]='F';
        Gender[0]='O';
        Gender[3]='M';

        for(int i=0;i<=Gender.length-1;i++)
        {
            System.out.println(Gender[i]);
        }
        
    }
}
