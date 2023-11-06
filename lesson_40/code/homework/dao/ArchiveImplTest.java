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
        doc[0] = new Document(1,1,"t1", "url1", now.minusDays(2));
        doc[1] = new Document(1,2,"t2", "url2", now.minusDays(3));
        doc[2] = new Document(1,3,"t3", "url3", now.minusDays(5));
        doc[3] = new Document(2,1,"t1", "url4", now.minusDays(7));
        doc[4] = new Document(2,2,"t2", "url5", now.minusDays(7));
        doc[5] = new Document(2,3,"t3", "url6", now.minusDays(7));

        for (int i = 0; i < doc.length; i++) {
            archive.addDocument(doc[i]);
        }
    }

    @Test
    void addDocument() {
        assertFalse(archive.addDocument(null));
        assertFalse(archive.addDocument(doc[1]));
        Document document = new Document(3,1,"t", "url", now);
        assertTrue(archive.addDocument(document));
        assertEquals(7, archive.size());
        document = new Document(3,2,"t", "url", now);
        assertFalse(archive.addDocument(document));
    }

    @Test
    void updateDocument() {
        assertTrue(archive.updateDocument(1,1,"newUrl"));
        assertEquals("newUrl", archive.getDocumentFromFolder(1, 1).getUrl());
    }

    @Test
    void getDocumentFromFolder() {
        assertEquals(doc[0], archive.getDocumentFromFolder(1, 1));
        assertNull(archive.getDocumentFromFolder(3, 1));
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
        Document[] actual = archive.getDocumentByDate(ld.minusDays(6), ld.minusDays(1));
        Arrays.sort(actual);
        Document[] expected = {doc[0], doc[1], doc[2]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void size() {
        assertEquals(6, archive.size());
    }
}