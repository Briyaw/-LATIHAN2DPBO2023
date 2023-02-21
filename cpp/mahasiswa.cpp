//import library
#include <bits/stdc++.h>
#include "sivitas.cpp"

//using standard namespace
using namespace std;

class Mahasiswa : public SivitasAkademik
{
    private:
        string nim;
        string nama;
        char jenis_kelamin;
        string fakultas;
        string prodi;

    public:
        Mahasiswa()
        {
            this->nim = "";
            this->nama = "";
            this->jenis_kelamin = '-';
            this->fakultas = "";
            this->prodi = "";
        }

        string get_nim()
        {
            return this->nim;
        }

        void set_nim(string nim)
        {
            this->nim = nim;
        }

        string get_nama()
        {
            return this->nama;
        }

        void set_nama(string nama)
        {
            this->nama = nama;
        }

        char get_jenis_kelamin()
        {
            return this->jenis_kelamin;
        }

        void set_jenis_kelamin(char jenis_kelamin)
        {
            this->jenis_kelamin = jenis_kelamin;
        }

        string get_fakultas()
        {
            return this->fakultas;
        }

        void set_fakultas(string fakultas)
        {
            this->fakultas = fakultas;
        }

        string get_prodi()
        {
            return this->prodi;
        }

        void set_prodi(string prodi)
        {
            this->prodi = prodi;
        }

        ~Mahasiswa()
        {

        }

};

