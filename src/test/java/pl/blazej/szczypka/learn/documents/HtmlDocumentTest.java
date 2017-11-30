package pl.blazej.szczypka.learn.documents;

import org.junit.Test;
import pl.blazej.szczypka.learn.beans.DocumentType;
import pl.blazej.szczypka.learn.beans.Page;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class HtmlDocumentTest {
    @Test
    public void testHtmlDocumentObjectIsHtmlType(){
        HtmlDocument htmlDocument = new HtmlDocument();
        //Poniżej assert który porównuje.
        //Po lewej getDocumentType() -> return documentType
        //return documentType -> DocumentType w Document
        //DocumentType w Document -> enum DocumentType gdzie jest HTML
        //Dlatego lewa isEqual prawej.
        assertThat(htmlDocument.getDocumentType()).isEqualTo(DocumentType.HTML);
    }
    @Test
    public void testHtmlDocumentContainsTwoPages(){
        HtmlDocument googleMainPage = new HtmlDocument();

        List<Page> pages = new ArrayList<>();
        pages.add(new Page());
        pages.add(new Page());
        pages.add(new Page());
        //Dodajemy trzy nowe strony Page z Listy do obiektu i zarazem
        // dokumentu googleMainPage.
        googleMainPage.setPages(pages);

        //Sprawdza czy są dokładnie 3 strony w Liście.
        assertThat(pages).hasSize(3);
        //Sprawdzam dokument-obiekt googleMainPage czy nie jest Null
        assertThat(googleMainPage.getPages()).isNotNull();
    }
}