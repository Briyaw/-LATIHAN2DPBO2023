from sivitas import SivitasAkademik
# kelas Mahasiswa sebagai anak yang diwariskan dari SivitasAkademik
class Mahasiswa(SivitasAkademik):
    # access modifier private
    __nim = "";
    __nama = "";
    __jenis_kelamin = '-';
    __fakultas = "";
    __prodi = "";

    # constructor
    def __init__(self, nim = "", nama = "", jenis_kelamin = "-", fakultas = "", prodi = ""):
        self.__nim = nim
        self.__nama = nama
        self.__jenis_kelamin
        self.__fakultas
        self.__prodi

    # penggunaan getter dan setter
    def get_nim(self):
        return self.__nim
    
    def set_nim(self, nim):
        self.__nim = nim

    def get_nama(self):
        return self.__nama
    
    def set_nama(self, nama):
        self.__nama = nama  

    def get_jenis_kelamin(self):
        return self.__jenis_kelamin
    
    def set_jenis_kelamin(self, jenis_kelamin):
        self.__jenis_kelamin = jenis_kelamin

    def get_fakultas(self):
        return self.__fakultas
    
    def set_fakultas(self, fakultas):
        self.__fakultas = fakultas      

    def get_prodi(self):
        return self.__prodi
    
    def set_prodi(self, prodi):
        self.__prodi = prodi  