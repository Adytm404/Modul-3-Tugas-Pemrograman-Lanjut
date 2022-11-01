public class Balok extends driver{
    int panjang;
    int lebar;
    int tinggi;
    int balok;

    public int getBalok() {
        return balok;
    }

    public void setBalok(int balok) {
        this.balok = balok;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    void hasil(){
        Perhitungan per = new Perhitungan();
        System.out.println("\nHasil Perhitungan");
        System.out.println("Luas\t\t: " + per.luas(this));
        System.out.println("Volume\t\t: " + per.volume(this));

        if (isCube(balok)){
            System.out.printf("\nIni merupakan balok!");
        }else {
            System.err.printf("\nIni bukan merupakan balok!");
        }
    }

    static boolean isCube(long input){
        return (Math.round(Math.cbrt(input))*Math.round(Math.cbrt(input))*Math.round(Math.cbrt(input))) == input;
    }



}