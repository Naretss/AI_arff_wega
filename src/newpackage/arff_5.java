/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import AI_arff.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.ButtonModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author User
 */
public class arff_5 extends javax.swing.JFrame {

    /**
     * Creates new form arff_1
     */
    public arff_5() {
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
        jLabel1 = new javax.swing.JLabel();
        JR_11 = new javax.swing.JRadioButton();
        JR_3 = new javax.swing.JRadioButton();
        JR_4 = new javax.swing.JRadioButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        Ques_3 = new javax.swing.JPanel();
        JR_6 = new javax.swing.JRadioButton();
        JR_7 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        JR_9 = new javax.swing.JRadioButton();
        JR_12 = new javax.swing.JRadioButton();
        Ques_2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        JR_10 = new javax.swing.JRadioButton();
        JR_1 = new javax.swing.JRadioButton();
        JR_2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        JL_name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        backgroud.setBackground(new java.awt.Color(0, 28, 51));

        Ques_1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        jLabel1.setText("13) อายุการเก็บรักษา");

        Q_2.add(JR_11);
        JR_11.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        JR_11.setText(" น้อยกว่า 1 วัน");
        JR_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR_11ActionPerformed(evt);
            }
        });

        Q_2.add(JR_3);
        JR_3.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        JR_3.setText("มากกว่า 1 วันแต่ไม่เกิน 1 สัปดาห์");
        JR_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR_3ActionPerformed(evt);
            }
        });

        Q_2.add(JR_4);
        JR_4.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        JR_4.setText("มากกว่า 1 สัปดาห์");
        JR_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR_4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Ques_1Layout = new javax.swing.GroupLayout(Ques_1);
        Ques_1.setLayout(Ques_1Layout);
        Ques_1Layout.setHorizontalGroup(
            Ques_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ques_1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(Ques_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JR_11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addComponent(JR_3, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(JR_4, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        Ques_1Layout.setVerticalGroup(
            Ques_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ques_1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGroup(Ques_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Ques_1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(JR_11))
                    .addGroup(Ques_1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(Ques_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JR_3)
                            .addComponent(JR_4))))
                .addContainerGap(42, Short.MAX_VALUE))
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
        JR_6.setText(" น้อย");
        JR_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR_6ActionPerformed(evt);
            }
        });

        Q_3.add(JR_7);
        JR_7.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        JR_7.setText(" ปานกลาง");

        jLabel6.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        jLabel6.setText("15) ความเหนียวของอาหาร(เคี้ยว)");

        Q_3.add(JR_9);
        JR_9.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        JR_9.setText(" มาก");

        Q_3.add(JR_12);
        JR_12.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        JR_12.setText(" ไม่เหนียว");
        JR_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR_12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Ques_3Layout = new javax.swing.GroupLayout(Ques_3);
        Ques_3.setLayout(Ques_3Layout);
        Ques_3Layout.setHorizontalGroup(
            Ques_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ques_3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(Ques_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Ques_3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(388, 388, 388))
                    .addGroup(Ques_3Layout.createSequentialGroup()
                        .addComponent(JR_12, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JR_6, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(JR_7, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addComponent(JR_9, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        Ques_3Layout.setVerticalGroup(
            Ques_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ques_3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(Ques_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Ques_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JR_7)
                        .addComponent(JR_9)
                        .addComponent(JR_6))
                    .addComponent(JR_12))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        Ques_2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        jLabel7.setText("14) ลักษณะของอาหาร");

        Q_1.add(JR_10);
        JR_10.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        JR_10.setText("เหลว");
        JR_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR_10ActionPerformed(evt);
            }
        });

        Q_1.add(JR_1);
        JR_1.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        JR_1.setText(" แข็ง");
        JR_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR_1ActionPerformed(evt);
            }
        });

        Q_1.add(JR_2);
        JR_2.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        JR_2.setText(" กึ่งเหลวกึ่งแข็ง");
        JR_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR_2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Ques_2Layout = new javax.swing.GroupLayout(Ques_2);
        Ques_2.setLayout(Ques_2Layout);
        Ques_2Layout.setHorizontalGroup(
            Ques_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ques_2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(Ques_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(Ques_2Layout.createSequentialGroup()
                        .addComponent(JR_10, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(JR_1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(JR_2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(405, Short.MAX_VALUE))
        );
        Ques_2Layout.setVerticalGroup(
            Ques_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ques_2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(Ques_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JR_1)
                    .addComponent(JR_10)
                    .addComponent(JR_2))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        JL_name.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        JL_name.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout backgroudLayout = new javax.swing.GroupLayout(backgroud);
        backgroud.setLayout(backgroudLayout);
        backgroudLayout.setHorizontalGroup(
            backgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroudLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(backgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroudLayout.createSequentialGroup()
                        .addGroup(backgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Ques_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ques_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ques_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(backgroudLayout.createSequentialGroup()
                        .addComponent(JL_name, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        backgroudLayout.setVerticalGroup(
            backgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroudLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ques_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Ques_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Ques_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
			
			if(JR_11.isSelected()) writer.write("Less-than-1-day,");
			if(JR_3.isSelected()) writer.write("More-than-1-day-but-less-than-1-week,");
                        if(JR_4.isSelected()) writer.write("More-than-1-week,");

                        
                        if(JR_10.isSelected()) writer.write("fluid,");
			if(JR_1.isSelected()) writer.write("hard,");
                        if(JR_2.isSelected()) writer.write("Semi-solid,");

                        
			if(JR_12.isSelected()) writer.write("none,");
			if(JR_6.isSelected()) writer.write("small,");
                        if(JR_7.isSelected()) writer.write("midium,");
                        if(JR_9.isSelected()) writer.write("large,");
                        
                        writer.write("?"); //the end test
			writer.close();
			
			System.out.println("Write success! page3");
			
		} catch (Exception e) {
		System.out.println(e);
		}
                
        EST_tset form1 = new EST_tset();
        form1.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void JR_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JR_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JR_4ActionPerformed

    private void JR_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JR_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JR_3ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setVisible(false);                 
    }//GEN-LAST:event_jLabel2MouseClicked

    private void JR_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JR_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JR_6ActionPerformed

    private void JR_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JR_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JR_11ActionPerformed

    private void JR_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JR_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JR_12ActionPerformed

    private void JR_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JR_1ActionPerformed

    }//GEN-LAST:event_JR_1ActionPerformed

    private void JR_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JR_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JR_10ActionPerformed

    private void JR_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JR_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JR_2ActionPerformed

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
            java.util.logging.Logger.getLogger(arff_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(arff_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(arff_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(arff_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new arff_5().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_name;
    private javax.swing.JRadioButton JR_1;
    private javax.swing.JRadioButton JR_10;
    private javax.swing.JRadioButton JR_11;
    private javax.swing.JRadioButton JR_12;
    private javax.swing.JRadioButton JR_2;
    private javax.swing.JRadioButton JR_3;
    private javax.swing.JRadioButton JR_4;
    private javax.swing.JRadioButton JR_6;
    private javax.swing.JRadioButton JR_7;
    private javax.swing.JRadioButton JR_9;
    private javax.swing.ButtonGroup Q_1;
    private javax.swing.ButtonGroup Q_2;
    private javax.swing.ButtonGroup Q_3;
    private javax.swing.JPanel Ques_1;
    private javax.swing.JPanel Ques_2;
    private javax.swing.JPanel Ques_3;
    private javax.swing.JPanel backgroud;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
