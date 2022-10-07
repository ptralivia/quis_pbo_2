
import java.util.Scanner;
class biaya{
    long pj,ja,bj,tsp,total;
    
    biaya(long pj, long ja, long bj, long tsp){
        this.pj = pj;
        this.ja = ja;
        this.bj = bj;
        this.tsp = tsp;
        this.total = total;
    }
    
    void total(){
        total = pj + ja + bj + tsp;
        System.out.println("Total Biaya yang di Bayar Pemesan Rp."+total);
    }
}
class team{
    int jenis;
    String namaTeam;
    void show(int jenis){
        if (jenis == 1){
            namaTeam = "Team Sea";    
        }else if (jenis == 2){
            namaTeam = "Team Mountain";
        }else if (jenis == 2){
            namaTeam = "Team Forest";
        }
        System.out.println("Nama Penyedia Jasa\t\t"+namaTeam);
    }
}
public class alivia{
    public static void main(String[] args){
        String nama,alamat,no,email,Jjasa;
        int pilih,jasa;
        long biaya1,biaya2,biaya3,biaya4;
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Car Cleaning.. Anda Pesan Kami Datang ---");
        System.out.println("=====================================\n\n");
        System.out.println("-----------------o0o-----------------");
        System.out.println("Masukan Data Pemesan");
        System.out.print("Masukan Nama     \t\t ");
        nama = input.next();
        System.out.print("Masukan Alamat   \t\t ");
        alamat = input.next();
        System.out.print("Masukan No. Tlp  \t\t ");
        no = input.next();
        System.out.print("Masukan Email  \t\t\t ");
        email = input.next();
        System.out.print("\n");
        System.out.println("Jenis Jasa");
        System.out.println("1. Cuci Mobil");
        System.out.println("2. Salon Mobil Interior");
        System.out.println("3. Salon Mobil Eksterior");
        System.out.println();
        System.out.print("Pilih Jasa : ");
        jasa = input.nextInt();
        System.out.print("\n");     
        System.out.println("Team Penyedia Jasa");
        System.out.println("1. Team Sea (2 Orang)");
        System.out.println("2. Team Mountain (4 Orang)");
        System.out.println("3. Team Forest (5 Orang)");
        System.out.println();
        System.out.print("Pilih Team : ");
        pilih = input.nextInt();
        System.out.println();
        System.out.print("Berikan Keterangan Pemesan : ");
        System.out.print("\n");
        String tindakan = input.next();
        System.out.print("\n");
        System.out.print("Masukan Biaya Penyedia Jasa\t  Rp.");
        biaya1 = input.nextLong();
        System.out.print("Masukan Biaya Jasa Alat\t\t  Rp.");
        biaya2 = input.nextLong();
        System.out.print("Masukan Biaya Bahan Jasa\t  Rp.");
        biaya3 = input.nextLong();
        System.out.print("Masukan Biaya Transportasi\t  Rp.");
        biaya4 = input.nextLong();
        biaya biaya0 = new biaya(biaya1,biaya2,biaya3,biaya4);
        System.out.println("---------------o0o---------------");
        System.out.println("=================================");
        if(jasa ==1){
            System.out.println("Jasa yang di Pesan\t\tCuci Mobil");
        }else if(jasa == 2){
            System.out.println("Jasa yang di Pesan\t\tSalon Mobil Interior");
        }else if(jasa == 3){
            System.out.println("Jasa yang di Pesan\t\tSalon Mobil Eksterior");
        }
        team team1 = new team();
        team1.show(pilih);
        System.out.println("Keterangan\t\t\t"+tindakan+"\n");
        biaya0.total();
        System.out.println();
        System.out.println("Salam Bersih "+nama+" Terimakasih");
    }
}