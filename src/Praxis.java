public class Praxis {
   patient erster;
   
   public void setErster(patient pPatient){
    
      erster=pPatient;
      while(erster==null){
         patient patient = erster;

      }
      while(erster!=null){erster.setNachfolger(pPatient.Nachfolger);

   }
   
   
}}