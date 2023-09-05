public class App {
    public static void main(String[] args) throws Exception {
       Maci maci = new Maci();
       Cica mici = new Cica();
       Pingvin bucu = new Pingvin(); 
       maci.hangotad("brumm..");
       maci.mezgyujtes(); 
 ///   maci.nev = "Brumi";
       System.out.println(mici.nev);
       mici.hangotad("meow..");
       mici.dorombolas();
 ///   mici.nev = "";    
       bucu.hangotad("oaaaa...");
       bucu.csuszkalas();
    }
}
