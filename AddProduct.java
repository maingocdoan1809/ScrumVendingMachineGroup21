/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import DataSource.Repository.ProductRepository;
import Models.Observer.Observer;
import Models.Observer.Subject;
import Models.Product;
import javax.swing.JOptionPane;

/**
 *
 * @author MAI NGOC DOAN
 */
/**
 * Adproduct là một subject. Ở đây thường là Screen (Observer) gọi đến command
 * là tạo một sản phẩm mới (Elearning)
 */
public class AddProduct extends javax.swing.JPanel implements Subject {

  private Observer caller = null;
  private Product newProduct = null;

  /**
   * Creates new form AddProduct
   */
  public AddProduct() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated
  // Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    txtPPrice = new javax.swing.JTextField();
    label2 = new javax.swing.JLabel();
    txtPName = new javax.swing.JTextField();
    txtPRemain = new javax.swing.JTextField();
    label5 = new javax.swing.JLabel();
    btnAdd = new javax.swing.JButton();

    setLayout(new java.awt.BorderLayout());

    jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Thêm sản phẩm");
    add(jLabel1, java.awt.BorderLayout.PAGE_START);

    jLabel2.setText("Name");

    txtPPrice.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtPPriceActionPerformed(evt);
      }
    });

    label2.setText("Giá");

    label5.setText("Số lượng ban đầu");

    btnAdd.setText("Thêm");
    btnAdd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAddActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout
                    .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 309,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPRemain, javax.swing.GroupLayout.PREFERRED_SIZE, 309,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPName, javax.swing.GroupLayout.PREFERRED_SIZE, 309,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPName, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2)
                    .addComponent(txtPPrice, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label5)
                    .addComponent(txtPRemain, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(btnAdd)
                .addContainerGap(89, Short.MAX_VALUE)));

    add(jPanel1, java.awt.BorderLayout.CENTER);
  }// </editor-fold>//GEN-END:initComponents

  private void txtPPriceActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPPriceActionPerformed
    // TODO add your handling code here:
  }// GEN-LAST:event_txtPPriceActionPerformed

  // lưu sự kiện thêm mới sản phẩm
  private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAddActionPerformed

    // Tạo một repository đến Product.
    ProductRepository pRepos = new ProductRepository();

    try {
      String name = this.txtPName.getText();
      String price = this.txtPPrice.getText();
      String remain = this.txtPRemain.getText();

      if (name.equals("") || price.equals("") || remain.equals("")) {
        throw new Exception("Vui lòng nhập tất cả thông tin");
      }

      float fprice = (float) 0.0;

      try {
        fprice = Float.parseFloat(price);
      } catch (Exception e) {
        throw new Exception("Giá tiền không hợp lệ.");
      }

      int iremain = 0;

      // lấy id hiện thời + 1 của bảng Product.

      Product p = new Product(pRepos.getNextId());
      // lưu các thông tin cần thiết
      p.setName(name);
      p.setPrice(fprice);
      p.setRemainNums(iremain);
      // nếu lưu thành công thì sẽ redirect đến một file khác
      if (pRepos.insert(p)) {
        newProduct = p;
        this.notifyObservers();
      }

    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "");
    }

  }// GEN-LAST:event_btnAddActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAdd;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel label2;
  private javax.swing.JLabel label5;
  private javax.swing.JTextField txtPName;
  private javax.swing.JTextField txtPPrice;
  private javax.swing.JTextField txtPRemain;
  // End of variables declaration//GEN-END:variables

  @Override
  public void register(Observer observer) {
    this.caller = observer;
  }

  @Override
  public void removeObserver(Observer observer) {
    this.caller = null;
  }

  @Override
  public void notifyObservers() {
    this.caller.update(this);
  }

  public Product getNewProduct() {
    return this.newProduct;
  }
}
