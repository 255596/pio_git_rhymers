package edu.kis.vh.nursery;

/**
 * Klasa HanoiRhymer rozszerza domyślną wyliczankę.
 * Jej działanie polega na tym, że odrzuca liczby,
 * które są większe od liczby, która znajduje sie na szczycie.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;
    /**
     * Metoda zwracająca całkowitą liczbę odrzuconych prób dodania elementu.
     * liczba odrzuconych elementów to wartość zmiennej totalRejected
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Metoda dodająca nową liczbę do wyliczanki.
     * Jeśli wyliczanka nie jest pusta i wprowadzana liczba jest większa
     * od tej na szczycie, liczba zostaje odrzucona, a licznik odrzuceń wzrasta.
     * W przeciwnym razie liczba jest dodawana normalnie.
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peek())
            totalRejected++;
        else
            super.countIn(in);
    }
}
