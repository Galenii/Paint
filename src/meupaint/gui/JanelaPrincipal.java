/*
 * Copyright (C) 2023 Guilherme Galeni
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package meupaint.gui;

import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JColorChooser;

/**
 * Janela principal da aplicação.
 * 
 * @author Guilherme Galeni
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    private int xPress;
    private int yPress;
    
    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupTipoDesenho = new javax.swing.ButtonGroup();
        painelFerramentas = new javax.swing.JPanel();
        btnLinha = new javax.swing.JToggleButton();
        btnRetangulo = new javax.swing.JToggleButton();
        btnElipse = new javax.swing.JToggleButton();
        btnPoligono = new javax.swing.JToggleButton();
        txtLados = new javax.swing.JTextField();
        btnCorContorno = new javax.swing.JButton();
        checkSemCorContorno = new javax.swing.JCheckBox();
        btnCorPreenchimento = new javax.swing.JButton();
        checkSemCorPreenchimento = new javax.swing.JCheckBox();
        painelDesenho = new meupaint.gui.PainelDesenho();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Meu Paint");

        btnGroupTipoDesenho.add(btnLinha);
        btnLinha.setSelected(true);
        btnLinha.setText("Linha");

        btnGroupTipoDesenho.add(btnRetangulo);
        btnRetangulo.setText("Retângulo");

        btnGroupTipoDesenho.add(btnElipse);
        btnElipse.setText("Elipse");

        btnGroupTipoDesenho.add(btnPoligono);
        btnPoligono.setText("Polígono");

        txtLados.setText("5");
        txtLados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLadosActionPerformed(evt);
            }
        });

        btnCorContorno.setForeground(new java.awt.Color(0, 0, 0));
        btnCorContorno.setText("\u25A0");
        btnCorContorno.setToolTipText("Cor Contorno");
        btnCorContorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorContornoActionPerformed(evt);
            }
        });

        checkSemCorContorno.setText("Sem Cor");
        checkSemCorContorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSemCorContornoActionPerformed(evt);
            }
        });

        btnCorPreenchimento.setForeground(new java.awt.Color(255, 255, 255));
        btnCorPreenchimento.setText("\u25A0");
        btnCorPreenchimento.setToolTipText("Cor Preenchimento");
        btnCorPreenchimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorPreenchimentoActionPerformed(evt);
            }
        });

        checkSemCorPreenchimento.setText("Sem Cor");

        javax.swing.GroupLayout painelFerramentasLayout = new javax.swing.GroupLayout(painelFerramentas);
        painelFerramentas.setLayout(painelFerramentasLayout);
        painelFerramentasLayout.setHorizontalGroup(
            painelFerramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFerramentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLinha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRetangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnElipse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPoligono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLados, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCorContorno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkSemCorContorno)
                .addGap(12, 12, 12)
                .addComponent(btnCorPreenchimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkSemCorPreenchimento)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        painelFerramentasLayout.setVerticalGroup(
            painelFerramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFerramentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFerramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLinha)
                    .addComponent(btnRetangulo)
                    .addComponent(btnElipse)
                    .addComponent(btnCorContorno)
                    .addComponent(checkSemCorContorno)
                    .addComponent(btnCorPreenchimento)
                    .addComponent(checkSemCorPreenchimento)
                    .addComponent(btnPoligono)
                    .addComponent(txtLados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelDesenho.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                painelDesenhoMouseDragged(evt);
            }
        });
        painelDesenho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                painelDesenhoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                painelDesenhoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout painelDesenhoLayout = new javax.swing.GroupLayout(painelDesenho);
        painelDesenho.setLayout(painelDesenhoLayout);
        painelDesenhoLayout.setHorizontalGroup(
            painelDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        painelDesenhoLayout.setVerticalGroup(
            painelDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFerramentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelDesenho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelFerramentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDesenho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void painelDesenhoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelDesenhoMousePressed
        xPress = evt.getX();
        yPress = evt.getY();
    }//GEN-LAST:event_painelDesenhoMousePressed

    private void painelDesenhoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelDesenhoMouseReleased
        
        FormaGeometrica novaForma = criarNovaForma( evt );
        painelDesenho.setFormaTemporaria( null );
        painelDesenho.adicionarForma( novaForma );
        painelDesenho.repaint();
        
    }//GEN-LAST:event_painelDesenhoMouseReleased

    private void painelDesenhoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelDesenhoMouseDragged
        
        FormaGeometrica formaTemp = criarNovaForma( evt );
        painelDesenho.setFormaTemporaria( formaTemp );
        painelDesenho.repaint();
        
    }//GEN-LAST:event_painelDesenhoMouseDragged

    private void btnCorContornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorContornoActionPerformed
        
        Color c = JColorChooser.showDialog( 
                this, 
                "Cor Contorno", 
                btnCorContorno.getForeground() );
        
        if ( c != null ) {
            btnCorContorno.setForeground( c );
        }
        
    }//GEN-LAST:event_btnCorContornoActionPerformed

    private void btnCorPreenchimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorPreenchimentoActionPerformed
        
        Color c = JColorChooser.showDialog( 
                this, 
                "Cor Preenchimento", 
                btnCorPreenchimento.getForeground() );
        
        if ( c != null ) {
            btnCorPreenchimento.setForeground( c );
        }
        
    }//GEN-LAST:event_btnCorPreenchimentoActionPerformed

    private void txtLadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLadosActionPerformed

    private void checkSemCorContornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSemCorContornoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkSemCorContornoActionPerformed

    private FormaGeometrica criarNovaForma( MouseEvent evt ) {
        
        FormaGeometrica novaForma = null;
        
        if ( btnLinha.isSelected() ) {
            novaForma = new Linha();
        } else if ( btnRetangulo.isSelected() ) {
            novaForma = new Retangulo();
        } else if ( btnElipse.isSelected() ) {
            novaForma = new Elipse();
        } else if( btnPoligono.isSelected() ){
            
            
            int c1 = evt.getX() - xPress ;
            int c2 = evt.getY() - yPress ;
            int h = (int) Math.sqrt( c1*c1 + c2*c2 );
            
            
            Poligono p = new Poligono();
            p.setQuantidadeLados( Integer.parseInt( txtLados.getText() ) );
            p.setRaio( h );
            p.setAngulo( Math.toDegrees( Math.atan2( c2, c1 ) ) );
            
            novaForma = p;
        }
        
        novaForma.setxIni( xPress );
        novaForma.setyIni( yPress );
        novaForma.setxFim( evt.getX() );
        novaForma.setyFim( evt.getY() );
        
        if ( checkSemCorContorno.isSelected() ) {
            novaForma.setCorContorno( null );
        } else {
            novaForma.setCorContorno( btnCorContorno.getForeground() );
        }
        
        if ( checkSemCorPreenchimento.isSelected() ) {
            novaForma.setCorPreenchimento( null );
        } else {
            novaForma.setCorPreenchimento( btnCorPreenchimento.getForeground() );
        }
        
        return novaForma;
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main( String args[] ) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for ( javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels() ) {
                if ( "Nimbus".equals( info.getName() ) ) {
                    javax.swing.UIManager.setLookAndFeel( info.getClassName() );
                    break;
                }
            }
        } catch ( ClassNotFoundException ex ) {
            java.util.logging.Logger.getLogger( JanelaPrincipal.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        } catch ( InstantiationException ex ) {
            java.util.logging.Logger.getLogger( JanelaPrincipal.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        } catch ( IllegalAccessException ex ) {
            java.util.logging.Logger.getLogger( JanelaPrincipal.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        } catch ( javax.swing.UnsupportedLookAndFeelException ex ) {
            java.util.logging.Logger.getLogger( JanelaPrincipal.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater( new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible( true );
            }
        } );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCorContorno;
    private javax.swing.JButton btnCorPreenchimento;
    private javax.swing.JToggleButton btnElipse;
    private javax.swing.ButtonGroup btnGroupTipoDesenho;
    private javax.swing.JToggleButton btnLinha;
    private javax.swing.JToggleButton btnPoligono;
    private javax.swing.JToggleButton btnRetangulo;
    private javax.swing.JCheckBox checkSemCorContorno;
    private javax.swing.JCheckBox checkSemCorPreenchimento;
    private meupaint.gui.PainelDesenho painelDesenho;
    private javax.swing.JPanel painelFerramentas;
    private javax.swing.JTextField txtLados;
    // End of variables declaration//GEN-END:variables
}
