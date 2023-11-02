package homework.dao;

import homework.Document;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;

public class DocumentsArchiveImpl implements DocumentsArchive{
    static Comparator<Document> comparator = (p1, p2) -> {
        int res = p1.getDate().compareTo(p2.getDate());
        return res != 0 ? res : Integer.compare(p1.getDocumentId(), p2.getDocumentId());
    };
    private Document[] documents;
    private int size;
    public DocumentsArchiveImpl(int capacity) {
        documents = new Document[capacity];
    }
    @Override
    public boolean addDocument(Document document) {
        return false;
    }

    @Override
    public boolean updateDocument(int folderId, int documentId, Date date, String url, String name) {
        return false;
    }

    @Override
    public Document getDocument(int folderId, int documentId) {
        return null;
    }

    @Override
    public Document[] getAllDocumentsFromFolder(int folderId) {
        return new Document[0];
    }

    @Override
    public Document[] getAllDocumentsByDate(LocalDate dateFrom, LocalDate dateTo) {
        return new Document[0];
    }

    @Override
    public int size() {
        return size;
    }

}
