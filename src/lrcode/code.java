/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lrcode;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

/**
 *
 * @author landryk
 */
public class code extends javax.swing.JFrame {
    int dl = 2,t,j=0;
    int x = 0,y=0;
    int posx ,posy ;
    int LM,L1,A1,A2,Ai,L2,L3;
    int pi = 3;
    int espaceL = 3,espace_angle=15,espace_lettreA = 6;
    double A;
    /**
     * Creates new form code
     */
    public code() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Panel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextPane1 = new javax.swing.JTextPane();
        Button1 = new javax.swing.JButton();
        Label1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtdecode = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        Supp = new javax.swing.JButton();
        ButtonDec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(TextPane1);

        Button1.setText("encoder");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Label1.setText("texte a encoder");

        jLabel1.setText("charger images");

        jButton1.setText("charger");
        jButton1.setActionCommand("charger");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtdecode.setViewportView(jTextPane1);

        Supp.setText("effacer l'ecran");
        Supp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuppActionPerformed(evt);
            }
        });

        ButtonDec.setText("decoder");
        ButtonDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button1)
                                .addGap(32, 32, 32))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                            .addComponent(txtdecode))))
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(Supp)
                .addGap(41, 41, 41)
                .addComponent(ButtonDec)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Label1)
                        .addComponent(Button1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addComponent(txtdecode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Supp)
                    .addComponent(ButtonDec)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void saveGraph(BufferedImage outImage) {
    /*BufferedImage outImage=new BufferedImage(MonPanel.getWidth(),MonPanel.getHeight(),BufferedImage.TYPE_INT_RGB);
    Graphics2D graphics = outImage.createGraphics();
    MonPanel.print(graphics);
    //MonPanel.paint(graphics);
        */
    File outFile=new File("out.png" );
    try {
        if (!ImageIO.write(outImage,"png",outFile))
            System.out.println("Format d'écriture non pris en charge" );
    } catch (Exception e) {
        System.out.println("erreur dans l'enregistrement de l'image :" );
        e.printStackTrace();
    }
}
    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        // TODO add your handling code here:
        String txt = TextPane1.getText();
        int taille = txt.length();
        int tab[] = new int[taille];
        int T[] = new int[taille];
        LRcode.code(txt,tab);
        BufferedImage outImage=new BufferedImage(Panel1.getWidth(),Panel1.getHeight(),BufferedImage.TYPE_INT_ARGB);
        Graphics g2 = outImage.getGraphics();
        g2.setColor(Color.WHITE);
	g2.fillRect(0, 0,Panel1.getWidth(),Panel1.getWidth());
        
        t = txt.split(" ").length;
        posy = Panel1.getHeight()/2;
        posx = Panel1.getWidth()/2;
        Graphics g1 =  Panel1.getGraphics();
        Graphics2D g = (Graphics2D) g1;
        BasicStroke line = new BasicStroke(4.0f);
        g.setStroke(line);
        g.setColor(Color.red);
        g2.setColor(Color.red);
        //on mutipli chaque lettre par 3
        for(int i=0;i<taille;i++){
            LM = LM + tab[i];
            T[i] = tab[i];
        }
        LM = 3*(LM + t);
        L1 = (LM*3)/6;
        L2 = (LM*2)/6;
        L3 =  LM/6;
        //System.out.println("L1 "+L1+" hauteur "+posy*2);
        //premier arc
        dessinarc(L1, T, g, g2, tab);
        g.setColor(Color.blue);
        g2.setColor(Color.blue);
        //second arc
        dessinarc(L2, T, g, g2, tab);
        g.setColor(Color.black);
        g2.setColor(Color.black);
        //3 ième arc
        dessinarc(L3, T, g, g2, tab);
        //cadre
        int d = (L1/pi) + 5;
        g.drawRect(posx-d/2,posy-d/2, d, d);
        g2.drawRect(posx-d/2,posy-d/2, d, d);
        saveGraph(outImage); 
        
    }//GEN-LAST:event_Button1ActionPerformed
private void decode(int[][] img,int l,int H){
    int ray1 = l-5,ray2,ray3,longueurM;
    ray2 = (ray1/3)*2;
    ray3 = (ray1/3);
    
}
    
    
    private void dessinarc(int rayon,int[] T,Graphics2D g,Graphics g2,int[] tab){
        A1 = 0;
        int D = rayon/pi;
     while(x<rayon){
            //garde la meme position et change juste l'angle
            if(T[j]!=0){
                A = (2.0*(double)T[j])/(double)D;
                A2 = (int)(A*180)/pi;
                g.drawArc(posx-D/2,posy-D/2, D, D, A1, A2);
                g2.drawArc(posx-D/2,posy-D/2, D, D, A1, A2);
                A1 = A1+A2+6;
                x = x+3*tab[j];
                j++;
            }
            else{
                A1 = A1+15;
                j++;
                x = x+3; 
            }
                  
        }
        
        j--;
        x=0;
        A1=0;
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jTextPane1.getText().isEmpty()==false){
        try{
            Graphics g = Panel1.getGraphics();
            Image img = ImageIO.read(new File(jTextPane1.getText()));
            g.drawImage(img, 0, 0, this);
        } catch(IOException e){
            e.printStackTrace();
        }
        }
        else{
            JFileChooser fileOuvrirImage = new JFileChooser();
			if (fileOuvrirImage.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                            try{
                                    Graphics g = Panel1.getGraphics();
                                    File f = new File(fileOuvrirImage.getSelectedFile().getAbsolutePath());
                                    Image img = ImageIO.read(f);
                                    jTextPane1.setText(f.toString());
                                    g.drawImage(img, 0, 0, this);
                                } catch(IOException e){
                                    e.printStackTrace();
                                }
			}
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void SuppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuppActionPerformed
        Panel1.repaint();
        
    }//GEN-LAST:event_SuppActionPerformed
private int[][][] toArray(BufferedImage image) {
		/* recup la taille de l'image */
		int width = image.getWidth();
		int height = image.getHeight();
		/* creation du tableau */
		int[][][] array = new int[height][width][5];
		/* remplissage du tableau */
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				int rgb = image.getRGB(x, y);
				array[y][x][0] = (rgb >> 24) & 0xFF;
				array[y][x][1] = (rgb >> 16) & 0xFF;
				array[y][x][2] = (rgb >> 8) & 0xFF;
				array[y][x][3] = rgb & 0xFF;
                                if((array[y][x][0] == 255) && (array[y][x][1] == 255) && (array[y][x][2] == 255))
                                    array[y][x][4] = 0;
                                else
                                    array[y][x][4] = 1; 

			}

		}
                return array;
}

    private void ButtonDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDecActionPerformed
        // TODO add your handling code here:
        BufferedImage imgIMG1 = null , result = null ;
        int taillex=0,tailley=0,ok=0;
        try {
            // Ouverture du f i c h i e r
            File f = new File(jTextPane1.getText()) ; 
            imgIMG1 = ImageIO.read(f) ;
        } catch (IOException ex) {
            Logger.getLogger(code.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            if (imgIMG1!= null) {
            int[][][] array ;
            result = new BufferedImage ( imgIMG1 . getWidth ( ) , imgIMG1 . getHeight ( ), BufferedImage.TYPE_INT_RGB) ;
            array = toArray(imgIMG1);
            int mx = imgIMG1 . getWidth ( )/2 , my = imgIMG1 . getHeight ( )/2,finx,finy;
              for ( int row = 0 ; row < imgIMG1 . getHeight ( ) ; row++){
                if(array[row][mx][4]== 0){
                    tailley++;
                }else{
                    break;
                }
            }
            for ( int col = 0 ; col < imgIMG1 . getWidth ( ) ;  col++){
                if(array[my][col][4]== 0){
                    taillex++;
                }else{
                    break;
                }
            }
           finx = imgIMG1 . getWidth() - taillex;
           finy = imgIMG1 . getHeight()- tailley;
           int H=0,l=0;
           H = finy - tailley;
           l=finx - taillex;
            int center[][] = new int[H][l];
            for ( int row = tailley ; row < finy ; row++){
                for ( int col = taillex ; col < finx ;  col++) {
                    center[row-tailley][col-taillex] = array[row][col][4];
                    System.out.print(center[row-tailley][col-taillex]+" ");
                       //result . setRGB( col , row , imgIMG1 . getRGB( col , row ) ) ;
                }
                System.out.println("");
            }
            }
            
    }//GEN-LAST:event_ButtonDecActionPerformed

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
            java.util.logging.Logger.getLogger(code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new code().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JButton ButtonDec;
    private javax.swing.JLabel Label1;
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton Supp;
    private javax.swing.JTextPane TextPane1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JScrollPane txtdecode;
    // End of variables declaration//GEN-END:variables
}
