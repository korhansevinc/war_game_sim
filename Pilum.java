public class Pilum extends Silah{
      private double pilumBonusu ;

      public Pilum()
      {
            super();
            this.pilumBonusu = 1.10 ;
      }
      public Pilum(double newSaldiriGucu, String newIsim)
      {
            super(newSaldiriGucu, newIsim);
            this.pilumBonusu = 1.10 ;
      }

      public double saldir(double hamleGucu)
      {
            return super.saldir(hamleGucu) * pilumBonusu ;
      }

      public void bilgi()
      {
            System.out.println("Pilum:");
            System.out.println("Isim: " + this.getIsim());
            System.out.println("Saldiri Gucu: " + this.getSaldiriGucu());
      }

      public String toString()
      {
          return ("[Pilum] Saldiri Gucu: " + this.getSaldiriGucu());  
      }

      public String ses()
      {
            return this.getIsim()+ " saplandi!";
      }
}
