import java.util.Arrays;

public class DocArray {
    public float mediaan(int[] getallen) {
        float med = 0;
        int aantal = getallen.length;
        Arrays.sort(getallen);
        if (aantal % 2 == 0) {
            med = (float) (getallen[aantal / 2 - 1] + getallen[aantal / 2]) / 2;   // even aantal
        } else {
            med = getallen[aantal / 2];    // oneven aantal
        }
        return med;
    }

    public float gemiddelde(int[] getallen) {
        int som = 0;
        int lengte = getallen.length;

        // met foreach-lus de som van alle getalllen berekenen
        for (int getal : getallen) {
            som += getal;
        }
//      kan ook berekend worden met gewone for-lus
//        for (int i = 0; i < lengte; i++) {
//            som += getallen[i];
//        }

        float gem = (float) som / lengte;    // CASTEN: int som wordt float (p623)
        // dit zorgt ervoor dat som/lengte als resultaat een float geeft en geen integer
        return gem;
    }

    public float standaarddeviatie(int[] getallen) {
        float som = 0;
        float gem = gemiddelde(getallen);
        float stddev = 0;
        int aantal = getallen.length;

        // som berekenen van kwadraten van afwijkingen
        for (int getal : getallen) {
            som += Math.pow(getal - gem, 2);    // kwadraat
        }

        // deze som delen door het aantal en de vierkantswortel nemen
        stddev = (float) Math.sqrt(som / aantal);  // vierkantswortel
        return stddev;
    }
}

