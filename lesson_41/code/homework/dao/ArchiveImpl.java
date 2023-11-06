package homework.dao;

import homework.model.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class ArchiveImpl implements Archive{
    static Comparator<Document> comparator = (d1, d2) -> {
        int res = d1.getDate().compareTo(d2.getDate());
        return res != 0 ? res : Integer.compare(d1.getDocumentId(), d2.getDocumentId());
    };
    private Document[] documents;
    private int size;
    public  ArchiveImpl(int capacity) {
        documents = new Document[capacity];
    }
    @Override
    public boolean addDocument(Document document) {
        if (document == null || size == documents.length || getDocumentFromFolder(document.getDocumentId(),
                document.getFolderId()) != null) {
            return false;
        }
        int index = Arrays.binarySearch(documents, 0, size, document,comparator);
        index = index >= 0 ? index : - index - 1;
        System.arraycopy(documents, index, documents, index + 1, size - index);
        documents[index] = document;
        size++;
        return true;
    }
    @Override
    public boolean updateDocument(int folderId, int documentId, String url) {
        Document document = getDocumentFromFolder(documentId, folderId);
        if (document == null){
            return false;
        }
        document.setUrl(url);
        return true;
    }

    @Override
    public Document getDocumentFromFolder (int folderId, int documentId) {
        Document pattern = new Document(folderId, documentId, null, null, null);
        for (int i = 0; i < size; i++) {
            if (pattern.equals(documents[i])) {
                return documents[i];
            }
        }
        return null;
    }

    @Override
    public Document[] getAllDocumentFromFolder(int folderId) {
        return findByPredicate(d -> folderId == d.getFolderId());
    }
    private Document[] findByPredicate(Predicate<Document> predicate) {
        Document[] res = new Document[size];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(documents[i])) {
                res[j] = documents[i];
                j++;
            }
        }
        return Arrays.copyOf(res, j);
    }
    @Override
    public Document[] getDocumentByDate(LocalDate dateFrom, LocalDate dateTo) {
        Document pattern = new Document(0, Integer.MIN_VALUE, null, null, dateFrom.atStartOfDay());
        int from = -Arrays.binarySearch(documents, 0, size, pattern, comparator) -1;
//        from = from >= 0 ? from : -from - 1;
        pattern = new Document(0, Integer.MAX_VALUE, null, null, LocalDateTime.of(dateTo, LocalTime.MAX));
        int to = -Arrays.binarySearch(documents, 0, size, pattern, comparator) - 1;
//        to = to >= 0 ? to : -to - 1;
        return Arrays.copyOfRange(documents, from, to);
    }
    @Override
    public int size() {
        return size;
    }

}
