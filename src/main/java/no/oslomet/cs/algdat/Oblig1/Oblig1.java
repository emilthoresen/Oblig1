package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;

public class Oblig1 {
    private Oblig1() {
    }

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        String feil_melding = "Tabellen er tom";
        int maks_verdi = 0;

        if (a.length < 1){
            throw new java.util.NoSuchElementException(feil_melding);

        }
        else if(a.length == 1){
            maks_verdi = a[0];
        }
        for (int i = 1; i < a.length; i++){
            if(a[i] < a[i-1]){
                int verdi = a[i];
                a[i] = a[i-1];
                a[i-1] = verdi;
            }
            maks_verdi  = a[i];
        }
        return maks_verdi ;
    }

    public static int ombyttinger(int[] a) {
        int antall = 0;

        for (int i = 1; i < a.length; i++){
            if (a[i] < a[i-1]){
                antall++;

                int verdi = a[i];
                a[i] = a[i-1];
                a[i-1] = verdi;
            }
        }
        return antall;
    }


    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        String feil_melding = "Array er ikke sortert";
        int antall = 1;

        if (a.length == 0){
            antall = 0;
        }

        for(int i = 1; i < a.length; i++){
            if (a[i] < a[i-1]){
                throw new IllegalStateException(feil_melding);
            }

            if ( a[i-1] != a[i]){
                antall++;
            }
        }
        return antall;
    }


    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        throw new UnsupportedOperationException();
    }

    /// 7b)
    public static String flett(String... s) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new UnsupportedOperationException();
    }

}  // Oblig1
