import java.util.Scanner;
public class WyswImion{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] tablica = new String[5];
        System.out.println("Podaj 5 imion");
        for(int j=0; j<tablica.length; j++) {
            System.out.println("Podaj imie:");
            tablica[j] = input.nextLine();
        }

        for(int i=4; i>0; i--){
            System.out.printf("Cześć: %s\n", tablica[i]);
        }
    }

}
