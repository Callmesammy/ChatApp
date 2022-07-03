
package form;


public class Chat extends javax.swing.JPanel {


    public Chat() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chat_title1 = new form.Chat_title();
        chat_bottom1 = new form.Chat_bottom();
        chat_body1 = new form.Chat_body();

        setBackground(new java.awt.Color(249, 249, 249));

        chat_title1.setBackground(new java.awt.Color(242, 242, 242));

        javax.swing.GroupLayout chat_title1Layout = new javax.swing.GroupLayout(chat_title1);
        chat_title1.setLayout(chat_title1Layout);
        chat_title1Layout.setHorizontalGroup(
            chat_title1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 761, Short.MAX_VALUE)
        );
        chat_title1Layout.setVerticalGroup(
            chat_title1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        chat_bottom1.setBackground(new java.awt.Color(242, 242, 242));

        javax.swing.GroupLayout chat_bottom1Layout = new javax.swing.GroupLayout(chat_bottom1);
        chat_bottom1.setLayout(chat_bottom1Layout);
        chat_bottom1Layout.setHorizontalGroup(
            chat_bottom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        chat_bottom1Layout.setVerticalGroup(
            chat_bottom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chat_title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(chat_bottom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(chat_body1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(chat_title1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(chat_body1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(chat_bottom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private form.Chat_body chat_body1;
    private form.Chat_bottom chat_bottom1;
    private form.Chat_title chat_title1;
    // End of variables declaration//GEN-END:variables
}
