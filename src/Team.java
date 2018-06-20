import java.util.ArrayList;

/**
 * Created by Dorota on 2016-12-25.
 */

public class Team {

    private String name;
    private String nationality;
    private ArrayList<Player> PlayerList= new ArrayList<>();
    private Player[] MatchUp=new Player[11];
    private Player[] Substitutions = new Player[7];
    private Formation formation;
    private int TeamOffensiveRatio[]=new int[11];
    private int TeamDefenseRatio=0;

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    //gettery i podstawowe funkcje zmieniające parametry
    public int getTeamOffensiveRatio(int n) {
        return TeamOffensiveRatio[n];
    }
    public int getTeamDefenseRatio() {
        return TeamDefenseRatio;
    }
    public Player getSub(int index){
        return Substitutions[index];
    }
    public Player getMatchUp2(int index) {
        return MatchUp[index];
    }
    public Player[] getMatchUp() {
        return MatchUp;
    }
    public void addPlayer(Player p) {
        this.PlayerList.add(p);
        for (int i=0; i<Substitutions.length; i++)
            if (Substitutions[i]==null) {
                Substitutions[i] = p;
                break;
            }
    }
    public String getName() {
        return name;
    }
    public String getNationality() {
        return nationality;
    }
    public Formation getFormation(){
        return this.formation;
    }
    // funkcja pozwalająca na dokonasnie zmiany
    public void substitution(Player p1, Player p2) {

        int index = 100;
        Player buf;
        for (int i = 0; i < Substitutions.length; i++) {
            if (this.Substitutions[i] != null) {
                if (this.Substitutions[i].hashCode() == p1.hashCode()) {
                    index = i;
                    break;
                }
            }
        }
        if (index == 100) {
            System.out.println("Player not found!");
            return;
        }
        boolean check=false;
        for (int i = 0; i < 11; i++) {
            if (this.MatchUp[i].hashCode()==p2.hashCode()) {
                buf = MatchUp[i];
                MatchUp[i] = Substitutions[index];
                Substitutions[index] = buf;
                System.out.println("\n\nSubstitution: "+Substitutions[index].getName()+" "+Substitutions[index].getSurname()+" ----> out");
                System.out.println("              "+MatchUp[i].getName()+" "+MatchUp[i].getSurname()+" <---- in");
                check=true;
                break;
            }

        }
        if (check==false) System.out.println("Player not found!");
        else calculateRatio(false);
    }
    // funkcja wyświetlająca drużyne
    public void showTeam(){
        System.out.println("\n \nMatch up:");

        for (int i=0; i<11; i++){
            System.out.println(MatchUp[i].getNumber()+"."+MatchUp[i].getName()+" "+MatchUp[i].getSurname() + " "+ this.formation.getPosition(i).getWing()+this.formation.getPosition(i).getLine());
        }
        System.out.println("\n \nSubstitutions:");

        for (int i=0; i<7; i++){
            if (Substitutions[i]!=null)
                System.out.println(this.Substitutions[i].getNumber()+"."+this.Substitutions[i].getName()+" "+this.Substitutions[i].getSurname());
            else System.out.println("---||---");
        }
        System.out.println("\n \n");
    }
    // ustawianie zawodników do formacji
    public void setUp(boolean visibility){
        Player z= new Player("","",new Position("","",""),0,0);
        ArrayList <Integer> notUsedPosition= new ArrayList<>();
        ArrayList <Integer> foundPosition= new ArrayList<>();
        Player[] buf= new Player[11];
        ArrayList <Player> missings = new ArrayList<>();
        boolean[] formation_flags = new boolean[11];
        boolean found=false;
        int checker=0;
        int counter=0;
        for(int i=0 ; i<11; i++){
            buf[i]=MatchUp[i];
            this.MatchUp[i]=z;
        }

        for (int i=0; i<11; i++){
            for(int j=0; j<11; j++) {
                if (buf[i].getPosition() == formation.getPosition(j)) {
                    if (formation_flags[j] == false) {
                        MatchUp[j] = buf[i];
                        formation_flags[j] = true;
                        found =true;
                        //      System.out.println("Znaleziono pozycję dla gracza: "+MatchUp[j].getName()+MatchUp[j].getSurname());
                        break;
                    }
                    //      System.out.println("Znaleziono pozycję dla gracza: "+buf[i].getName()+buf[i].getSurname()+" ale jest zajęta, szukam dalej");
                }
            }
            if (found==false){
                missings.add(buf[i]);
                //       System.out.println("Nie znaleziono pozycji dla gracza: "+buf[i].getName()+" "+buf[i].getSurname());
            }
            found =false;
        }


        for (int i=0 ; i<11; i++){
            // System.out.println(MatchUp[i].getNumber()+"."+MatchUp[i].getName()+" "+MatchUp[i].getSurname()+formation.getPosition(i).getWing()+formation.getPosition(i).getLine());
            if(formation_flags[i]==false){
                notUsedPosition.add(i);
            }
        }

        for(int i=0; i<notUsedPosition.size(); i++){
            formation_flags[i]=false;
        }
        if (visibility)
            System.out.println("Ustawiono nasępujący skład do formacji:" + this.formation.getName());
        if (missings.size()==0) {
            if (visibility==true) {
                showTeam();
            }
            return;
        }


        for(int i=0; i<notUsedPosition.size(); i++){
            for(int j=0 ; j<notUsedPosition.size(); j++) {
                if (missings.get(i).getPosition().getTask() == formation.getPosition((notUsedPosition.get(j))).getTask() && formation_flags[j]==false){
                    MatchUp[(notUsedPosition.get(j))]=missings.get(i);
                    formation_flags[j]=true;
                    found=true;
                    break;
                }
            }
            if(found==false){
                missings.add(missings.get(i));
            }
            found=false;
        }
        for(int i=0; i<11; i++){
            //    System.out.println(MatchUp[i].getNumber()+"."+MatchUp[i].getName()+" "+MatchUp[i].getSurname()+formation.getPosition(i).getWing()+formation.getPosition(i).getLine());
            if(MatchUp[i].getSurname()=="" && MatchUp[i].getName()==""){
                checker++;
            }
        }
        if (checker==11){
            if (visibility==true) {
                showTeam();
            }
            return;
        }


        checker=0;
        counter=notUsedPosition.size();
        for(int i=0; i<counter; i++){
            missings.remove(0);
            notUsedPosition.remove(0);
        }

        for (int i=0 ; i<11; i++){
            if(MatchUp[i].getSurname()=="" && MatchUp[i].getName()==""){
                notUsedPosition.add(i);
            }
        }

        for(int i=0; i<notUsedPosition.size(); i++){
            formation_flags[i]=false;
        }
        for(int i=0; i<notUsedPosition.size(); i++){
            for(int j=0 ; j<notUsedPosition.size(); j++) {
                if (missings.get(i).getPosition().getLine() == formation.getPosition((notUsedPosition.get(j))).getLine() && formation_flags[j]==false){
                    MatchUp[(notUsedPosition.get(j))]=missings.get(i);
                    formation_flags[j]=true;
                    found=true;
                    break;
                }
            }
            if(found==false){
                missings.add(missings.get(i));
            }
            found=false;
        }
        for(int i=0; i<11; i++){
            if(MatchUp[i].getSurname()!=""){
                checker++;
            }
        }
        if (checker==11){
            if (visibility==true) {
                showTeam();
            }
            return;
        }


        checker=0;
        counter=notUsedPosition.size();
        for(int i=0; i<counter; i++){
            missings.remove(0);
            notUsedPosition.remove(0);
        }


        for (int i=0 ; i<11; i++){
            //       System.out.println(MatchUp[i].getNumber()+"."+MatchUp[i].getName()+" "+MatchUp[i].getSurname()+formation.getPosition(i).getWing()+formation.getPosition(i).getLine());
            if(MatchUp[i].getSurname()=="" && MatchUp[i].getName()==""){
                notUsedPosition.add(i);
            }
        }

        for(int i=0; i<notUsedPosition.size(); i++){
            formation_flags[i]=false;
        }
        for(int i=0; i<notUsedPosition.size(); i++){
            for(int j=0 ; j<notUsedPosition.size(); j++) {
                if (missings.get(i).getPosition().getWing() == formation.getPosition((notUsedPosition.get(j))).getWing() && formation_flags[j]==false){
                    MatchUp[(notUsedPosition.get(j))]=missings.get(i);
                    formation_flags[j]=true;
                    found=true;
                    break;
                }

            }
            if(found==false){
                missings.add(missings.get(i));
            }
            found=false;
        }
        for(int i=0; i<11; i++){
            if(MatchUp[i].getSurname()!=""){
                checker++;
            }
        }
        if (checker==11){
            if (visibility==true) {
                showTeam();
            }
            return;
        }



        counter=notUsedPosition.size();
        for(int i=0; i<counter; i++){
            missings.remove(0);
            notUsedPosition.remove(0);
        }
        for (int i=0 ; i<11; i++){
            if(MatchUp[i].getSurname()=="" && MatchUp[i].getName()==""){
                notUsedPosition.add(i);
            }
        }

        for(int i=0; i<notUsedPosition.size(); i++){
            formation_flags[i]=false;
        }
        for(int i=0; i<notUsedPosition.size(); i++){
            // System.out.println("Szukanie pozycji dla zawodnika: "+missings.get(i).getName()+" "+missings.get(i).getSurname());
            for(int j=0 ; j<notUsedPosition.size(); j++) {
                if (formation_flags[j]==false){
                    MatchUp[(notUsedPosition.get(j))]=missings.get(i);
                    //  System.out.println("Znaleziono! Pozycja "+notUsedPosition.get(j)+"dla "+missings.get(i).getName()+" "+missings.get(i).getSurname());
                    formation_flags[j]=true;
                    found=true;
                    break;
                }
                //   System.out.println("Pozycja zajęta, szukam innej");
            }
            if(found==false){
                //   System.out.println("Nie znaleziono pozycji dla " + missings.get(i).getName() + " " + missings.get(i).getSurname());
                missings.add(missings.get(i));
            }
            found=false;
        }

        if (visibility==true) {
            showTeam();
        }


    }
    // konstruktor
    public Team(String name, String nationality,Formation form, Player p1, Player p2, Player p3, Player p4, Player p5, Player p6, Player p7, Player p8, Player p9, Player p10, Player p11) {

        this.formation=form;
        this.name = name;
        this.nationality = nationality;
        this.PlayerList.add(p1);
        this.PlayerList.add(p2);
        this.PlayerList.add(p3);
        this.PlayerList.add(p4);
        this.PlayerList.add(p5);
        this.PlayerList.add(p6);
        this.PlayerList.add(p7);
        this.PlayerList.add(p8);
        this.PlayerList.add(p9);
        this.PlayerList.add(p10);
        this.PlayerList.add(p11);
        this.MatchUp[0]= this.PlayerList.get(0);
        this.MatchUp[1]= this.PlayerList.get(1);
        this.MatchUp[2]= this.PlayerList.get(2);
        this.MatchUp[3]= this.PlayerList.get(3);
        this.MatchUp[4]= this.PlayerList.get(4);
        this.MatchUp[5]= this.PlayerList.get(5);
        this.MatchUp[6]= this.PlayerList.get(6);
        this.MatchUp[7]= this.PlayerList.get(7);
        this.MatchUp[8]= this.PlayerList.get(8);
        this.MatchUp[9]= this.PlayerList.get(9);
        this.MatchUp[10]= this.PlayerList.get(10);
        for (int i=0; i<11; i++) TeamOffensiveRatio[i]=0;


    }
    // obliczanie wartości ofensywnych zawodników i całkowitą wartość obrony drużyny
    public int calculateRatio(boolean visibility){
        int [] PlayerOveralls= new int[11];
        int Overalll=0;
        if (visibility)
            System.out.println("Ratios calculated: ");
        for(int i=0; i<11 ; i++) {
            if (MatchUp[i].getPosition().getLine() == formation.getPosition(i).getLine()) {
                if (MatchUp[i].getPosition().getWing() == formation.getPosition(i).getWing()) {
                    if (MatchUp[i].getPosition().getTask() == formation.getPosition(i).getTask()) {
                        PlayerOveralls[i]=MatchUp[i].getOverall();
                    }
                    else if ( formation.getPosition(i).getTask()=="E" ||MatchUp[i].getPosition().getTask()=="E")  {
                        PlayerOveralls[i]=(int)(MatchUp[i].getOverall()*0.9);
                    }
                    else{
                        PlayerOveralls[i]=(int)(MatchUp[i].getOverall()*0.8);
                    }
                }
                else if(MatchUp[i].getPosition().getWing() !="C" && formation.getPosition(i).getWing() !="C"){
                    PlayerOveralls[i]=(int)(MatchUp[i].getOverall()*0.95);
                    if (MatchUp[i].getPosition().getTask() == formation.getPosition(i).getTask()) {
                        PlayerOveralls[i]=PlayerOveralls[i];
                    }
                    else if ( MatchUp[i].getPosition().getTask() == formation.getPosition(i).getTask() && (formation.getPosition(i).getTask()=="E" ||MatchUp[i].getPosition().getTask()=="E") ) {
                        PlayerOveralls[i]=(int)(PlayerOveralls[i]*0.9);
                    }
                    else PlayerOveralls[i]=(int)(PlayerOveralls[i]*0.9);
                }
                else {
                    PlayerOveralls[i] = (int) (MatchUp[i].getOverall() * 0.9);
                    if (MatchUp[i].getPosition().getTask() == formation.getPosition(i).getTask()) {
                        PlayerOveralls[i] = PlayerOveralls[i];
                    } else if (MatchUp[i].getPosition().getTask() == formation.getPosition(i).getTask() && (formation.getPosition(i).getTask() == "E" || MatchUp[i].getPosition().getTask() == "E")) {
                        PlayerOveralls[i] = (int) (PlayerOveralls[i] * 0.9);
                    } else PlayerOveralls[i] = (int) (PlayerOveralls[i] * 0.9);
                }
            }
            else if (MatchUp[i].getPosition().getLine()=="M" || formation.getPosition(i).getLine()=="M") {
                PlayerOveralls[i]=(int)(MatchUp[i].getOverall()*0.9);
                if (MatchUp[i].getPosition().getWing() == formation.getPosition(i).getWing()) {
                    if (MatchUp[i].getPosition().getTask() == formation.getPosition(i).getTask()) {
                        PlayerOveralls[i]=PlayerOveralls[i];
                    }
                    else if ( MatchUp[i].getPosition().getTask() == formation.getPosition(i).getTask() && (formation.getPosition(i).getTask()=="E" ||MatchUp[i].getPosition().getTask()=="E") ) {
                        PlayerOveralls[i]=(int)(PlayerOveralls[i]*0.9);
                    }
                    else PlayerOveralls[i]=(int)(PlayerOveralls[i]*0.9);
                }
                else if(MatchUp[i].getPosition().getWing() !="C" && formation.getPosition(i).getWing() !="C"){
                    PlayerOveralls[i]=(int)(MatchUp[i].getOverall()*0.9);
                    if (MatchUp[i].getPosition().getTask() == formation.getPosition(i).getTask()) {
                        PlayerOveralls[i]=PlayerOveralls[i];
                    }
                    else if ( MatchUp[i].getPosition().getTask() == formation.getPosition(i).getTask() && (formation.getPosition(i).getTask()=="E" ||MatchUp[i].getPosition().getTask()=="E") ) {
                        PlayerOveralls[i]=(int)(PlayerOveralls[i]*0.9);
                    }
                    else PlayerOveralls[i]=(int)(PlayerOveralls[i]*0.9);
                }
                else {
                    PlayerOveralls[i] = (int) (MatchUp[i].getOverall() * 0.9);
                    if (MatchUp[i].getPosition().getTask() == formation.getPosition(i).getTask()) {
                        PlayerOveralls[i] = PlayerOveralls[i];
                    } else if (MatchUp[i].getPosition().getTask() == formation.getPosition(i).getTask() && (formation.getPosition(i).getTask() == "E" || MatchUp[i].getPosition().getTask() == "E")) {
                        PlayerOveralls[i] = (int) (PlayerOveralls[i] * 0.9);
                    } else PlayerOveralls[i] = (int) (PlayerOveralls[i] * 0.9);
                }
            }
            else {
                PlayerOveralls[i]=(int)(MatchUp[i].getOverall()*0.65);
                if (MatchUp[i].getPosition().getWing() == formation.getPosition(i).getWing()) {
                    if (MatchUp[i].getPosition().getTask() == formation.getPosition(i).getTask()) {
                        PlayerOveralls[i]=PlayerOveralls[i];
                    }
                    else if ( MatchUp[i].getPosition().getTask() == formation.getPosition(i).getTask() && (formation.getPosition(i).getTask()=="E" ||MatchUp[i].getPosition().getTask()=="E") ) {
                        PlayerOveralls[i]=(int)(PlayerOveralls[i]*0.9);
                    }
                    else PlayerOveralls[i]=(int)(PlayerOveralls[i]*0.9);
                }
                else if(MatchUp[i].getPosition().getWing() !="C" && formation.getPosition(i).getWing() !="C"){
                    PlayerOveralls[i]=(int)(PlayerOveralls[i]*0.9);
                    if (MatchUp[i].getPosition().getTask() == formation.getPosition(i).getTask()) {
                        PlayerOveralls[i]=PlayerOveralls[i];
                    }
                    else if ( MatchUp[i].getPosition().getTask() == formation.getPosition(i).getTask() && (formation.getPosition(i).getTask()=="E" ||MatchUp[i].getPosition().getTask()=="E") ) {
                        PlayerOveralls[i]=(int)(PlayerOveralls[i]*0.9);
                    }
                    else PlayerOveralls[i]=(int)(PlayerOveralls[i]*0.9);
                }
                else {
                    PlayerOveralls[i] = (int) (MatchUp[i].getOverall() * 0.8);
                    if (MatchUp[i].getPosition().getTask() == formation.getPosition(i).getTask()) {
                        PlayerOveralls[i] = PlayerOveralls[i];
                    } else if (MatchUp[i].getPosition().getTask() == formation.getPosition(i).getTask() && (formation.getPosition(i).getTask() == "E" || MatchUp[i].getPosition().getTask() == "E")) {
                        PlayerOveralls[i] = (int) (PlayerOveralls[i] * 0.9);
                    } else PlayerOveralls[i] = (int) (PlayerOveralls[i]* 0.8);
                }
            }
        }
        for (int i=0; i<11 ; i++){
            Overalll+=PlayerOveralls[i];
            switch(MatchUp[i].getPosition().getWing()+MatchUp[i].getPosition().getLine()+MatchUp[i].getPosition().getTask()){
                case "CGKD": TeamOffensiveRatio[i]=1; TeamDefenseRatio+=(PlayerOveralls[i]*15); break;
                case "CBD": TeamOffensiveRatio[i]=PlayerOveralls[i]*2; TeamDefenseRatio+=(PlayerOveralls[i]*7);break;
                case "RBD": TeamOffensiveRatio[i]=(int)(PlayerOveralls[i]*2.5); TeamDefenseRatio+=(PlayerOveralls[i]*6);break;
                case "LBD": TeamOffensiveRatio[i]=(int)(PlayerOveralls[i]*2.5); TeamDefenseRatio+=(PlayerOveralls[i]*6);break;
                case "CMD": TeamOffensiveRatio[i]=PlayerOveralls[i]*4; TeamDefenseRatio+=(PlayerOveralls[i]*5);break;
                case "CME": TeamOffensiveRatio[i]=PlayerOveralls[i]*5; TeamDefenseRatio+=(PlayerOveralls[i]*4);break;
                case "CMO": TeamOffensiveRatio[i]=(int)(PlayerOveralls[i]*6.5); TeamDefenseRatio+=(int)(PlayerOveralls[i]*2.5);break;
                case "CAO": TeamOffensiveRatio[i]=PlayerOveralls[i]*9; TeamDefenseRatio+=PlayerOveralls[i];break;
                case "RAO": TeamOffensiveRatio[i]=PlayerOveralls[i]*9; TeamDefenseRatio+=(PlayerOveralls[i]);break;
                case "LAO": TeamOffensiveRatio[i]=PlayerOveralls[i]*9; TeamDefenseRatio+=(PlayerOveralls[i]);break;
                case "LBE": TeamOffensiveRatio[i]=(int)(PlayerOveralls[i]*4.5); TeamDefenseRatio+=(int)(PlayerOveralls[i]*4.5);break;
                case "RBE": TeamOffensiveRatio[i]=(int)(PlayerOveralls[i]*4.5); TeamDefenseRatio+=(int)(PlayerOveralls[i]*4.5);break;
                case "RME": TeamOffensiveRatio[i]=(int)(PlayerOveralls[i]*5.5); TeamDefenseRatio+=(int)(PlayerOveralls[i]*3.5);break;
                case "LME": TeamOffensiveRatio[i]=(int)(PlayerOveralls[i]*5.5); TeamDefenseRatio+=(int)(PlayerOveralls[i]*3.5);break;
            }
            if (visibility)
                System.out.println(MatchUp[i].getName()+" "+MatchUp[i].getSurname()+" original overall:  "+MatchUp[i].getPosition().getWing()+MatchUp[i].getPosition().getLine()+MatchUp[i].getOverall()+"    overall after:         "+PlayerOveralls[i]+" "+formation.getPosition(i).getWing()+formation.getPosition(i).getLine());
        }

        return Overalll;
    }
    // szukanie najlepszego możliwego ustawienia
    public void bestSetUp(ArrayList <Formation> s, boolean visibility){
        int best=0;
        int index=0;
        for(int i=0; i<s.size() ; i++) {
            if (visibility)
                System.out.println("Setting formation: "+s.get(i).getName());
            this.setFormation(s.get(i));
            this.setUp(false);
            int ovrl= this.calculateRatio(visibility);
            if (visibility)
                System.out.println("\n\nFormation:"+this.formation.getName()+" overall: "+ovrl+"\n");
            if (ovrl > best){
                best = ovrl;
                index = i;
            }
            if (visibility)
                System.out.println("Current best ratio: "+best+" formation:"+s.get(index).getName());
        }
        this.setFormation(s.get(index));
        this.setUp(false);
        if (visibility)
            System.out.println("The best formation for team: "+this.getName()+"is: "+this.formation.getName());
    }
    // wyczyszczenie wartości ofensywnych i defensywnych drużyny
    public void clearRatios(){ for (int i=0; i<11; i++) TeamOffensiveRatio[i]=0; TeamDefenseRatio=0;}
    //metoda odpowiedzialna za rozgrywanie meczy między dwoma zespołami, parametr time ustala jak długo trwa mecz
    public int[] PlayMatch(Team Away,int Time){
        clearRatios();
        Away.clearRatios();
        System.out.println("          " + getName() + "           " + Away.getName());
        int GoalsHome = 0;
        int GoalsAway = 0;
        ArrayList<Integer> minutes =new ArrayList<>();
        ArrayList<Integer> teamGoal= new ArrayList<>();
        ArrayList<Integer> scorers=new ArrayList<>();
        getMatchUp();
        Away.getMatchUp();
        calculateRatio(false);
        Away.calculateRatio(false);
        int goal;
        for (int i = 1; i < Time + 1; i++) {
            goal = (int) (Math.random() * (Away.getTeamDefenseRatio()));
            for (int j = 0; j < 11; j++) {
                for (int k = 0; k < (int) (getTeamOffensiveRatio(j) / 40); k++) {
                    int shot = (int) (Math.random() * (1000 + Away.getTeamDefenseRatio()));
                    if (shot == goal) {
                        GoalsHome++;
                        minutes.add(i);
                        teamGoal.add(1);
                        scorers.add(j);
                        MatchUp[j].GoalScored();
                        System.out.println(i + "'       " + MatchUp[j].getNumber() + "." + MatchUp[j].getName() + " " + MatchUp[j].getSurname());
                        i++;
                    }
                }
            }
            goal = (int) (Math.random() * (getTeamDefenseRatio() + 1500));
            for (int j = 0; j < 11; j++) {
                for (int k = 0; k < (int) (getTeamOffensiveRatio(j) / 50); k++) {
                    int shot = (int) (Math.random() * (1500 + getTeamDefenseRatio()));
                    if (shot == goal) {
                        minutes.add(i);
                        teamGoal.add(2);
                        scorers.add(j);
                        GoalsAway++;
                        Away.MatchUp[j].GoalScored();
                        System.out.println(i + "'                                 " + Away.MatchUp[j].getNumber() + "." + Away.MatchUp[j].getName() + " " + Away.MatchUp[j].getSurname());
                        i++;
                    }
                }
            }


        }
        System.out.println(GoalsHome + ":" + GoalsAway + "\n ");
        Integer[] mins=minutes.toArray(new Integer[minutes.size()]);
        Integer[] players=scorers.toArray(new Integer[scorers.size()]);
        Integer[] teamscored=teamGoal.toArray(new Integer[teamGoal.size()]);
        int score[]=new int[3*mins.length];
        for (int i=0; i<mins.length; i++){
            score[i*3]=mins[i];
            score[i*3+1]=players[i];
            score[i*3+2]=teamscored[i];
        }
        return score;
    }
    // metoda pozwalająca na rozegranie konkursu rzutów karnych

}
