package src;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class LigaMistrzowGIU2 extends JFrame {
    private Team enemy;
    private Team player;
    private ArrayList<Formation> formations;
    private JLabel[] players =new JLabel[121];

    public LigaMistrzowGIU2(){
        initComponents();

    }
    public LigaMistrzowGIU2(Team t1, Team t2, ArrayList<Formation> f) {
        this.formations=f;
        this.enemy=t2;
        this.player=t1;
        initComponents();
        setPlayersx();
        initTeams();
    }
    public void setPlayersx(){
        for (int i=0; i<11 ; i++){
            if (!enemy.getMatchUp2(i).getName().equals("") && !enemy.getMatchUp2(i).getSurname().equals("") ) {
                players[110 + i].setText(enemy.getMatchUp2(i).getName().substring(0, 1) + ". " + enemy.getMatchUp2(i).getSurname());
            }
            else
                players[110 + i].setText(enemy.getMatchUp2(i).getName()+ enemy.getMatchUp2(i).getSurname());
        }

        setLabelsx();
    }
    public void setLabelsx() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 11; j++) {
                if (player.getMatchUp2(j).getName().equals("") || player.getMatchUp2(j).getSurname().equals("") ) {
                    players[i * 11 + j].setText(player.getMatchUp2(j).getSurname()+player.getMatchUp2(j).getName());
                }
                else {
                    players[i * 11 + j].setText(player.getMatchUp2(j).getName().substring(0, 1) + ". " + player.getMatchUp2(j).getSurname());
                }
            }
        }
        jLabel123.setText(player.getName());
        jLabel12.setText(enemy.getName());

    }
    public void initTeams(){
        String[] strings=new String[11];
        for (int i=0; i<11; i++){
            strings[i]=player.getMatchUp2(i).getNumber()+". "+player.getMatchUp2(i).getName()+" "+player.getMatchUp2(i).getSurname()+" "+player.getMatchUp2(i).getPosition().getWing()+player.getMatchUp2(i).getPosition().getLine();
        }
        jList1.setModel(new AbstractListModel<String>() {
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        String[] strings1=new String[7];
        for (int i=0; i<7; i++){
            strings1[i]=player.getSub(i).getNumber()+". "+player.getSub(i).getName()+" "+player.getSub(i).getSurname()+" "+player.getSub(i).getPosition().getWing()+player.getSub(i).getPosition().getLine();
        }
        jList2.setModel(new AbstractListModel<String>() {
            public int getSize() { return strings1.length; }
            public String getElementAt(int i) { return strings1[i]; }
        });
        String[] strings2=new String[11];
        for (int i=0; i<11; i++){
            strings2[i]=enemy.getMatchUp2(i).getNumber()+". "+enemy.getMatchUp2(i).getName()+" "+enemy.getMatchUp2(i).getSurname()+" "+enemy.getMatchUp2(i).getPosition().getWing()+enemy.getMatchUp2(i).getPosition().getLine();
        }
        jList3.setModel(new AbstractListModel<String>() {
            public int getSize() { return strings2.length; }
            public String getElementAt(int i) { return strings2[i]; }
        });
        String[] strings3=new String[7];
        for (int i=0; i<7; i++){
            strings3[i]=enemy.getSub(i).getNumber()+". "+enemy.getSub(i).getName()+" "+enemy.getSub(i).getSurname()+" "+enemy.getSub(i).getPosition().getWing()+enemy.getSub(i).getPosition().getLine();
        }
        jList4.setModel(new AbstractListModel<String>() {
            public int getSize() { return strings3.length; }
            public String getElementAt(int i) { return strings3[i]; }
        });

    }
    public void showTeam(){
        String[] strings=new String[11];
        for (int i=0; i<11; i++){
            strings[i]=player.getMatchUp2(i).getNumber()+" "+player.getMatchUp2(i).getName()+" "+player.getMatchUp2(i).getSurname()+" "+player.getMatchUp2(i).getPosition().getWing()+player.getMatchUp2(i).getPosition().getLine();
        }
        jList1.setModel(new AbstractListModel<String>() {
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        String[] strings1=new String[7];
        for (int i=0; i<7; i++){
            strings1[i]=player.getSub(i).getNumber()+" "+player.getSub(i).getName()+" "+player.getSub(i).getSurname()+" "+player.getSub(i).getPosition().getWing()+player.getSub(i).getPosition().getLine();
        }
        jList2.setModel(new AbstractListModel<String>() {
            public int getSize() { return strings1.length; }
            public String getElementAt(int i) { return strings1[i]; }
        });
        jLabel4.setText(player.getFormation().getName());
    }
    private void initComponents() {


        jTabbedPane1 = new JTabbedPane();
        jPanel6 = new JPanel();
        player2 = new JLabel();
        jLabel15 = new JLabel();
        jLabel16 = new JLabel();
        jLabel17 = new JLabel();
        jLabel18 = new JLabel();
        jLabel24 = new JLabel();
        jLabel25 = new JLabel();
        jLabel26 = new JLabel();
        jLabel27 = new JLabel();
        jLabel28 = new JLabel();
        jLabel29 = new JLabel();
        jButton10 = new JButton();
        jPanel7 = new JPanel();
        jLabel30 = new JLabel();
        jLabel31 = new JLabel();
        jLabel23 = new JLabel();
        jLabel32 = new JLabel();
        jLabel33 = new JLabel();
        jLabel34 = new JLabel();
        jLabel23 = new JLabel();
        jLabel66 = new JLabel();
        jLabel102 = new JLabel();
        jLabel103 = new JLabel();
        jLabel104 = new JLabel();
        jLabel105 = new JLabel();
        jButton9 = new JButton();
        jPanel8 = new JPanel();
        jLabel35 = new JLabel();
        jLabel36 = new JLabel();
        jLabel37 = new JLabel();
        jLabel38 = new JLabel();
        jLabel39 = new JLabel();
        jLabel106 = new JLabel();
        jLabel107 = new JLabel();
        jLabel108 = new JLabel();
        jLabel109 = new JLabel();
        jLabel110 = new JLabel();
        jLabel111 = new JLabel();
        jButton8 = new JButton();
        jPanel9 = new JPanel();
        jLabel40 = new JLabel();
        jLabel41 = new JLabel();
        jLabel42 = new JLabel();
        jLabel43 = new JLabel();
        jLabel44 = new JLabel();
        jLabel96 = new JLabel();
        jLabel97 = new JLabel();
        jLabel98 = new JLabel();
        jLabel99 = new JLabel();
        jLabel100 = new JLabel();
        jLabel101 = new JLabel();
        jButton7 = new JButton();
        jPanel10 = new JPanel();
        jLabel45 = new JLabel();
        jLabel46 = new JLabel();
        jLabel47 = new JLabel();
        jLabel48 = new JLabel();
        jLabel84 = new JLabel();
        jLabel85 = new JLabel();
        jLabel86 = new JLabel();
        jLabel87 = new JLabel();
        jLabel88 = new JLabel();
        jLabel89 = new JLabel();
        jLabel90 = new JLabel();
        jButton6 = new JButton();
        jPanel11 = new JPanel();
        jLabel49 = new JLabel();
        jLabel50 = new JLabel();
        jLabel51 = new JLabel();
        jLabel52 = new JLabel();
        jLabel72 = new JLabel();
        jLabel73 = new JLabel();
        jLabel74 = new JLabel();
        jLabel75 = new JLabel();
        jLabel76 = new JLabel();
        jLabel77 = new JLabel();
        jLabel78 = new JLabel();
        jButton5 = new JButton();
        jPanel12 = new JPanel();
        jPanel15 = new JPanel();
        jLabel54 = new JLabel();
        jLabel55 = new JLabel();
        jLabel56 = new JLabel();
        jLabel57 = new JLabel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel79 = new JLabel();
        jLabel80 = new JLabel();
        jLabel81 = new JLabel();
        jLabel82 = new JLabel();
        jLabel83 = new JLabel();
        jButton4 = new JButton();
        jPanel13 = new JPanel();
        jLabel19 = new JLabel();
        jLabel58 = new JLabel();
        jLabel59 = new JLabel();
        jLabel60 = new JLabel();
        jlabel39 = new JLabel();
        jLabel20 = new JLabel();
        jLabel91 = new JLabel();
        jLabel92 = new JLabel();
        jLabel93 = new JLabel();
        jLabel94 = new JLabel();
        jLabel95 = new JLabel();
        jButton3 = new JButton();
        jPanel14 = new JPanel();
        jLabel21 = new JLabel();
        jLabel62 = new JLabel();
        jLabel63 = new JLabel();
        jLabel64 = new JLabel();
        jLabel65 = new JLabel();
        jLabel22 = new JLabel();
        jLabel67 = new JLabel();
        jLabel68 = new JLabel();
        jLabel69 = new JLabel();
        jLabel70 = new JLabel();
        jLabel71 = new JLabel();
        jButton2 = new JButton();
        jPanel5 = new JPanel();
        jLabel53 = new JLabel();
        jLabel112 = new JLabel();
        jLabel113 = new JLabel();
        jLabel114 = new JLabel();
        jLabel115 = new JLabel();
        jLabel116 = new JLabel();
        jLabel117 = new JLabel();
        jLabel118 = new JLabel();
        jLabel119 = new JLabel();
        jLabel120 = new JLabel();
        jLabel121 = new JLabel();
        jButton1 = new JButton();
        jScrollPane1 = new JScrollPane();
        jList1 = new JList<>();
        jScrollPane2 = new JScrollPane();
        jList2 = new JList<>();
        jButton11 = new JButton();
        jButton13 = new JButton();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jPanel1 = new JPanel();
        jPanel16 = new JPanel();
        jLabel125 = new JLabel();
        jLabel126 = new JLabel();
        jLabel127 = new JLabel();
        jLabel128 = new JLabel();
        jLabel129 = new JLabel();
        jLabel130 = new JLabel();
        jLabel131 = new JLabel();
        jLabel132 = new JLabel();
        jLabel133 = new JLabel();
        jLabel134 = new JLabel();
        jLabel135 = new JLabel();
        jScrollPane3 = new JScrollPane();
        jList3 = new JList<>();
        jScrollPane4 = new JScrollPane();
        jList4 = new JList<>();
        jScrollPane5 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jLabel5 = new JLabel();
        jPanel2 = new JPanel();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        jLabel122 = new JLabel();
        jLabel123 = new JLabel();
        jLabel124 = new JLabel();
        jButton14 = new JButton();
        jButton14.setEnabled(false);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        jLabel15.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel16.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel17.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel18.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel24.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel25.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel26.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel27.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel28.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel29.setHorizontalAlignment(SwingConstants.CENTER);

        jButton10.setText("Set Formation");

        GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel18, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(player2, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel16, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                                        .addComponent(jLabel17, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel26, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel29, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel25, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                                        .addComponent(jLabel28, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel27, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                        .addComponent(jLabel24, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(jButton10, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap(50, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel27)
                                        .addComponent(jLabel28)
                                        .addComponent(jLabel29))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel24)
                                        .addComponent(jLabel25)
                                        .addComponent(jLabel26))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(player2)
                                        .addComponent(jLabel17))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel16))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18)
                                .addGap(40, 40, 40)
                                .addComponent(jButton10))
        );


        players[66]=jLabel18;
        players[67]=player2;
        players[68]=jLabel15;
        players[69]=jLabel16;
        players[70]=jLabel17;
        players[71]=jLabel26;
        players[72]=jLabel25;
        players[73]=jLabel24;
        players[74]=jLabel29;
        players[75]=jLabel27;
        players[76]=jLabel28;

        jTabbedPane1.addTab("4-3-3", jPanel6);

        jLabel30.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel31.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel32.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel33.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel34.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel23.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel66.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel102.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel103.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel104.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel105.setHorizontalAlignment(SwingConstants.CENTER);

        jButton9.setText("Set Formation");

        GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(jLabel23, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel66, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                                .addComponent(jLabel102, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel103, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel104, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel105, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel30, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel32, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel31, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel33, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                                                        .addComponent(jLabel34, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addComponent(jButton9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addContainerGap(38, Short.MAX_VALUE)
                                .addComponent(jLabel105)
                                .addGap(36, 36, 36)
                                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel104)
                                        .addComponent(jLabel103)
                                        .addComponent(jLabel102))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel23)
                                        .addComponent(jLabel66))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel32)
                                        .addComponent(jLabel34))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel31)
                                        .addComponent(jLabel33))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel30)
                                .addGap(29, 29, 29)
                                .addComponent(jButton9))
        );

        players[77]=jLabel30;
        players[78]=jLabel32;
        players[79]=jLabel31;
        players[80]=jLabel33;
        players[81]=jLabel34;
        players[82]=jLabel23;
        players[83]=jLabel66;
        players[84]=jLabel104;
        players[85]=jLabel102;
        players[86]=jLabel103;
        players[87]=jLabel105;

        jTabbedPane1.addTab("4-2-3-1", jPanel7);

        jLabel35.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel36.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel38.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel39.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel106.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel107.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel108.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel109.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel110.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel111.setHorizontalAlignment(SwingConstants.CENTER);
        jButton8.setText("Set Formation");

        GroupLayout jPanel8Layout = new GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jLabel106, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel108, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel107, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jLabel109, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel110, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                                        .addComponent(jLabel35, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel37, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel36, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel38, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                                        .addComponent(jLabel39, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap())
                        .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel111, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap()))
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel107)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel110)
                                        .addComponent(jLabel109))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel108)
                                        .addComponent(jLabel106))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel37)
                                        .addComponent(jLabel39))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel36)
                                        .addComponent(jLabel38))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel35)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8))
                        .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(125, 125, 125)
                                        .addComponent(jLabel111)
                                        .addContainerGap(150, Short.MAX_VALUE)))
        );

        players[88]=jLabel35;
        players[89]=jLabel37;
        players[90]=jLabel36;
        players[91]=jLabel38;
        players[92]=jLabel39;
        players[93]=jLabel106;
        players[94]=jLabel111;
        players[95]=jLabel108;
        players[96]=jLabel110;
        players[97]=jLabel109;
        players[98]=jLabel107;

        jTabbedPane1.addTab("4-3-2-1", jPanel8);

        jLabel40.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel41.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel43.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel44.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel96.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel97.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel98.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel99.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel100.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel101.setHorizontalAlignment(SwingConstants.CENTER);

        jButton7.setText("Set Formation");

        GroupLayout jPanel9Layout = new GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel101, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel40, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel42, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel41, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel43, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                                        .addComponent(jLabel44, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                                .addComponent(jLabel97, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel96, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel99, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addComponent(jLabel98, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel100, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jButton7, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addContainerGap(42, Short.MAX_VALUE)
                                .addComponent(jLabel101)
                                .addGap(31, 31, 31)
                                .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel98)
                                        .addComponent(jLabel100))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel99)
                                        .addComponent(jLabel96)
                                        .addComponent(jLabel97))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel42)
                                        .addComponent(jLabel44))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel41)
                                        .addComponent(jLabel43))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel40)
                                .addGap(33, 33, 33)
                                .addComponent(jButton7))
        );

        players[99]=jLabel40;
        players[100]=jLabel42;
        players[101]=jLabel41;
        players[102]=jLabel43;
        players[103]=jLabel44;
        players[104]=jLabel97;
        players[105]=jLabel96;
        players[106]=jLabel99;
        players[107]=jLabel98;
        players[108]=jLabel100;
        players[109]=jLabel101;

        jTabbedPane1.addTab("4-5-1", jPanel9);

        jLabel45.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel46.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel47.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel48.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel85.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel86.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel87.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel88.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel89.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel90.setHorizontalAlignment(SwingConstants.CENTER);

        jButton6.setText("Set Formation");

        GroupLayout jPanel10Layout = new GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
                jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel89, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel48, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                                .addComponent(jLabel45, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel46, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel47, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                                        .addComponent(jButton6, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel10Layout.createSequentialGroup()
                                                .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jLabel88, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel84, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                                        .addComponent(jLabel85, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel86, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                                        .addComponent(jLabel87, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel90, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
                jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addContainerGap(38, Short.MAX_VALUE)
                                .addComponent(jLabel89, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel90)
                                        .addComponent(jLabel88))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel84)
                                        .addComponent(jLabel87))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel85)
                                        .addComponent(jLabel86, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel47)
                                        .addComponent(jLabel46)
                                        .addComponent(jLabel45))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel48)
                                .addGap(27, 27, 27)
                                .addComponent(jButton6))
        );

        players[0]=jLabel48;
        players[1]=jLabel45;
        players[2]=jLabel46;
        players[3]=jLabel47;
        players[4]=jLabel84;
        players[5]=jLabel85;
        players[6]=jLabel86;
        players[7]=jLabel87;
        players[8]=jLabel90;
        players[9]=jLabel88;
        players[10]=jLabel89;


        jTabbedPane1.addTab("3-4-3", jPanel10);

        jLabel49.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel50.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel51.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel52.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel72.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel73.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel74.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel75.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel76.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel77.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel78.setHorizontalAlignment(SwingConstants.CENTER);

        jButton5.setText("Set Formation");

        GroupLayout jPanel11Layout = new GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
                jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel74, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel49, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                                .addComponent(jLabel51, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel50, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel52, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                                .addComponent(jLabel77, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel78, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jButton5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                                                .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jLabel73, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                                        .addComponent(jLabel72, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel76, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel75, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
                jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel77)
                                        .addComponent(jLabel78))
                                .addGap(24, 24, 24)
                                .addComponent(jLabel74)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel72)
                                        .addComponent(jLabel76))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel75)
                                        .addComponent(jLabel73))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel52)
                                        .addComponent(jLabel50)
                                        .addComponent(jLabel51))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel49)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(jButton5))
        );

        players[11]=jLabel49;
        players[12]=jLabel51;
        players[13]=jLabel50;
        players[14]=jLabel52;
        players[15]=jLabel72;
        players[16]=jLabel73;
        players[17]=jLabel75;
        players[18]=jLabel76;
        players[19]=jLabel74;
        players[20]=jLabel78;
        players[21]=jLabel77;

        jTabbedPane1.addTab("3-5-2", jPanel11);

        jLabel54.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel55.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel56.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel57.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel80.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel81.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel82.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel83.setHorizontalAlignment(SwingConstants.CENTER);

        GroupLayout jPanel15Layout = new GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
                jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel83, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel54, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel15Layout.createSequentialGroup()
                                                .addComponent(jLabel56, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel55, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel57, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                                                .addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel79, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel80, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel81, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                                        .addComponent(jLabel82, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
                jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel83)
                                .addGap(31, 31, 31)
                                .addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel79)
                                        .addComponent(jLabel82))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel80)
                                        .addComponent(jLabel81))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel57)
                                        .addComponent(jLabel55)
                                        .addComponent(jLabel56))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(jLabel54)
                                .addGap(41, 41, 41))
        );

        players[22]=jLabel54;
        players[23]=jLabel1;
        players[24]=jLabel56;
        players[25]=jLabel55;
        players[26]=jLabel57;
        players[27]=jLabel2;
        players[28]=jLabel80;
        players[29]=jLabel81;
        players[30]=jLabel82;
        players[31]=jLabel79;
        players[32]=jLabel83;

        jButton4.setText("Set Formation");

        GroupLayout jPanel12Layout = new GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
                jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
                jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addContainerGap(255, Short.MAX_VALUE)
                                .addComponent(jButton4)
                                .addContainerGap())
                        .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("5-4-1", jPanel12);

        jLabel19.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel58.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel59.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel60.setHorizontalAlignment(SwingConstants.CENTER);
        jlabel39.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel20.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel91.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel92.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel93.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel94.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel95.setHorizontalAlignment(SwingConstants.CENTER);

        jButton3.setText("Set Formation");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        GroupLayout jPanel13Layout = new GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
                jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel60, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                                .addComponent(jLabel58, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel59, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jlabel39, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel13Layout.createSequentialGroup()
                                                .addComponent(jLabel19, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel20, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel13Layout.createSequentialGroup()
                                                .addComponent(jLabel91, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel92, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel93, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                                        .addGroup(jPanel13Layout.createSequentialGroup()
                                                .addComponent(jLabel94, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel95, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jButton3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
                jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel94)
                                        .addComponent(jLabel95))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel93)
                                        .addComponent(jLabel92)
                                        .addComponent(jLabel91))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel19)
                                        .addComponent(jLabel20))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jlabel39)
                                        .addComponent(jLabel59)
                                        .addComponent(jLabel58))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel60)
                                .addGap(28, 28, 28)
                                .addComponent(jButton3)
                                .addContainerGap(32, Short.MAX_VALUE))
        );

        players[33]=jLabel60;
        players[34]=jLabel19;
        players[35]=jLabel58;
        players[36]=jLabel59;
        players[37]=jlabel39;
        players[38]=jLabel20;
        players[39]=jLabel91;
        players[40]=jLabel92;
        players[41]=jLabel93;
        players[42]=jLabel94;
        players[43]=jLabel95;

        jTabbedPane1.addTab("5-3-2", jPanel13);

        jLabel21.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel62.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel63.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel64.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel65.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel22.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel67.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel68.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel69.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel70.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel71.setHorizontalAlignment(SwingConstants.CENTER);

        jButton2.setText("Set Formation");


        GroupLayout jPanel14Layout = new GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
                jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel14Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel71, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel64, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                                .addComponent(jLabel62, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel63, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel65, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel14Layout.createSequentialGroup()
                                                .addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jLabel67, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel69, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel21, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel22, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel70, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel68, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
                jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel71)
                                .addGap(31, 31, 31)
                                .addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel69)
                                        .addComponent(jLabel70))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel67)
                                        .addComponent(jLabel68))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel21)
                                        .addComponent(jLabel22))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel65)
                                        .addComponent(jLabel63)
                                        .addComponent(jLabel62))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel64)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(jButton2))
        );

        players[44]=jLabel64;
        players[45]=jLabel21;
        players[46]=jLabel62;
        players[47]=jLabel63;
        players[48]=jLabel65;
        players[49]=jLabel22;
        players[50]=jLabel68;
        players[51]=jLabel67;
        players[52]=jLabel70;
        players[53]=jLabel69;
        players[54]=jLabel71;

        jTabbedPane1.addTab("5-2-2-1", jPanel14);


        jLabel112.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel113.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel114.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel115.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel117.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel118.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel119.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel120.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel121.setHorizontalAlignment(SwingConstants.CENTER);

        jButton1.setText("Set Formation");


        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel115, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel53, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel112, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel113, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                                        .addComponent(jLabel114, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel116, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel117, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel118, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                                        .addComponent(jLabel119, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel120, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel121, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel120)
                                        .addComponent(jLabel121))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel116)
                                        .addComponent(jLabel119))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel117)
                                        .addComponent(jLabel118))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel53)
                                        .addComponent(jLabel114))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel112)
                                        .addComponent(jLabel113))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel115)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(jButton1))
        );

        players[55]=jLabel115;
        players[56]=jLabel53;
        players[57]=jLabel112;
        players[58]=jLabel113;
        players[59]=jLabel114;
        players[60]=jLabel116;
        players[61]=jLabel117;
        players[62]=jLabel118;
        players[63]=jLabel119;
        players[64]=jLabel120;
        players[65]=jLabel121;

        jTabbedPane1.addTab("4-4-2", jPanel5);

        jList1.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "6", "7", "8", "9", "10", "11" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "6", "7" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);
        jButton11.setText("Swap");
        jButton13.setText("Start match");
        jLabel3.setFont(new Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("Enemy team");

        jLabel4.setFont(new Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setText("Your team");

        jLabel125.setText("jLabel6");

        jLabel126.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel126.setText("jLabel4");

        jLabel127.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel127.setText("jLabel5");

        jLabel128.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel128.setText("jLabel7");

        jLabel129.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel129.setText("jLabel3");

        jLabel130.setText("jLabel6");

        jLabel131.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel131.setText("jLabel4");

        jLabel132.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel132.setText("jLabel5");

        jLabel133.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel133.setText("jLabel7");

        jLabel134.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel134.setText("jLabel23");

        jLabel135.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel135.setText("jLabel66");

        GroupLayout jPanel16Layout = new GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
                jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel129, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel16Layout.createSequentialGroup()
                                                .addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel125, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel126, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel127, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                                        .addComponent(jLabel128, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel16Layout.createSequentialGroup()
                                                .addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel130, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel131, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel132, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                                        .addComponent(jLabel133, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel16Layout.createSequentialGroup()
                                                .addComponent(jLabel134, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel135, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
                jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel134)
                                        .addComponent(jLabel135))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel130)
                                        .addComponent(jLabel133))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel131)
                                        .addComponent(jLabel132))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel125)
                                        .addComponent(jLabel128))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel126)
                                        .addComponent(jLabel127))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel129)
                                .addGap(28, 28, 28))
        );

        players[110]=jLabel129;
        players[111]=jLabel126;
        players[112]=jLabel127;
        players[113]=jLabel125;
        players[114]=jLabel128;
        players[115]=jLabel131;
        players[116]=jLabel132;
        players[117]=jLabel130;
        players[118]=jLabel133;
        players[119]=jLabel134;
        players[120]=jLabel135;

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))
        );

        jList3.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "6", "7", "8", "9", "10", "11" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        jList4.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "6", "7" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList4);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane5.setViewportView(jTextArea1);

        jLabel5.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel5.setText("Match overview");

        jLabel12.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(SwingConstants.LEFT);


        jLabel13.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel13.setText("0");

        jLabel122.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        jLabel122.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel122.setText("0");

        jLabel123.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabel123.setHorizontalAlignment(SwingConstants.LEFT);

        jLabel124.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        jLabel124.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel124.setText("Score");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel123, GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                        .addComponent(jLabel122, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                        .addComponent(jLabel124, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel124)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel123, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(7, 7, 7))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel122, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel13, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                                .addGap(40, 40, 40))
        );

        jButton14.setText("Exit match");
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane( ).setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jScrollPane2)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jButton13, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addComponent(jButton11, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        ))
                                                                .addGap(0, 7, Short.MAX_VALUE))))
                                        .addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane4))
                                        .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jScrollPane5, GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                                                        .addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jButton14, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 308, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(743, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTabbedPane1)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jScrollPane5, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton11))
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton13))
                                        .addComponent(jScrollPane1)
                                        .addComponent(jScrollPane3)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton14, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel4)
                                        .addContainerGap(601, Short.MAX_VALUE)))
        );
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt,0);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt,1);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt,2);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt,3);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt,4);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt,5);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt,6);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt,7);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt,8);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt,9);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playMatch(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jTabbedPane1.getAccessibleContext().setAccessibleName("player1");

        pack();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        player.substitution(player.getSub(jList2.getSelectedIndex()),player.getMatchUp2(jList1.getSelectedIndex()));
        setLabelsx();
        showTeam();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {


        showTeam();
        player.setFormation(formations.get((jList3.getSelectedIndex())));
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt, int x) {

        System.out.println(x);
        player.setFormation(formations.get(x));
        player.setUp(false);
        setLabelsx();

    }
    private void playMatch(java.awt.event.ActionEvent evt){
        int[] score=new int[2];
        Team tx=player;
        int[] indexes= new int[]{0,1,2,3};


        score=player.PlayMatch(enemy, 90);
        jTextArea1.setText(player.getName()+"                              "+enemy.getName()+"\n");
        int[] goals=new int[2];
        for(int i=0; i<score.length/3; i++){
            if(score[i*3+2]==1) {
                jTextArea1.append("" + score[i * 3] + "' " + player.getMatchUp2(score[i * 3 + 1]).getName() + " " + player.getMatchUp2(score[i * 3 + 1]).getSurname() + "\n");
                goals[0]++;
            }
            else {
                jTextArea1.append("                                                 " + score[i * 3] + "' " + enemy.getMatchUp2(score[i * 3 + 1]).getName() + " " + enemy.getMatchUp2(score[i * 3 + 1]).getSurname() + "\n");
                goals[1]++;
            }
        }
        jLabel13.setText(""+goals[1]);
        jLabel122.setText(""+goals[0]);
        jButton13.setEnabled(false);
        jButton14.setEnabled(true);
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        super.dispose();
    }

    public static void main(String args[]) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LigaMistrzowGIU2().setVisible(true);
            }
        });
    }


    private JButton jButton1;
    private JButton jButton10;
    private JButton jButton11;
    private JButton jButton13;
    private JButton jButton14;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;
    private JLabel jLabel1;
    private JLabel jLabel100;
    private JLabel jLabel101;
    private JLabel jLabel102;
    private JLabel jLabel103;
    private JLabel jLabel104;
    private JLabel jLabel105;
    private JLabel jLabel106;
    private JLabel jLabel107;
    private JLabel jLabel108;
    private JLabel jLabel109;
    private JLabel jLabel110;
    private JLabel jLabel111;
    private JLabel jLabel112;
    private JLabel jLabel113;
    private JLabel jLabel114;
    private JLabel jLabel115;
    private JLabel jLabel116;
    private JLabel jLabel117;
    private JLabel jLabel118;
    private JLabel jLabel119;
    private JLabel jLabel12;
    private JLabel jLabel120;
    private JLabel jLabel121;
    private JLabel jLabel122;
    private JLabel jLabel123;
    private JLabel jLabel124;
    private JLabel jLabel125;
    private JLabel jLabel126;
    private JLabel jLabel127;
    private JLabel jLabel128;
    private JLabel jLabel129;
    private JLabel jLabel13;
    private JLabel jLabel130;
    private JLabel jLabel131;
    private JLabel jLabel132;
    private JLabel jLabel133;
    private JLabel jLabel134;
    private JLabel jLabel135;
    private JLabel player2;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel26;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel33;
    private JLabel jLabel34;
    private JLabel jLabel35;
    private JLabel jLabel36;
    private JLabel jLabel37;
    private JLabel jLabel38;
    private JLabel jLabel39;
    private JLabel jLabel4;
    private JLabel jLabel40;
    private JLabel jLabel41;
    private JLabel jLabel42;
    private JLabel jLabel43;
    private JLabel jLabel44;
    private JLabel jLabel45;
    private JLabel jLabel46;
    private JLabel jLabel47;
    private JLabel jLabel48;
    private JLabel jLabel49;
    private JLabel jLabel5;
    private JLabel jLabel50;
    private JLabel jLabel51;
    private JLabel jLabel52;
    private JLabel jLabel53;
    private JLabel jLabel54;
    private JLabel jLabel55;
    private JLabel jLabel56;
    private JLabel jLabel57;
    private JLabel jLabel58;
    private JLabel jLabel59;
    private JLabel jLabel60;
    private JLabel jlabel39;
    private JLabel jLabel62;
    private JLabel jLabel63;
    private JLabel jLabel64;
    private JLabel jLabel65;
    private JLabel jLabel66;
    private JLabel jLabel67;
    private JLabel jLabel68;
    private JLabel jLabel69;
    private JLabel jLabel70;
    private JLabel jLabel71;
    private JLabel jLabel72;
    private JLabel jLabel73;
    private JLabel jLabel74;
    private JLabel jLabel75;
    private JLabel jLabel76;
    private JLabel jLabel77;
    private JLabel jLabel78;
    private JLabel jLabel79;
    private JLabel jLabel80;
    private JLabel jLabel81;
    private JLabel jLabel82;
    private JLabel jLabel83;
    private JLabel jLabel84;
    private JLabel jLabel85;
    private JLabel jLabel86;
    private JLabel jLabel87;
    private JLabel jLabel88;
    private JLabel jLabel89;
    private JLabel jLabel90;
    private JLabel jLabel91;
    private JLabel jLabel92;
    private JLabel jLabel93;
    private JLabel jLabel94;
    private JLabel jLabel95;
    private JLabel jLabel96;
    private JLabel jLabel97;
    private JLabel jLabel98;
    private JLabel jLabel99;
    private JList<String> jList1;
    private JList<String> jList2;
    private JList<String> jList3;
    private JList<String> jList4;
    private JPanel jPanel1;
    private JPanel jPanel10;
    private JPanel jPanel11;
    private JPanel jPanel12;
    private JPanel jPanel13;
    private JPanel jPanel14;
    private JPanel jPanel15;
    private JPanel jPanel16;
    private JPanel jPanel2;
    private JPanel jPanel5;
    private JPanel jPanel6;
    private JPanel jPanel7;
    private JPanel jPanel8;
    private JPanel jPanel9;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JScrollPane jScrollPane4;
    private JScrollPane jScrollPane5;
    private JTabbedPane jTabbedPane1;
    private JTextArea jTextArea1;
    // End of variables declaration
}
