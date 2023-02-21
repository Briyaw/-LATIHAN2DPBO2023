//Kelas Mahasiswa sebagai induk kelas Human
class Human extends Mahasiswa
{   
    //private
    private String nik;
    private String nama;
    private String jenis_kelamin;
    //public
    public Human()
    {
        this.nik = "";
        this.nama = "";
        this.jenis_kelamin = "";
    }
    //getter dan setter
    public String getnik()
    {
        return this.nik;
    }

    public void setnik(String nik)
    {
        this.nik = nik;
    }
        
    public String getnama()
    {
        return this.nama;
    }
    
    public void setnama(String nama)
    {
        this.nama = nama;
    }
    public String getjenis_kelamin()
    {
        return this.jenis_kelamin;
    }
    
    public void setjenis_kelamin(String jenis_kelamin)
    {
        this.jenis_kelamin = jenis_kelamin;
    }
}