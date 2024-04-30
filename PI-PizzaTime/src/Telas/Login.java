/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

/**
 *
 * @author nicolas.gbmarco
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        lblNome = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        lblCadastrar = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PizzaTime - Login");
        getContentPane().setLayout(null);

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 0, 0));
        lblNome.setText("Nome: ");
        getContentPane().add(lblNome);
        lblNome.setBounds(50, 80, 50, 30);

        lblSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(0, 0, 0));
        lblSenha.setText("Senha: ");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(50, 140, 50, 30);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(100, 140, 160, 30);
        getContentPane().add(txtNome);
        txtNome.setBounds(100, 80, 160, 30);

        btnLogin.setText("Login");
        getContentPane().add(btnLogin);
        btnLogin.setBounds(100, 190, 160, 40);

        lblCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        lblCadastrar.setText("Não Possui Cadastro?");
        getContentPane().add(lblCadastrar);
        lblCadastrar.setBounds(120, 240, 130, 30);

        btnCadastrar.setText("Cadastrar");
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(130, 270, 90, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor.ssousa4\\Desktop\\teste\\Senac-PizzaTime\\PI-PizzaTime\\Assets\\Logo.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 0, 180, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor.ssousa4\\Desktop\\teste\\Senac-PizzaTime\\PI-PizzaTime\\Assets\\Logo-BackGround.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, -20, 370, 90);

        jLabel3.setBackground(new java.awt.Color(220, 220, 220));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 70, 370, 300);

        setSize(new java.awt.Dimension(359, 363));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}