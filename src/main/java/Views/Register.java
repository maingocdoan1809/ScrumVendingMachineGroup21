/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import DataSource.Repository.BankAccountRepository;
import DataSource.Repository.UserRepository;
import Models.BankAccount;
import Models.User;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author MAI NGOC DOAN
 */

 /**
  * Form đắng kí cái gì học viên
  */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    private long startTime = 0;
    private BankAccount account = null;

    public Register() {
        initComponents();
        this.txtBankAccount.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                JTextField txt = (JTextField) e.getSource();
                getBankAccount(txt.getText(), new String(txtBankPassword.getPassword()));
                startTime = e.getWhen();
            }

        });
        this.txtBankPassword.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                JPasswordField txt = (JPasswordField) e.getSource();
                getBankAccount(txtBankAccount.getText(), new String(txt.getPassword()));
                startTime = e.getWhen();
            }

        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel Username = new javax.swing.JLabel();
        javax.swing.JLabel Username1 = new javax.swing.JLabel();
        txtRetypePassword = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        javax.swing.JLabel Username2 = new javax.swing.JLabel();
        javax.swing.JLabel Username3 = new javax.swing.JLabel();
        javax.swing.JLabel Username4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        txtBankAUserName = new javax.swing.JTextField();
        javax.swing.JLabel Username5 = new javax.swing.JLabel();
        txtBankAccount = new javax.swing.JTextField();
        txtBankName = new javax.swing.JTextField();
        javax.swing.JLabel Username6 = new javax.swing.JLabel();
        txtBankPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register");

        Username.setText("Username");

        Username1.setText("Bank Account");

        txtRetypePassword.setBackground(new java.awt.Color(204, 204, 204));

        btnRegister.setBackground(new java.awt.Color(204, 204, 255));
        btnRegister.setForeground(new java.awt.Color(0, 0, 51));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        Username2.setText("Re-type password");

        Username3.setText("Bank's account name");

        Username4.setText("Password");

        txtPassword.setBackground(new java.awt.Color(204, 204, 204));

        txtUsername.setBackground(new java.awt.Color(204, 204, 204));

        txtBankAUserName.setBackground(new java.awt.Color(102, 102, 102));
        txtBankAUserName.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtBankAUserName.setEnabled(false);

        Username5.setText("Bank's Password");

        txtBankAccount.setBackground(new java.awt.Color(204, 204, 204));

        txtBankName.setBackground(new java.awt.Color(102, 102, 102));
        txtBankName.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtBankName.setEnabled(false);

        Username6.setText("Bank's Name");

        txtBankPassword.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(205, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Username)
                            .addComponent(Username1)
                            .addComponent(Username2)
                            .addComponent(Username3)
                            .addComponent(Username4)
                            .addComponent(Username6)
                            .addComponent(Username5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBankPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtRetypePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBankAUserName)
                                    .addComponent(txtBankName))
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUsername)
                                .addComponent(txtBankAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username4))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRetypePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username1)
                    .addComponent(txtBankAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username5)
                    .addComponent(txtBankPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBankAUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username6))
                .addGap(42, 42, 42)
                .addComponent(btnRegister)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

        // lấy tấ cả thông tin trong trường
        String txtUsername = this.txtUsername.getText();
        String txtPassword = new String(this.txtPassword.getPassword()).trim();
        String txtRetypePassword = new String(this.txtRetypePassword.getPassword()).trim();

        // nếu người dùng nhập sai thì phải báo lỗi
        if (txtPassword.equals("") || txtUsername.equals("") || txtRetypePassword.equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng không để trống dữ liệu.");
            return;
        }

        if (!txtPassword.equals(txtRetypePassword)) {
            JOptionPane.showMessageDialog(null, "Mật khẩu không khớp.");
            return;
        }

        if (this.account == null) {
            JOptionPane.showMessageDialog(null, "Không tìm thấy tài khoản ngân hàng của bạn.");
            return;
        }

        UserRepository userRepos = new UserRepository();

        // nếu đến chỗ này vẫn tốt thì có nghĩa là ta sẽ lưu dữ liệu này vào database,
        try{ 
            userRepos.insert(
                new User(txtUsername)
                    .setPassword(txtPassword)
                    .setAccount(account)
            );
            JOptionPane.showMessageDialog(null, "Tạo tài khoản thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    /**
     * Hàm này để kiểm tra và update liên tục những sản phẩm bán chạy nhất cái đấy đâu
     */
    private void getBankAccount(String bankAccount, String bankPassword) {
        if (!bankAccount.equals("") && !bankPassword.equals("")) {
            BankAccountRepository bankRepos = new BankAccountRepository();
            BankAccount tryAccount = bankRepos.get(bankAccount, bankPassword);
            if (tryAccount != null) {
                this.account = tryAccount;
                this.txtBankAUserName.setText(tryAccount.getBankAccountUsername());
                this.txtBankName.setText(tryAccount.getBankName());
            } else {
                this.txtBankAUserName.setText("");
                this.txtBankName.setText("");
            }

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtBankAUserName;
    private javax.swing.JTextField txtBankAccount;
    private javax.swing.JTextField txtBankName;
    private javax.swing.JPasswordField txtBankPassword;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRetypePassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
