public class Override_gyakorlas {
    public static void main(String[] args) {
        Bigyom bigyom1 , bigyom2, bigyom3;
        
        bigyom1 = new Bigyom();
        bigyom2 = new MasikBigyom();
        bigyom3 = new AlBigyom();


        bigyom1.ertek = 7;
        bigyom2.ertek = 14;
        bigyom3.ertek = 6;

        bigyom1.megjelenit();
        bigyom2.megjelenit();
        bigyom3.megjelenit();
    }
}

class Bigyom{
    int ertek;

    public void megjelenit(){
        System.out.println("Bigyom erteke "+ ertek);
    }
}

class AlBigyom extends Bigyom{
    @Override
    public void megjelenit(){
        System.out.println("Albigyom erteke " + ertek);
    }
}

class MasikBigyom extends Bigyom{
    @Override
    public void megjelenit(){
        System.out.println("Masik bigyom erteke "+ ertek);
    }
}