package assignment3;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
     
    public String ime;
    public String prezime;
    LocalDate datumRodjenja;
    public String mestoRodjenja;
    
    public Person (String ime, String prezime, LocalDate datumRodjenja, String mestoRodjenja){
        this.ime = ime;
        this.prezime = prezime;
        this.datumRodjenja = datumRodjenja;
        this.mestoRodjenja = mestoRodjenja;
    }
    @Override
    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd. MMM yyyy.");
        
        return (ime + " " + prezime + " " + datumRodjenja.format(formatter) + " " + mestoRodjenja );
    }
            
}
