
package Pdf_Factura;

import Logic.Factura;
import Logic.Service;
import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import java.io.*;

public class pdf_Factura {
    
    public static final String DEST = "factura.pdf";
  
 /* public static void main(String args[]) throws IOException {
    createPdf(DEST);
  }*/
  //Ahora se genera numeros de factura con Strings
   public static void createPdf(String dest, String idFact) throws IOException, Exception {
        PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA);
        PdfWriter writer = new PdfWriter(dest);
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf, PageSize.A4.rotate());
        document.setMargins(20, 20, 20, 20);

        ImageData data = ImageDataFactory.create("logo.png");        
        Image img = new Image(data); 
        document.add(img);
        
        document.add(new Paragraph(""));
        document.add(new Paragraph("GRUPO T1").setFont(font).setBold().setFontSize(20f));

        Table table = new Table(5);
        Cell c; 
        Color bkg = ColorConstants.RED;
        Color frg= ColorConstants.WHITE;
        c= new Cell(); c.add(new Paragraph("Cantidad")).setBackgroundColor(bkg).setFontColor(frg); 
        table.addHeaderCell(c);
        c= new Cell(); c.add(new Paragraph("Codigo")).setBackgroundColor(bkg).setFontColor(frg);
        table.addHeaderCell(c);     
        c= new Cell(); c.add(new Paragraph("Descripcion")).setBackgroundColor(bkg).setFontColor(frg);
        table.addHeaderCell(c); 
        c= new Cell(); c.add(new Paragraph("Precio")).setBackgroundColor(bkg).setFontColor(frg);
        table.addHeaderCell(c); 
        c= new Cell(); c.add(new Paragraph("Total")).setBackgroundColor(bkg).setFontColor(frg);
        table.addHeaderCell(c);                    
        Factura facturaEncontrada = Service.instance().buscarIDFactura(idFact);
        if (facturaEncontrada == null) {
           Exception ee = new Exception();
           throw ee;
       }
        String Cantidad;
        String Codigo;
        String Descripcion;
        String Precio;
        String Total;
        String IVA = String.valueOf(facturaEncontrada.getIVA());
        String TotalIVA = String.valueOf(facturaEncontrada.getTotalIVA());
        Total = String.valueOf(facturaEncontrada.getTotal());
        float subTotalProducto = 0;
        String subTotalStr;
        int tam = facturaEncontrada.getList().size();
        for(int i=0;i<tam;i++){
            Cantidad = String.valueOf(facturaEncontrada.getList().get(i).getCantidad());
            Codigo = facturaEncontrada.getList().get(i).getCodigo();
            Descripcion = facturaEncontrada.getList().get(i).getNombre();
            Precio = String.valueOf(facturaEncontrada.getList().get(i).getPrecio());
            
            //Se agrega los valores obtenidos al pdf
            subTotalProducto = ((facturaEncontrada.getList().get(i).getCantidad()) * (facturaEncontrada.getList().get(i).getPrecio()));
            subTotalStr = String.valueOf(subTotalProducto);
            table.addHeaderCell(Cantidad);
            table.addHeaderCell(Codigo);
            table.addHeaderCell(Descripcion);                          
            table.addHeaderCell(Precio);     
            table.addHeaderCell(subTotalStr);
        }
        c= new Cell(1,4);  c.add(new Paragraph("SubTotal")).setBackgroundColor(bkg).setFontColor(frg).setTextAlignment(TextAlignment.RIGHT);
        table.addHeaderCell(c);                    
        c= new Cell();  c.add(new Paragraph(Total)).setBackgroundColor(bkg).setFontColor(frg);
        table.addHeaderCell(c);    
        c= new Cell(1,4);  c.add(new Paragraph("IVA")).setBackgroundColor(bkg).setFontColor(frg).setTextAlignment(TextAlignment.RIGHT);
        table.addHeaderCell(c);                    
        c= new Cell();  c.add(new Paragraph(IVA)).setBackgroundColor(bkg).setFontColor(frg);
        table.addHeaderCell(c); 
        c= new Cell(1,4);  c.add(new Paragraph("Total")).setBackgroundColor(bkg).setFontColor(frg).setTextAlignment(TextAlignment.RIGHT);
        table.addHeaderCell(c);                    
        c= new Cell();  c.add(new Paragraph(TotalIVA)).setBackgroundColor(bkg).setFontColor(frg);
        table.addHeaderCell(c);  
        document.add(table);
        document.close();
    }
    
}
