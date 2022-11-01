import java.util.Scanner;

public class driver{
    public static void main(String[] args) {
        Balok input = new Balok();
        Scanner sisi = new Scanner(System.in);

        int balok;
        String menu;

        System.out.println("===[Balok Checker]===");
        System.out.print("Masukan sisi\t\t: ");
        balok = sisi.nextInt();

        input.setBalok(balok);
        input.setPanjang(balok);
        input.setLebar(balok);
        input.setTinggi(balok);

        input.hasil();
    }

}