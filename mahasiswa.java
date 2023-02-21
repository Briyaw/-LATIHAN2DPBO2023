//Kelas SivitasAkademik menjadi induk Mahasiswa
class Mahasiswa extends SivitasAkademik
{
    //private
    private String nim;
    private String nama;
    private String jenis_kelamin;
    private String fakultas;
    private String prodi;

    //public
    public Mahasiswa()
    {
        this.nim = "";
        this.nama = "";
        this.jenis_kelamin = "";
        this.fakultas = "";
        this.prodi = "";
    }

    //getter setter
    public String getnim()
    {
        return this.nim;
    }

    public void setnim(String nim)
    {
        this.nim = nim;
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
    public String getfakultas()
    {
        return this.fakultas;
    }
    
    public void setfakultas(String fakultas)
    {
        this.fakultas = fakultas;
    }
    public String getprodi()
    {
        return this.prodi;
    }
    
    public void setprodi(String prodi)
    {
        this.prodi = prodi;
    }
}