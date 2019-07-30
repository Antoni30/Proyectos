
package control;

import com.barcodelib.barcode.QRCode;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import modelo.Boleto;
import vista.JFBoleto;


public class ControladorCompra implements ActionListener {
    JFBoleto b;
    Timer timer;
    int udm=0,resol=72,rot=0;
    float mi=0.000f,md=0.000f,ms=0.000f,min=0.000f,tam=5.00f;
    public ControladorCompra(JFBoleto b)
    {
        timer = new Timer();
        SimpleDateFormat formato = new SimpleDateFormat("hh:mm:ss");
        TimerTask t = new TimerTask() {
            @Override
            public void run() {
                b.reloj.setText(formato.format(new Date()));
            }
        };
        timer.schedule(t, 0, 1000);
        this.b=b;
        this.b.jButton1.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b.jButton1) {
            String h,j,k,f,r;
            Date fecha;
            int a;
            h=b.n.getText();
            j=b.d.getText();
            k=b.t.getText();
            r=String.valueOf(b.ruta.getSelectedItem());
            fecha=b.calendario.getDatoFecha();
            a=Integer.parseInt(String.valueOf(b.numboletos.getValue()));
            Boleto b = new Boleto(h,j,k,fecha,a,r);
            generarQR(b.formatoBoleto(),b.nombre);
            JOptionPane.showMessageDialog(null,"Creacion del Codigo Qr Exitos :)\n         Feliz Viaje ;)");
            
         }
    }
    public void generarQR(String dato,String num)
    {
        try {
            QRCode c=new QRCode();
            c.setData(dato);
            c.setDataMode(QRCode.MODE_BYTE);
            c.setUOM(udm);
            c.setLeftMargin(mi);
            c.setRightMargin(md);
            c.setTopMargin(ms);
            c.setBottomMargin(min);
            c.setResolution(resol);
            c.setRotate(rot);
            c.setModuleSize(tam);
            String archivo = System.getProperty("user.home")+"/qrBoleto"+num+".gif";
            c.renderBarcode(archivo);
            Desktop d= Desktop.getDesktop();
            d.open(new File("archivo"));
        } catch (Exception e) {
        }
    }
}
