package game.source;

public class Monster {

    private int lv=0;
    private int maxHP = 100;
    private int hp = maxHP;
    private int attackCount = 10;
    private boolean isAlive = true;


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

    public void monsterAppear(){
        System.out.println("레벨이 "+this.lv+"이고 체력이 "+this.hp+"인 몬스터가 등장했습니다.");
    }

}
