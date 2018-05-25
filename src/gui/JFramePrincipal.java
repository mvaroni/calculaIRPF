/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import business.Controller;
import javax.swing.JOptionPane;

/**
 *
 * @author 14202122
 */
public class JFramePrincipal extends javax.swing.JFrame {

    Controller controller = new Controller();
    
    /**
     * Creates new form JFramePrincipal
     */
    public JFramePrincipal() {
        initComponents();
        jgbtnTipo.add(jrbCompleto);
        jgbtnTipo.add(jrbSimplificado);
        jrbCompleto.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jgbtnTipo = new javax.swing.ButtonGroup();
        jpnPrincipal = new javax.swing.JPanel();
        jlblTitulo = new javax.swing.JLabel();
        jlblNome = new javax.swing.JLabel();
        jlblCPF = new javax.swing.JLabel();
        jlblIdade = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jtfCPF = new javax.swing.JTextField();
        jtfIdade = new javax.swing.JTextField();
        jlblNroDependentes = new javax.swing.JLabel();
        jtfNroDependentes = new javax.swing.JTextField();
        jlblContrPrevOficial = new javax.swing.JLabel();
        jlblTotRendimentos = new javax.swing.JLabel();
        jtfContrPrevOficial = new javax.swing.JTextField();
        jtfTotRendimentos = new javax.swing.JTextField();
        jrbSimplificado = new javax.swing.JRadioButton();
        jrbCompleto = new javax.swing.JRadioButton();
        jbtnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlblTitulo.setText("Cálculo de IRPF");

        jlblNome.setText("Nome:");

        jlblCPF.setText("CPF:");

        jlblIdade.setText("Idade:");

        jlblNroDependentes.setText("Nº Dependentes:");

        jlblContrPrevOficial.setText("Contribuição de Previdência Oficial:");

        jlblTotRendimentos.setText("Total de Rendimentos:");

        jrbSimplificado.setText("Simplificado");

        jrbCompleto.setText("Completo");

        jbtnCalcular.setText("Calcular");
        jbtnCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnCalcularMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnPrincipalLayout = new javax.swing.GroupLayout(jpnPrincipal);
        jpnPrincipal.setLayout(jpnPrincipalLayout);
        jpnPrincipalLayout.setHorizontalGroup(
            jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnPrincipalLayout.createSequentialGroup()
                .addGroup(jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnPrincipalLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jrbCompleto)
                        .addGap(18, 18, 18)
                        .addComponent(jrbSimplificado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnCalcular))
                    .addGroup(jpnPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblContrPrevOficial)
                            .addComponent(jlblTotRendimentos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfTotRendimentos)
                            .addComponent(jtfContrPrevOficial)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnPrincipalLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jlblTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnPrincipalLayout.createSequentialGroup()
                                .addComponent(jlblNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpnPrincipalLayout.createSequentialGroup()
                                .addComponent(jlblCPF)
                                .addGap(18, 18, 18)
                                .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblNroDependentes)
                            .addComponent(jlblIdade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNroDependentes, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(jtfIdade))))
                .addGap(62, 62, 62))
        );
        jpnPrincipalLayout.setVerticalGroup(
            jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblTitulo)
                .addGap(18, 18, 18)
                .addGroup(jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblNome)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblIdade)
                    .addComponent(jtfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblCPF)
                    .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblNroDependentes)
                    .addComponent(jtfNroDependentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblContrPrevOficial)
                    .addComponent(jtfContrPrevOficial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTotRendimentos)
                    .addComponent(jtfTotRendimentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbSimplificado)
                    .addComponent(jrbCompleto)
                    .addComponent(jbtnCalcular))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCalcularMouseClicked
        //Calcula o IRPF
        JOptionPane.showMessageDialog(jpnPrincipal,
                                      controller.calculaIRPF(jrbCompleto.isSelected(),
                                                             jtfNome.getText(), 
                                                             jtfCPF.getText(), 
                                                             jtfIdade.getText(), 
                                                             jtfNroDependentes.getText(), 
                                                             jtfContrPrevOficial.getText(), 
                                                             jtfTotRendimentos.getText()),
                                      "ALERTA",
                                      JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jbtnCalcularMouseClicked

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
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnCalcular;
    private javax.swing.ButtonGroup jgbtnTipo;
    private javax.swing.JLabel jlblCPF;
    private javax.swing.JLabel jlblContrPrevOficial;
    private javax.swing.JLabel jlblIdade;
    private javax.swing.JLabel jlblNome;
    private javax.swing.JLabel jlblNroDependentes;
    private javax.swing.JLabel jlblTitulo;
    private javax.swing.JLabel jlblTotRendimentos;
    private javax.swing.JPanel jpnPrincipal;
    private javax.swing.JRadioButton jrbCompleto;
    private javax.swing.JRadioButton jrbSimplificado;
    private javax.swing.JTextField jtfCPF;
    private javax.swing.JTextField jtfContrPrevOficial;
    private javax.swing.JTextField jtfIdade;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNroDependentes;
    private javax.swing.JTextField jtfTotRendimentos;
    // End of variables declaration//GEN-END:variables
}