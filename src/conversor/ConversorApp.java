/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conversor;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author Karen Campinas
 */
public class ConversorApp extends javax.swing.JFrame {

    /**
     * Creates new form ConversorApp
     */
    public ConversorApp() {
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

        telaConversor = new javax.swing.JInternalFrame();
        lblQuantia = new java.awt.Label();
        btnConverter = new javax.swing.JButton();
        lblPesoChilenoParaRealValue = new java.awt.Label();
        lblRealParaDolarValue = new java.awt.Label();
        lblRealParaEuroValue = new java.awt.Label();
        lblRealParaLibraValue = new java.awt.Label();
        lblRealParaPesoArgentinoValue = new java.awt.Label();
        lblRealParaPesoChilenoValue = new java.awt.Label();
        lblDolarParaRealValue = new java.awt.Label();
        lblEuroParaRealValue = new java.awt.Label();
        lblLibraParaRealValue = new java.awt.Label();
        lblPesoArgentinoParaRealValue = new java.awt.Label();
        lblRealParaDolar = new java.awt.Label();
        lblRealParaEuro = new java.awt.Label();
        lblRealParaLibra = new java.awt.Label();
        lblRealParaPesoArgentino = new java.awt.Label();
        lblRealParaPesoChileno = new java.awt.Label();
        lblDolarParaReal = new java.awt.Label();
        lblEuroParaReal = new java.awt.Label();
        lblLibraParaReal = new java.awt.Label();
        lblPesoArgentinoParaReal = new java.awt.Label();
        lblPesoChilenoParaReal = new java.awt.Label();
        chooseOption = new javax.swing.JSpinner();
        lblChamada = new java.awt.Label();
        btnClear = new javax.swing.JButton();
        lblDataCotacao = new javax.swing.JLabel();
        lblOption = new java.awt.Label();
        lblAviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 60));
        setResizable(false);

        telaConversor.setBackground(new java.awt.Color(255, 255, 255));
        telaConversor.setForeground(new java.awt.Color(255, 255, 255));
        telaConversor.setMinimumSize(new java.awt.Dimension(22, 27));
        telaConversor.setVisible(true);
        telaConversor.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblQuantia.setBackground(new java.awt.Color(42, 122, 228));
        lblQuantia.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblQuantia.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantia.setText(" Quantia:");
        telaConversor.getContentPane().add(lblQuantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 90, 30));

        telaConversor.getContentPane().add(getSpinnerQuantia(), new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 90, 40));

        btnConverter.setBackground(new java.awt.Color(255, 255, 255));
        btnConverter.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnConverter.setForeground(new java.awt.Color(42, 122, 228));
        btnConverter.setText("Converta");
        btnConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConverterActionPerformed(evt);
            }
        });
        telaConversor.getContentPane().add(btnConverter, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, -1, 30));

        lblPesoChilenoParaRealValue.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblPesoChilenoParaRealValue.setForeground(new java.awt.Color(42, 122, 228));
        lblPesoChilenoParaRealValue.setText("R$");
        telaConversor.getContentPane().add(lblPesoChilenoParaRealValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 326, 220, -1));

        lblRealParaDolarValue.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblRealParaDolarValue.setForeground(new java.awt.Color(42, 122, 228));
        lblRealParaDolarValue.setText("$");
        telaConversor.getContentPane().add(lblRealParaDolarValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 53, 220, 30));

        lblRealParaEuroValue.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblRealParaEuroValue.setForeground(new java.awt.Color(42, 122, 228));
        lblRealParaEuroValue.setText("€");
        telaConversor.getContentPane().add(lblRealParaEuroValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 220, 30));

        lblRealParaLibraValue.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblRealParaLibraValue.setForeground(new java.awt.Color(42, 122, 228));
        lblRealParaLibraValue.setText("£");
        telaConversor.getContentPane().add(lblRealParaLibraValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 113, 220, -1));

        lblRealParaPesoArgentinoValue.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblRealParaPesoArgentinoValue.setForeground(new java.awt.Color(42, 122, 228));
        lblRealParaPesoArgentinoValue.setText("$a");
        telaConversor.getContentPane().add(lblRealParaPesoArgentinoValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 143, 220, 30));

        lblRealParaPesoChilenoValue.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblRealParaPesoChilenoValue.setForeground(new java.awt.Color(42, 122, 228));
        lblRealParaPesoChilenoValue.setText("CLP$");
        telaConversor.getContentPane().add(lblRealParaPesoChilenoValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 173, 220, 30));

        lblDolarParaRealValue.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblDolarParaRealValue.setForeground(new java.awt.Color(42, 122, 228));
        lblDolarParaRealValue.setText("R$");
        telaConversor.getContentPane().add(lblDolarParaRealValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 220, 20));

        lblEuroParaRealValue.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblEuroParaRealValue.setForeground(new java.awt.Color(42, 122, 228));
        lblEuroParaRealValue.setText("R$");
        telaConversor.getContentPane().add(lblEuroParaRealValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 233, 220, 30));

        lblLibraParaRealValue.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblLibraParaRealValue.setForeground(new java.awt.Color(42, 122, 228));
        lblLibraParaRealValue.setText("R$");
        telaConversor.getContentPane().add(lblLibraParaRealValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 220, 40));

        lblPesoArgentinoParaRealValue.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblPesoArgentinoParaRealValue.setForeground(new java.awt.Color(42, 122, 228));
        lblPesoArgentinoParaRealValue.setText("R$");
        telaConversor.getContentPane().add(lblPesoArgentinoParaRealValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 293, 220, 30));

        lblRealParaDolar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblRealParaDolar.setForeground(java.awt.Color.darkGray);
        lblRealParaDolar.setText("1 . Real para Dólar Americano");
        telaConversor.getContentPane().add(lblRealParaDolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 300, 40));

        lblRealParaEuro.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblRealParaEuro.setForeground(java.awt.Color.darkGray);
        lblRealParaEuro.setText("2 . Real para Euro");
        telaConversor.getContentPane().add(lblRealParaEuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 300, 40));

        lblRealParaLibra.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblRealParaLibra.setForeground(java.awt.Color.darkGray);
        lblRealParaLibra.setText("3 . Real para Libra Esterlina");
        telaConversor.getContentPane().add(lblRealParaLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 300, 40));

        lblRealParaPesoArgentino.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblRealParaPesoArgentino.setForeground(java.awt.Color.darkGray);
        lblRealParaPesoArgentino.setText("4 . Real para Peso Argentino");
        telaConversor.getContentPane().add(lblRealParaPesoArgentino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 300, 40));

        lblRealParaPesoChileno.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblRealParaPesoChileno.setForeground(java.awt.Color.darkGray);
        lblRealParaPesoChileno.setText("5 . Real para Peso Chileno");
        telaConversor.getContentPane().add(lblRealParaPesoChileno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 300, 40));

        lblDolarParaReal.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblDolarParaReal.setForeground(java.awt.Color.darkGray);
        lblDolarParaReal.setText("6 . Dólar Americano para Real");
        telaConversor.getContentPane().add(lblDolarParaReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 300, 40));

        lblEuroParaReal.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblEuroParaReal.setForeground(java.awt.Color.darkGray);
        lblEuroParaReal.setText("7 . Euro para Real");
        telaConversor.getContentPane().add(lblEuroParaReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 300, 40));

        lblLibraParaReal.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblLibraParaReal.setForeground(java.awt.Color.darkGray);
        lblLibraParaReal.setText("8 . Libra Esterlina para Real");
        telaConversor.getContentPane().add(lblLibraParaReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 300, 40));

        lblPesoArgentinoParaReal.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblPesoArgentinoParaReal.setForeground(java.awt.Color.darkGray);
        lblPesoArgentinoParaReal.setText("9 . Peso Argentino para Real");
        telaConversor.getContentPane().add(lblPesoArgentinoParaReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 300, 40));

        lblPesoChilenoParaReal.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblPesoChilenoParaReal.setForeground(java.awt.Color.darkGray);
        lblPesoChilenoParaReal.setText("10 . Peso Chileno para Real");
        telaConversor.getContentPane().add(lblPesoChilenoParaReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 300, 40));

        chooseOption.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        telaConversor.getContentPane().add(chooseOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 90, 40));

        lblChamada.setBackground(new java.awt.Color(42, 122, 228));
        lblChamada.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblChamada.setForeground(new java.awt.Color(255, 255, 255));
        lblChamada.setText("   Escolha como deseja converter:");
        telaConversor.getContentPane().add(lblChamada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 670, 40));

        btnClear.setBackground(new java.awt.Color(255, 255, 255));
        btnClear.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(42, 122, 228));
        btnClear.setText("Limpar Tudo");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        telaConversor.getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, 30));

        lblDataCotacao.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        lblDataCotacao.setForeground(java.awt.Color.darkGray);
        lblDataCotacao.setText("<html>Data da cotação:<br><center>07/06/2022</center></html>");
        telaConversor.getContentPane().add(lblDataCotacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 90, 40));

        lblOption.setBackground(new java.awt.Color(42, 122, 228));
        lblOption.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblOption.setForeground(new java.awt.Color(255, 255, 255));
        lblOption.setMinimumSize(new java.awt.Dimension(77, 27));
        lblOption.setText(" Opção:");
        telaConversor.getContentPane().add(lblOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 90, 30));

        lblAviso.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        lblAviso.setForeground(new java.awt.Color(204, 0, 0));
        lblAviso.setText("<html>Apenas a vírgula precedendo os<br>\n centavos será validada pelo programa, não<br>\n utilize pontos.</html>");
        telaConversor.getContentPane().add(lblAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 100, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaConversor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaConversor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private JSpinner getSpinnerQuantia() {
        if (spinnerQuantia == null) {
            spinnerQuantia = new JSpinner();
            spinnerQuantia.setModel(new SpinnerNumberModel(0.0, 0.0, 1000000000000.0, 0.01));
            JSpinner.NumberEditor ne_spinnerQuantia = new JSpinner.NumberEditor(spinnerQuantia, "0.00");
            ne_spinnerQuantia.getFormat().setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(new Locale("pt", "BR")));
            spinnerQuantia.setEditor(ne_spinnerQuantia);
        }
        return spinnerQuantia;
    }
    
    private void btnConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConverterActionPerformed

        BigDecimal quantia = new BigDecimal(getSpinnerQuantia().getValue().toString());
        BigDecimal pDolarHj = new BigDecimal("0.2044613");
        BigDecimal pEuroHj = new BigDecimal("0.1911205");
        BigDecimal pLibraHj = new BigDecimal("0.1623219");
        BigDecimal pPesoArgHj = new BigDecimal("24.7954376");
        BigDecimal  pPesoChilenoHj = new BigDecimal("169.8946653");
        String padrao = "###,###.####";
        DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
        dfs.setDecimalSeparator(',');
        dfs.setGroupingSeparator('.');
        DecimalFormat df = new DecimalFormat(padrao, dfs);
        
        switch (Integer.parseInt(chooseOption.getValue().toString())){
            case 1 -> lblRealParaDolarValue.setText("$ " + df.format(quantia.multiply(pDolarHj)));
            case 2 -> lblRealParaEuroValue.setText("€ " + df.format(quantia.multiply(pEuroHj)));
            case 3 -> lblRealParaLibraValue.setText("£ " + df.format(quantia.multiply(pLibraHj)));
            case 4 -> lblRealParaPesoArgentinoValue.setText("$a " + df.format(quantia.multiply(pPesoArgHj)));
            case 5 -> lblRealParaPesoChilenoValue.setText("CLP$ " + df.format(quantia.multiply(pPesoChilenoHj))); 
            case 6 -> lblDolarParaRealValue.setText("R$ " + df.format(quantia.divide(pDolarHj ,4, RoundingMode.HALF_EVEN)));
            case 7 -> lblEuroParaRealValue.setText("R$ " + df.format(quantia.divide(pEuroHj ,4, RoundingMode.HALF_EVEN)));
            case 8 -> lblLibraParaRealValue.setText("R$ " + df.format(quantia.divide(pLibraHj ,4, RoundingMode.HALF_EVEN)));
            case 9 -> lblPesoArgentinoParaRealValue.setText("R$ " + df.format(quantia.divide(pPesoArgHj ,4, RoundingMode.HALF_EVEN)));
            case 10 -> lblPesoChilenoParaRealValue.setText("R$ " + df.format(quantia.divide(pPesoChilenoHj ,4, RoundingMode.HALF_EVEN)));
        }
    }//GEN-LAST:event_btnConverterActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
                            
                            lblRealParaDolarValue.setText("$ ");
                            lblRealParaEuroValue.setText("€ ");
                            lblRealParaLibraValue.setText("£ ");
                            lblRealParaPesoArgentinoValue.setText("$a ");
                            lblRealParaPesoChilenoValue.setText("CLP$ ");
                            lblDolarParaRealValue.setText("R$ ");
                            lblEuroParaRealValue.setText("R$ ");
                            lblLibraParaRealValue.setText("R$ ");
                            lblPesoArgentinoParaRealValue.setText("R$ ");
                            lblPesoChilenoParaRealValue.setText("R$ ");
    }//GEN-LAST:event_btnClearActionPerformed
    
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
            java.util.logging.Logger.getLogger(ConversorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversorApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnConverter;
    private javax.swing.JSpinner chooseOption;
    private javax.swing.JLabel lblAviso;
    private java.awt.Label lblChamada;
    private javax.swing.JLabel lblDataCotacao;
    private java.awt.Label lblDolarParaReal;
    private java.awt.Label lblDolarParaRealValue;
    private java.awt.Label lblEuroParaReal;
    private java.awt.Label lblEuroParaRealValue;
    private java.awt.Label lblLibraParaReal;
    private java.awt.Label lblLibraParaRealValue;
    private java.awt.Label lblOption;
    private java.awt.Label lblPesoArgentinoParaReal;
    private java.awt.Label lblPesoArgentinoParaRealValue;
    private java.awt.Label lblPesoChilenoParaReal;
    private java.awt.Label lblPesoChilenoParaRealValue;
    private java.awt.Label lblQuantia;
    private java.awt.Label lblRealParaDolar;
    private java.awt.Label lblRealParaDolarValue;
    private java.awt.Label lblRealParaEuro;
    private java.awt.Label lblRealParaEuroValue;
    private java.awt.Label lblRealParaLibra;
    private java.awt.Label lblRealParaLibraValue;
    private java.awt.Label lblRealParaPesoArgentino;
    private java.awt.Label lblRealParaPesoArgentinoValue;
    private java.awt.Label lblRealParaPesoChileno;
    private java.awt.Label lblRealParaPesoChilenoValue;
    private javax.swing.JSpinner spinnerQuantia;
    private javax.swing.JInternalFrame telaConversor;
    // End of variables declaration//GEN-END:variables
}
