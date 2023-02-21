//import library
#include <bits/stdc++.h>
#include "mahasiswa.cpp"
//using standard namespace
using namespace std;

class Human : public Mahasiswa
{
    private:
        string nik;
        string nama;
        char jenis_kelamin;
        
    public:
        Human()
        {
            this->nik = "";
            this->nama = "";
            this->jenis_kelamin = '-';
        }

        string get_nik()
        {
            return this->nik;
        }

        void set_nik(string nik)
        {
            this->nik = nik;
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

        ~Human()
        {

        }
};