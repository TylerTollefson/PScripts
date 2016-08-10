
import com.mysite.pfarmscripts.pages.LoginPage;
import com.mysite.pfarmscripts.pages.ShelterPage;
import com.mysite.pfarmscripts.resources.PokeDex;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Jessica Wooley
 */
public class PF extends javax.swing.JFrame {
    LoginPage loginPage;
    ShelterPage shelterPage;
    char[] password;
    String user     = "";
    String pokemon  = "";
    String flute    = "none";
    String stage    = "egg";
    
    public PF() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchType = new javax.swing.ButtonGroup();
        pokemonStage = new javax.swing.ButtonGroup();
        pokemonEgg = new javax.swing.ButtonGroup();
        userLabel = new javax.swing.JLabel();
        userInput = new javax.swing.JTextField();
        pwLabel = new javax.swing.JLabel();
        pwInput = new javax.swing.JPasswordField();
        goButton = new javax.swing.JButton();
        searchLabel = new javax.swing.JLabel();
        noneButton = new javax.swing.JRadioButton();
        whiteButton = new javax.swing.JRadioButton();
        blackButton = new javax.swing.JRadioButton();
        pokemonButton = new javax.swing.JRadioButton();
        eggButton = new javax.swing.JRadioButton();
        bulbasaurEgg = new javax.swing.JRadioButton();
        charmanderEgg = new javax.swing.JRadioButton();
        squirtleEgg = new javax.swing.JRadioButton();
        caterpieEgg = new javax.swing.JRadioButton();
        weedleEgg = new javax.swing.JRadioButton();
        pidgeyEgg = new javax.swing.JRadioButton();
        rattataEgg = new javax.swing.JRadioButton();
        spearowEgg = new javax.swing.JRadioButton();
        ekansEgg = new javax.swing.JRadioButton();
        pichuEgg = new javax.swing.JRadioButton();
        sandshrewEgg = new javax.swing.JRadioButton();
        nidoranEgg = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userLabel.setText("Username:");

        pwLabel.setText("Password:");

        goButton.setText("Find My Pokemon!");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        searchLabel.setText("Search for:");

        searchType.add(noneButton);
        noneButton.setSelected(true);
        noneButton.setText("None");
        noneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noneButtonActionPerformed(evt);
            }
        });

        searchType.add(whiteButton);
        whiteButton.setText("White Flute");
        whiteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteButtonActionPerformed(evt);
            }
        });

        searchType.add(blackButton);
        blackButton.setText("Black Flute");
        blackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackButtonActionPerformed(evt);
            }
        });

        pokemonStage.add(pokemonButton);
        pokemonButton.setText("Pokemon");
        pokemonButton.setEnabled(false);
        pokemonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokemonButtonActionPerformed(evt);
            }
        });

        pokemonStage.add(eggButton);
        eggButton.setSelected(true);
        eggButton.setText("Egg");
        eggButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eggButtonActionPerformed(evt);
            }
        });

        pokemonEgg.add(bulbasaurEgg);
        bulbasaurEgg.setText("Bulbasaur");
        bulbasaurEgg.setName(PokeDex.Bulbasaur);

        pokemonEgg.add(charmanderEgg);
        charmanderEgg.setText("Charmander");
        charmanderEgg.setName(PokeDex.Charmander);

        pokemonEgg.add(squirtleEgg);
        squirtleEgg.setText("Squirtle");
        squirtleEgg.setName(PokeDex.Squirtle);

        pokemonEgg.add(caterpieEgg);
        caterpieEgg.setText("Caterpie");
        caterpieEgg.setName(PokeDex.Caterpie);

        pokemonEgg.add(weedleEgg);
        weedleEgg.setText("Weedle");
        weedleEgg.setName(PokeDex.Weedle);

        pokemonEgg.add(pidgeyEgg);
        pidgeyEgg.setText("Pidgey");
        pidgeyEgg.setName(PokeDex.Pidgey);

        pokemonEgg.add(rattataEgg);
        rattataEgg.setText("Rattata");
        rattataEgg.setName(PokeDex.Weedle);

        pokemonEgg.add(spearowEgg);
        spearowEgg.setText("Spearow");
        spearowEgg.setName(PokeDex.Spearow);

        pokemonEgg.add(ekansEgg);
        ekansEgg.setText("Ekans");
        ekansEgg.setName(PokeDex.Ekans);

        pokemonEgg.add(pichuEgg);
        pichuEgg.setText("Pichu");
        pichuEgg.setName(PokeDex.Pichu);

        pokemonEgg.add(sandshrewEgg);
        sandshrewEgg.setText("Sandshrew");
        sandshrewEgg.setName(PokeDex.Sandshrew);

        pokemonEgg.add(nidoranEgg);
        nidoranEgg.setText("Nidoran");
        nidoranEgg.setName(PokeDex.Nidoran);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(goButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(noneButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(whiteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(blackButton)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(caterpieEgg)
                            .addComponent(rattataEgg)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(userLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(userInput, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(pwLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(pwInput)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(searchLabel)
                                .addGap(34, 34, 34)
                                .addComponent(pokemonButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(eggButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bulbasaurEgg)
                                    .addComponent(pichuEgg))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(spearowEgg)
                                        .addGap(18, 18, 18)
                                        .addComponent(ekansEgg))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(charmanderEgg)
                                            .addComponent(weedleEgg))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pidgeyEgg)
                                            .addComponent(squirtleEgg)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sandshrewEgg)
                                        .addGap(6, 6, 6)
                                        .addComponent(nidoranEgg)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabel)
                    .addComponent(userInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwLabel)
                    .addComponent(pwInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchLabel)
                    .addComponent(pokemonButton)
                    .addComponent(eggButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bulbasaurEgg)
                        .addComponent(charmanderEgg))
                    .addComponent(squirtleEgg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caterpieEgg)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pidgeyEgg)
                        .addComponent(weedleEgg)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rattataEgg)
                    .addComponent(spearowEgg)
                    .addComponent(ekansEgg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pichuEgg)
                    .addComponent(sandshrewEgg)
                    .addComponent(nidoranEgg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noneButton)
                    .addComponent(whiteButton)
                    .addComponent(blackButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(goButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        user = userInput.getText();
        password = pwInput.getPassword();
        for (Enumeration<AbstractButton> buttons = pokemonEgg.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {pokemon = button.getName();}
        }
        if (pokemon != ""){
            this.dispose();
            WebDriver driver = new ChromeDriver();
            loginPage = new LoginPage(driver);
            shelterPage = new ShelterPage(driver);
            loginPage.ClickLogin();
            loginPage.EnterLoginCreds(user, new String(password));
            try {
                shelterPage.getEgg(flute, pokemon);
            } catch (Exception ex) {
                Logger.getLogger(PF.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{JOptionPane.showMessageDialog(this, "Please choose a Pokemon!");}
    }//GEN-LAST:event_goButtonActionPerformed

    private void pokemonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokemonButtonActionPerformed
        stage = "pokemon";
    }//GEN-LAST:event_pokemonButtonActionPerformed

    private void eggButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eggButtonActionPerformed
        stage = "egg";
    }//GEN-LAST:event_eggButtonActionPerformed

    private void noneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noneButtonActionPerformed
        flute = "none";
    }//GEN-LAST:event_noneButtonActionPerformed

    private void whiteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteButtonActionPerformed
        flute = "white";
    }//GEN-LAST:event_whiteButtonActionPerformed

    private void blackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackButtonActionPerformed
        flute = "black";
    }//GEN-LAST:event_blackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton blackButton;
    private javax.swing.JRadioButton bulbasaurEgg;
    private javax.swing.JRadioButton caterpieEgg;
    private javax.swing.JRadioButton charmanderEgg;
    private javax.swing.JRadioButton eggButton;
    private javax.swing.JRadioButton ekansEgg;
    private javax.swing.JButton goButton;
    private javax.swing.JRadioButton nidoranEgg;
    private javax.swing.JRadioButton noneButton;
    private javax.swing.JRadioButton pichuEgg;
    private javax.swing.JRadioButton pidgeyEgg;
    private javax.swing.JRadioButton pokemonButton;
    private javax.swing.ButtonGroup pokemonEgg;
    private javax.swing.ButtonGroup pokemonStage;
    private javax.swing.JPasswordField pwInput;
    private javax.swing.JLabel pwLabel;
    private javax.swing.JRadioButton rattataEgg;
    private javax.swing.JRadioButton sandshrewEgg;
    private javax.swing.JLabel searchLabel;
    private javax.swing.ButtonGroup searchType;
    private javax.swing.JRadioButton spearowEgg;
    private javax.swing.JRadioButton squirtleEgg;
    private javax.swing.JTextField userInput;
    private javax.swing.JLabel userLabel;
    private javax.swing.JRadioButton weedleEgg;
    private javax.swing.JRadioButton whiteButton;
    // End of variables declaration//GEN-END:variables
}
