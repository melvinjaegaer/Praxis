public class patient {
    String name,nachname;
    patient Nachfolger;
    patient patient;


    public void setName(String pName) {
      name=  pName;
    }
    public String getName() {
        return name;
    }
    public void setNachname(String pName) {
        nachname=  pName;
    }
    public String getNachnameame() {
        return nachname;
    }
    public void setNachfolger( patient pNachfolger ){
        Nachfolger =pNachfolger;
        while(Nachfolger==null){

            patient.setName(name);
            patient.setNachname(nachname);
        }
        while(Nachfolger !=null){
            Nachfolger.setNachfolger(patient.Nachfolger);
        }
    }
    public void getNachfolger(  ){

       
    }




















}