package de.bs14.bestellprozess;

public class ProduktModel {

    private final long id;
    private final String content;

    public ProduktModel(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
