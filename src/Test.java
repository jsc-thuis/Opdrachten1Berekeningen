import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        DocArray da = new DocArray();

        // mediaan van een oneven aantal getallen
        int oneven[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(oneven));
        System.out.println("mediaan: " + da.mediaan(oneven));

        // mediaan van een even aantal getallen
        int even[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(even));
        System.out.println("mediaan: " + da.mediaan(even));

        // standaarddeviatie van een reeks getallen
        int resultaten[] = {2, 4, 5, 5, 6, 7, 9, 10};
        System.out.println(Arrays.toString(resultaten));
        System.out.println("standaarddeviatie: " + da.standaarddeviatie(resultaten));
    }
}
