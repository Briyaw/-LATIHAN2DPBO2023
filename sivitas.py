# Kelas SivitasAkademik sebagai induk
class SivitasAkademik:
    
    # access modifier private
    __asal_universitas = ""
    __email_edu = ""

    # constructor
    def __init__(self, asal_universitas = "", email_edu = ""):
        self.__asal_universitas = asal_universitas
        self.__email_edu = email_edu

    def get_asal_universitas(self):
        return self.__asal_universitas
    
    def set_asal_universitas(self, asal_universitas):
        self.__asal_universitas = asal_universitas

    def get_email_edu(self):
        return self.__email_edu
    
    def set_email_edu(self, email_edu):
        self.__email_edu = email_edu



