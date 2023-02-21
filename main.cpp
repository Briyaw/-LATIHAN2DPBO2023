//import library
#include <bits/stdc++.h>
#include "human.cpp"

//using standard namespace
using namespace std;


int main()
{
    //declaration variable
    int i, loop, n, cek, j_data = 0;
    string nama, prodi, asal, email, fakultas, nim, nik;
    char jenis_kelamin;

    list<Human> llist;//using list class Human

    do{//looping untuk pilih method
        cout << "Ketik 1 untuk Input Data Mahasiswa" << endl;
        cout << "Ketik 2 untuk melihat Data Mahasiswa yang sudah di input" << endl;
        cout << "Ketik 3 untuk selesai" << "\n\n";
        cout << "Input : ";
        cin >> cek;
        if(cek == 1)//method 1 menginput data mahasiswa
        {
            cout << endl <<"Berapa data yang ingin di input : ";
            cin >> n;
            
            for(i=0; i<n; i++)//perulangan untuk menginput dan menyimpan data yang sudah diinput
            {
                Human temp;//membuat penyimpanan sementara
                j_data++;
                cout << "Input Data Mahasiswa ke-" << j_data <<endl;
                //input data
                cout << "Nama : ";
                cin >> nama;
                cout << "NIK : ";
                cin >> nik;
                cout << "NIM : ";
                cin >> nim;
                cout << "Prodi : ";
                cin >> prodi;
                cout << "Fakultas : ";
                cin >> fakultas;
                cout << "Asal Kampus :";
                cin >> asal;
                cout << "email : ";
                cin >> email;
                cout << "Jenis Kelamin : ";
                cin >> jenis_kelamin;
                cout << endl;

                //memindahkan data ke atribut kelas
                temp.set_asal_universitas(asal);
                temp.set_email_edu(email);
                temp.set_nim(nim);
                temp.set_nama(nama);
                temp.set_jenis_kelamin(jenis_kelamin);
                temp.set_fakultas(fakultas);
                temp.set_prodi(prodi);
                temp.set_nik(nik);  
                llist.push_back(temp);
                
            }
        
        }
        else if(cek == 2)//method 2 menampilkan data mahasiswa
        {
            if(j_data == 0)//jika data masih kosong
            {
                cout << "Data Mahasiswa belum ada"  << endl;
            }
            else//jika data sudah terisi
            {   
                cout << endl << "Jumlah Data Mahasiswa : " << j_data << "\n\n";
                cout << "Menampilkan Data Mahasiswa" << endl;
                i=0;
                //perulangan untuk menampilkan data menggunakan iterator
                for(list<Human>::iterator it = llist.begin(); it != llist.end(); it ++)
                {
                    cout << endl;
                    cout << (i+1) << ". " << "Nama : " << it->get_nama() << endl;
                    cout << "   ";
                    cout << "NIM : " << it->get_nim() << endl;
                    cout << "   ";
                    cout << "NIK : " << it->get_nik() << endl;
                    cout << "   ";
                    cout << "Jenis Kelamin : " << it->get_jenis_kelamin() << endl;
                    cout << "   ";
                    cout << "Prodi : " << it->get_prodi() << endl;
                    cout << "   ";
                    cout << "Fakultas : " << it->get_nik() << endl;
                    cout << "   ";
                    cout << "Asal Universitas : " << it->get_asal_universitas() << endl;
                    cout << "   ";
                    cout << "email : " << it->get_email_edu() << endl;
                    i++;
                }
                cout<<endl;
            }
        }

    }while(cek!=3);//method 3 -> looping sampai ingin berhenti
    return 0;
}