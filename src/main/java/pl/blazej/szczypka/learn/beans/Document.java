package pl.blazej.szczypka.learn.beans;

import java.util.List;

public abstract class Document {
    protected List<Page> pages;
    protected DocumentType documentType;

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    @Override
    public String toString() {
        return "Document{" +
                "pages=" + pages +
                ", documentType=" + documentType +
                '}';
    }
}
