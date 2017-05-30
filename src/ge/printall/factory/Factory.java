package ge.printall.factory;

import ge.printall.DAO.MaikaDAO;

/**
 * Created by giosan777 on 25.05.2017.
 */
public class Factory {
    private static Factory instance = null;

    public static synchronized Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }

    public MaikaDAO getBusDAO(){
        if (MaikaDAO == null){
            busDAO = new BusDAOImpl();
        }
        return busDAO;
    }

}
