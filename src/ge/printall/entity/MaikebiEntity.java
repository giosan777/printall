package ge.printall.entity;

import java.util.Arrays;

/**
 * Created by giosan777 on 25.05.2017.
 */
public class MaikebiEntity {
    private long id;
    private byte[] content;
    private long janriId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public long getJanriId() {
        return janriId;
    }

    public void setJanriId(long janriId) {
        this.janriId = janriId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaikebiEntity that = (MaikebiEntity) o;

        if (id != that.id) return false;
        if (janriId != that.janriId) return false;
        if (!Arrays.equals(content, that.content)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + Arrays.hashCode(content);
        result = 31 * result + (int) (janriId ^ (janriId >>> 32));
        return result;
    }
}
