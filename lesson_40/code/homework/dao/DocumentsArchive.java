package homework.dao;

import homework.Document;

import java.time.LocalDate;
import java.util.Date;


public interface DocumentsArchive {
    boolean addDocument(Document document);
    boolean updateDocument(int folderId, int documentId, Date date, String url, String name);
    Document getDocument(int folderId, int documentId);
    Document[] getAllDocumentsFromFolder(int folderId);
    Document[] getAllDocumentsByDate(LocalDate dateFrom, LocalDate dateTo);
    int size();
}
