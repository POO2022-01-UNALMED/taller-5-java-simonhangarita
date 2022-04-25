package zooAnimales;
import java.util.ArrayList;
public class Pez extends Animal{
  private static ArrayList<Pez> listado=new ArrayList<Pez>();
  public static int salmones=0;
  public static int bacalaos=0;
  private String colorEscamas;
  private int cantidadAletas;
  public Pez(String n,int e,String h,String g ,String colorPiel,int venenoso){
    this.setNombre(n);
    this.setEdad(e);
    this.setHabitat(h);
    this.setGenero(g);
    this.colorEscamas=colorPiel;
    this.cantidadAletas=venenoso;
    listado.add(this);
    Animal.setTotalAnimales(1+Animal.getTotalAnimales());
  }
  public Pez(){
    listado.add(this);
    Animal.setTotalAnimales(1+Animal.getTotalAnimales());
  }
  public static ArrayList<Pez> getListado(){
    return listado;
  }
  public String getColorEscamas(){
    return colorEscamas;
  }
  public int getCantidadAletas(){
    return cantidadAletas;
  }
  public static void setListado(ArrayList<Pez> l){
    listado=l;
  }
  public void setColorEscamas(String c){
    colorEscamas=c;
  }
  public void setCantidadAletas(int v){
    cantidadAletas=v;
  } 
  public static int cantidadPeces(){
    return Pez.listado.size();
  }
  public static Pez crearSalmon(String n,int e,String g ){
    salmones+=1;
    return new Pez(n,e,"oceano",g,"rojo",6);
  }
  public static Pez crearBacalao(String n,int e,String g){
    bacalaos+=1;
    return new Pez(n,e,"oceano",g,"gris",6);
  } 
  public String movimiento(){
    return "nadar";
  }
}