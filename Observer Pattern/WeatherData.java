package cn.com.model;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData(){
        observers=new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        int i=observers.indexOf(ob);
        if(i>=0)
            observers.remove(i);
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i <observers.size(); i++) {
            Observer observer=observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }
    public void measureChanged(){
        notifyObserver();
    }
    public void setMeasurement(float temp,float humidity,float pressure){
        this.temperature=temp;
        this.humidity=humidity;
        this.temperature=pressure;
        measureChanged();
    }

}
