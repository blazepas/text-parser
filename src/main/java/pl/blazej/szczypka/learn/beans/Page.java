package pl.blazej.szczypka.learn.beans;

public class Page {
    protected String content;
    protected short number;
    protected String title;
    protected Header header;
    protected Footer footer;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public short getNumber() {
        return number;
    }

    public void setNumber(short number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Footer getFooter() {
        return footer;
    }

    public void setFooter(Footer footer) {
        this.footer = footer;
    }

    @Override
    public String toString() {
        return "Page{" +
                "content='" + content + '\'' +
                ", number=" + number +
                ", title='" + title + '\'' +
                ", header=" + header +
                ", footer=" + footer +
                '}';
    }
}
