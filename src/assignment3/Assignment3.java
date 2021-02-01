package assignment3;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Assignment3 {
    public static void main(String[] args) {
   
        String text = "John.Davidson/05051988/Belgrade Michael.Barton/01011968/Krakov Ivan.Perkinson/23051986/Moscow";
        LocalDate datum = null;
        ArrayList listaPodataka = new ArrayList();

        String [] niz = text.split("[ ./]+");
         for (int i = 0; i<niz.length; i=i+4) {
            
             String ime = niz[i];
             String prezime = niz[i+1];
             String datumRodjenja = niz[i+2];
             String mestoRodjenja = niz[i+3];
             try {
                 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
                 datum = LocalDate.parse(datumRodjenja, formatter);
                 }    
             catch (Exception exc){
                  System.out.println(exc);
             }       
             Person p = new Person (ime, prezime, datum, mestoRodjenja);
             listaPodataka.add(p);
         }
             for(Object l: listaPodataka){
                 System.out.println(l.toString());
             }
    }

   
        
}
    

   

    
    
