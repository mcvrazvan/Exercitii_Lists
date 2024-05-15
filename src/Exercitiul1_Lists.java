
import java.util.ArrayList;
import java.util.Iterator;


public class Exercitiul1_Lists {
    public static void main(String[] args) {


//    Ex. 1
//            - Creati un ArrayList nou cu elemente de tip String pe care sa il numiti `companies`;
//- Adaugati 5 companii in lista;
//- Afisati elementele din lista;
//- Stergeti elementul de pe pozitia 1;
//- Stergeti elementul de de pozitia 2;
//- Redenumiti compania de pe pozitia 0;
//- Afisati elementele din lista;
//- Preluati elementul de pe ultimul index (preluati ultimul index folosind proprietatea
//            size) si afisati-l;
//- Treceti prin elementele din lista folosind un iterator si afisati-le.



//- Creati un ArrayList nou cu elemente de tip String pe care sa il numiti `companies`;
ArrayList<String> companies = new ArrayList<>(5);

//- Adaugati 5 companii in lista;
    for(int i=0; i<10; i++){
        companies.add(i, "Compania " + i);
    }

//- Afisati elementele din lista;
      //  System.out.println("companiile sunt: " + companies);


        //- Stergeti elementul de pe pozitia 1;
//- Stergeti elementul de de pozitia 2;
companies.remove(1);
companies.remove(2);


//- Redenumiti compania de pe pozitia 0;
companies.set(0, "CocaCola");


//- Afisati elementele din lista;
        System.out.println("companiile sunt: " + companies);

//- Preluati elementul de pe ultimul index (preluati ultimul index folosind proprietatea
//            size) si afisati-l;

        String ultimulElement = companies.get(companies.size()-1);
        System.out.println("ultimul element este " + ultimulElement);

//- Treceti prin elementele din lista folosind un iterator si afisati-le.
        //1
        for(String element : companies){
            System.out.println(element);
        }
        //2
        System.out.println("Metoda 2");
        Iterator<String> iterator = companies.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }















}







}
