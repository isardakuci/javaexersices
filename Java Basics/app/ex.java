import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
System.out.println("How many numbers do you want to enter?");
int nr = in.nextInt();
int average = 0;
int count = 0;
for(int i =0; i< nr ; i++)
{
    System.out.println("Enter number"+i);
    int x = in.nextInt();
    if(x % 3 == 0)
{
    count++;
    average += x;

}

}
average /= count;
System.out.println("The average of the numbers divisible by 3 is" + average);

            
    }
}