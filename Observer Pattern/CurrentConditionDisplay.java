package cn.com.model;

public class CurrentConditionDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;
    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData=weatherData;
        this.weatherData.registerObserver(this);//实现构造器初始化的时候直接完成注册
    }
    @Override
    public void display() {
        System.out.println("Current conditions: "+temperature+
                "F degrees and "+humidity+"% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature=temp;
        this.humidity=humidity;
        display();
    }
}
