package zooAnimales;
import java.util.ArrayList;
public class Ave extends Animal{
  private static ArrayList<Ave> listado=new ArrayList<Ave>();
  public static int halcones=0;
  public static int aguilas=0;
  private String colorPlumas;
  public Ave(String n,int e,String h,String g,String colorPiel){
    this.setNombre(n);
    this.setEdad(e);
    this.setHabitat(h);
    this.setGenero(g);
    this.colorPlumas=colorPiel;
    listado.add(this);
    Animal.setTotalAnimales(1+Animal.getTotalAnimales());
  }
  public Ave(){
    listado.add(this);
    Animal.setTotalAnimales(1+Animal.getTotalAnimales());
  }
  public static ArrayList<Ave> getListado(){
    return listado;
  }
  public String getColorPlumas(){
    return colorPlumas;
  }
  public static void setListado(ArrayList<Ave> l){
    listado=l;
  }
  public void setColorPlumas(String c){
    colorPlumas=c;
  }
  public static int cantidadAves(){
    return (int)Ave.listado.size();
  }
  public static Ave crearHalcon(String n,int e,String g){
    halcones+=1;
    return new Ave(n,e,"montanas",g,"cafe glorioso");
  }
  public static Ave crearAguila(String n,int e,String g){
    aguilas+=1;
    return new Ave(n,e,"montanas",g,"blanco y amarillo");
  } 
  public String movimiento(){
    return "volar";
  }
}