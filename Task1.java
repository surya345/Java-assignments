
public class Task1{
    public static void main(String []args)
    {
    int tempC=0,i;
    float tempF;
    System.out.printf("Sr no/t/t Temperature(celsius)/t/t Temp(Fahrenheit)") ;
    
        for(i=1;i<=11;i+=1)
        {
            tempF=(tempC*9/5)+32;
            System.out.printf("\n%6d\t\t %6d \t\t\t %8.2f", i,tempC,tempF);
            tempC+=10;
        }
       
    }
}

