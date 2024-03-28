package game.source;

public class Charactor {
    /*
    * - 캐릭터
    속성 : 이름 , 직업 , 레벨, 공격력, 살아있는지 확인
    메소드 :
    전투-공격, 전투-피하기, 전투 - 맞기, 전투 -도망가기 , 레벨 업, (몬스터 죽음, 사람이 죽음)
    * */
    private String name;
    private int lv=0;
    private int job;
    private String jobText;
    private int attackCount;
    private boolean isAlive = true;



    public Charactor() {  }
    public Charactor(String name, int job) {
        this.name = name;
        this.job = job;
        constructorFn();
    }

    public void constructorFn(){

        switch (this.job){
            case 1 : //전사
                this.attackCount = 20;
                this.jobText ="전사";
                break;
            case 2 : //마법사
                this.attackCount = 15;
                this.jobText ="마법사";
                break;
            case 3 : //궁수
                this.attackCount = 10;
                this.jobText ="궁수";
                break;
            default:
                this.attackCount = 5;
                this.jobText ="무직";
                break;
        }

    }

    public void attack(){

    }

    public String charactorInfo() {
        return "Charactor{" +
                "name='" + this.name + '\'' +
                ", lv=" + this.lv +
                ", job=" + this.jobText +
                '}';
    }
}
