
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
        setDefaults();
    }
    
    public void setDefaults(){
        this.setSize(290, 300);
        kantoPanel.setVisible(false);
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
        kantoPanel = new javax.swing.JPanel();
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
        cleffaEgg = new javax.swing.JRadioButton();
        vulpixEgg = new javax.swing.JRadioButton();
        igglybuffEgg = new javax.swing.JRadioButton();
        zubatEgg = new javax.swing.JRadioButton();
        oddishEgg = new javax.swing.JRadioButton();
        parasEgg = new javax.swing.JRadioButton();
        venonatEgg = new javax.swing.JRadioButton();
        diglettEgg = new javax.swing.JRadioButton();
        meowthEgg = new javax.swing.JRadioButton();
        psyduckEgg = new javax.swing.JRadioButton();
        mankeyEgg = new javax.swing.JRadioButton();
        poliwagEgg = new javax.swing.JRadioButton();
        growlitheEgg = new javax.swing.JRadioButton();
        abraEgg = new javax.swing.JRadioButton();
        machopEgg = new javax.swing.JRadioButton();
        bellsproutEgg = new javax.swing.JRadioButton();
        tentacoolEgg = new javax.swing.JRadioButton();
        geodudeEgg = new javax.swing.JRadioButton();
        ponytaEgg = new javax.swing.JRadioButton();
        slowpokeEgg = new javax.swing.JRadioButton();
        magnemiteEgg = new javax.swing.JRadioButton();
        farfetchdEgg = new javax.swing.JRadioButton();
        doduoEgg = new javax.swing.JRadioButton();
        seelEgg = new javax.swing.JRadioButton();
        grimerEgg = new javax.swing.JRadioButton();
        shellderEgg = new javax.swing.JRadioButton();
        gastlyEgg = new javax.swing.JRadioButton();
        onixEgg = new javax.swing.JRadioButton();
        drowzeeEgg = new javax.swing.JRadioButton();
        krabbyEgg = new javax.swing.JRadioButton();
        voltorbEgg = new javax.swing.JRadioButton();
        exeggcuteEgg = new javax.swing.JRadioButton();
        cuboneEgg = new javax.swing.JRadioButton();
        lickitungEgg = new javax.swing.JRadioButton();
        koffingEgg = new javax.swing.JRadioButton();
        rhyhornEgg = new javax.swing.JRadioButton();
        tangelaEgg = new javax.swing.JRadioButton();
        kangaskhanEgg = new javax.swing.JRadioButton();
        horseaEgg = new javax.swing.JRadioButton();
        goldeenEgg = new javax.swing.JRadioButton();
        staryuEgg = new javax.swing.JRadioButton();
        mimeJrEgg = new javax.swing.JRadioButton();
        mrMimeEgg = new javax.swing.JRadioButton();
        scytherEgg = new javax.swing.JRadioButton();
        smoochumEgg = new javax.swing.JRadioButton();
        pinsirEgg = new javax.swing.JRadioButton();
        taurosEgg = new javax.swing.JRadioButton();
        magikarpEgg = new javax.swing.JRadioButton();
        laprasEgg = new javax.swing.JRadioButton();
        dittoEgg = new javax.swing.JRadioButton();
        eeveeEgg = new javax.swing.JRadioButton();
        omanyteEgg = new javax.swing.JRadioButton();
        kabutoEgg = new javax.swing.JRadioButton();
        aerodactylEgg = new javax.swing.JRadioButton();
        munchlaxEgg = new javax.swing.JRadioButton();
        snorlaxEgg = new javax.swing.JRadioButton();
        dratiniEgg = new javax.swing.JRadioButton();
        kantoToggle = new javax.swing.JToggleButton();

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

        cleffaEgg.setText("Cleffa");
        cleffaEgg.setName(PokeDex.Cleffa);

        vulpixEgg.setText("Vulpix");
        vulpixEgg.setName(PokeDex.Vulpix);

        igglybuffEgg.setText("Igglybuff");
        igglybuffEgg.setName(PokeDex.Igglybuff);

        zubatEgg.setText("Zubat");
        zubatEgg.setName(PokeDex.Zubat);

        oddishEgg.setText("Oddish");
        oddishEgg.setName(PokeDex.Oddish);

        parasEgg.setText("Paras");
        parasEgg.setName(PokeDex.Paras);

        venonatEgg.setText("Venonat");
        venonatEgg.setName(PokeDex.Venonat);

        diglettEgg.setText("Diglett");
        diglettEgg.setName(PokeDex.Diglett);

        meowthEgg.setText("Meowth");
        meowthEgg.setName(PokeDex.Meowth);

        psyduckEgg.setText("Psyduck");
        psyduckEgg.setName(PokeDex.Psyduck);

        mankeyEgg.setText("Mankey");
        mankeyEgg.setName(PokeDex.Mankey);

        poliwagEgg.setText("Poliwag");
        poliwagEgg.setName(PokeDex.Poliwag);

        growlitheEgg.setText("Growlithe");
        growlitheEgg.setName(PokeDex.Growlithe);

        abraEgg.setText("Abra");
        abraEgg.setName(PokeDex.Abra);

        machopEgg.setText("Machop");
        machopEgg.setName(PokeDex.Machop);

        bellsproutEgg.setText("Bellsprout");
        bellsproutEgg.setName(PokeDex.Bellsprout);

        tentacoolEgg.setText("Tentacool");
        tentacoolEgg.setName(PokeDex.Tentacool);

        geodudeEgg.setText("Geodude");
        geodudeEgg.setName(PokeDex.Geodude);

        ponytaEgg.setText("Ponyta");
        ponytaEgg.setName(PokeDex.Ponyta);

        slowpokeEgg.setText("Slowpoke");
        slowpokeEgg.setName(PokeDex.Slowpoke);

        magnemiteEgg.setText("Magnemite");
        magnemiteEgg.setName(PokeDex.Magnemite);

        farfetchdEgg.setText("Farfetch'd");
        farfetchdEgg.setName(PokeDex.Farfetchd);

        doduoEgg.setText("Doduo");
        doduoEgg.setName(PokeDex.Doduo);

        seelEgg.setText("Seel");
        seelEgg.setName(PokeDex.Seel);

        grimerEgg.setText("Grimer");
        grimerEgg.setName(PokeDex.Grimer);

        shellderEgg.setText("Shellder");
        shellderEgg.setName(PokeDex.Shellder);

        gastlyEgg.setText("Gastly");
        gastlyEgg.setName(PokeDex.Gastly);

        onixEgg.setText("Onix");
        onixEgg.setName(PokeDex.Onix);

        drowzeeEgg.setText("Drowzee");
        drowzeeEgg.setName(PokeDex.Drowzee);

        krabbyEgg.setText("Krabby");
        krabbyEgg.setName(PokeDex.Krabby);

        voltorbEgg.setText("Voltorb");
        voltorbEgg.setName(PokeDex.Voltorb);

        exeggcuteEgg.setText("Exeggcute");
        exeggcuteEgg.setName(PokeDex.Exeggcute);

        cuboneEgg.setText("Cubone");
        cuboneEgg.setName(PokeDex.Cubone);

        lickitungEgg.setText("Lickitung");
        lickitungEgg.setName(PokeDex.Lickitung);

        koffingEgg.setText("Koffing");
        koffingEgg.setName(PokeDex.Koffing);

        rhyhornEgg.setText("Rhyhorn");
        rhyhornEgg.setName(PokeDex.Rhyhorn);

        tangelaEgg.setText("Tangela");
        tangelaEgg.setName(PokeDex.Tangela);

        kangaskhanEgg.setText("Kangaskhan");
        kangaskhanEgg.setName(PokeDex.Kangaskhan);

        horseaEgg.setText("Horsea");
        horseaEgg.setName(PokeDex.Horsea);

        goldeenEgg.setText("Goldeen");
        goldeenEgg.setName(PokeDex.Goldeen);

        staryuEgg.setText("Staryu");
        staryuEgg.setName(PokeDex.Staryu);

        mimeJrEgg.setText("Mime Jr.");
        mimeJrEgg.setName(PokeDex.Mime_jr);

        mrMimeEgg.setText("Mr. Mime");
        mrMimeEgg.setName(PokeDex.Mr_mime);

        scytherEgg.setText("Scyther");
        scytherEgg.setName(PokeDex.Scyther);

        smoochumEgg.setText("Smoochum");
        smoochumEgg.setName(PokeDex.Smoochum);

        pinsirEgg.setText("Pinsir");
        pinsirEgg.setName(PokeDex.Pinsir);

        taurosEgg.setText("Tauros");
        taurosEgg.setName(PokeDex.Tauros);

        magikarpEgg.setText("Magikarp");
        magikarpEgg.setName(PokeDex.Magikarp);

        laprasEgg.setText("Lapras");
        laprasEgg.setName(PokeDex.Lapras);

        dittoEgg.setText("Ditto");
        dittoEgg.setName(PokeDex.Ditto);

        eeveeEgg.setText("Eevee");
        eeveeEgg.setName(PokeDex.Eevee);

        omanyteEgg.setText("Omanyte");
        omanyteEgg.setName(PokeDex.Omanyte);

        kabutoEgg.setText("Kabuto");
        kabutoEgg.setName(PokeDex.Kabuto);

        aerodactylEgg.setText("Aerodactyl");
        aerodactylEgg.setName(PokeDex.Aerodactyl);

        munchlaxEgg.setText("Munchlax");
        munchlaxEgg.setName(PokeDex.Munchlax);

        snorlaxEgg.setText("Snorlax");
        snorlaxEgg.setName(PokeDex.Snorlax);

        dratiniEgg.setText("Dratini");
        dratiniEgg.setName(PokeDex.Dratini);

        javax.swing.GroupLayout kantoPanelLayout = new javax.swing.GroupLayout(kantoPanel);
        kantoPanel.setLayout(kantoPanelLayout);
        kantoPanelLayout.setHorizontalGroup(
            kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kantoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(munchlaxEgg)
                    .addGroup(kantoPanelLayout.createSequentialGroup()
                        .addComponent(bellsproutEgg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tentacoolEgg))
                    .addComponent(growlitheEgg)
                    .addGroup(kantoPanelLayout.createSequentialGroup()
                        .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kantoPanelLayout.createSequentialGroup()
                                .addComponent(ponytaEgg)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kantoPanelLayout.createSequentialGroup()
                                .addComponent(farfetchdEgg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doduoEgg)
                            .addComponent(slowpokeEgg)))
                    .addComponent(onixEgg)
                    .addGroup(kantoPanelLayout.createSequentialGroup()
                        .addComponent(grimerEgg)
                        .addGap(18, 18, 18)
                        .addComponent(shellderEgg))
                    .addComponent(lickitungEgg)
                    .addComponent(goldeenEgg)
                    .addComponent(mrMimeEgg)
                    .addComponent(pinsirEgg)
                    .addComponent(caterpieEgg)
                    .addComponent(rattataEgg)
                    .addGroup(kantoPanelLayout.createSequentialGroup()
                        .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bulbasaurEgg)
                            .addComponent(pichuEgg)
                            .addComponent(cleffaEgg)
                            .addComponent(zubatEgg)
                            .addComponent(venonatEgg)
                            .addComponent(psyduckEgg)
                            .addComponent(voltorbEgg)
                            .addComponent(tangelaEgg)
                            .addComponent(laprasEgg)
                            .addComponent(omanyteEgg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kantoPanelLayout.createSequentialGroup()
                                .addComponent(spearowEgg)
                                .addGap(18, 18, 18)
                                .addComponent(ekansEgg))
                            .addGroup(kantoPanelLayout.createSequentialGroup()
                                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(charmanderEgg)
                                    .addComponent(weedleEgg))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pidgeyEgg)
                                    .addComponent(squirtleEgg)))
                            .addGroup(kantoPanelLayout.createSequentialGroup()
                                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sandshrewEgg)
                                    .addComponent(vulpixEgg)
                                    .addComponent(oddishEgg)
                                    .addComponent(diglettEgg)
                                    .addComponent(mankeyEgg)
                                    .addComponent(abraEgg)
                                    .addGroup(kantoPanelLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(exeggcuteEgg)
                                            .addComponent(drowzeeEgg)
                                            .addComponent(koffingEgg)
                                            .addComponent(kangaskhanEgg)
                                            .addComponent(staryuEgg)
                                            .addComponent(scytherEgg)
                                            .addComponent(taurosEgg)
                                            .addComponent(dittoEgg)
                                            .addComponent(kabutoEgg)
                                            .addComponent(snorlaxEgg))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aerodactylEgg)
                                    .addComponent(nidoranEgg)
                                    .addComponent(geodudeEgg)
                                    .addComponent(magnemiteEgg)
                                    .addComponent(seelEgg)
                                    .addComponent(gastlyEgg)
                                    .addComponent(krabbyEgg)
                                    .addComponent(cuboneEgg)
                                    .addComponent(rhyhornEgg)
                                    .addComponent(horseaEgg)
                                    .addComponent(mimeJrEgg)
                                    .addComponent(smoochumEgg)
                                    .addComponent(magikarpEgg)
                                    .addComponent(eeveeEgg)
                                    .addComponent(dratiniEgg)
                                    .addComponent(poliwagEgg)
                                    .addComponent(meowthEgg)
                                    .addComponent(parasEgg)
                                    .addComponent(igglybuffEgg)
                                    .addComponent(machopEgg)))))))
        );
        kantoPanelLayout.setVerticalGroup(
            kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kantoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bulbasaurEgg)
                        .addComponent(charmanderEgg))
                    .addComponent(squirtleEgg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caterpieEgg)
                    .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pidgeyEgg)
                        .addComponent(weedleEgg)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rattataEgg)
                    .addComponent(spearowEgg)
                    .addComponent(ekansEgg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pichuEgg)
                    .addComponent(sandshrewEgg)
                    .addComponent(nidoranEgg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cleffaEgg)
                    .addComponent(vulpixEgg)
                    .addComponent(igglybuffEgg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zubatEgg)
                    .addComponent(oddishEgg)
                    .addComponent(parasEgg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(venonatEgg)
                    .addComponent(diglettEgg)
                    .addComponent(meowthEgg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(psyduckEgg)
                    .addComponent(mankeyEgg)
                    .addComponent(poliwagEgg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abraEgg)
                    .addComponent(machopEgg)
                    .addComponent(growlitheEgg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bellsproutEgg)
                    .addComponent(tentacoolEgg)
                    .addComponent(geodudeEgg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ponytaEgg)
                    .addComponent(slowpokeEgg)
                    .addComponent(magnemiteEgg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(farfetchdEgg)
                    .addComponent(doduoEgg)
                    .addComponent(seelEgg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grimerEgg)
                    .addComponent(shellderEgg)
                    .addComponent(gastlyEgg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onixEgg)
                    .addComponent(drowzeeEgg)
                    .addComponent(krabbyEgg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exeggcuteEgg)
                    .addComponent(voltorbEgg)
                    .addComponent(cuboneEgg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lickitungEgg)
                    .addComponent(koffingEgg)
                    .addComponent(rhyhornEgg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horseaEgg)
                    .addComponent(kangaskhanEgg)
                    .addComponent(tangelaEgg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goldeenEgg)
                    .addComponent(staryuEgg)
                    .addComponent(mimeJrEgg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mrMimeEgg)
                    .addComponent(scytherEgg)
                    .addComponent(smoochumEgg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pinsirEgg)
                    .addComponent(taurosEgg)
                    .addComponent(magikarpEgg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laprasEgg)
                    .addComponent(dittoEgg)
                    .addComponent(eeveeEgg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(omanyteEgg)
                    .addComponent(kabutoEgg)
                    .addComponent(aerodactylEgg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kantoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(munchlaxEgg)
                    .addComponent(snorlaxEgg)
                    .addComponent(dratiniEgg))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kantoToggle.setText("Show Kanto");
        kantoToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kantoToggleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(goButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pokemonButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(eggButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(userLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(userInput, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(pwLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(pwInput))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kantoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(noneButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(whiteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(blackButton)))
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kantoToggle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchLabel)
                    .addComponent(pokemonButton)
                    .addComponent(eggButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kantoToggle)
                .addGap(4, 4, 4)
                .addComponent(kantoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
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

    private void kantoToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kantoToggleActionPerformed
        if (kantoPanel.isVisible()){
            kantoPanel.setVisible(false);
            this.setSize(290, 300);
        }else{
            kantoPanel.setVisible(true);
            this.setSize(290, 1000);
        }
    }//GEN-LAST:event_kantoToggleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton abraEgg;
    private javax.swing.JRadioButton aerodactylEgg;
    private javax.swing.JRadioButton bellsproutEgg;
    private javax.swing.JRadioButton blackButton;
    private javax.swing.JRadioButton bulbasaurEgg;
    private javax.swing.JRadioButton caterpieEgg;
    private javax.swing.JRadioButton charmanderEgg;
    private javax.swing.JRadioButton cleffaEgg;
    private javax.swing.JRadioButton cuboneEgg;
    private javax.swing.JRadioButton diglettEgg;
    private javax.swing.JRadioButton dittoEgg;
    private javax.swing.JRadioButton doduoEgg;
    private javax.swing.JRadioButton dratiniEgg;
    private javax.swing.JRadioButton drowzeeEgg;
    private javax.swing.JRadioButton eeveeEgg;
    private javax.swing.JRadioButton eggButton;
    private javax.swing.JRadioButton ekansEgg;
    private javax.swing.JRadioButton exeggcuteEgg;
    private javax.swing.JRadioButton farfetchdEgg;
    private javax.swing.JRadioButton gastlyEgg;
    private javax.swing.JRadioButton geodudeEgg;
    private javax.swing.JButton goButton;
    private javax.swing.JRadioButton goldeenEgg;
    private javax.swing.JRadioButton grimerEgg;
    private javax.swing.JRadioButton growlitheEgg;
    private javax.swing.JRadioButton horseaEgg;
    private javax.swing.JRadioButton igglybuffEgg;
    private javax.swing.JRadioButton kabutoEgg;
    private javax.swing.JRadioButton kangaskhanEgg;
    private javax.swing.JPanel kantoPanel;
    private javax.swing.JToggleButton kantoToggle;
    private javax.swing.JRadioButton koffingEgg;
    private javax.swing.JRadioButton krabbyEgg;
    private javax.swing.JRadioButton laprasEgg;
    private javax.swing.JRadioButton lickitungEgg;
    private javax.swing.JRadioButton machopEgg;
    private javax.swing.JRadioButton magikarpEgg;
    private javax.swing.JRadioButton magnemiteEgg;
    private javax.swing.JRadioButton mankeyEgg;
    private javax.swing.JRadioButton meowthEgg;
    private javax.swing.JRadioButton mimeJrEgg;
    private javax.swing.JRadioButton mrMimeEgg;
    private javax.swing.JRadioButton munchlaxEgg;
    private javax.swing.JRadioButton nidoranEgg;
    private javax.swing.JRadioButton noneButton;
    private javax.swing.JRadioButton oddishEgg;
    private javax.swing.JRadioButton omanyteEgg;
    private javax.swing.JRadioButton onixEgg;
    private javax.swing.JRadioButton parasEgg;
    private javax.swing.JRadioButton pichuEgg;
    private javax.swing.JRadioButton pidgeyEgg;
    private javax.swing.JRadioButton pinsirEgg;
    private javax.swing.JRadioButton pokemonButton;
    private javax.swing.ButtonGroup pokemonEgg;
    private javax.swing.ButtonGroup pokemonStage;
    private javax.swing.JRadioButton poliwagEgg;
    private javax.swing.JRadioButton ponytaEgg;
    private javax.swing.JRadioButton psyduckEgg;
    private javax.swing.JPasswordField pwInput;
    private javax.swing.JLabel pwLabel;
    private javax.swing.JRadioButton rattataEgg;
    private javax.swing.JRadioButton rhyhornEgg;
    private javax.swing.JRadioButton sandshrewEgg;
    private javax.swing.JRadioButton scytherEgg;
    private javax.swing.JLabel searchLabel;
    private javax.swing.ButtonGroup searchType;
    private javax.swing.JRadioButton seelEgg;
    private javax.swing.JRadioButton shellderEgg;
    private javax.swing.JRadioButton slowpokeEgg;
    private javax.swing.JRadioButton smoochumEgg;
    private javax.swing.JRadioButton snorlaxEgg;
    private javax.swing.JRadioButton spearowEgg;
    private javax.swing.JRadioButton squirtleEgg;
    private javax.swing.JRadioButton staryuEgg;
    private javax.swing.JRadioButton tangelaEgg;
    private javax.swing.JRadioButton taurosEgg;
    private javax.swing.JRadioButton tentacoolEgg;
    private javax.swing.JTextField userInput;
    private javax.swing.JLabel userLabel;
    private javax.swing.JRadioButton venonatEgg;
    private javax.swing.JRadioButton voltorbEgg;
    private javax.swing.JRadioButton vulpixEgg;
    private javax.swing.JRadioButton weedleEgg;
    private javax.swing.JRadioButton whiteButton;
    private javax.swing.JRadioButton zubatEgg;
    // End of variables declaration//GEN-END:variables
}
