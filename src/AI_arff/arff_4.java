/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AI_arff;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author User
 */
public class arff_4 extends javax.swing.JFrame {

    
    public arff_4() {
        initComponents();
//        setExtendedState(MAXIMIZED_BOTH);
             NameFood user = new NameFood(); 
        JL_name.setText(user.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Q_1 = new javax.swing.ButtonGroup();
        Q_2 = new javax.swing.ButtonGroup();
        Q_3 = new javax.swing.ButtonGroup();
        backgroud = new javax.swing.JPanel();
        Ques_1 = new javax.swing.JPanel();
        JR_1 = new javax.swing.JRadioButton();
        JR_22 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        Ques_3 = new javax.swing.JPanel();
        JR_6 = new javax.swing.JRadioButton();
        JR_7 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        Ques_2 = new javax.swing.JPanel();
        JR_3 = new javax.swing.JRadioButton();
        JR_4 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        JR_5 = new javax.swing.JRadioButton();
        JR_8 = new javax.swing.JRadioButton();
        JL_name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        backgroud.setBackground(new java.awt.Color(0, 28, 51));

        Ques_1.setBackground(new java.awt.Color(255, 255, 255));

        Q_1.add(JR_1);
        JR_1.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        JR_1.setText(" มี");
        JR_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR_1ActionPerformed(evt);
            }
        });

        Q_1.add(JR_22);
        JR_22.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        JR_22.setText(" ไม่มี");

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        jLabel1.setText("10) เครื่องเคียง");

        javax.swing.GroupLayout Ques_1Layout = new javax.swing.GroupLayout(Ques_1);
        Ques_1.setLayout(Ques_1Layout);
        Ques_1Layout.setHorizontalGroup(
            Ques_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ques_1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(Ques_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(Ques_1Layout.createSequentialGroup()
                        .addComponent(JR_1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(JR_22, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(662, Short.MAX_VALUE))
        );
        Ques_1Layout.setVerticalGroup(
            Ques_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ques_1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(Ques_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JR_1)
                    .addComponent(JR_22))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jToggleButton1.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        jToggleButton1.setText("หน้าถัดไป");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        Ques_3.setBackground(new java.awt.Color(255, 255, 255));

        Q_3.add(JR_6);
        JR_6.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        JR_6.setText(" เย็น");
        JR_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR_6ActionPerformed(evt);
            }
        });

        Q_3.add(JR_7);
        JR_7.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        JR_7.setText(" ร้อน");

        jLabel6.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        jLabel6.setText("12) อุณหภูมิของอาหาร");

        javax.swing.GroupLayout Ques_3Layout = new javax.swing.GroupLayout(Ques_3);
        Ques_3.setLayout(Ques_3Layout);
        Ques_3Layout.setHorizontalGroup(
            Ques_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ques_3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(Ques_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(Ques_3Layout.createSequentialGroup()
                        .addComponent(JR_6, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(JR_7, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(660, Short.MAX_VALUE))
        );
        Ques_3Layout.setVerticalGroup(
            Ques_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ques_3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(25, 25, 25)
                .addGroup(Ques_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JR_6)
                    .addComponent(JR_7))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Ques_2.setBackground(new java.awt.Color(255, 255, 255));

        Q_2.add(JR_3);
        JR_3.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        JR_3.setText("แป้งสำหรับทอด");
        JR_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR_3ActionPerformed(evt);
            }
        });

        Q_2.add(JR_4);
        JR_4.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        JR_4.setText("แป้งมัน");
        JR_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR_4ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        jLabel7.setText("11) แป้งสำหรับทำอาหาร");

        Q_2.add(JR_5);
        JR_5.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        JR_5.setText("แป้งข้าวโพด");
        JR_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR_5ActionPerformed(evt);
            }
        });

        Q_2.add(JR_8);
        JR_8.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        JR_8.setText(" ไม่มี");
        JR_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR_8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Ques_2Layout = new javax.swing.GroupLayout(Ques_2);
        Ques_2.setLayout(Ques_2Layout);
        Ques_2Layout.setHorizontalGroup(
            Ques_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ques_2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(Ques_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Ques_2Layout.createSequentialGroup()
                        .addComponent(JR_8, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JR_3)
                        .addGap(51, 51, 51)
                        .addComponent(JR_5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(JR_4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(Ques_2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(853, Short.MAX_VALUE))))
        );
        Ques_2Layout.setVerticalGroup(
            Ques_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ques_2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(Ques_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JR_3)
                    .addComponent(JR_4)
                    .addComponent(JR_5)
                    .addComponent(JR_8))
                .addGap(21, 21, 21))
        );

        JL_name.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        JL_name.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout backgroudLayout = new javax.swing.GroupLayout(backgroud);
        backgroud.setLayout(backgroudLayout);
        backgroudLayout.setHorizontalGroup(
            backgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroudLayout.createSequentialGroup()
                .addGroup(backgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroudLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Ques_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroudLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(backgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ques_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ques_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(backgroudLayout.createSequentialGroup()
                                .addGap(1011, 1011, 1011)
                                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JL_name, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        backgroudLayout.setVerticalGroup(
            backgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroudLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(JL_name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ques_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Ques_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Ques_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void read(){
		String path = "C:\\Users\\User\\Desktop\\AI\\attribute.arff";
		File file = new File(path);
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
		String path = "C:\\Users\\User\\Desktop\\AI\\attribute_test.arff";
		File file = new File(path);
		
		FileWriter writer;
		try {
			
			writer = new FileWriter(file, true);  //True = Append to file, false = Overwrite

                        
                    if(JR_1.isSelected() || JR_22.isSelected()){               
                      if(JR_3.isSelected() || JR_4.isSelected() || JR_5.isSelected() || JR_8.isSelected()){       
                           if(JR_6.isSelected() || JR_7.isSelected()){       
                                            
                                    if(JR_1.isSelected()) writer.write("have,");
                                    if(JR_22.isSelected()) writer.write("none,");

                                    if(JR_8.isSelected()) writer.write("none,");
                                    if(JR_3.isSelected()) writer.write("Dough,");
                                    if(JR_5.isSelected()) writer.write("Cornflour,");
                                    if(JR_4.isSelected()) writer.write("cassava_starch,");

                                    if(JR_6.isSelected()) writer.write("cold,");
                                    if(JR_7.isSelected()) writer.write("hot,");
                                    
                                    arff_5 form1 = new arff_5();
                                    form1.setVisible(true);
                                    setVisible(false);           

                            }else JOptionPane.showMessageDialog(null, "กรุณาเลือกคำตอบข้อที่ 12 ", "คำเตือน",JOptionPane.ERROR_MESSAGE);
                        }else JOptionPane.showMessageDialog(null, "กรุณาเลือกคำตอบข้อที่ 11 ", "คำเตือน",JOptionPane.ERROR_MESSAGE);
                    }else JOptionPane.showMessageDialog(null, "กรุณาเลือกคำตอบข้อที่ 10 ", "คำเตือน",JOptionPane.ERROR_MESSAGE);
                    
                    
			writer.close();
			
			System.out.println("Write success! page4");
			
		} catch (Exception e) {
		System.out.println(e);
		}
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void JR_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JR_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JR_4ActionPerformed

    private void JR_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JR_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JR_6ActionPerformed

    private void JR_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JR_1ActionPerformed

    }//GEN-LAST:event_JR_1ActionPerformed

    private void JR_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JR_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JR_3ActionPerformed

    private void JR_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JR_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JR_5ActionPerformed

    private void JR_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JR_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JR_8ActionPerformed

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
            java.util.logging.Logger.getLogger(arff_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(arff_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(arff_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(arff_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new arff_4().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_name;
    private javax.swing.JRadioButton JR_1;
    private javax.swing.JRadioButton JR_22;
    private javax.swing.JRadioButton JR_3;
    private javax.swing.JRadioButton JR_4;
    private javax.swing.JRadioButton JR_5;
    private javax.swing.JRadioButton JR_6;
    private javax.swing.JRadioButton JR_7;
    private javax.swing.JRadioButton JR_8;
    private javax.swing.ButtonGroup Q_1;
    private javax.swing.ButtonGroup Q_2;
    private javax.swing.ButtonGroup Q_3;
    private javax.swing.JPanel Ques_1;
    private javax.swing.JPanel Ques_2;
    private javax.swing.JPanel Ques_3;
    private javax.swing.JPanel backgroud;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
