package practice.doc_archive.dao;

import practice.doc_archive.model.Document1;

import java.time.LocalDate;

public interface Archive1 {

        boolean addDocument (Document1 document);
        boolean removeDocument(int folderId, int documentId);
        boolean updateDocument(int folderId, int documentId,String url);
        Document1 getDocFromFolder (int folderId, int documentId);
        Document1[] getAllDocFromFolder(int folderId);
        Document1[] getDocBetweenDate(LocalDate dateFrom, LocalDate dateTo);
        int size(); //quantity
        void viewArchive(); // метод для печати содержимого
}
