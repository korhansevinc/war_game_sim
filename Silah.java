public class Silah {
      private double saldiriGucu ;
      private String isim ;
      

      public Silah()
      {
            this.saldiriGucu = 0 ;
            this.isim = "null";
      }
      public Silah(double newSaldiriGucu , String newIsim)
      {
            this.saldiriGucu = newSaldiriGucu ;
            this.isim = newIsim ;
      }

      public double saldir(double hamleGucu)
      {
            return this.saldiriGucu* hamleGucu ;
      }

      public double getSaldiriGucu()
      {
            return this.saldiriGucu ;
      }
      public String getIsim()
      {
            return this.isim ;
      }
      public void bilgi()
      {
            System.out.println("Tanimlanmayan Silah:");
            System.out.println("Isim: " + this.isim);
            System.out.println("Saldiri Gucu: " + this.saldiriGucu);
      }

      public String toString()
      {
          return ("[Tanimlanmayan Silah] Saldiri Gucu: " + saldiriGucu);  
      }

      public String ses()
      {
            return this.isim + " gorundu!";
      }

    
}
