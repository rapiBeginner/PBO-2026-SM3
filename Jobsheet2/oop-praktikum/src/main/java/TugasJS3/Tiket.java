package TugasJS3;
public class Tiket {
    private String judulFilm;
    private double hargaDasar;
    private boolean  statusPembayaran;
    
    Tiket(String judulFilm, double hargaDasar){
        if(hargaDasar<0){
            this.hargaDasar=35000;
        }else{
            this.hargaDasar=hargaDasar;
        }
        this.judulFilm=judulFilm;
        statusPembayaran=false;
    }
    
    public void lakukanPembayaran(){
        statusPembayaran=true;
    }
    
    public boolean IsStatusPembayaran(){
        return statusPembayaran;
    }
    
    public String getJudulFilm(){
        return judulFilm;
    }
    
    public double getHargaDasar(){
        return hargaDasar;
    } 
}
