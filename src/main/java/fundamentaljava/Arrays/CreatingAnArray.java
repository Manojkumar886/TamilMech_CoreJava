package fundamentaljava.Arrays;

import fundamentaljava.Modifiers.access;

public class CreatingAnArray extends access
{
    public void accessprotect()
    {
        protectedModifier();
        // DefaultModfier();
    }


    public static void main(String[] args) 
    {

        access a=new access();// other package class .class is public
        a.publicmodifier();
        // a.DefaultModfier();//
        // a.protectedModifier();//protected modifier cannot access other package
        // a.privateModifier();// private modifier cannot access other class and packages
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
