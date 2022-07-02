/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

import net.miginfocom.swing.MigLayout;
import swing.ScrollBar;


/**
 *
 * @author user
 */
public class Left_side extends javax.swing.JPanel {

    /**
     * Creates new form Left_side
     */
    public Left_side() {
        initComponents();
        init();
    }
    
    private void init(){
        menulist.setLayout(new MigLayout("fillx", "0[]0", "0[]0"));
        box();
        sp.setVerticalScrollBar(new ScrollBar());
        
    }
    private void box(){
        menulist.removeAll();
    for (int i =0; i<10; i++){
        menulist.add(new Item_people("Box " + i), "wrap");
    }
    redeem();
    } 
      private void pep(){
          menulist.removeAll();
    for (int i =0; i<7; i++){
        menulist.add(new Item_people("People " + i), " wrap");
    }
    redeem();
      }
      private void mess(){
          menulist.removeAll();
    for (int i =0; i<5; i++){
        menulist.add(new Item_people("Message " +i), " wrap");
    }
    redeem();
    }
      private void redeem(){
          menulist.repaint();
          menulist.revalidate();
      }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JLayeredPane();
        box = new swing.menubotton();
        mess = new swing.menubotton();
        pep = new swing.menubotton();
        sp = new javax.swing.JScrollPane();
        menulist = new javax.swing.JLayeredPane();

        setBackground(new java.awt.Color(242, 242, 242));

        menu.setBackground(new java.awt.Color(232, 232, 232));
        menu.setLayout(new javax.swing.BoxLayout(menu, javax.swing.BoxLayout.X_AXIS));

        box.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-box-30.png"))); // NOI18N
        box.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-box-30.png"))); // NOI18N
        box.setIconsimple(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-box-30_1.png"))); // NOI18N
        box.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boxMouseEntered(evt);
            }
        });
        box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActionPerformed(evt);
            }
        });
        menu.add(box);

        mess.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-topic-30.png"))); // NOI18N
        mess.setIconsimple(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-topic-30_1.png"))); // NOI18N
        mess.setSelected(true);
        mess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messActionPerformed(evt);
            }
        });
        menu.add(mess);

        pep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-user-30_1.png"))); // NOI18N
        pep.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-user-30.png"))); // NOI18N
        pep.setIconsimple(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-user-30_1.png"))); // NOI18N
        pep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pepActionPerformed(evt);
            }
        });
        menu.add(pep);

        sp.setBackground(new java.awt.Color(242, 242, 242));
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        sp.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        sp.setViewportBorder(null);
        sp.setOpaque(true);

        menulist.setBackground(new java.awt.Color(242, 242, 242));
        menulist.setOpaque(true);

        javax.swing.GroupLayout menulistLayout = new javax.swing.GroupLayout(menulist);
        menulist.setLayout(menulistLayout);
        menulistLayout.setHorizontalGroup(
            menulistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        menulistLayout.setVerticalGroup(
            menulistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );

        sp.setViewportView(menulist);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
            .addComponent(sp)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActionPerformed
        if(!box.isSelected()){
      box.setSelected(true);
      mess.setSelected(false);
      pep.setSelected(false);
      box();
    }//GEN-LAST:event_boxActionPerformed
   
    }
    private void messActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messActionPerformed
      if(!mess.isSelected()){
          mess.setSelected(true);
          box.setSelected(false);
      pep.setSelected(false); 
      pep();
    }//GEN-LAST:event_messActionPerformed

    }
    private void pepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pepActionPerformed
       if (!pep.isSelected()){
        pep.setSelected(true);
        box.setSelected(false);
        mess.setSelected(false); 
        mess();
    }//GEN-LAST:event_pepActionPerformed
 
    }
    private void boxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxMouseEntered
     
      
    }//GEN-LAST:event_boxMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.menubotton box;
    private javax.swing.JLayeredPane menu;
    private javax.swing.JLayeredPane menulist;
    private swing.menubotton mess;
    private swing.menubotton pep;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
