package pl.blazej.szczypka.learn.beans;

public class Header {
    protected String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Header{" +
                "content='" + content + '\'' +
                '}';
    }
}
