package homework.dao;

import homework.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveImplTest {
    Archive archive;
    LocalDateTime now = LocalDateTime.now();
    Document[] doc;

    @BeforeEach
    void setUp() {
        archive = new ArchiveImpl(7);
        doc =new Document[6];
        doc[0] = new Document(1,4,"Bank", "url1", now.minusDays(9));
        doc[1] = new Document(2,3,"Tax Declaration", "url2", now.minusDays(2));
        doc[2] = new Document(1,9,"Credit", "url3", now.minusDays(10));
        doc[3] = new Document(2,7,"Insurance", "url4", now.minusDays(-7));
        doc[4] = new Document(2,5,"Paper", "url5", now.minusDays(3));
        doc[5] = new Document(2,2,"Visa", "url6", now.minusDays(5));

        for (int i = 0; i < doc.length; i++) {
            archive.addDocument(doc[i]);
        }
    }

    @Test
    void addDocument() {
        assertFalse(archive.addDocument(null));
        assertFalse(archive.addDocument(doc[1]));
        Document document = new Document(3,1,"P", "url7", now);
        assertTrue(archive.addDocument(document));
        assertEquals(7, archive.size());
        document = new Document(3,2,"t", "url7", now);
        assertFalse(archive.addDocument(document));
    }

    @Test
    void updateDocument() {
        assertTrue(archive.updateDocument(1,1,"M","newUrl"));
        assertEquals("newUrl", archive.getDocument(1, 1).getUrl());
    }

    @Test
    void getDocument() {
        assertEquals(doc[0], archive.getDocument(1, 4));
        assertNull(archive.getDocument(3, 8));
    }

    @Test
    void getAllDocumentFromFolder() {
        Document[] expected = {doc[3], doc[4], doc[5]};
        Document[] actual = archive.getAllDocumentFromFolder(2);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void getDocumentsByDate() {
        LocalDate ld = now.toLocalDate();
        Document[] actual = archive.getDocumentsByDate(ld.minusDays(6), ld.minusDays(1));
        Arrays.sort(actual);
        Document[] expected = {doc[0], doc[1], doc[2]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void size() {
        assertEquals(6, archive.size());
    }
}