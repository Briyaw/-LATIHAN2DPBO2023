# menghubungkan antara main dengan kelas-kelas
from human import Human

s_data = Human()#s_data sebagai temporary

#menginput 1 data mahasiswa -> method 1
print("Input Data Mahasiswa ke-1")
s_data.set_nama("Muhammad Febriansyah Firdaus")
s_data.set_nik("32720791239392")
s_data.set_nim("2005202")
s_data.set_prodi("Ilkom")
s_data.set_fakultas("FPMIPA")
s_data.set_asal_universitas("UPI")
s_data.set_email_edu("febrifebri@gmail.com")
s_data.set_jenis_kelamin("Laki-Laki")

#menampilkan 1 data mahasiswa -> method 2   
print("Jumlah Data Mahasiswa : 1")
print("Menampilkan Data Mahasiswa")
print("1. Nama", s_data.get_nama())
print("   NIM : ", s_data.get_nim())
print("   NIK : ", s_data.get_nik())
print("   Jenis Kelamin : ", s_data.get_jenis_kelamin())
print("   Prodi : ", s_data.get_prodi())
print("   Fakultas : ", s_data.get_fakultas())
print("   Asal Unniversitas : ", s_data.get_asal_universitas())
print("   Email : ", s_data.get_email_edu())