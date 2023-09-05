public class Allat {
    String nev = "névtelen";

    public void beallitNev(String nev){
        if(nev.isEmpty()) {
            System.out.println("Hiba, nem adtál meg nevet!");
            System.out.println(1);

        }

        this.nev = nev;

    }
    public void hangotad(String hang) {

            System.out.println(hang);
    
    }


}
