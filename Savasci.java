public class Savasci {
      private Silah silah ;
      private String isim ;
      public double can ;
      

      public Savasci()
      {
            this.isim = "null";
            this.can = 100;
      }

      public Savasci(Silah newSilah, String newIsim)
      {
            this.silah = newSilah ;
            this.isim = newIsim ;
            this.can = 100 ;
      }

      public double saldir(double hamleGucu)
      {     
            System.out.println("[" + this.isim + "] " + this.silah.ses() + " Saldiri Gucu: " + this.silah.saldir(hamleGucu));
            return this.silah.saldir(hamleGucu) ;
      }

      public void zararGor(double zarar)
      {
           can = can - zarar ;
           if(can>0)
                  System.out.println("["+this.isim+"] can kaybediyor! Kalan can: " + can);
            else
                  System.out.println("["+this.isim+"] yenildi!");
           
      }

      public String toString()
      {
            return "[" + this.isim +"]" + " Kalan can: " + this.can + " Silah: " + this.silah ; 
      }

}
