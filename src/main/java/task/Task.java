package task;

import java.util.Objects;

public class Task {
    protected int id;

    public Task(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    // Ниже находятся вспомогательные методы для корректной работы equals
    // Переопределять их в наследниках не нужно


    public boolean matches(String query) {

        return false;
    }
}
