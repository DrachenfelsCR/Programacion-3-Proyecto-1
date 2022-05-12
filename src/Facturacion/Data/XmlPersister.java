/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturacion.Data;

import Logic.Factura;
import Logic.Service;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XmlPersister {
    private String path;
    private String pathFact = "";  

  
    private static String numeracion = String.valueOf(Service.instance().getSerieFactura());
    private static XmlPersister theInstance;
    public static XmlPersister instance(){
        if (theInstance==null){ 
            theInstance=new XmlPersister("facturacion.xml");
        }
        return theInstance;
    }
    
    public XmlPersister(String p) {
            path=p;       
    }  
    
      public String getPathFact() {
        return pathFact;
    }

    public void setPathFact(String pathFact) {
        this.pathFact = pathFact;
    }
    
    public Data load() throws Exception{
        JAXBContext jaxbContext = JAXBContext.newInstance(Data.class);  
        FileInputStream is = new FileInputStream(path);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();  
        Data result = (Data) unmarshaller.unmarshal(is);
        is.close();
        return result;        
    }
    
    public void store(Data d)throws Exception{
        JAXBContext jaxbContext = JAXBContext.newInstance(Data.class);  
        FileOutputStream os = new FileOutputStream(path);
        Marshaller marshaller = jaxbContext.createMarshaller();  
        marshaller.marshal(d, os);
        os.flush();
        os.close();     
    } 
     public void storeFactura(Factura f, String p)throws Exception{
        JAXBContext jaxbContext = JAXBContext.newInstance(Logic.Factura.class);  
        pathFact = p + ".xml";
        FileOutputStream os = new FileOutputStream(pathFact);
        Marshaller marshaller = jaxbContext.createMarshaller();  
        marshaller.marshal(f, os);
        os.flush();
        os.close();     
    } 
}