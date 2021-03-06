/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maestros;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

/**
 *
 * @author prof_tes_a
 */
public class RopMaeRop extends javax.swing.JInternalFrame
{
    private RopMaeRop_01 objMaeRop_01;
    
    /**
     * Creates new form RopMaeRop
     */
    public RopMaeRop()
    {
        initComponents();
        cargarTiposRopa();
        objMaeRop_01=new RopMaeRop_01(JOptionPane.getFrameForComponent(this), true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgrSec = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtMar = new javax.swing.JTextField();
        butMar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboTip = new javax.swing.JComboBox();
        optSecDam = new javax.swing.JRadioButton();
        optSecCab = new javax.swing.JRadioButton();
        optSecNin = new javax.swing.JRadioButton();
        chkTalS = new javax.swing.JCheckBox();
        chkTalM = new javax.swing.JCheckBox();
        chkTalL = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaObs = new javax.swing.JTextArea();
        butAbr = new javax.swing.JButton();
        butGua = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ropa");
        getContentPane().setLayout(null);

        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 120, 30);

        jLabel2.setText("Marca:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 52, 120, 30);
        getContentPane().add(txtNom);
        txtNom.setBounds(134, 11, 291, 30);

        txtMar.setEditable(false);
        getContentPane().add(txtMar);
        txtMar.setBounds(134, 52, 291, 30);

        butMar.setText("...");
        butMar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butMarActionPerformed(evt);
            }
        });
        getContentPane().add(butMar);
        butMar.setBounds(431, 52, 45, 30);

        jLabel3.setText("Tipo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 93, 120, 30);

        jLabel4.setText("Sección:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 147, 120, 30);

        jLabel5.setText("Talla:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 180, 120, 30);

        jLabel6.setText("Observaciones:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 223, 120, 30);

        cboTip.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboTip);
        cboTip.setBounds(134, 93, 291, 30);

        bgrSec.add(optSecDam);
        optSecDam.setSelected(true);
        optSecDam.setText("Damas");
        getContentPane().add(optSecDam);
        optSecDam.setBounds(136, 139, 87, 30);

        bgrSec.add(optSecCab);
        optSecCab.setText("Caballeros");
        getContentPane().add(optSecCab);
        optSecCab.setBounds(241, 139, 87, 30);

        bgrSec.add(optSecNin);
        optSecNin.setText("Niños");
        getContentPane().add(optSecNin);
        optSecNin.setBounds(346, 139, 87, 30);

        chkTalS.setText("S");
        getContentPane().add(chkTalS);
        chkTalS.setBounds(130, 172, 31, 30);

        chkTalM.setText("M");
        getContentPane().add(chkTalM);
        chkTalM.setBounds(241, 172, 33, 30);

        chkTalL.setText("L");
        getContentPane().add(chkTalL);
        chkTalL.setBounds(346, 172, 31, 30);

        txaObs.setColumns(20);
        txaObs.setRows(5);
        jScrollPane1.setViewportView(txaObs);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(134, 214, 293, 56);

        butAbr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abrir.gif"))); // NOI18N
        butAbr.setText("Abrir");
        butAbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAbrActionPerformed(evt);
            }
        });
        getContentPane().add(butAbr);
        butAbr.setBounds(290, 280, 150, 30);

        butGua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        butGua.setText("Guardar");
        butGua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGuaActionPerformed(evt);
            }
        });
        getContentPane().add(butGua);
        butGua.setBounds(140, 280, 150, 30);

        setBounds(0, 0, 500, 350);
    }// </editor-fold>//GEN-END:initComponents

    private void butMarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butMarActionPerformed
        //RopMaeRop_01 objMaeRop_01=new RopMaeRop_01(JOptionPane.getFrameForComponent(this), true);
        objMaeRop_01.setVisible(true);
        if (objMaeRop_01.isClickAceptar())
            txtMar.setText(objMaeRop_01.getMarcaSeleccionada());
    }//GEN-LAST:event_butMarActionPerformed

    private void butGuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGuaActionPerformed
        guardarRopa();
    }//GEN-LAST:event_butGuaActionPerformed

    private void butAbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAbrActionPerformed
        abrirRopa();
    }//GEN-LAST:event_butAbrActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgrSec;
    private javax.swing.JButton butAbr;
    private javax.swing.JButton butGua;
    private javax.swing.JButton butMar;
    private javax.swing.JComboBox cboTip;
    private javax.swing.JCheckBox chkTalL;
    private javax.swing.JCheckBox chkTalM;
    private javax.swing.JCheckBox chkTalS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton optSecCab;
    private javax.swing.JRadioButton optSecDam;
    private javax.swing.JRadioButton optSecNin;
    private javax.swing.JTextArea txaObs;
    private javax.swing.JTextField txtMar;
    private javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables

    private boolean cargarTiposRopa()
    {
        boolean blnRes=true;
        try
        {
            String strCon=""; //Contenido del archivo.
            java.io.FileReader objFilRea=new java.io.FileReader("RopTipoRopa.txt");
            java.io.BufferedReader objBufRea=new java.io.BufferedReader(objFilRea);
            String strLin;
            cboTip.removeAllItems();
            while((strLin=objBufRea.readLine())!=null)
            {
                cboTip.addItem(strLin);
            }
            objBufRea.close();
        }
        catch(java.io.FileNotFoundException e)
        {
            JOptionPane.showMessageDialog(this, "Excepción: " + e.toString(), "Sistema TES", JOptionPane.ERROR_MESSAGE);
            blnRes=false;
        }
        catch(java.io.IOException e)
        {
            JOptionPane.showMessageDialog(this, "Excepción: " + e.toString(), "Sistema TES", JOptionPane.ERROR_MESSAGE);
            blnRes=false;
        }
        return blnRes;
    }
    
    private boolean guardarRopa()
    {
        boolean blnRes=true;
        try
        {
            String strArc;
            if (this.getTitle().equals("Ropa"))
            {
                JFileChooser objFilCho=new JFileChooser();
                objFilCho.setDialogTitle("Guardar");
                objFilCho.setFileSelectionMode(JFileChooser.FILES_ONLY);
                objFilCho.setCurrentDirectory(new File("C:\\"));
                //Filtrado (Opción 1):
                FileNameExtensionFilter objFilNamExt=new FileNameExtensionFilter("Archivos XML", "xml");
                objFilCho.setFileFilter(objFilNamExt);
                //Filtrado (Opción 2):
    //            objFilCho.addChoosableFileFilter(new FileNameExtensionFilter("Archivos de texto", "txt"));
    //            objFilCho.addChoosableFileFilter(new FileNameExtensionFilter("Archivos java", "java"));
    //            objFilCho.addChoosableFileFilter(new FileNameExtensionFilter("Archivos php", "php", "php4", "phtml"));
                if (objFilCho.showSaveDialog(this)==JFileChooser.APPROVE_OPTION)
                {
                    strArc=objFilCho.getSelectedFile().getPath();
                    //Si no tiene la extensión "txt" agregarsela.
                    if (!strArc.toLowerCase().endsWith(".xml"))
                        strArc+=".xml";
                    if (guardarArcXML(strArc))
                        this.setTitle(strArc);
        //            System.out.println("Directorio seleccionado: " + strArc);
        //            System.out.println("Texto: " + ((MenArcBloNot)dskGen.getSelectedFrame()).txaPag.getText());
                }
                else
                {
                    System.out.println("El usuario canceló");
                }
            }
            else
                guardarArcXML(this.getTitle());
        }
        catch(Exception e)
        {
            System.out.println("Excepción: " + e.toString());
            blnRes=false;
        }
        return blnRes;
    }
    
    private boolean guardarArcXML(String strNomArc)
    {
        boolean blnRes=true;
        try
        {
            DocumentBuilderFactory obDocBuiFac=DocumentBuilderFactory.newInstance();
            DocumentBuilder objDocBui=obDocBuiFac.newDocumentBuilder();
            DOMImplementation objDomImp=objDocBui.getDOMImplementation();
            Document objDoc=objDomImp.createDocument(null, "xml", null);
            objDoc.setXmlVersion("1.0");
            
            //Crear el nodo raíz.
            Element objNodRai=objDoc.createElement("Ropa");
            //Crear los nodos hijos.
            Element objNodNom=objDoc.createElement("Nombre");
            Element objNodMar=objDoc.createElement("Marca");
            Element objNodTip=objDoc.createElement("Tipo");
            Element objNodSec=objDoc.createElement("Seccion");
            Element objNodTal=objDoc.createElement("Talla");
            Element objNodObs=objDoc.createElement("Observaciones");
            //Asignar el valor a los nodos hijos.
            Text objTexNom=objDoc.createTextNode(txtNom.getText());
            Text objTexMar=objDoc.createTextNode(txtMar.getText());
            Text objTexTip=objDoc.createTextNode(cboTip.getSelectedItem().toString());
            String strSec="";
            if (optSecDam.isSelected())
            {
                strSec="Damas";
            }
            else if (optSecCab.isSelected())
            {
                strSec="Caballeros";
            }
            else
            {
                strSec="Niños";
            }
            Text objTexSec=objDoc.createTextNode(strSec);
            String strTal="";
            if (chkTalS.isSelected())
            {
                strTal="S";
            }
            if (chkTalM.isSelected())
            {
                strTal+=(strTal.equals("")?"M":", M");
            }
            if (chkTalL.isSelected())
            {
                strTal+=(strTal.equals("")?"L":", L");
            }
            Text objTexTal=objDoc.createTextNode(strTal);
            Text objTexObs=objDoc.createTextNode(txaObs.getText());
            
            //Agregar los nodos al documento.
            objDoc.getDocumentElement().appendChild(objNodRai);
            objNodRai.appendChild(objNodNom);
            objNodRai.appendChild(objNodMar);
            objNodRai.appendChild(objNodTip);
            objNodRai.appendChild(objNodSec);
            objNodRai.appendChild(objNodTal);
            objNodRai.appendChild(objNodObs);
            objNodNom.appendChild(objTexNom);
            objNodMar.appendChild(objTexMar);
            objNodTip.appendChild(objTexTip);
            objNodSec.appendChild(objTexSec);
            objNodTal.appendChild(objTexTal);
            objNodObs.appendChild(objTexObs);
            Source objSou=new DOMSource(objDoc);
            Result objRes=new StreamResult(new java.io.File(strNomArc));
            Result objResCon=new StreamResult(System.out);
            Transformer objTra=TransformerFactory.newInstance().newTransformer();
            objTra.transform(objSou, objRes);
            objTra.transform(objSou, objResCon);
        }
        catch(Exception e)
        {
            System.out.println("Excepción: " + e.toString());
            blnRes=false;
        }
        return blnRes;
    }
    
    private boolean abrirRopa()
    {
        boolean blnRes=true;
        try
        {
            String strArc;
            JFileChooser objFilCho=new JFileChooser();
            objFilCho.setDialogTitle("Abrir");
            objFilCho.setFileSelectionMode(JFileChooser.FILES_ONLY);
            objFilCho.setCurrentDirectory(new File("C:\\"));
            //Filtrado (Opción 1):
            FileNameExtensionFilter objFilNamExt=new FileNameExtensionFilter("Archivos XML", "xml");
            objFilCho.setFileFilter(objFilNamExt);
            //Filtrado (Opción 2):
    //        objFilCho.addChoosableFileFilter(new FileNameExtensionFilter("Archivos de texto", "txt"));
    //        objFilCho.addChoosableFileFilter(new FileNameExtensionFilter("Archivos java", "java"));
    //        objFilCho.addChoosableFileFilter(new FileNameExtensionFilter("Archivos php", "php", "php4", "phtml"));
            if (objFilCho.showOpenDialog(this)==JFileChooser.APPROVE_OPTION)
            {
                strArc=objFilCho.getSelectedFile().getPath();
                //Si no tiene la extensión "txt" agregarsela.
    //            if (!strArc.toLowerCase().endsWith(".txt"))
    //                strArc+=".txt";

//                CarMaeVeh objCarMaeVeh=new CarMaeVeh();
//                dskGen.add(objCarMaeVeh, JLayeredPane.DEFAULT_LAYER);
//                objCarMaeVeh.setVisible(true);

                //abrirArcTex(strArc, ((MenArcBloNot)dskGen.getSelectedFrame()).txaPag);
                abrirArcXML(strArc);
                this.setTitle(strArc);
    //            System.out.println("Directorio seleccionado: " + strArc);
    //            System.out.println("Texto: " + ((ifrProPal)dskGen.getSelectedFrame()).txaPag.getText());
            }
            else
            {
                System.out.println("El usuario canceló");
            }
        }
        catch(Exception e)
        {
            System.out.println("Excepción: " + e.toString());
            blnRes=false;
        }
        return blnRes;
    }
    
    private boolean abrirArcXML(String strNomArc)
    {
        boolean blnRes=true;
        try
        {
            DocumentBuilderFactory obDocBuiFac=DocumentBuilderFactory.newInstance();
            DocumentBuilder objDocBui=obDocBuiFac.newDocumentBuilder();
            Document objDoc=objDocBui.parse(new File(strNomArc));
            objDoc.getDocumentElement().normalize();
//            System.out.println("Nodo raíz: " + objDoc.getDocumentElement().getNodeName());
            NodeList objNodLis=objDoc.getElementsByTagName("Ropa");
            for (int i=0; i<objNodLis.getLength(); i++)
            {
                Node objNodPel=objNodLis.item(i);
                if (objNodPel.getNodeType()==Node.ELEMENT_NODE)
                {
                    Element objEle=(Element)objNodPel;
                    txtNom.setText(getTagValue("Nombre", objEle));
                    txtMar.setText(getTagValue("Marca", objEle));
                    cboTip.setSelectedItem(getTagValue("Tipo", objEle));
                    switch (getTagValue("Seccion", objEle))
                    {
                        case "Damas":
                            optSecDam.setSelected(true);
                            break;
                        case "Caballeros":
                            optSecCab.setSelected(true);
                            break;
                        case "Niños":
                            optSecNin.setSelected(true);
                            break;
                    }
                    chkTalS.setSelected(false);
                    chkTalM.setSelected(false);
                    chkTalL.setSelected(false);
                    if (getTagValue("Talla", objEle).indexOf("S")!=-1)
                    {
                        chkTalS.setSelected(true);
                    }
                    if (getTagValue("Talla", objEle).indexOf("M")!=-1)
                    {
                        chkTalM.setSelected(true);
                    }
                    if (getTagValue("Talla", objEle).indexOf("L")!=-1)
                    {
                        chkTalL.setSelected(true);
                    }
                    txaObs.setText(getTagValue("Observaciones", objEle));
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Excepción: " + e.toString());
            blnRes=false;
        }
        return blnRes;
    }
    
    private static String getTagValue(String sTag, Element eElement)
    {
        NodeList nlList= eElement.getElementsByTagName(sTag).item(0).getChildNodes();
        Node nValue = (Node) nlList.item(0);
        if (nValue==null)
            return "";
        else
            return nValue.getNodeValue();
    }

    
}
