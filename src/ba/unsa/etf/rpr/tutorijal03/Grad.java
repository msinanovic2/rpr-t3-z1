package ba.unsa.etf.rpr.tutorijal03;

public enum Grad {
    BIHAC(0), GORAZDE(1), LIVNO(2), MOSTAR(3), ORASJE(4), SARAJEVO(5), SIROKI_BRIJEG(6), TRAVNIK(7), TUZLA(8), ZENICA(9);
    int index;

    Grad(int i) {
        index = i;
    }
}
