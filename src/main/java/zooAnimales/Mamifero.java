package zooAnimales;
import java.util.ArrayList;
public class Mamifero extends Animal{
  private static ArrayList<Mamifero> listado=new ArrayList<Mamifero>();
  public static int leones=0;
  public static int caballos=0;
  private boolean pelaje;
  private int patas;
  public Mamifero(String n,int e,String h,String g ,boolean colorPiel,int venenoso){
    this.setNombre(n);
    this.setEdad(e);
    this.setHabitat(h);
    this.setGenero(g);
    this.pelaje=colorPiel;
    this.patas=venenoso;
    listado.add(this);
    Animal.setTotalAnimales(1+Animal.getTotalAnimales());
  }
  public Mamifero(){
    listado.add(this);
    Animal.setTotalAnimales(1+Animal.getTotalAnimales());
  }
  public static ArrayList<Mamifero> getListado(){
    return listado;
  }
  public boolean getPelaje(){
    return pelaje;
  }
  public int getPatas(){
    return patas;
  }
  public static void setListado(ArrayList<Mamifero> l){
    listado=l;
  }
  public void setPelaje(boolean c){
    pelaje=c;
  }
  public void setPatas(int v){
    patas=v;
  } 
  public static int cantidadMamiferos(){
    return Mamifero.listado.size();
  }
  public static Mamifero crearCaballo(String n,int e,String g ){
    caballos+=1;
    return new Mamifero(n,e,"pradera",g,true,4);
  }
  public static Mamifero crearLeon(String n,int e,String g){
    leones+=1;
    return new Mamifero(n,e,"selva",g,true,4);
  } 
  public boolean isPelaje(){
    return pelaje;
  }
}