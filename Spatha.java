public class Spatha extends Kilic {
      private double spathaBonusu ;

      public Spatha()
      {
            super();
            this.spathaBonusu = 1.45 ;
      }

      public Spatha(double newSaldiriGucu, String newIsim)
      {
            super(newSaldiriGucu,newIsim);
            this.spathaBonusu = 1.45 ;
      }

      public double getSpathaBonusu()
      {
            return this.getSpathaBonusu();
      }

      public double saldir(double hamleGucu)
      {
            return super.saldir(hamleGucu) * spathaBonusu;
      }

      public void bilgi()
      {
            System.out.println("Spatha:");
            System.out.println("Isim: " + this.getIsim());
            System.out.println("Saldiri Gucu: " + this.getSaldiriGucu());
      }

      public String toString()
      {
          return ("[Spatha] Saldiri Gucu: " + this.getSaldiriGucu());  
      }

      public String ses()
      {
            return this.getIsim() + " saldiriyor!";
      }
}
