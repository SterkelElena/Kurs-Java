package homework;

import java.time.LocalDateTime;
import java.util.Objects;

public class Document implements Comparable<Document>{
    private int folderId;
    private int documentId;
    private String name;
    private String url;
    private LocalDateTime date;

    public Document(int folderId, int documentId, String name, String url, LocalDateTime date) {
        this.folderId = folderId;
        this.documentId = documentId;
        this.name = name;
        this.url = url;
        this.date = date;
    }

    public int getFolderId() {
        return folderId;
    }

    public int getDocumentId() {
        return documentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Document{" +
                "folderId=" + folderId +
                ", documentId=" + documentId +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Document document = (Document) object;
        return folderId == document.folderId &&
                documentId == document.documentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(folderId, documentId, date);
    }

    @Override
    public int compareTo(Document o) {
        int res = Integer.compare(folderId, o.folderId);
        return res != 0 ? res: Integer.compare(documentId, o.documentId);
    }
}
