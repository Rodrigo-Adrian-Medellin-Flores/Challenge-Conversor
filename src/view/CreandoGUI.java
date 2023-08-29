package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.text.NumberFormat;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;

import clasesAbstractas.Divisas;
import clasesAbstractas.Unidades;

public class CreandoGUI extends JPanel implements ActionListener, KeyListener{

    private JComboBox<String> listaUnidades;
    private JComboBox<String> listaUnidad1;
    private JComboBox<String> listaUnidad2;
    private DefaultComboBoxModel<String> cBoxModel;
    private DefaultComboBoxModel<String> cBoxModel2;
    private JFormattedTextField cantidad;
    private JFormattedTextField resultado;
    private JButton botonConvertir;
    private JButton botonCambioDeUnidades;
    private JLabel etiquetaListaUnidades;
    private JTextField infoPrograma;
    private JLabel informacion;
    private JLabel logo;
    private int contador;
    private int indiceUnidades;
    
    
    public CreandoGUI(){
        
        this.setBackground(new Color(205, 210, 240));

        listaUnidades = new JComboBox<>();
        DefaultComboBoxModel<String> comboBoxModel=new DefaultComboBoxModel<>();
        listaUnidades.setBounds(175,20,200,30);
        Font fuente = new Font("Calibri", 1, 18);
        listaUnidades.setFont(fuente);
        listaUnidades.setBackground(new Color(0, 0, 145));
        listaUnidades.setForeground(Color.WHITE);
        listaUnidades.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        listaUnidades.setUI(new BasicComboBoxUI(){
            protected JButton createArrowButton(){
                BasicArrowButton botonCombobox = new BasicArrowButton(SwingConstants.SOUTH, Color.WHITE, new Color(0, 0, 160), new Color(0, 0, 160), Color.WHITE);
                botonCombobox.setBorder(BorderFactory.createLineBorder(Color.WHITE));
                return botonCombobox;
            }
        });

        etiquetaListaUnidades = new JLabel("Eliga una unidad para convertir");
        etiquetaListaUnidades.setBounds(185, 52, 200, 20);
        etiquetaListaUnidades.setForeground(new Color(90, 90, 90));

        for(Class<?> o: Unidades.unidades){
            comboBoxModel.addElement(o.toString().replace("class clasesAbstractas.", ""));
        }

        listaUnidades.setModel(comboBoxModel);
        listaUnidades.setSelectedIndex(0);
        listaUnidades.addActionListener(this);

        NumberFormat formatoResultado = NumberFormat.getNumberInstance();
        formatoResultado.setMinimumFractionDigits(2);
        formatoResultado.setMaximumFractionDigits(8);
        resultado = new JFormattedTextField(formatoResultado);
        resultado.setBounds(350, 150, 150, 30);
        resultado.setColumns(10);
        resultado.setHorizontalAlignment(JTextField.RIGHT);
        resultado.setEditable(false);
        fuente = new Font("Calibri", 3, 18);
        resultado.setFont(fuente);
        resultado.setForeground(Color.RED);
        resultado.setBackground(Color.WHITE);
        
        
        NumberFormat formatoCantidad = NumberFormat.getNumberInstance();
        cantidad = new JFormattedTextField(formatoCantidad);
        cantidad.setBounds(350, 100, 150, 30);
        cantidad.setColumns(10);
        cantidad.setHorizontalAlignment(JTextField.RIGHT);
        fuente = new Font("Calibri", 1, 18);
        cantidad.setFont(fuente);
        cantidad.addKeyListener(this);
        
        
        listaUnidad1 = new JComboBox<>();
        listaUnidad1.setBounds(50, 100, 250, 30);
        fuente = new Font("Calibri", 1, 14);
        listaUnidad1.setFont(fuente);
        listaUnidad1.setBackground(new Color(255, 255, 220));
        listaUnidad1.addItemListener(e -> convertir());
        listaUnidad2 = new JComboBox<>();
        listaUnidad2.setBounds(50, 150, 250, 30);
        listaUnidad2.setFont(fuente);
        listaUnidad2.setBackground(new Color(255, 255, 220));
        listaUnidad2.addItemListener(e -> convertir());

        informacion = new JLabel();
        informacion.setBounds(345,182,200,20);
        
        actualizarListas(listaUnidades.getSelectedIndex());


        botonConvertir = new JButton("Convertir");
        botonConvertir.setForeground(new Color(0, 0, 110));
        botonConvertir.setBounds(125, 215, 300, 40);
        botonConvertir.addActionListener(e -> convertir());

        infoPrograma = new JTextField("Rodrigo Adrian Medellín Flores     Challenge Conversor v1.0     Alura - ONE     2023");
        infoPrograma.setBounds(-2, 280, 550, 35);
        infoPrograma.setForeground(Color.WHITE);
        infoPrograma.setBackground(Color.BLACK);
        infoPrograma.setEditable(false);
        fuente = new Font("Calibri", 1, 15);
        infoPrograma.setFont(fuente);
        infoPrograma.setHorizontalAlignment(JTextField.CENTER);

        BufferedImage myPicture;
        try {
            myPicture = ImageIO.read(getClass().getResource("/images/Logo.png")); //Tamaño de imagen original 120 x 48
            myPicture = myPicture.getSubimage(40, 0, 78, 48); //Extraemos solo la parte del logo - Nueva dimension 38 x 48
            Image img = myPicture.getScaledInstance(myPicture.getWidth() * 29/38, myPicture.getHeight() * 36/48, Image.SCALE_SMOOTH); //Escalamos la imagen, debe guardarse en una variable de tipo Image
            logo = new JLabel(new ImageIcon(img)); //"Convertimos" nuestra imagen a icono y la agregamos a la etiqueta
            logo.setBounds(0,15,100,50); //Establecemos un tamaño para la etiqueta
            add(logo); // Agregamos la etiqueta al JPanel

            //Ahora usemos el mismo try-catch y redeclaremos el valor de las variables para cargar una imagen en un boton
            myPicture = ImageIO.read(getClass().getResource("/images/Change.png"));
            img = myPicture.getScaledInstance(myPicture.getWidth() * 25/512, myPicture.getHeight() * 28/512, Image.SCALE_SMOOTH);
            botonCambioDeUnidades = new JButton(new ImageIcon(img));
            botonCambioDeUnidades.setToolTipText("Intercambia Unidades");
            botonCambioDeUnidades.setBounds(310, 132, 30, 30);
            botonCambioDeUnidades.addActionListener(e -> intercambiarUnidades());
            add(botonCambioDeUnidades);

        } catch (IOException e1) {
            e1.printStackTrace();
        }

        

        add(listaUnidades);
        add(etiquetaListaUnidades);
        add(listaUnidad1);
        add(cantidad);
        add(listaUnidad2);
        add(resultado);
        add(botonConvertir);
        add(informacion);
        add(infoPrograma);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox<String> cb = (JComboBox<String>)e.getSource();
        int indice = (int)cb.getSelectedIndex();
        actualizarListas(indice);
    }

    public void actualizarListas(int indice){
        
        cBoxModel = new DefaultComboBoxModel<>();
        cBoxModel2 = new DefaultComboBoxModel<>();
        
        boolean contadorTieneValor = false;

        indiceUnidades = listaUnidades.getSelectedIndex();
        
        if(Unidades.unidades[indiceUnidades] == Divisas.class){
            
            for(int i = 0; i < Divisas.listaNombres.size(); i++){

                cBoxModel.addElement(Divisas.listaNombres.get(i).toString());
                cBoxModel2.addElement(Divisas.listaNombres.get(i).toString());
                
            }

            informacion.setText("Tipo de Cambio al: " + Divisas.fecha);

        } else {
            
            for(int i = 0; i < Unidades.subunidades.length; i++){
                if (Unidades.unidades[indice].isAssignableFrom(Unidades.subunidades[i]) ){
                    if(!contadorTieneValor){
                        contador = i;
                        contadorTieneValor = true;
                    }
                    cBoxModel.addElement(Unidades.subunidades[i].toString().replace("class clasesUtilitarias.", ""));
                    cBoxModel2.addElement(Unidades.subunidades[i].toString().replace("class clasesUtilitarias.", ""));
                }
            }

            informacion.setText(null);

        }

        cantidad.setValue(null);
        resultado.setValue(null);
        listaUnidad1.setModel(cBoxModel);
        listaUnidad1.setSelectedIndex(0);
        listaUnidad2.setModel(cBoxModel2);
        listaUnidad2.setSelectedIndex(1);
    }

    public static void crearFrame(){
        JFrame marco = new JFrame();
        marco.setSize(550, 350);
        marco.setTitle("Challenge Conversor");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JComponent panel = new CreandoGUI();
        panel.setLayout(null);
        panel.setOpaque(true);
        marco.setContentPane(panel);

        marco.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        int ascii = e.getKeyChar();
        if((ascii<48 || ascii>57) && ascii != 46){
            e.consume();
            informacion.setText("Ingrese una cantidad válida.");
        } else {
            resultado.setValue(null);
            informacion.setText(null);
        }
        
        if(ascii == 8 || ascii == 10 || ascii == 127) {
            resultado.setValue(null);
            informacion.setText(null);
        }
        
    }
    
    @Override
    public void keyPressed(KeyEvent e) {  
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        int ascii = e.getKeyChar();
        if(ascii == 10 ){
            convertir();
        }
    }

    public void intercambiarUnidades(){
        int indice1 =listaUnidad1.getSelectedIndex();
        int indice2 = listaUnidad2.getSelectedIndex();

        listaUnidad1.setSelectedIndex(indice2);
        listaUnidad2.setSelectedIndex(indice1);
    }
    
    public void convertir(){
        if(cantidad.getValue() != null && !cantidad.getText().isEmpty()){
            try {
                Unidades.cantidad = 0;
                Number n = (Number) cantidad.getValue();
                double can = n.doubleValue();
                Unidades.cantidad = can;
                int indice = listaUnidad1.getSelectedIndex();
                double resul;

                indiceUnidades = listaUnidades.getSelectedIndex();

                if (Unidades.unidades[indiceUnidades] == Divisas.class){
                    int indice2 = listaUnidad2.getSelectedIndex();
                    resul = Unidades.cantidad * Divisas.listaValores.get(indice2) / Divisas.listaValores.get(indice);
                    informacion.setText("Tipo de Cambio al: " + Divisas.fecha);
                } else {
                    Method m = Unidades.subunidades[contador + indice].getMethod(listaUnidad2.getSelectedItem().toString().toLowerCase(), null);
                    resul = (double) m.invoke(Unidades.subunidades[contador + indice], (Object[])null);
                    m=null;
                }
                resultado.setValue(resul);
            } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e1) {
                e1.printStackTrace();
            }
        }

    }

}