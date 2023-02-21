//import library
import java.util.Scanner;
import java.util.ArrayList; 

class Main extends Human
{
    public static void main(String[] args)
    {
        //deklarasi variabel
        int i, loop, n, cek, j_data = 0;
        String jenis_kelamin, nama, prodi, asal, email, fakultas, nim, nik;
        ArrayList<Human> list = new ArrayList<>();//menggunakan list
        Scanner sc = new Scanner(System.in);

        do{//perulangan untuk memilih metode yang akan digunakan
            System.out.println("Ketik 1 untuk Input Data Mahasiswa");
            System.out.println("Ketik 2 untuk melihat Data Mahasiswa yang sudah di input");
            System.out.println("Ketik 3 untuk selesai");
            System.out.println("Input : ");
            cek = sc.nextInt();
            if(cek == 1)//method 1 menginput data
            {
                System.out.println("Berapa data yang ingin di input : ");
                n = sc.nextInt();
                
                for(i=0; i<n; i++)//perulangan menginput data dan memasukannya kedalam atribut kelas
                {
                    Human temp = new Human();
                    j_data++;
                    System.out.println("Input Data Mahasiswa ke-" + j_data);
                    System.out.println("Nama : ");
                    nama= sc.next();
                    System.out.println("NIK : ");
                    nik= sc.next();
                    System.out.println("NIM : ");
                    nim= sc.next();
                    System.out.println("Prodi : ");
                    prodi= sc.next();
                    System.out.println("Fakultas : ");
                    fakultas= sc.next();
                    System.out.println("Asal Kampus :");
                    asal= sc.next();
                    System.out.println("email : ");
                    email= sc.next();
                    System.out.println("Jenis Kelamin : ");
                    jenis_kelamin= sc.next();

                    temp.setasal_universitas(asal);
                    temp.setemail_edu(email);
                    temp.setnim(nim);
                    temp.setnama(nama);
                    temp.setjenis_kelamin(jenis_kelamin);
                    temp.setfakultas(fakultas);
                    temp.setprodi(prodi);
                    temp.setnik(nik);  
                    list.add(temp);
                    
                }
            
            }
            else if(cek == 2)//method 2 menampilkan data
            {
                if(j_data == 0)//jika data kosong
                {
                    System.out.println("Data Mahasiswa belum ada");
                }
                else//jika data sudah terisi
                {   
                    System.out.println("Jumlah Data Mahasiswa : " + j_data);
                    System.out.println("Menampilkan Data Mahasiswa");
                    for(i=0; i<list.size(); i++)//perulangan menampilkan data yang sudah diisi
                    {
                        System.out.println(Integer.toString(i+1) + ". " + "Nama : " + list.get(i).getnama());
                        System.out.println("   NIM : " + list.get(i).getnim());
                        System.out.println("   NIK : " + list.get(i).getnik());
                        System.out.println("   Jenis Kelamin : " + list.get(i).getjenis_kelamin());
                        System.out.println("   Prodi : " + list.get(i).getprodi());
                        System.out.println("   Fakultas : " + list.get(i).getfakultas());
                        System.out.println("   Asal Universitas : " + list.get(i).getasal_universitas());
                        System.out.println("   email : " + list.get(i).getemail_edu());
                        i++;
                    }
                    
                }
            }

        }while(cek!=3);// metode 3 loop berhenti sampai kita ingin berhenti
        sc.close();
    }
    
    
}