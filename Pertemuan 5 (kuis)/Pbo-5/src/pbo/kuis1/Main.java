
package pbo.kuis1;

public class Main {
    public static void main(String[] args) {
        Pria anak = new Pria ();
        anak.setNama("Dimas");
        anak.setUmur(10);
        Wanita istri = new Wanita (20,"Hawa",true,anak);
        Pria pria = new Pria (22,"Ibra",true,istri);
       
        System.out.println(anak.info());
        System.out.println(pria.info());
        System.out.println(istri.info());
    }
}
