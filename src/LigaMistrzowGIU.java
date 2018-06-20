

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;


class LigaMistrzowGUI extends javax.swing.JFrame {

    public String druzyna;
    public Team[] teams;
    private static JLabel[] labels;

    private ArrayList <Formation> formations;
    public int day=1;

    public LigaMistrzowGUI(Team t1[], ArrayList<Formation> f) {
        druzyna=t1[0].getName();
        this.formations=f;
        teams=t1;
        initComponents();
        this.setTeamList(t1);
        this.pack();
    }
    public void setTeamList(Team t1[]){
        String TeamList[]= new String[16];
        for (int i=0; i<16 ; i++) {
            TeamList[i] = t1[i].getName();
        }
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(TeamList));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(TeamList));
    }


    public Team findTeam2(String t1){
        for (int i=0; i<16; i++){
            if (teams[i].getName().equals(t1))
                return teams[i];
        }
        return teams[0];
    }





    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Wybierz swoj zespół");
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Wybierz zespol przeciwnika");

        jButton1.setText("Zagraj mecz!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                                .addGap(144, 144, 144))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jButton1)
                                .addGap(0, 56, Short.MAX_VALUE))
        );

        pack();
    }


  
    private void  jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        LigaMistrzowGUI2 window2= new LigaMistrzowGUI2(findTeam2(teams[(jComboBox1.getSelectedIndex())].getName()),findTeam2(teams[(jComboBox2.getSelectedIndex())].getName()),formations);
        window2.setVisible(true);
        super.dispose();
    }



    public static void main(String args[]) {

       
        Position GK = new Position("GK","C","D");
        Position CB = new Position("B","C","D");
        Position RB = new Position("B","R","D");
        Position LB = new Position("B","L","D");
        Position CM = new Position("M","C","E");
        Position CDM = new Position("M","C","D");
        Position CAM = new Position("M","C","O");
        Position ST = new Position("A","C","O");
        Position RW = new Position("A","R","O");
        Position LW = new Position("A","L","O");
        Position LWB = new Position("B","L","E");
        Position RWB = new Position("B","R","E");
        Position RM = new Position("M","R","E");
        Position LM = new Position("M","L","E");


        ArrayList<Formation> formations= new ArrayList<>();
        formations.add(new Formation("4-4-2",GK,LB,CB,CB,RB,LM,CM,CM,RM,ST,ST));
        formations.add(new Formation("4-3-3",GK,LB,CB,CB,RB,LM,CAM,RM,LW,RW,ST));
        formations.add(new Formation("4-2-3-1",GK,LB,CB,CB,RB,CM,CM,RM,LM,CAM,ST));
        formations.add(new Formation("4-3-2-1",GK,LB,CB,CB,RB,CM,CM,CM,RW,LW,ST));
        formations.add(new Formation("4-5-1",GK,LB,CB,CB,RB,LM,CM,CM,CM,RM,ST));
        formations.add(new Formation("3-4-3",GK,CB,CB,CB,LM,CM,CM,RM,RW,LW,ST));
        formations.add(new Formation("3-5-2",GK,CB,CB,CB,LM,CM,CM,RM,CAM,ST,ST));
        formations.add(new Formation("5-4-1",GK,LB,CB,CB,CB,RB,CM,CM,RM,LM,ST));
        formations.add(new Formation("5-3-2",GK,LB,CB,CB,CB,RB,CM,CM,CM,ST,ST));
        formations.add(new Formation("5-2-2-1",GK,LWB,CB,CB,CB,RWB,CM,CM,RW,LW,ST));



        // tworzenie zawodników
        Player zero= new Player ("","",GK,0,0);
        //Real Madryt
        Player KNavas=new Player("Keylor", "Navas", GK ,1, 84);
        Player Marcelo=new Player("Marcelo", "", LB, 3, 84);
        Player SRamos=new Player("Sergio", "Ramos", CB, 4, 89);
        Player RVarane= new Player("Raphael", "Varane",CB, 14,84);
        Player DCarvajal=new Player("Dani", "Carvajal", RB, 63, 83);
        Player TKroos=new Player("Toni", "Kroos", CM,6, 86);
        Player LModric=new Player("Luca", "Modric", CM,18, 90);
        Player Isco = new Player("Isco","",CAM,22,86);
        Player MAsensio= new Player("Marco","Asensio",CAM,20,83);
        Player CRonaldo=new Player("Cristiano", "Ronaldo", ST, 7, 96);
        Player GBale=new Player("Gareth", "Bale", RW,11, 92);

        // Lawka
        Player Casemiro = new Player("Casemiro","",CM,21,82);
        Player KBenzema = new Player("Karim","Benzema",ST,9,87);
        Player LVasquez= new Player("Lucas","Vasquez",LW,18,82);
        Player KCas = new Player ("Kiko","Casilla",GK, 93,78);
        Player DCeballos= new Player("Dani","Ceballos",CM,24,83);
        Player Kovacic= new Player("Marko","Kovacic",CM,14,80);
        Player Nacho= new Player("Nacho","",CB,34,78);
        // FC Barcelona
        Player TStegen=new Player("Ter", "Stegen", GK, 1, 80);
        Player JAlba=new Player("Jordi", "Alba", LB,18, 83);
        Player GPique=new Player("Gerrard", "Pique", CB, 4, 84);
        Player SUmtiti=new Player("Samuel","Umtiti",CB,23,85);
        Player SRoberto=new Player("Sergi", "Roberto", RB, 3, 80);
        Player SBusquets=new Player("Sergio", "Busquets", CDM, 6, 86);
        Player IRakitic=new Player("Ivan", "Rakitic", CM, 8, 85);
        Player AIniesta=new Player("Andres", "Iniesta", CAM, 12, 88);
        Player LMessi=new Player("Lionel", "Messi", ST,10, 95);
        Player LSuarez=new Player("Luis", "Suarez", ST, 9, 92);
        Player ODembele=new Player("Osama","Dembele",RW,11,84);
        //Lawka
        Player Mwielgus=new Player("Muhamad","Wielgus",GK,9,83);
        Player JMascherano=new Player("Javier", "Mascherano", CB,5, 83);
        Player AGomes= new Player("Andre","Gomes",CM,14,79);
        Player PAlcacer = new Player("Paco","Alcacer",ST,19,82);
        Player Paulinho= new Player("Paulinho","",CM,15,82);
        Player JCilessen= new Player("Jasper","Cillesen",GK,13,77);
        Player GDeufoleu= new Player("Gerard","Deulofeu",ST,16,79);
        Player NSemedo= new Player ("Nelson", "Semedo",RB,2,79);
        //Manchester City
        Player Ederson=new Player("Ederson", "", GK, 31, 84);
        Player Danilo=new Player("Danilo", "", RB, 3, 84);
        Player JStones=new Player("John", "Stones", CB,5,81 );
        Player NOtamendi=new Player("Nicolas", "Otamendi", CB,30, 84);
        Player DSilva=new Player("David", "Silva", CAM,21, 88);
        Player Fernandinho=new Player("", "Fernandinho", CDM,25, 83);
        Player BMendy=new Player("Benjamin","Mendy",LB,22,85);
        Player KDBruyne=new Player("Kevin", "De Bruyne", CAM, 17, 90);
        Player SAguero=new Player("Sergio", "Aguero", ST, 9, 90);
        Player GJesus=new Player("Gabriel","Jesus",ST, 33,88);
        Player KWalker=new Player("Kyle","Walker",RB,2,81);

        Player CBravo=new Player("Claudio", "Bravo", GK, 1, 82);
        Player RSterling=new Player("Raheem", "Sterling", ST, 7, 87);
        Player Fernando=new Player("Fernando", "", CDM, 6, 83);
        Player BSilva=new Player("Bernardo","Silva",CAM,20,86);
        Player VKompany = new Player("Vincent","Kompany",CB,4,84);
        Player LSane = new Player("Leroy","Sane",RW,19,85);
        Player IGundogan=new Player("Illkay","Gundogan",CM,8,85);
        //Arsenal
        Player PCech=new Player("Petr", "Čech", GK, 33, 88);
        Player NMonreal=new Player("Nacho", "Monreal", LB, 18, 81);
        Player Mustafi= new Player("","Mustafi",CB,15,83);
        Player LKoscielny=new Player("Laurent", "Koscielny", CB, 6, 85);
        Player Kolasinac=new Player("Kolasinac","",LB,31,83);
        Player HBellerín=new Player("Hector", "Bellerín	", RB, 24, 85);
        Player MÖzil=new Player("Mesut", "Özil", CAM, 11, 89);
        Player ARamsey = new Player("Aaron","Ramsey",CM,8,83);
        Player GXhaka=new Player("Granit", "Xhaka", CM, 29, 83);
        Player ASánchez=new Player("Alexis", "Sánchez", ST, 7, 90);
        Player ALacazette=new Player("Alexandre","Lacazette",ST,9,87);
        //Lawka
        Player AIwobi=new Player("Alex", "Iwobi", CM, 17, 83);
        Player DOspina = new Player("David","Ospina",GK,13,82);
        Player FCoquelin=new Player("Francis", "Coquelin", CDM, 34, 84);
        Player OGiroud=  new Player("Oliver","Giroud",ST,12,84);
        Player TWalcott=new Player("Theo", "Walcott", ST, 14, 86);
        Player DWelbeck= new Player("Danny","Welbeck",ST,23,82);
        Player PMertesacker=new Player("Per","Mertesacker",CB,4,74);

        //Chelsea
        Player TCourtois=new Player("Thibout", "Courtois", GK, 13, 89);
        Player CAzpilicueta=new Player("Cesar", "Azpilicueta", CB, 28, 85);
        Player GCahill=new Player("Gary", "Cahill", CB,24, 83);
        Player DLuiz=new Player("David", "Luiz", CB, 30, 84);
        Player VMoses=new Player("Victor", "Moses", LB, 20, 83);
        Player MAlonso=new Player("Marcos", "Alonso", RB,3, 83);
        Player NKante=new Player("N'golo", "Kante", CDM, 7, 86);
        Player Bakayoko=new Player("Tiemenue","Bakayoko",CDM,14,85);
        Player PRodriguez=new Player("Pedro", "Rodriguez", RW, 11, 86);
        Player EHazard=new Player("Eden", "Hazard", LW,10, 90);
        Player AMorata=new Player("Alvaro", "Morata", ST, 9,85);

        //Lawka
        Player WCaballero=new Player("Willy","Caballero",GK,1,80);
        Player DZapacosta=new Player("Davide","Zapacosta",RB,21,82);
        Player Christensen=new Player("Andreas","Christensen",CB,27,81);
        Player DDrinkwater=new Player ("Danny","Drinkwater",CM,6,82);
        Player Willian=new Player ("Willian","",RW,22,85);
        Player Batshuay=new Player("Michy","Batshuayi",ST,23,82);
        Player Fabregas=new Player("Cesc","Fabregas",CM,4,84);

        // Bayern
        Player MNeuer=new Player("Manuel", "Neuer", GK, 1, 89);
        Player DAlaba=new Player("David", "Alaba", LB, 2, 84);
        Player MHummels=new Player("Mats", "Hummels", CB, 3, 86);
        Player JBoateng=new Player("Jerome", "Boateng", CB, 17, 86);
        Player JKimmich=new Player("Joshua", "Kimmich", RB, 4, 83);
        Player XAlonso=new Player("Xabi", "Alonso", CDM, 5, 83);
        Player AVidal=new Player("Arturo", "Vidal", CM, 6, 86);
        Player TMuller=new Player("Thomas", "Muller", CAM, 10, 85);
        Player Tolisso=new Player("Tolisso", "", CM, 24, 84);
        Player ARobben=new Player("Arjen", "Robben", RW, 11, 85);
        Player RLewandowski=new Player("Robert", "Lewandowski", ST, 9, 90);
        // Lawka
        Player Ulreich = new Player("","Ulreich",GK,26,75);
        Player JRodriguez=new Player("James", "Rodriguez", CAM, 11, 85);
        Player KComan= new Player("Kingsley","Coman",RW,19,83);
        Player JMartinez= new Player("Javi","Martinez",CDM,24,82);
        Player Friedl= new Player("Friedl","",CM,34,77);
        Player Pantovic= new Player("Pantovic","",CB,41,73);
        Player Rafinha=new Player ("Rafinha","",LB,13,82);
        // PSG
        Player Trapp=new Player("Trapp", "", GK, 1, 85);
        Player TSilva=new Player("Thiago", "Silva", CB, 2, 88);
        Player Marquinios=new Player("Marquinios", "", CB,5, 83);
        Player DAlver=new Player("Dani", "Alves", RB,32, 85);
        Player Kurzawa=new Player("Kurzawa", "", LB, 20, 83);
        Player MVeratti=new Player("Marco", "Veratti", CAM, 6, 86);
        Player Motta=new Player("Thiago","Motta",CM,8,83);
        Player Rabiot=new Player("Adrien","Rabiot",CM,25,83);
        Player ECavani=new Player("Edinson", "Cavani", ST, 9, 88);
        Player Neymar=new Player("Neymar", "Jr", ST, 11, 93);
        Player KMbappe=new Player("Kyllian","Mbappe",ST,11,86);

        Player LMoura=new Player("Lucas", "Moura", RW, 7, 85);
        Player Areola=new Player("Alvaro","Areola",GK,16,84);
        Player Draxler=new Player("Julian","Draxler", CAM,23,84);
        Player Kimpembe= new Player("Presnel","Kimpember",CB,3,80);
        Player Meunier=new Player("Thomas","Meunier",RB,12,83);
        Player DiMaria=new Player("Angel","Di Maria",RW,22,84);
        Player Beriche= new Player("Yuri","Beriche",LB,17,81);

        Player DSubasic=new Player("Danjel","Subasic",GK,1,82);
        Player KGlik=new Player("Kamil","Glik",CB,4,86);
        Player Jemerson=new Player("Jemerson","",RB,2,81);
        Player Sidibe=new Player("Djibril","Sidibe",RB,19, 82);
        Player Jorge=new Player("Jorge","",LB,6,77);
        Player JMoutinho=new Player("Joao","Moutinho",CM,8,84);
        Player Fabinho=new Player("Fabinho","",CM,2,84);
        Player Lemar= new Player("Thomas","Lemar",LM,27,85);
        Player RLopes= new Player("Rony","Lopes",RM,20,79);
        Player RFalcao=new Player("Radamel","Falcao",ST,9,86);
        Player Diakhaby= new Player("Adama","Diakhaby",ST,15,80);


        Player Benaglio= new Player("Diego","Benaglio",GK,16,78);
        Player Tielemans= new Player("Youri","Tielemans",ST,17,84);
        Player ARaggi= new Player("Andrea","Raggi",CB,24,81);
        Player Keita= new Player ("Balde","Keita",ST,14,80);
        Player Jovetic= new Player("Stefan","Jovetic",ST,10,81);
        Player Ghezzal= new Player ("Rahid","Ghezzal",CM,7,79);
        Player Carillo= new Player("Guido","Carillo",RW,11,81);

        //Tottenham
        Player HLloris=new Player("Hugo","Lloris",GK,1,88);
        Player TAlderweireld=new Player("Toby","Alderweireld",CB,4,85);
        Player JVertonghen=new Player("Jan","Vertonghen",CB,5,83);
        Player DRose=new Player("Danny","Rose",LB,2,83);
        Player Davies=new Player("Ben","Davies",RB,33,81);
        Player MDembele=new Player("Moussa","Dembele",CM,7,85);
        Player VWanyama=new Player("Victor","Wanyama",CM,8,86);
        Player DAlli=new Player("Delle","Alli",CAM,11,84);
        Player SHueng=new Player("Son","Hueng",ST,10,83);
        Player HKane=new Player("Harry","Kane",ST,9,85);
        Player CEriksen=new Player("Cristian","Eriksen",CAM,10,84);

        Player Vorm= new Player("Michel","Vorm",GK,13,79);
        Player Aurier=new Player ("Serge","Aurier",RB,24,82);
        Player Dier= new Player("Eric","Dier",CM,15,83);
        Player Trippier= new Player("Kieran","Trippier",RB,2,80);
        Player Winks= new Player("Harry","Winks",CM,29,78);
        Player Llorente= new Player("Fernando","Llorente",ST,18,82);
        Player Sissoko= new Player("Sissoko","",CM,17,82);

        Player Burki=new Player("Burki","",GK,1,81);
        Player SPapasdopulos=new Player("Sokratis","Papasdopulos",CB,4,84);
        Player LPiszczek=new Player("Lukasz","Piszczek",RB,3,82);
        Player MBartra=new Player("Marc","Bartra",CB,5,81);
        Player Castro=new Player("Gonzalo","Castro",CM,27,82);
        Player CPulisic=new Player("Christian","Pulisic",RW,22,80);
        Player SKagawa=new Player("Shinji","Kagawa",CM,8,83);
        Player MGoetze=new Player("Mario","Goetze",CAM,7,84);
        Player ASchurrle=new Player("Andre","Schurrle",CAM,8,81);
        Player Reus=new Player("Marco","Reus",LW,11,88);
        Player PAubameyang=new Player("Pierre-Emerick","Aubameyang",ST,17,87);

        Player Dahoud= new Player("Mahmoud","Dahoud",CM,19,79);
        Player Toprak=new Player("Omer","Toprak",CB,36,80);
        Player Weidenfeller=new Player("Roman","Weidenfeller",GK,1,75);
        Player Yarmolenko=new Player("Andryi","Yarmolenko",ST,9,84);
        Player Guerreiro=new Player("Raphael","Guerreiro",LM,42,81);
        Player Schmelzer=new Player("Marcel","Schmelzer",LB,29,79);
        Player Maximilian=new Player("Maximilian","Philipp",LW,20,79);


        Player JOblak=new Player("Jan","Oblak",GK,13,87);
        Player DGodin=new Player("Diego","Godin",CB,3,88);
        Player FLuis=new Player("Felipe","Luis",LB,4,85);
        Player Savic=new Player("Savic","",CB,5,83);
        Player Juanfran=new Player("Juanfran","",RB,2,83);
        Player MGaitan=new Player("Marcos","Gaitan",CM,7,85);
        Player YCarrasco=new Player("Yannick","Carrasco",CM,10,82);
        Player Gabi=new Player("Gabi","",CM,14,82);
        Player Koke=new Player("Koke","",CM,6,84);
        Player AGriezmann=new Player("Antoine","Griezmann",ST,11,88);
        Player FTorres=new Player("Fernando","Torres",ST,9,81);

        Player Vietto=new Player("Luciano","Vietto",ST,17,80);
        Player Thomas=new Player("Thomas","",CM,5,80);
        Player Correa= new Player("Angel","Correa",CM,11,80);
        Player Gimenez=new Player("Jose","Jimenez",CB,24,80);
        Player Lucas=new Player("Lucas","Hernandes",CB,19,78);
        Player Saul=new Player ("Saul","Niguez",CAM,8,83);
        Player Moya=new Player("Miguel Angel","Moya",GK,1,79);

        Player TShinhan=new Player("Tien","Shinhan ",GK,1,82);
        Player Yamcha=new Player("Yamcha","",CB,5,81);
        Player Krillin=new Player("Krillin","",CB,4,82);
        Player Roshi=new Player("Master","Roshi",LB,3,81);
        Player Whis=new Player("Whis","",RB,2,99);
        Player Piccolo=new Player("Piccolo","",CM,6,84);
        Player Trunks=new Player("Trunks","",CAM,7,83);
        Player Goten=new Player("Goten","",CDM,8,83);
        Player Vegeta=new Player("Vegeta","",LW,9,95);
        Player Goku=new Player("Goku","",ST,10,94);
        Player Beerus=new Player("Beerus","",RW,11,97);
        Player Jamemba=new Player("Jamemba","",GK,1,89);
        Player Turles=new Player("Turles","",CB,2,70);
        Player Brolly=new Player("Brolly","",CB,3,93);
        Player Nappa=new Player("Nappa","",CB,4,75);
        Player Cell=new Player("Cell","",RB,5,89);
        Player Buu=new Player("Buu","",LB,6,93);
        Player Frieza=new Player("Frieza","",CM,7,87);
        Player Android=new Player("Android","17 ",CM,17,87);
        Player Black=new Player("Black","",CAM,9,94);
        Player Zamasu=new Player("Zamasu","",CAM,11,89);
        Player Ginyu=new Player("Ginyu","",ST,10,80);
        //Superstarr
        Player HBajda=new Player("Henryk","Bajda",GK,1,84);
        Player SJach=new Player("Stanisław 'Stajku'","Jach",CB,2,90);
        Player APastuszek=new Player("Adam 'Chomik'","Pastuszek",CB,4,90);
        Player HMinus=new Player("Herkules","Minus",CB,3,83);
        Player BBolek=new Player("Bolek","",LB,5,83);
        Player FGerula=new Player("Florian","Gerula",RB,6,86);
        Player MGerula=new Player("Marian","Gerula",CM,7,86);
        Player CGerula=new Player("Czesław","Gerula",CM,8,86);
        Player JSzpytman=new Player("Jarosław 'Pitas'","Szpytman",CM,23,89);
        Player KWojtowicz=new Player("Kamil 'Kombajn'","Wojtowicz",ST,10,87);
        Player ŁJach=new Player("Łukasz Kryminał","Jach",ST,9,87);
        // Huragan
        Player MDaraz=new Player("Maciej", "Daraz", GK, 12, 87);
        Player MZatawrdnicki=new Player("Maciej", "Zatawrdnicki", CB, 2, 83);
        Player BZatwardnicki=new Player("Bartosz", "Zatwardnicki", CB, 4, 90);
        Player DMazur=new Player("Damian", "Mazur", LB, 3, 89);
        Player KLewiarz=new Player("Krzysztof", "Lewiarz", RB, 11, 88);
        Player DFudali=new Player("Daniel", "Fudali", CDM,6, 90);
        Player BFrosztega=new Player("Bartosz", "Frosztega", CM,13, 83);
        Player LPawlowski=new Player("Łukasz", "Pawłowski", RW, 19, 90);
        Player DPawlowski=new Player("Daniel", "Pawłowski", CAM, 10, 90);
        Player BDzimira=new Player("Bogumił", "Dzimira", ST,9, 91);
        Player APawlowski=new Player("Arkadiusz", "Pawłowski", LW, 7, 94);
        // Legends
        Player GBednarczyk=new Player("Grzegorz","Bednarczyk",GK,12,87);
        Player MGłuszko=new Player("Mieczysław","Głuszko",LB,3,86);
        Player MPawłowski=new Player("Marian","Pawłowski",CB,2,85);
        Player PDzidek=new Player("Paweł","Dzidek",CB,3,87);
        Player ZPawłowski=new Player("Zenon","Pawłowski",RB,5,84);
        Player EFudali=new Player("Edward","Fudali",CDM,7,84);
        Player DSzpytman=new Player("Dawid","Szpytman",CDM,8,85);
        Player STomaszewski=new Player("Szymon ","Tomaszewski",CAM,10,94);
        Player LChorbowy=new Player("Leon","Chorbowy",CAM,4,88);
        Player MSzpytman=new Player("Marek","Szpytman",CAM,88,85);
        Player WBajda=new Player("Wiesław","Bajda",ST,11,87);
        Player LDaraż=new Player("Łukasz","Daraż",CB,70,86);
        Player DGłowacz=new Player("Dawid","Głowacz",RM,8,85);
        Player AWanat= new Player("Arkadiusz","Wanat",CM,96,84);
        Player MPawlowski= new Player("Marcin","Pawłowski",LB,25,87);
        Player MBus= new Player("Mateusz","Buś",CB,74,85);
        Player JKwasny=new Player("Józef","Kwaśny",GK,1,87);
        Player KPastuszek= new Player("Kacper","Pastuszek",ST,69,84);
        Player BBajda=new Player("Bartosz","Bajda",CB,22,79);
        Player JGerula=new Player("Jacek","Gerula",ST,9,86);
        Player PGerula=new Player("Piotr","Gerula",ST,19,88);
        Player JBajda=new Player("Jarosław","Bajda",CB,26,84);
        Player DBochenek= new Player("Damian","Bochenek",CB,14,89);
        Player PMikita= new Player("Piotr","Mikita",CDM,30,79);
        Player EKowalinski= new Player("Eugeniusz","Kowaliński",RB,32,80);
        Player JGluszko=new Player("Jarosław","Głuszko",CM,18,87);
        Player KZabawski= new Player("Krystian","Zabawski",CM,42,87);
        Player DZabawski= new Player("Damian","Zabawski",CB,41,80);
        Player SFednar= new Player("Sylwester","Fednar",RM,21,80);
        Player MFednar= new Player("Marcin","Fednar",CM,17,82);
        Player DSwist= new Player("Dominik","Swist",RW,27,85);
        Player MSwist= new Player("Mateusz","Swist",LW,28,86);



        // stworzenie tablicy zespołów i przypisanie do niej zespołów (pozycja [16] jest pozycją buforową aby w późniejszym etapie możliwe były zmiany pozycji zespołów w tablicy)
        Team ChampionsLeagueCompetitors[]=new Team[17];
        ChampionsLeagueCompetitors[0]=new Team("Real Madrid","Spain", formations.get(0),KNavas,	Marcelo,SRamos,RVarane,DCarvajal,TKroos,LModric,Isco,MAsensio,GBale,CRonaldo);
        ChampionsLeagueCompetitors[1]=new Team( "FC Barcelona", "Spain",formations.get(0), TStegen,JAlba,GPique,SUmtiti,SRoberto,SBusquets,IRakitic,AIniesta,LMessi,LSuarez,ODembele);
        ChampionsLeagueCompetitors[2]=new Team( "Huragan Reczpol", "Poland",formations.get(2),  MDaraz,MZatawrdnicki,	BZatwardnicki,DMazur,KLewiarz,DFudali,BFrosztega,LPawlowski,DPawlowski,BDzimira,APawlowski);
        ChampionsLeagueCompetitors[3]=new Team( "Manchester City", "England",formations.get(0),  Ederson,	Danilo,BMendy,JStones,NOtamendi,DSilva,Fernandinho,KWalker,KDBruyne,GJesus,SAguero);
        ChampionsLeagueCompetitors[4]=new Team( "Arsenal FC", "England",formations.get(0),  PCech,NMonreal,LKoscielny,Kolasinac,	HBellerín,ALacazette,GXhaka,Mustafi,ASánchez,ARamsey,MÖzil);
        ChampionsLeagueCompetitors[5]=new Team( "Chelsea FC", "England",formations.get(0),  TCourtois,CAzpilicueta,GCahill,DLuiz,VMoses,MAlonso,NKante,Bakayoko,PRodriguez,EHazard,AMorata);
        ChampionsLeagueCompetitors[6]=new Team("Bayern Munich", "Germany",formations.get(0), MNeuer,	DAlaba,	MHummels,JBoateng,JKimmich,XAlonso,	AVidal,TMuller,Tolisso,ARobben,RLewandowski);
        ChampionsLeagueCompetitors[7]=new Team("PSG","France",formations.get(0), Trapp,	TSilva,	Marquinios,DAlver,Kurzawa,Motta,Rabiot,MVeratti,Neymar,	ECavani,KMbappe);
        ChampionsLeagueCompetitors[8]=new Team("AS Monaco","France",formations.get(0),DSubasic,Diakhaby,KGlik,Jemerson,Sidibe,Jorge,JMoutinho,Fabinho,Lemar,RLopes,RFalcao);
        ChampionsLeagueCompetitors[9]=new Team("Tottenham Hotspur","England",formations.get(0), HLloris,TAlderweireld,JVertonghen,Davies,DRose,MDembele,VWanyama,DAlli,SHueng,	HKane,CEriksen);
        ChampionsLeagueCompetitors[10]=new Team("Borussia Dortmund","Germany",formations.get(0), Burki,SPapasdopulos,LPiszczek,	MBartra,CPulisic,SKagawa,MGoetze,ASchurrle,Castro,Reus,PAubameyang);
        ChampionsLeagueCompetitors[11]=new Team("Atletico Madrid", "Spain",formations.get(0), JOblak,	DGodin,	FLuis,Savic,Juanfran,	MGaitan,YCarrasco,Gabi,Koke,AGriezmann,FTorres) ;
        ChampionsLeagueCompetitors[12]=new Team("DragunboluGut","Japan",formations.get(0), TShinhan,Yamcha,Krillin,Roshi,Whis,Piccolo,Trunks,Goten,Vegeta,Goku,Beerus);
        ChampionsLeagueCompetitors[13]=new Team("DragunboluBat","Japan",formations.get(0),Jamemba,Turles,Brolly,Nappa,Cell,Buu,Frieza,Android,Black,Zamasu,Ginyu);
        ChampionsLeagueCompetitors[14]=new Team("Reczpol Superstar","Poland",formations.get(0), HBajda,SJach,APastuszek,HMinus,BBolek,FGerula,MGerula,CGerula,JSzpytman,KWojtowicz,ŁJach);
        ChampionsLeagueCompetitors[15]=new Team("Reczpol Legends","Poland",formations.get(0),GBednarczyk,MGłuszko,MPawłowski,PDzidek,ZPawłowski,	EFudali,DSzpytman,STomaszewski,LChorbowy,MSzpytman,WBajda);

        ChampionsLeagueCompetitors[0].addPlayer(KCas);
        ChampionsLeagueCompetitors[0].addPlayer(Nacho);
        ChampionsLeagueCompetitors[0].addPlayer(Casemiro);
        ChampionsLeagueCompetitors[0].addPlayer(KBenzema);
        ChampionsLeagueCompetitors[0].addPlayer(DCeballos);
        ChampionsLeagueCompetitors[0].addPlayer(Kovacic);
        ChampionsLeagueCompetitors[0].addPlayer(LVasquez);

        ChampionsLeagueCompetitors[1].addPlayer(JMascherano);
        ChampionsLeagueCompetitors[1].addPlayer(AGomes);
        ChampionsLeagueCompetitors[1].addPlayer(PAlcacer);
        ChampionsLeagueCompetitors[1].addPlayer(Paulinho);
        ChampionsLeagueCompetitors[1].addPlayer(JCilessen);
        ChampionsLeagueCompetitors[1].addPlayer(GDeufoleu);
        ChampionsLeagueCompetitors[1].addPlayer(NSemedo);

        ChampionsLeagueCompetitors[2].addPlayer(LDaraż);
        ChampionsLeagueCompetitors[2].addPlayer(DGłowacz);
        ChampionsLeagueCompetitors[2].addPlayer(AWanat);
        ChampionsLeagueCompetitors[2].addPlayer(MPawlowski);
        ChampionsLeagueCompetitors[2].addPlayer(MBus);
        ChampionsLeagueCompetitors[2].addPlayer(JKwasny);
        ChampionsLeagueCompetitors[2].addPlayer(KPastuszek);

        ChampionsLeagueCompetitors[3].addPlayer(CBravo);
        ChampionsLeagueCompetitors[3].addPlayer(IGundogan);
        ChampionsLeagueCompetitors[3].addPlayer(BSilva);
        ChampionsLeagueCompetitors[3].addPlayer(LSane);
        ChampionsLeagueCompetitors[3].addPlayer(RSterling);
        ChampionsLeagueCompetitors[3].addPlayer(VKompany);
        ChampionsLeagueCompetitors[3].addPlayer(Fernando);

        ChampionsLeagueCompetitors[4].addPlayer(DOspina);
        ChampionsLeagueCompetitors[4].addPlayer(DWelbeck);
        ChampionsLeagueCompetitors[4].addPlayer(AIwobi);
        ChampionsLeagueCompetitors[4].addPlayer(PMertesacker);
        ChampionsLeagueCompetitors[4].addPlayer(OGiroud);
        ChampionsLeagueCompetitors[4].addPlayer(TWalcott);
        ChampionsLeagueCompetitors[4].addPlayer(FCoquelin);


        ChampionsLeagueCompetitors[5].addPlayer(WCaballero);
        ChampionsLeagueCompetitors[5].addPlayer(Willian);
        ChampionsLeagueCompetitors[5].addPlayer(Christensen);
        ChampionsLeagueCompetitors[5].addPlayer(DDrinkwater);
        ChampionsLeagueCompetitors[5].addPlayer(Fabregas);
        ChampionsLeagueCompetitors[5].addPlayer(Batshuay);
        ChampionsLeagueCompetitors[5].addPlayer(DZapacosta);

        ChampionsLeagueCompetitors[6].addPlayer(Ulreich);
        ChampionsLeagueCompetitors[6].addPlayer(JRodriguez);
        ChampionsLeagueCompetitors[6].addPlayer(KComan);
        ChampionsLeagueCompetitors[6].addPlayer(JMartinez);
        ChampionsLeagueCompetitors[6].addPlayer(Friedl);
        ChampionsLeagueCompetitors[6].addPlayer(Pantovic);
        ChampionsLeagueCompetitors[6].addPlayer(Rafinha);

        ChampionsLeagueCompetitors[7].addPlayer(LMoura);
        ChampionsLeagueCompetitors[7].addPlayer(Areola);
        ChampionsLeagueCompetitors[7].addPlayer(Meunier);
        ChampionsLeagueCompetitors[7].addPlayer(DiMaria);
        ChampionsLeagueCompetitors[7].addPlayer(Beriche);
        ChampionsLeagueCompetitors[7].addPlayer(Kimpembe);
        ChampionsLeagueCompetitors[7].addPlayer(Draxler);

        ChampionsLeagueCompetitors[8].addPlayer(Benaglio);
        ChampionsLeagueCompetitors[8].addPlayer(Carillo);
        ChampionsLeagueCompetitors[8].addPlayer(Ghezzal);
        ChampionsLeagueCompetitors[8].addPlayer(Jovetic);
        ChampionsLeagueCompetitors[8].addPlayer(Keita);
        ChampionsLeagueCompetitors[8].addPlayer(ARaggi);
        ChampionsLeagueCompetitors[8].addPlayer(Tielemans);

        ChampionsLeagueCompetitors[9].addPlayer(Vorm);
        ChampionsLeagueCompetitors[9].addPlayer(Aurier);
        ChampionsLeagueCompetitors[9].addPlayer(Dier);
        ChampionsLeagueCompetitors[9].addPlayer(Trippier);
        ChampionsLeagueCompetitors[9].addPlayer(Winks);
        ChampionsLeagueCompetitors[9].addPlayer(Llorente);
        ChampionsLeagueCompetitors[9].addPlayer(Sissoko);

        ChampionsLeagueCompetitors[10].addPlayer(Dahoud);
        ChampionsLeagueCompetitors[10].addPlayer(Toprak);
        ChampionsLeagueCompetitors[10].addPlayer(Weidenfeller);
        ChampionsLeagueCompetitors[10].addPlayer(Yarmolenko);
        ChampionsLeagueCompetitors[10].addPlayer(Guerreiro);
        ChampionsLeagueCompetitors[10].addPlayer(Schmelzer);
        ChampionsLeagueCompetitors[10].addPlayer(Maximilian);

        ChampionsLeagueCompetitors[11].addPlayer(Vietto);
        ChampionsLeagueCompetitors[11].addPlayer(Thomas);
        ChampionsLeagueCompetitors[11].addPlayer(Correa);
        ChampionsLeagueCompetitors[11].addPlayer(Gimenez);
        ChampionsLeagueCompetitors[11].addPlayer(Lucas);
        ChampionsLeagueCompetitors[11].addPlayer(Saul);
        ChampionsLeagueCompetitors[11].addPlayer(Moya);


        ChampionsLeagueCompetitors[12].addPlayer(LMoura);
        ChampionsLeagueCompetitors[12].addPlayer(Areola);
        ChampionsLeagueCompetitors[12].addPlayer(Meunier);
        ChampionsLeagueCompetitors[12].addPlayer(DiMaria);
        ChampionsLeagueCompetitors[12].addPlayer(Beriche);
        ChampionsLeagueCompetitors[12].addPlayer(Kimpembe);
        ChampionsLeagueCompetitors[12].addPlayer(Draxler);

        ChampionsLeagueCompetitors[13].addPlayer(LMoura);
        ChampionsLeagueCompetitors[13].addPlayer(Areola);
        ChampionsLeagueCompetitors[13].addPlayer(Meunier);
        ChampionsLeagueCompetitors[13].addPlayer(DiMaria);
        ChampionsLeagueCompetitors[13].addPlayer(Beriche);
        ChampionsLeagueCompetitors[13].addPlayer(Kimpembe);
        ChampionsLeagueCompetitors[13].addPlayer(Draxler);

        ChampionsLeagueCompetitors[14].addPlayer(BBajda);
        ChampionsLeagueCompetitors[14].addPlayer(JGerula);
        ChampionsLeagueCompetitors[14].addPlayer(PGerula);
        ChampionsLeagueCompetitors[14].addPlayer(JBajda);
        ChampionsLeagueCompetitors[14].addPlayer(DBochenek);
        ChampionsLeagueCompetitors[14].addPlayer(PMikita);
        ChampionsLeagueCompetitors[14].addPlayer(EKowalinski);

        ChampionsLeagueCompetitors[15].addPlayer(JGluszko);
        ChampionsLeagueCompetitors[15].addPlayer(KZabawski);
        ChampionsLeagueCompetitors[15].addPlayer(DZabawski);
        ChampionsLeagueCompetitors[15].addPlayer(SFednar);
        ChampionsLeagueCompetitors[15].addPlayer(MFednar);
        ChampionsLeagueCompetitors[15].addPlayer(DSwist);
        ChampionsLeagueCompetitors[15].addPlayer(MSwist);


        //ustawienie najlepszych formacji dla każdej z drużyn
        for(int i=0; i<ChampionsLeagueCompetitors.length-1; i++) ChampionsLeagueCompetitors[i].bestSetUp(formations,false);

        // stworzenie grup w których rozgrywane będą mecze (program działa tak, aby w jednej grupie nie spotkały się dwie drużyny z tego samego państwa)


        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LigaMistrzowGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LigaMistrzowGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LigaMistrzowGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LigaMistrzowGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LigaMistrzowGUI(ChampionsLeagueCompetitors,formations).setVisible(true);
            }
        });
    }


    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;

}
