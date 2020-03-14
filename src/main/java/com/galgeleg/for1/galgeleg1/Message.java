package com.galgeleg.for1.galgeleg1;

public class Message {
    private final long id;
    private final String content;
    private final String cont2;

    public Message(long id, String content, String cont2) {
        this.id = id;
        this.content = content;
        this.cont2 = cont2;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getCont2() {
        return cont2;
    }
}
