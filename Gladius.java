public class Gladius extends Kilic {
      private double gladiusBonusu = 1.30 ;

      public Gladius()
      {
            super();
            this.gladiusBonusu = 1.30 ;
            
      }
      public Gladius(double newSaldiriGucu , String newIsim)
      {
            super(newSaldiriGucu, newIsim) ;
            this.gladiusBonusu = 1.30 ;
      }

      public double saldir(double hamleGucu)
      {
            return super.saldir(hamleGucu) * gladiusBonusu ;
      }

      public double getGladiusBonusu()
      {
            return this.gladiusBonusu ;
      }

      public void bilgi()
      {
            System.out.println("Gladius:");
            System.out.println("Isim: " + this.getIsim());
            System.out.println("Saldiri Gucu: " + this.getSaldiriGucu());
      }

      public String toString()
      {
          return ("[Gladius] Saldiri Gucu: " + this.getSaldiriGucu());  
      }

      public String ses()
      {
            return this.getIsim() + " savruluyor!";
      }

}
