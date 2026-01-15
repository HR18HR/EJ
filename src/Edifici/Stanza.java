package Edifici;

public class Stanza{
   private float lat1,lat2,altezza;

   Stanza(float lat1,float lat2,float altezza){
       this.lat1=lat1;
       this.lat2=lat2;
       this.altezza=altezza;
   }
   public float getSuperficie(){
       return (lat1+lat2)*2;
   }
   public float getVolume(){
       return altezza*(lat1*lat2);
   }

}
