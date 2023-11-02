package homework.dao;

import homework.Document;

import java.time.LocalDate;

public interface Archive {
    boolean addDocument(Document document);
    boolean updateDocument(int folderId, int documentId, String name, String url);
    Document  getDocument(int folderId, int documentId);
    Document[] getAllDocumentFromFolder(int folderId);
    Document[] getDocumentsByDate(LocalDate dateFrom, LocalDate dateTo);
    int size();
}
