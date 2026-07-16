package String;

import java.util.Scanner;

public class NameMaker {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String firstName;
        String middleName;
        String lastName;
        String fullName;

        System.out.print("Primeiro nome: ");
        firstName = sc.next();

        System.out.print("Nome do Meio: ");
        middleName = sc.next();

        System.out.print("Sobrenome nome: ");
        lastName = sc.next();

        fullName = firstName+' '+middleName+' '+lastName+' ';

        System.out.println(fullName);

    }
    
}
