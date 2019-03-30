package newpackage;

import AI_arff.*;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


public class form extends javax.swing.JFrame {

    JFileChooser Select_address;

    public form() {
        initComponents();
        setTitle("Notepad");   //ชื่อโปรแกรม
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        mNew = new javax.swing.JMenuItem();
        mOpen = new javax.swing.JMenuItem();
        mSave = new javax.swing.JMenuItem();
        mPrint = new javax.swing.JMenuItem();
        mExit = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        mUndo = new javax.swing.JMenuItem();
        mCut = new javax.swing.JMenuItem();
        mCopy = new javax.swing.JMenuItem();
        mPaste = new javax.swing.JMenuItem();
        mSelectAll = new javax.swing.JMenuItem();
        mHightlight = new javax.swing.JMenuItem();
        menuFont = new javax.swing.JMenu();
        mFont = new javax.swing.JMenuItem();
        menuAbout = new javax.swing.JMenu();
        mAbout = new javax.swing.JMenuItem();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu2ActionPerformed(evt);
            }
        });
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));

        txt.setColumns(20);
        txt.setRows(5);
        jScrollPane2.setViewportView(txt);

        menuFile.setText("File");

        mNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mNew.setText("New");
        mNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNewActionPerformed(evt);
            }
        });
        menuFile.add(mNew);

        mOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        mOpen.setText("Open");
        mOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mOpenActionPerformed(evt);
            }
        });
        menuFile.add(mOpen);

        mSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mSave.setText("Save");
        mSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSaveActionPerformed(evt);
            }
        });
        menuFile.add(mSave);

        mPrint.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        mPrint.setText("Print");
        mPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPrintActionPerformed(evt);
            }
        });
        menuFile.add(mPrint);

        mExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        mExit.setText("Exit");
        mExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mExitActionPerformed(evt);
            }
        });
        menuFile.add(mExit);

        jMenuBar1.add(menuFile);

        menuEdit.setText("Edit");

        mUndo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        mUndo.setText("Undo");
        mUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mUndoActionPerformed(evt);
            }
        });
        menuEdit.add(mUndo);

        mCut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        mCut.setText("Cut");
        mCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCutActionPerformed(evt);
            }
        });
        menuEdit.add(mCut);

        mCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mCopy.setText("Copy");
        mCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCopyActionPerformed(evt);
            }
        });
        menuEdit.add(mCopy);

        mPaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        mPaste.setText("Paste");
        mPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPasteActionPerformed(evt);
            }
        });
        menuEdit.add(mPaste);

        mSelectAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mSelectAll.setText("SelectAll");
        mSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSelectAllActionPerformed(evt);
            }
        });
        menuEdit.add(mSelectAll);

        mHightlight.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        mHightlight.setText("Hightlight");
        mHightlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mHightlightActionPerformed(evt);
            }
        });
        menuEdit.add(mHightlight);

        jMenuBar1.add(menuEdit);

        menuFont.setText("format");

        mFont.setText("Font");
        mFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFontActionPerformed(evt);
            }
        });
        menuFont.add(mFont);

        jMenuBar1.add(menuFont);

        menuAbout.setText("Help");

        mAbout.setText("About");
        mAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAboutActionPerformed(evt);
            }
        });
        menuAbout.add(mAbout);

        jMenuBar1.add(menuAbout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

 

    private void mNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNewActionPerformed
        txt.setText("");
        System.out.println("New pad");
 

    }//GEN-LAST:event_mNewActionPerformed

 
    private void mSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSaveActionPerformed
        FileNameExtensionFilter name=new FileNameExtensionFilter("TextDocument (*.arff)","arff"); 
        //สร้าง Object FileFilter ที่จะใช้เพิ่มให้กับ File Chooser Dialog ใช้กรอกไฟล์ txt
        Select_address=new JFileChooser();
        Select_address.setFileFilter(name); //เอาไว้เป็น type ในการเลือกหา
        
        Select_address.setDialogTitle("บันทึกแฟ้มข้อมูล"); //ชื่อ bar เฉยๆ
        int returnValue=Select_address.showSaveDialog(this);
        if(returnValue!=JFileChooser.APPROVE_OPTION){ // ถ้าผู้ใช้ไม่กดเชฟ
            System.out.println("No Save");
            return;
        }
        try {
            FileWriter writer=new FileWriter(Select_address.getSelectedFile()+".arff");
            //จะคืนค่า File ที่ถูกเลือกของ Object JFileChooser โดยคืนค่ากลับมาเป็นตัวแปรประเภท File 
            System.out.println("address : "+Select_address.getSelectedFile()); 
            BufferedWriter bf=new BufferedWriter(writer); //ตัวช่วยในการเขียนไฟล์ข้อมูล
            bf.write(txt.getText()); //เขียนไฟล์
            bf.close();
             System.out.println("Save.....");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_mSaveActionPerformed

    private void mPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPasteActionPerformed
       txt.paste();
        System.out.println("Paste");
    }//GEN-LAST:event_mPasteActionPerformed

    private void mCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCutActionPerformed
       txt.cut();
       System.out.println("cut");
    }//GEN-LAST:event_mCutActionPerformed

    private void mCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCopyActionPerformed
       txt.copy();
       System.out.println("copy");
    }//GEN-LAST:event_mCopyActionPerformed

    private void mSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSelectAllActionPerformed
       txt.selectAll();
       System.out.println("selectAllText");
    }//GEN-LAST:event_mSelectAllActionPerformed

    private void mHightlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mHightlightActionPerformed
       txt.setSelectionColor(Color.yellow);
       txt.setSelectedTextColor(Color.red);
       System.out.println("Hightlight_text");
    }//GEN-LAST:event_mHightlightActionPerformed

    private void mOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mOpenActionPerformed
        FileNameExtensionFilter name = new FileNameExtensionFilter("TextDocucment (*.txt)","txt");
        Select_address=new JFileChooser();
        Select_address.setFileFilter(name);  //เอาไว้เป็น type ในการเลือกหา
        Select_address.setDialogTitle("เปิดแฟ้มข้อมูล"); //ชื่อ bar เฉยๆ
        int returnValue=Select_address.showOpenDialog(this);
        
        //เช็ดว่าเลือกไฟล์ข้อมูลรึป่าว
        if(returnValue!=JFileChooser.APPROVE_OPTION){ //ถ้าผู้ใช้ไม่กดเลือกไฟล์
            System.out.println("No open");
            return;
        }
        try{
            FileReader reader=new FileReader(Select_address.getSelectedFile());
            System.out.println("address : "+Select_address.getSelectedFile()); 
            
            String line="";
            StringBuffer strBuff=new StringBuffer();
            BufferedReader br=new BufferedReader(reader);//ตัวช่วยการอ่านไฟล์ข้อมูล
            while((line=br.readLine()) !=null){ //อ่านเรื่อยๆ มาที่ละบรรทัดๆ
                strBuff.append(line+"\n"); //นำตัวสติงมาต่อกันเรื่อยๆ แล้วขึ้นบรรทัดใหม่  
            }
            txt.setText(strBuff.toString());
            System.out.println("open......");
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_mOpenActionPerformed

    private void mExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mExitActionPerformed
        int confirm= JOptionPane.showConfirmDialog(this,"คุณต้องการออกจากโปรแกรมหรือไม่","คำยืนยัน",JOptionPane.YES_NO_OPTION);
        if(confirm==JOptionPane.YES_OPTION){
            System.out.println("Exit Program");
            System.exit(0);
        }
    }//GEN-LAST:event_mExitActionPerformed

    private void mPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPrintActionPerformed
        try {
           if(txt.getText().equals("")) {
               JOptionPane.showMessageDialog(this,"กรุณากรอกข้อความ","แจ้งเตือน",0);
               return;
           }
           else txt.print();
        } catch (PrinterException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_mPrintActionPerformed

    
    private void mUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mUndoActionPerformed

    }//GEN-LAST:event_mUndoActionPerformed

    private void mFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFontActionPerformed

   
    }//GEN-LAST:event_mFontActionPerformed

    private void menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu2ActionPerformed

    private void mAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAboutActionPerformed

   
    }//GEN-LAST:event_mAboutActionPerformed

    private void newFile(){ //เมื่อกดปุ่ม new ให้ text ว่าง
        txt.setText("");
    }   
    private void cutFile(){ //เมื่อกดปุ่ม new ให้ text ว่าง
        txt.cut();
    }   
    
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
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem mAbout;
    private javax.swing.JMenuItem mCopy;
    private javax.swing.JMenuItem mCut;
    private javax.swing.JMenuItem mExit;
    private javax.swing.JMenuItem mFont;
    private javax.swing.JMenuItem mHightlight;
    private javax.swing.JMenuItem mNew;
    private javax.swing.JMenuItem mOpen;
    private javax.swing.JMenuItem mPaste;
    private javax.swing.JMenuItem mPrint;
    private javax.swing.JMenuItem mSave;
    private javax.swing.JMenuItem mSelectAll;
    private javax.swing.JMenuItem mUndo;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private javax.swing.JMenu menuAbout;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuFont;
    private javax.swing.JTextArea txt;
    // End of variables declaration//GEN-END:variables
}
