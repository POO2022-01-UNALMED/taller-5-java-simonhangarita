package zooAnimales;
import java.util.ArrayList;
public class Reptil extends Animal{
  private static ArrayList<Reptil> listado=new ArrayList<Reptil>();
  public static int iguanas=0;
  public static int serpientes=0;
  private String colorEscamas;
  private int largoCola;
  public Reptil(String n,int e,String h,String g ,String colorPiel,int venenoso){
    this.setNombre(n);
    this.setEdad(e);
    this.setHabitat(h);
    this.setGenero(g);
    this.colorEscamas=colorPiel;
    this.largoCola=venenoso;
    listado.add(this);
    Animal.setTotalAnimales(1+Animal.getTotalAnimales());
  }
  public Reptil(){
    listado.add(this);
    Animal.setTotalAnimales(1+Animal.getTotalAnimales());
  }
  public static ArrayList<Reptil> getListado(){
    return listado;
  }
  public String getColorEscamas(){
    return colorEscamas;
  }
  public int getLargoCola(){
    return largoCola;
  }
  public static void setListado(ArrayList<Reptil> l){
    listado=l;
  }
  public void setColorEscamas(String c){
    colorEscamas=c;
  }
  public void setLargoCola(int v){
    largoCola=v;
  } 
  public static int cantidadReptiles(){
    return Reptil.listado.size();
  }
  public static Reptil crearIguana(String n,int e,String g ){
    iguanas+=1;
    return new Reptil(n,e,"humedal",g,"verde",3);
  }
  public static Reptil crearSerpiente(String n,int e,String g){
    serpientes+=1;
    return new Reptil(n,e,"jungla",g,"blanco",1);
  } 
  public String movimiento(){
    return "reptar";
  }
}