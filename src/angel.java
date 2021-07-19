
//Actor角色类：复合产品
class Actor{
    private String type;
    private String sex;
    private String face;
    private String costume;
    private String hairstyle;

    public void setType(String type) {
        this.type = type;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }

    public String getType() {
        return (this.type);
    }
    public String getSex(){
        return(this.sex);
    }
    public String getFace(){
        return(this.face);
    }
    public String getCostume(){
        return(this.costume);
    }
    public String getHairstyle(){
        return(this.hairstyle);
    }
}
//角色建造器：抽象建造者
abstract class ActorBuilder {
    protected Actor actor = new Actor();

    public abstract void buildType();

    public abstract void buildSex();

    public abstract void buildFace();

    public abstract void buildCostume();

    public abstract void buildHairstyle();

    public Actor createActor() {
        return actor;
    }
}
//英雄角色建造器：具体建造者
class HeroBuilder extends ActorBuilder{
    public void buildType()
    {
        actor.setType("英雄");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildFace() {
        actor.setFace("英俊");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("盔甲");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("飘逸");
    }
}
//天使角色建造器：具体建造者
class AngelBuilder extends ActorBuilder
{
    @Override
    public void buildType() {
        actor.setType("天使");
    }

    @Override
    public void buildSex() {
        actor.setSex("女");
    }

    @Override
    public void buildFace() {
        actor.setFace("漂亮");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("白裙");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("披肩长发");
    }
}
//魔鬼角色建造器：具体建造者
class GhostBuilder extends ActorBuilder
{
    public void buildType()
    {
        actor.setType("魔鬼");
    }

    @Override
    public void buildSex() {
        actor.setSex("妖");
    }

    @Override
    public void buildFace() {
        actor.setFace("丑陋");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("黑衣");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("光头");
    }
}
//Actor角色创建控制器：指挥者
class ActorController
{
    public Actor construct(ActorBuilder ab)
    {
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        ab.buildHairstyle();
        actor = ab.createActor();
        return actor;
    }
}
//客户端测试类
class angel
{
    public static void main(String[] args) {
        ActorController ac = new ActorController();
        ActorBuilder ab;
        ab = new AngelBuilder();
        Actor angel;
        angel = ac.construct(ab);
        String type = angel.getType();
        System.out.println(type + "的外观");
        System.out.println("性别：" + angel.getSex());
        System.out.println("面容：" + angel.getFace());
        System.out.println("服装：" + angel.getCostume());
        System.out.println("发型：" + angel.getHairstyle());


    }
}
