public class Kilic extends Silah {
      private double kilicBonusu ;

      public Kilic()
      {
            super();
            this.kilicBonusu = 1.25 ;
      }
      public Kilic(double newSaldiriGucu , String newIsim)
      {
            super(newSaldiriGucu,newIsim);
            this.kilicBonusu = 1.25 ;
      }

      public double saldir(double hamleGucu)
      {
            return super.saldir(hamleGucu) * kilicBonusu ;
      }
      
      public double getKilicBonusu()
      {
            return this.kilicBonusu ;
      }

      public void bilgi()
      {
            System.out.println("Tanimsiz Kilic:");
            System.out.println("Isim: " + this.getIsim());
            System.out.println("Saldiri Gucu: " + this.getSaldiriGucu());
      }

      public String toString()
      {
          return ("[Tanimlanmayan Kilic] Saldiri Gucu: " + this.getSaldiriGucu());  
      }

      public String ses()
      {
            return this.getIsim() + " cekildi!";
      }
}
