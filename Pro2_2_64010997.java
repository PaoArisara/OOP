import java.util.Random;
import java.util.Scanner;

public class Pro2_2_64010997 {
    public static void main(String[] args) {
        String[] ran = {"scissor","rock","paper"};
        String[] word ={"Draw","Lost","Win"};
        Scanner input = new Scanner(System.in);
        int user;
        System.out.print("sissor(0),rock(1),paper(2) : ");
        user = input.nextInt();
        int random =(int)(Math.random()*3);
        if(user==random)
        System.out.print("The computer is "+ran[random]+". You are "+ran[user]+". "+word[0]);
        if(user==0&&random==1)
        System.out.print("The computer is "+ran[random]+". You are "+ran[user]+". "+word[1]);
        if(user==0&&random==2)
        System.out.print("The computer is "+ran[random]+". You are "+ran[user]+". "+word[2]);
        if(user==1&&random==0)
        System.out.print("The computer is "+ran[random]+". You are "+ran[user]+". "+word[2]);
        if(user==1&&random==2)
        System.out.print("The computer is "+ran[random]+". You are "+ran[user]+". "+word[1]);
        if(user==2&&random==0)
        System.out.print("The computer is "+ran[random]+". You are "+ran[user]+". "+word[1]);
        if(user==2&&random==1)
        System.out.print("The computer is "+ran[random]+". You are "+ran[user]+". "+word[2]);
        
    }
}
