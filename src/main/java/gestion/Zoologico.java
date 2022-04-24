package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;
public class Zoologico{
  private String nombre;
  private String ubicacion;
  private ArrayList<Zona> zonas;
  public Zoologico(String nombre,String ubicacion){
    this.nombre=nombre;
    this.ubicacion=ubicacion;
  }
  public Zoologico(){
  }
  public String getNombre(){
    return nombre;
  }
  public String getUbicacion(){
    return ubicacion;
  }
  public ArrayList<Zona> getZona(){
    return zonas;
  }
  public void setNombre(String n){
    this.nombre=n;
  }
  public void setUbicacion(String u){
    this.ubicacion=u;
  }
  public void setZonas(ArrayList<Zona> z){
    zonas=z;
  }
  public int cantidadTotalAnimales(){
    int x=0;
    if (zonas!=null){
      for(Zona e:zonas){
        x+=e.cantidadAnimales();
      }
    }
    return x;
  }
  public void agregarZonas(Zona z){
    zonas.add(z);
  }
}
  
