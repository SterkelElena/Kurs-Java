package homework.dao;

import homework.model.Document;

import java.time.LocalDate;

public interface Archive {
    boolean addDocument(Document document);
    boolean updateDocument(int folderId, int documentId, String url);
    Document  getDocumentFromFolder(int folderId, int documentId);
    Document[] getAllDocumentFromFolder(int folderId);
    Document[] getDocumentByDate(LocalDate dateFrom, LocalDate dateTo);
    int size();
}
