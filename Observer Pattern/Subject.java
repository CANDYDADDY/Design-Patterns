package cn.com.model;

public interface Subject {
    public void registerObserver(Observer ob);
    public void removeObserver(Observer ob);
    public void notifyObserver();
}
