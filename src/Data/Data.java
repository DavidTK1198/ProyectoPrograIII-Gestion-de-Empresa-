/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Logic.Cliente;
import Logic.Empresa;
import Logic.Factura;
import Logic.Producto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD)
public class Data {

      public Map<String, Producto> productos;
      private Map<String,Factura> facturas;
      private Map<String, Cliente> clientes1;
      private Empresa Emp;

    public Data() {
        clientes1 = new HashMap<>();
        productos = new HashMap<>();
        facturas = new HashMap<>();
        Emp=Logic.Empresa.getInstance();
        
        
    }

    public List<Cliente> getClientes() {
        List<Cliente> ls = new ArrayList<>();
        for (Map.Entry<String, Cliente> entry : clientes1.entrySet()) {
            Cliente ayudante = entry.getValue();
            ls.add(ayudante);
        }
        return ls;
    }

    public void addProduct(Producto p) throws Exception {
        Producto Product = productos.get(p.getCodigo());
        if (Product == null) {
            productos.put(p.getCodigo(), p);
            
        } else {
            throw new Exception("El producto ya existe");
        }
    }
    
    
    public void addClient(Cliente p) throws Exception {
        Cliente cl = clientes1.get(p.getCedula());
        if (cl == null) {
            clientes1.put(p.getCedula(), p);
        } else {
            throw new Exception("El producto ya existe");
        }
    }
    public void addFactura(Factura p) throws Exception{
        
          Factura fa = facturas.get(p.getNumeroFactura());
        if (fa == null) {
            facturas.put(p.getNumeroFactura(), p);
        } else {
            throw new Exception("La Factura ya existe");
        }
    }

       public List<Factura> getFacturas() {
        List<Factura> ls = new ArrayList<>();
        for (Map.Entry<String, Factura> entry : facturas.entrySet()) {
            Factura ayudante = entry.getValue();
            ls.add(ayudante);
        }
        return ls;
    }
       
    public List<Producto> getProductos() {
        List<Producto> ls = new ArrayList<>();
        for (Map.Entry<String, Producto> entry : productos.entrySet()) {
            Producto ayudante = entry.getValue();
            ls.add(ayudante);
        }
        return ls;
    }
    
    public void removeElement(Producto p){//revisar
        if(productos.size()==1){
             productos = new HashMap<>();
        }else{
            productos.remove(p.getCodigo());
        }
     
    }
    public void removeCliente(Cliente c){
        if(clientes1.size() == 1){
            clientes1 = new HashMap<>();
        }else{
           this.clientes1.remove(c.getCedula());
        }
       
    }
    public void replaceCliente(String ced,Cliente nuevo){
        Cliente c = this.clientes1.get(ced);
        c.setApellidos(nuevo.getApellidos());
        c.setCorreoE(nuevo.getCorreoE());
        c.setNombre(nuevo.getNombre());
    }
    public void replaceProducto(String key,Producto nuevo){
        Producto p = this.productos.get(key);
        p.setDescripcion(nuevo.getDescripcion());
        p.setNombre(nuevo.getNombreE());
        p.setPrecioUnitario(nuevo.getPrecioUnitario());
        p.calculoIV();
        
    }
    
   public Producto getProducto(String p) throws Exception{
        Producto prod=productos.get(p);
        if(prod==null){
            throw new Exception("No se encontro al elemento");
        }
        return prod;
    }
   public Cliente getCliente(String ced)throws Exception{
       Cliente client = this.clientes1.get(ced);
       if(client == null){
           throw new Exception("Cedula no encontrada");
       }
       return client;
   }

    public Empresa getEmp() {
        return Emp;
    }
  

}






















































