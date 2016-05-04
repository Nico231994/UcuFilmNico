/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucufilms;

import java.awt.Color;
import java.util.Date;



/**
 *
 * @author Nico
 */
public class UcuFilmFramePage extends javax.swing.JFrame {
    static UcuFilms programa = new UcuFilms();
    public Lista<Actor> actores;
    public Lista<Pelicula> peliculas;
    public Lista<Director> directores;
    public Lista<Productor> productores;
    public Lista<Imagen> imagenes;
    int varLocation = 0;
    String nombrePeliculaMostrar1;
    int contadordeInicio=1;
    public boolean banderaGeneros = false;
    /**
     * Creates new form UcuFilmFramePage
     */
    public UcuFilmFramePage() {
        initComponents();
        Color color = new Color(255,102,0);
        this.getContentPane().setBackground(new Color(255,102,0));
        programa.cargarDatos();
        this.peliculas = programa.getPeliculas();
        this.peliculas.Ordenar();
        this.actores = programa.getActores();
        this.directores = programa.getDirectores();
        this.imagenes=programa.getImagenes(); 
        this.setSize(MAXIMIZED_HORIZ, MAXIMIZED_VERT);
        if(contadordeInicio==1){
            crearPanel();
            contadordeInicio++;
        }
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 0));
        setPreferredSize(new java.awt.Dimension(1003, 600));
        setSize(new java.awt.Dimension(1024, 600));

        jButton1.setText("Cargar Datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText("Fecha Inicio");

        jTextField2.setText("Fecha Fin");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton2.setText("Ver ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arimo", 0, 12)); // NOI18N
        jLabel1.setText("  Filtros de Fechas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("       Ranking");

        jButton3.setText("Top 10");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("BAD 10");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("  Nombre Pelicula");

        jButton5.setText("Filtrar Pelicula");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton6.setText("Filtrar por Genero");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Filtrar por Director");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Filtrar Actor");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(867, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(33, 33, 33)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        programa.cargarDatos();
        this.peliculas = programa.getPeliculas();
        this.peliculas.Ordenar();
        this.actores = programa.getActores();
        this.directores = programa.getDirectores();
        this.imagenes=programa.getImagenes(); 
        //this.imagenes.Ordenar();
        crearPanel();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            if(jTextField1.getText()!=null && jTextField1.getText().length()==4
                    &&jTextField2.getText()!=null && jTextField2.getText().length()==4
                    
                    //&&jTextField1.getText().contains("1234567890")&&jTextField2.getText().contains("1234567890")
                    ){             
                filtroAño();
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        filtroPorRanking();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String nombre = jTextField3.getText();        
        filtroNombre(nombre);//Para nombre peli
        
//filtroPorDirector(nombre);
       //para filtrar por genero
       
        
        //frame.pack();
        //frame2.pack();
      // if(filtroActor(nombre)==false && filtroNombre(nombre)== false && filtroPorDirector(nombre)==false && 
        //filtroPorGenero(nombre);
      //if(banderaGeneros == false){
           //dialog.pack();
           //dialog.setVisible(true);
          // jTextField3.setText("No se encontraron resultados");}
               
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String nombre = jTextField3.getText();
        NewOkCancelDialog dialog = new NewOkCancelDialog(this, rootPaneCheckingEnabled);
        NewJDiialogPelis frame = new NewJDiialogPelis(llenarLista1(nombre));
        frame.setBackground(new Color(255,102,0));
        
        frame.setVisible(true);
        frame.pack();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         
        String nombre = jTextField3.getText();
        NewJDiialogPelis d = new NewJDiialogPelis(mostrarDirector(nombre));//para filtrar por director
        d.setBackground(new Color(255,102,0));
         d.setVisible(true);
        d.pack();
                
     
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       String nombre = jTextField3.getText();
        NewOkCancelDialog dialog = new NewOkCancelDialog(this, rootPaneCheckingEnabled);
        NewJDiialogPelis d = new NewJDiialogPelis(filtrarActor(nombre));// filtrar por actor
        d.setBackground(new Color(255,102,0));
         d.setVisible(true);
        d.pack();
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UcuFilmFramePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UcuFilmFramePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UcuFilmFramePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UcuFilmFramePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UcuFilmFramePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

  
  public void crearPanel(){
       ILista<Pelicula> listaMostrar =peliculas;
       ILista<Imagen> listaImagen = imagenes;
       
       java.util.Date fecha = new Date();
            Pelicula elemento =(Pelicula) listaMostrar.getPrimero();
            Imagen elementoImagen = (Imagen) listaImagen.getPrimero();
            int año = Integer.parseInt(elemento.getAño().toString());
            int cont=0;
            int location = 0;
            int loc=0;
            int indice=0;
            int location2=0;
            while (cont<=10){
                if(elemento.getEtiqueta().equals(elementoImagen.getEtiqueta())){
               if(indice <=4){
                   
                   Movie movieout= new Movie(elemento, elementoImagen);
                   if(año>=2014){
                        this.add(movieout);
                        movieout.setLocation(10+location, 10);
                        movieout.setSize(200, 300);
                        elemento = (Pelicula) elemento.getSiguiente();
                        elementoImagen = (Imagen) elementoImagen.getSiguiente();
                        cont++;
                        movieout.setBackground(new Color(0,0,0));
                        location+=250;}
                   }else{
              if(indice==5){
                       if(año>=2014){
                       Movie movieout1= new Movie(elemento,elementoImagen);
                       this.add(movieout1);
                       movieout1.setLocation(10, 10+loc);
                       movieout1.setSize(200, 300);
                       elemento = (Pelicula) elemento.getSiguiente();
                       elementoImagen = (Imagen) elementoImagen.getSiguiente();
                       movieout1.setBackground(new Color(0,0,0));
                       cont++;loc+=350;
                    }    
               }else{
                  Movie movieout2= new Movie(elemento,elementoImagen);
                    if(año>=2014){
                    this.add(movieout2);
                    movieout2.setLocation(10+location2, 10+loc);
                    movieout2.setSize(200, 300);
                    elemento = (Pelicula) elemento.getSiguiente();
                    elementoImagen = (Imagen) elementoImagen.getSiguiente();
                    movieout2.setBackground(new Color(0,0,0));
                    cont++;
                    location2+=250;}
                   }              
               }
               indice++;}
               elemento = (Pelicula) elemento.getSiguiente();
               elementoImagen = (Imagen) elementoImagen.getSiguiente();
        }this.pack();
   }
  
  
  public ILista<Pelicula> llenarLista1(String nombre){
      String nombreUp=nombre.toUpperCase();
      ILista<Pelicula> pelis = new Lista<>();
      Pelicula elemento =(Pelicula) peliculas.getPrimero();
      while(elemento !=null){
          if(elemento.getGeneros().toUpperCase().contains(nombreUp)){
              pelis.insertar(new Pelicula(elemento.getEtiqueta(), 
                        elemento.getNombre(), elemento.getAño(), elemento.getPuntaje(), 
                      elemento.getReseña(), elemento.getGeneros(), elemento.getActores(), 
                       elemento.getDirectores(),elemento.getProductores())); 
              System.out.println(elemento.getNombre());
          }elemento = (Pelicula) elemento.getSiguiente();
      }
     
      return pelis;
      
  }
  public ILista<Pelicula> filtrarActor(String nombre){
      String nombreUp=nombre.toUpperCase();
      ILista<Pelicula> pelis = new Lista<>();
      ILista<Pelicula> listaMostrar =peliculas;
      Pelicula elemento =(Pelicula) listaMostrar.getPrimero();
       while (elemento != null){
           Actor elementoAc = (Actor)elemento.getActores().getPrimero();
           while (elementoAc != null){
               if(nombreUp.equals(elementoAc.getNombre().toUpperCase())){
              pelis.insertar(new Pelicula(elemento.getEtiqueta(), 
                        elemento.getNombre(), elemento.getAño(), elemento.getPuntaje(), 
                      elemento.getReseña(), elemento.getGeneros(), elemento.getActores(), 
                       elemento.getDirectores(),elemento.getProductores())); 
              System.out.println(elemento.getNombre());
          }elementoAc = (Actor) elementoAc.getSiguiente();
      } 
           elemento =(Pelicula) elemento.getSiguiente(); 
       
      }
     
      return pelis;
       }
    public boolean filtroActor(String nombre){
      String nombreUp = nombre.toUpperCase();
      ILista<Imagen> listaIm=imagenes;
      Imagen elementoIm = (Imagen) listaIm.getPrimero();
      ILista<Pelicula> listaMostrar =peliculas;
      Pelicula elemento =(Pelicula) listaMostrar.getPrimero();
     // Actor elementoAc = (Actor)elemento.getActores().getPrimero();
       while (elemento != null){
           Actor elementoAc = (Actor)elemento.getActores().getPrimero();
           while (elementoAc != null){
               if(nombreUp.equals(elementoAc.getNombre().toUpperCase()))
                  {if(elemento.getEtiqueta().equals(elementoIm.getEtiqueta())){
                   NewJDialogInfo dialog = new NewJDialogInfo(new java.awt.Frame() , true,elemento,elemento.getActores(),
                   elemento.getDirectores(),elementoIm);
                   dialog.setVisible(true);
                   this.pack();
                   return true;     
               }
           
           }
               elementoAc = (Actor) elementoAc.getSiguiente();
           }
           elementoIm=(Imagen) elementoIm.getSiguiente();
           elemento =(Pelicula) elemento.getSiguiente();          
       }
      return false;
  }
  
  
   public ILista<Pelicula> mostrarDirector(String nombre){
      String nombreUp=nombre.toUpperCase();
      ILista<Pelicula> pelis = new Lista<>();
      ILista<Pelicula> listaMostrar =peliculas;
      Pelicula elemento =(Pelicula) listaMostrar.getPrimero();
      while(elemento !=null){
          Director elementoAc = (Director)elemento.getDirectores().getPrimero();
          if(nombreUp.equals(elementoAc.getNombre().toUpperCase())){
              pelis.insertar(new Pelicula(elemento.getEtiqueta(), 
                      elemento.getNombre(), elemento.getAño(), elemento.getPuntaje(), 
                      elemento.getReseña(), elemento.getGeneros(), elemento.getActores(), 
                      elemento.getDirectores(),elemento.getProductores())); 
              System.out.println(elemento.getNombre());
          }
          elemento = (Pelicula) elemento.getSiguiente();        
      }
      return pelis; 
  }
public boolean filtroNombre(String nombre){
       String nombreUp=nombre.toUpperCase();
       ILista<Pelicula> listaMostrar =peliculas;
       ILista<Imagen> listaImagen = imagenes;
       Pelicula elemento =(Pelicula) listaMostrar.getPrimero();
       Imagen elementoIm = (Imagen) listaImagen.getPrimero();
       while (elemento != null){
          {if(nombreUp.equals(elemento.getNombre().toUpperCase())){
                  {if(elemento.getEtiqueta().equals(elementoIm.getEtiqueta())){
                      NewJDialogInfo dialog = new NewJDialogInfo(new java.awt.Frame() , true,elemento,elemento.getActores(),
                      elemento.getDirectores(),elementoIm);
                      dialog.setVisible(true);
                      this.pack();
                      return true;}
                  }
                  }       
          }elemento =(Pelicula) elemento.getSiguiente(); 
           elementoIm=(Imagen) elementoIm.getSiguiente();
       }
       return false;
  }
  public void filtroAño(){
        ILista<Pelicula> listaMostrar =peliculas;
        ILista<Imagen> listaImagen = imagenes;
        String fecha1= jTextField1.getText();
        int año1=Integer.parseInt(fecha1);
        String fecha2= jTextField2.getText();
        int año2=Integer.parseInt(fecha2);
        
        Pelicula elemento =(Pelicula) listaMostrar.getPrimero();
        Imagen elementoImagen = (Imagen) listaImagen.getPrimero();
        
            int cont=0;
            int location = 0;
            int loc=0;
            int indice=0;
            int location2=0;
            
            while (elemento!=null&&cont<=10){
                if(elemento.getEtiqueta().equals(elementoImagen.getEtiqueta())){
               if(indice <=4){ 
               int año = Integer.parseInt(elemento.getAño().toString());  
               Movie movieout= new Movie(elemento,elementoImagen);
              
               if(año>=año1 && año<=año2){
               this.add(movieout);
                movieout.setLocation(10+location, 10);
                movieout.setSize(200, 300);
                elemento = (Pelicula) elemento.getSiguiente();
                cont++;
                location+=250;}
              }
               else{
                   int año = Integer.parseInt(elemento.getAño().toString()); 
                   if(indice==5){
                       
               if(año>=año1 && año<=año2){
               Movie movieout1= new Movie(elemento,elementoImagen);
                this.add(movieout1);
                movieout1.setLocation(10, 10+loc);
                movieout1.setSize(200, 300);
                elemento = (Pelicula) elemento.getSiguiente();
                cont++;loc+=350;
               }    
               }else{
                Movie movieout2= new Movie(elemento,elementoImagen);
               if(año>=año1 && año<=año2){
                this.add(movieout2);
                movieout2.setLocation(10+location2, 10+loc);
                movieout2.setSize(200, 300);
                elemento = (Pelicula) elemento.getSiguiente();
                cont++;
                location2+=250;}
                   }
                   
               }indice++;}
               elementoImagen = (Imagen) elementoImagen.getSiguiente(); 
               elemento = (Pelicula) elemento.getSiguiente();
        }this.pack();
        
  }
  
  public void filtroPorRanking(){
        ILista<Pelicula> listaMostrar =peliculas;
        ILista<Imagen> listaImagen = imagenes;
               
        Pelicula elemento =(Pelicula) listaMostrar.getPrimero();
        Imagen elementoImagen = (Imagen) listaImagen.getPrimero();
            
            int cont=0;
            int location = 0;
            int loc=0;
            int indice=0;
            int location2=0;
            while (elemento!=null&&cont<=10){
               if(indice <=4){ 
               float puntajePel = elemento.getPuntaje();  
               Movie movieout= new Movie(elemento,elementoImagen);
              
               if(puntajePel>=9.0 && puntajePel<=10.0){
               this.add(movieout);
                movieout.setLocation(10+location, 10);
                movieout.setSize(200, 300);
                elemento = (Pelicula) elemento.getSiguiente();
                cont++;
                location+=250;}
              }
               else{
                   float puntajePel = elemento.getPuntaje(); 
                   if(indice==5){
                      
               if(puntajePel>=8.0 && puntajePel<=10.0){
               Movie movieout1= new Movie(elemento,elementoImagen);
                this.add(movieout1);
                movieout1.setLocation(10, 10+loc);
                movieout1.setSize(200, 300);
                elemento = (Pelicula) elemento.getSiguiente();
                cont++;loc+=350;
               }    
               }else{
                Movie movieout2= new Movie(elemento,elementoImagen);
               if(puntajePel>=8.0 && puntajePel<=10.0){
                this.add(movieout2);
                movieout2.setLocation(10+location2, 10+loc);
                movieout2.setSize(200, 300);
                elemento = (Pelicula) elemento.getSiguiente();
                cont++;
                location2+=250;}
                   }
                   
               }indice++;
                
               elemento = (Pelicula) elemento.getSiguiente();
        }this.pack();}
   }
  


        
    

            
