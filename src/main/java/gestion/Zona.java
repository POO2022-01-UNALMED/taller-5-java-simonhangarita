package gestion;
import zooAnimales.Animal;
import java.util.ArrayList;
public class Zona{
  private String nombre;
  private Zoologico zoo;
  private ArrayList<Animal> animales;
  public Zona(String n,Zoologico z){
    nombre=n;
    zoo=z;
  }
  public Zona(){
    
  }
  public String getNombre(){
    return nombre;
  }
  public Zoologico getZoo(){
    return zoo;
  }
  public ArrayList<Animal> getAnimales(){
    return animales;
  }
  public void setNombre(String n){
    nombre=n;
  }
  public void setZoo(Zoologico z){
    zoo=z;
  }
  public void setAnimales(ArrayList<Animal> a){
    animales=a;
  }
  public void agregarAnimales(Animal a){
    animales.add(a);
  }
  public int cantidadAnimales(){
    int x=0;
    if (animales!=null){
      for(Animal e:animales){
        x+=1;
      }
    }
    return x;
  }
  
  
}