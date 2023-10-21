import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Persona> personaList = new ArrayList<Persona>();
        personaList.add(new Persona("Jonathan","Jordi",1,1030));
        personaList.add(new Persona("Pepe","Perez",20,1080));
        personaList.add(new Persona("Pablo","Sanchez",30,1230));
        personaList.add(new Persona("Carita","Carita",40,654));

        for(int i = 0;i<personaList.size();i++){
            System.out.println(personaList.get(i).toString());


        }
        System.out.println("");
        for (Persona persona: personaList){
            System.out.println(persona);

        }
        personaList.forEach(System.out::println);


        }



    }


