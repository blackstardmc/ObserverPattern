package com.company;

import java.util.Observable;
import java.util.Observer;

public class DataSource extends Observable {
    private int valueExample;

    public DataSource(int valueExample) {
        this.valueExample = valueExample;
    }

    public int getValueExample() {
        return valueExample;
    }

    public void setValueExample(int valueExample) {
        this.valueExample = valueExample;
        setChanged();
        notifyObservers();

    }

}


class DataListener implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof DataSource) {
            DataSource dataSource = (DataSource) o;
            System.out.println("Data has changed to: " + dataSource.getValueExample());
        }
    }
}
