package ge.printall.DAO;

import ge.printall.entity.MaikebiEntity;

import java.sql.SQLException;

public interface MaikaDAO {
    public void getMaikaByJanri(long janriId) throws SQLException;
    public void getAllMaika(long janriId) throws SQLException;
}
