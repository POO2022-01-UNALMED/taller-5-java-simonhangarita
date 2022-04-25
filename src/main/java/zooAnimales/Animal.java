package zooAnimales;
import gestion.Zona;
public class Animal{
  private static int totalAnimales;
  private String nombre;
  private int edad;
  private String habitat;
  private String genero;
  private Zona zona;
  public Animal(String n,int e,String h,String g){
    nombre=n;
    edad=e;
    habitat=h;
    genero=g;
    totalAnimales+=1;
  }
  public Animal(){
    totalAnimales+=1;
  }
  public static int getTotalAnimales(){
    return totalAnimales;
  }
  public String getNombre(){
    return nombre;
  }
  public int getEdad(){
    return edad;
  }
  public String getHabitat(){
    return habitat;
  }
  public String getGenero(){
    return genero;
  }
  public Zona getZona(){
    return zona;
  }
  public static void setTotalAnimales(int i){
    totalAnimales=i;
  }
  public void setNombre(String n){
    nombre=n;
  }
  public void setEdad(int e){
    edad=e;
  }
  public void setHabitat(String h){
    habitat=h;
  }
  public void setGenero(String g){
    genero=g;
  }
  public void setZona(Zona z){
    zona=z;
  }
  public String movimiento(){
    return "desplazarse";
  }
  public static String totalPorTipo(){
    return "Mamiferos: "+Mamifero.cantidadMamiferos()+"\nAves: "+Ave.cantidadAves()+"\nReptiles: "+ Reptil.cantidadReptiles()+"\nPeces: "+Pez.cantidadPeces()+"\nAnfibios: "+Anfibio.cantidadAnfibios();
  }
  public String toString(){
    if (zona==null){
           return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero;
    }
    else{
      return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero+", la zona donde me ubico es "+zona+", en el zoo "+zona.getZoo() ;
    }
      
  }
}