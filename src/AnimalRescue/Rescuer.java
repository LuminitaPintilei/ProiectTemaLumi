package AnimalRescue;

public abstract class Rescuer {

    private String nameGirl;

    public String getNameGirl(){
        return nameGirl;
    }

    public void setNameGirl(String nameGirl) {
        this.nameGirl = nameGirl;
    }

    private float money;

    public float getMoney(){
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }
}
