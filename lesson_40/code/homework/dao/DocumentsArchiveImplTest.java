package homework.dao;

import homework.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DocumentsArchiveImplTest {
    DocumentsArchive documentsArchive;
    LocalDateTime now = LocalDateTime.now();
    Document[] doc;

    @BeforeEach
    void setUp() {
        documentsArchive = new DocumentsArchiveImpl(7);
        doc = new Document[6];
        doc[0] = new Document(1,4,"Bank", "url1",now.minusDays(9));
        doc[1] = new Document(2,3,"Tax Declaration", "url2",now.minusDays(2));
        doc[2] = new Document(1,9,"Credit", "url3",now.minusDays(10));
        doc[3] = new Document(2,7,"Insurance", "url4",now.minusDays(3));
        doc[4] = new Document(2,5,"Paper", "url5",now.minusDays(7));
        doc[5] = new Document(1,2,"Visa", "url6",now.minusDays(5));

    }

    @Test
    void addDocument() {
        assertFalse(documentsArchive.addDocument(null));
        // нельзя добавить имеющееся
        assertFalse(documentsArchive.addDocument(doc[1]));
        // проверить возможность добавления
        Document document = new Document(3,1,"N", "url", now);
        assertTrue(documentsArchive.addDocument(document));
        // проверить ожидаемое кол-во после добавления
        assertEquals(7, documentsArchive.size());
        // нельзя превысить capacity
        document = new Document(3,2,"N", "url", now);
        assertFalse(documentsArchive.addDocument(document));
    }

    @Test
    void updateDocument() {
    }

    @Test
    void getDocument() {
    }

    @Test
    void getAllDocumentsFromFolder() {
    }

    @Test
    void getAllDocumentsByDate() {
    }

    @Test
    void size() {
        assertEquals(6, documentsArchive.size());
    }
}