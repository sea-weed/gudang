package id.co.askrindo.gudang;

public class Petugas 
{
	private String nip;
    private String nama;
	private Date tgllahir;
	
	public Petugas(){
		System.out.println("Constructor tanpa argumen");
		}
	public Petugas(String nip, String nama, Date tgllahir){
		System.out.println("Constructor dengan argumen");
		this.nip = nip;
		this.nama = nama;
		this.tgllahir = tgllahir;
	}
	// getter dan setter
	public String getNip(){
		return nip;
	}

	public void setNip(String nip){
		this.nip = nip;
	}

	public String getNama(){
		return nama;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public Date getTglLahir(){
		return tgllahir;
	}

	public void setTglLahir(Date tgllahir){
		this.tgllahir = tgllahir;
	}
}
