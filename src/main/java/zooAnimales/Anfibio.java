package zooAnimales;
import java.util.ArrayList;
public class Anfibio extends Animal{
  private static ArrayList<Anfibio> listado=new ArrayList<Anfibio>();
  public static int ranas=0;
  public static int salamandras=0;
  private String colorPiel;
  private boolean venenoso;
  public Anfibio(String n,int e,String h,String g ,String colorPiel,boolean venenoso){
    this.setNombre(n);
    this.setEdad(e);
    this.setHabitat(h);
    this.setGenero(g);
    this.colorPiel=colorPiel;
    this.venenoso=venenoso;
    listado.add(this);
    Animal.setTotalAnimales(1+Animal.getTotalAnimales());
  }
  public Anfibio(){
    listado.add(this);
    Animal.setTotalAnimales(1+Animal.getTotalAnimales());
  }
  public static ArrayList<Anfibio> getListado(){
    return listado;
  }
  public String getColorPiel(){
    return colorPiel;
  }
  public boolean getVenenoso(){
    return venenoso;
  }
  public static void setListado(ArrayList<Anfibio> l){
    listado=l;
  }
  public void setColorPiel(String c){
    colorPiel=c;
  }
  public void setVenenoso(boolean v){
    venenoso=v;
  } 
  public static int cantidadAnfibios(){
    return Anfibio.listado.size();
  }
  public static Anfibio crearRana(String n,int e,String g ){
    ranas+=1;
    return new Anfibio(n,e,"selva",g,"rojo",true);
  }
  public static Anfibio crearSalamandra(String n,int e,String g){
    salamandras+=1;
    return new Anfibio(n,e,"selva",g,"negro y amarillo",false);
  } 
  public String movimiento(){
    return "saltar";
  }
  public boolean isVenenoso(){
    return venenoso;
  }
}