//kelas SivitasAkademik menjadi induk dari semua kelas yang ada
class SivitasAkademik
{
    //private
    private String asal_universitas;
    private String email_edu;
    //public
    public SivitasAkademik()
    {
        this.asal_universitas = "";
        this.email_edu = "";
    }
    public String getasal_universitas()
    {
        return this.asal_universitas;
    }
    
    public void setasal_universitas(String asal_universitas)
    {
        this.asal_universitas = asal_universitas;
    }
        
    public String getemail_edu()
    {
        return this.email_edu;
    }
    
    public void setemail_edu(String email_edu)
    {
        this.email_edu = email_edu;
    }
}