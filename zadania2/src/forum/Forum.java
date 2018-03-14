package forum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Forum {

    public void addUser2(List<User> B, User U){
        Scanner we = new Scanner(System.in);
        U = new User();
        System.out.println("Podaj login: ");
        U.setName(we.nextLine());
        System.out.println("Podaj wiek: ");
        U.setAge(we.nextInt());
        System.out.println("Podaj płeć: ");
        U.setSex(we.nextBoolean());
        B.add(U);
    }


    public static void main(String[] args) {
        Scanner w1 = new Scanner(System.in);
//        Licznik li = new Licznik();
//        User [] u = new User[10];
        Forum f = new Forum();
        User o = new User();
        List<User> A = new ArrayList<>();
        int poz=-1;
        while (poz!=0){
            System.out.print("Menu\n1 - zaloguj usera\n2 - wyświetl userów\n3 - podaj liczę zalogowanych\n4 - wyloguj usera\n0 - wyjście\nWybierz opcję: ");
            poz=w1.nextInt();
            switch (poz){
                case 1:
//                    addUser(u,li);
                    f.addUser2(A,o);
                    break;
                case 2:
//                    for (int i=0; i<li.x; i++)
//                        System.out.println(u[i].getName());
                    for (int i=0; i<A.size(); i++)
                        System.out.println(i+". "+A.get(i).getName()+" lat: "+A.get(i).getAge()+" płeć: "+A.get(i).getSex());
                    break;
                case 3:
//                    System.out.println("Liczba zalogowanych userów: "+li.x);
                    System.out.println("Liczba zalogowanych userów: "+A.size());
                    break;
                case 4:
                    System.out.println("Podaj index do wylogowania: ");
                    A.remove(w1.nextInt());
                    break;
                case 0:
                    break;
                    default:
                        System.out.println("Brak takiej opcji");
            }
        }
    }
//    public static void addUser(User [] u, Licznik log){
//        Scanner we = new Scanner(System.in);
//        u[log.x]=new User();
//        System.out.println("Podaj login: ");
//        u[log.x].setName(we.nextLine());
//        log.x++;
//    }
//    public static void addUser2(List<User> B, User U){
//        Scanner we = new Scanner(System.in);
//        U = new User();
//        System.out.println("Podaj login: ");
//        U.setName(we.nextLine());
//        System.out.println("Podaj wiek: ");
//        U.setAge(we.nextInt());
//        System.out.println("Podaj płeć: ");
//        U.setSex(we.nextBoolean());
//        B.add(U);
//    }
}
