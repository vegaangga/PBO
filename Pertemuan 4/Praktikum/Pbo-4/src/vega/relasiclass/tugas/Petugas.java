
package vega.relasiclass.tugas;

public class Petugas {
    public String id;
    public String namaPet;

    public Petugas(String id, String namaPet) {
        this.id = id;
        this.namaPet = namaPet;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamaPet() {
        return namaPet;
    }

    public void setNamaPet(String namaPet) {
        this.namaPet = namaPet;
    }

    
    
    public String info (){
        String info = "";
        info += "Id Petugas: " + id + "\n";
        info += "Nama Petugas: " + namaPet + "\n";
        return info;
    }
    
}
