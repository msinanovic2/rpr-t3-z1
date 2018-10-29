package ba.unsa.etf.rpr.tutorijal03;


public class  FiksniBroj extends TelefonskiBroj {
        private Grad grad;
        private String broj;

        FiksniBroj(Grad grad, String broj){
            this.grad=grad;
            this.broj=broj;
        }
        public final String niz[]={"037", "031", "035", "032" ,"038" ,"030", "036", "039" ,"033", "034"};
        @Override
        public String ispisi(){

            return niz[grad.index]+"/"+broj;
        }
        @Override
        public int hashCode(){
            return broj.hashCode();
        }

    public String getBroj() {
        return broj;
    }
}
