import java.io.*;

public class DecimalConversion{
    int num,binResult;

    //Parameterized constructor
    public DecimalConversion(int n)
    {
        num=n;
        binResult=0;
    }

    //converting to binary recursivly
    public int convert()
    {
        if(num == 0)
            return 0;
        else if(num == 1)
            return 1;
        else{
            int rem=num%2;
            num/=2;
            return rem+convert()*10;
        }
    }

    public void display()
    {
        System.out.println("Decimal number: " + num);
        binResult=convert();
        System.out.println("Binary equivalent: " + binResult);
    }

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Integer: ");
        int n = Integer.parseInt(br.readLine());
        DecimalConversion obj = new DecimalConversion(n);
        obj.display();
    }
}
