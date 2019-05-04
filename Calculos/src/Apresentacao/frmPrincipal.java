/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Apresentacao;

/**
 *
 * @author n280hj5
 */
public class frmPrincipal extends javax.swing.JDialog
{

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        mnbCalculos = new javax.swing.JMenuBar();
        mnuCalculos = new javax.swing.JMenu();
        mniFatorial = new javax.swing.JMenuItem();
        mniPrimo = new javax.swing.JMenuItem();
        mniTriangulos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mnuCalculos.setText("Calculos");

        mniFatorial.setText("Fatorial");
        mniFatorial.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mniFatorialActionPerformed(evt);
            }
        });
        mnuCalculos.add(mniFatorial);

        mniPrimo.setText("Primo");
        mniPrimo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mniPrimoActionPerformed(evt);
            }
        });
        mnuCalculos.add(mniPrimo);

        mniTriangulos.setText("Triangulo");
        mniTriangulos.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mniTriangulosActionPerformed(evt);
            }
        });
        mnuCalculos.add(mniTriangulos);

        mnbCalculos.add(mnuCalculos);

        setJMenuBar(mnbCalculos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniPrimoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mniPrimoActionPerformed
    {//GEN-HEADEREND:event_mniPrimoActionPerformed
        frmPrimo frmP = new frmPrimo(null, true);
        frmP.setVisible(true);
    }//GEN-LAST:event_mniPrimoActionPerformed

    private void mniFatorialActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mniFatorialActionPerformed
    {//GEN-HEADEREND:event_mniFatorialActionPerformed
        frmFatorial frmF = new frmFatorial(null, true);
        frmF.setVisible(true);
    }//GEN-LAST:event_mniFatorialActionPerformed

    private void mniTriangulosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mniTriangulosActionPerformed
    {//GEN-HEADEREND:event_mniTriangulosActionPerformed
        frmTriangulos frmT = new frmTriangulos(null, true);
        frmT.setVisible(true);
    }//GEN-LAST:event_mniTriangulosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmPrincipal dialog = new frmPrincipal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar mnbCalculos;
    private javax.swing.JMenuItem mniFatorial;
    private javax.swing.JMenuItem mniPrimo;
    private javax.swing.JMenuItem mniTriangulos;
    private javax.swing.JMenu mnuCalculos;
    // End of variables declaration//GEN-END:variables
}
