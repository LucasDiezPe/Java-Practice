package a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main (String[] args){
    HashSet<String> miSet= new HashSet<String>();
    miSet.add("uno");
    miSet.add("dos");
    miSet.add("tres");
        System.out.println(miSet.size()+" "+miSet.toString());

        TreeSet<String> miSet2= new TreeSet<String>();
        miSet2.add("1");
        miSet2.add("2");
        miSet2.add("3");
        System.out.println(miSet2.size()+" "+miSet2.toString());

        HashSet<Persona> Personas= new HashSet<Persona>();
        Persona A = new Persona();
        A.setNombre("Lucas");
        A.setDNI("34798539");
        Personas.add(A);
        Persona B = new Persona();
        B.setNombre("Nicole");
        B.setDNI("38391111");
        Personas.add(B);
        System.out.println(Personas.size()+" "+Personas.toString());
        System.out.println(A.getNombre()+" & "+B.getNombre());

        ArrayList<String>ListaDeNombres=new ArrayList<>();
        ListaDeNombres.add("Doha");
        ListaDeNombres.add("Luna");
        ListaDeNombres.add("Gouda");
        ListaDeNombres.add("Rocco");
        System.out.println(ListaDeNombres.size()+" "+ListaDeNombres.toString());
        ListaDeNombres.add("Pipa");
        ListaDeNombres.add("Pepa");
        ListaDeNombres.add("Maluca");
        ListaDeNombres.add("Otto");
        System.out.println("El tamaño de la lista de nombres es: "+ListaDeNombres.size()+" elementos y el elemento 5 de la lista es: "+ListaDeNombres.get(4));
        System.out.println("los nombres de la lista son: "+ListaDeNombres.toString());
        ListaDeNombres.remove(7);
        System.out.println("los nombres de la lista son: "+ListaDeNombres.toString());

        //<------------------------hashmap--------------------------->
        System.out.println("<------------------------hashmap--------------------------->");
        HashMap<String,Persona> mapaPersonas = new HashMap<String,Persona>();
        mapaPersonas.put("uno",A);
        mapaPersonas.put("dos",B);
        System.out.println(mapaPersonas.entrySet());
        System.out.println(mapaPersonas.get("uno"));
        System.out.println(mapaPersonas.get("uno").getNombre());
        System.out.println("En el hash :"+mapaPersonas.get("dos")+" se encuentra el objeto persona cullos atributos son Nombre:"+mapaPersonas.get("dos").getNombre()+" DNI: "+mapaPersonas.get("dos").getDNI());
        System.out.println();
        System.out.println("<----------------------hashcode-------------->");
        Persona Lucas = mapaPersonas.get("uno");
        Persona Nicole = mapaPersonas.get("dos");
        System.out.println(Lucas.getNombre()+" "+Lucas.getDNI());
        System.out.println(Nicole.getNombre()+" "+Nicole.getDNI());








    };
}
