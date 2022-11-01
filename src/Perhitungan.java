public class Perhitungan extends Balok {
     static long luas, volume;

     long luas(Balok sisi){
         return luas = sisi.getPanjang() * sisi.getLebar() * sisi.getTinggi();
     }

     long volume(Balok sisi) {
        return volume = 4 * sisi.getLebar() * sisi.getPanjang() * sisi.getTinggi();
     }



}