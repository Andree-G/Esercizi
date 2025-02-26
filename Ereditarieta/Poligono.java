package Ereditarieta;

public class Poligono
{
   private double base;
   private double altezza;




   public Poligono (double base, double altezza)
   {
       this.base = base;
       this.altezza = altezza;
   }


   public double getBase()
   {
       return base;
   }
   public void setBase(double base)
   {
       this.base = base;
   }


   public double getAltezza()
   {
       return altezza;
   }
   public void setAltezza(double altezza)
   {
       this.altezza = altezza;
   }


   public double getPerimetroQuadrato()
   {
       return base * 4;
   }


   public double getAreaQuadrato()
   {
       return base * base;
   }

   public double getPerimetroRettangolo()
   {
       return 2 * (base + altezza);
   }


   public double getAreaRettangolo()
   {
       return base * altezza;
   }



   @Override
   public String toString()
   {
        return "Base: " + base + " Altezza: " + altezza + " Perimetro Quadrato: " + getPerimetroQuadrato() + "Perimetro rettangolo: " + getPerimetroRettangolo() +  " Area Quadrato: " + getAreaQuadrato() + "Area Rettangolo: " + getAreaRettangolo();
    } 

    public void mostraDettagli()
    {
        System.out.println("Base: " + base + " Altezza: " + altezza + " Perimetro Quadrato: " + getPerimetroQuadrato() + " Perimetro rettangolo: " + getPerimetroRettangolo() +  " Area Quadrato: " + getAreaQuadrato() + " Area Rettangolo: " + getAreaRettangolo());
}

}
