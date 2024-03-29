package game.source;

public class Monster {

    private int lv=1;
    private int maxHP = 100;
    private int hp = maxHP;
    private int attackCount = 10;
    private boolean isAlive = true;
    private  int attCnt;

    public void setAttCnt(int attCnt) {
        this.attCnt = attCnt;
    }


    //몬스터 값 초기화
    public void remonstervalue(){
        this.hp = this.maxHP;
    }

    public void levelupMonster(){
        this.lv ++;
        this.attackCount = this.attackCount+((this.attackCount*lv)/2);
        this.isAlive = true;
        this.maxHP =this.maxHP+((this.maxHP*lv)/2);
        this.hp = this.maxHP;
    }

    public void deadMonster(){
        if(!this.isAlive){
            this.levelupMonster();
        }
    }

    public int getAttackCount() {
        return attackCount;
    }

    public void  attackMonster(){
        this.hp -= attCnt;
        System.out.println("데미지"+attCnt+" 로 몬스터를 공격했습니다. 체력이 "+this.hp+" 만큼 남았습니다.");
    }
    public void monsterAppear(){
        System.out.println("레벨이 "+this.lv+"이고 체력이 "+this.hp+"인 몬스터가 등장했습니다.");
    }

}
