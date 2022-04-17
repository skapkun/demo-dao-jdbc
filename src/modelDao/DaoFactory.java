package modelDao;

import db.DB;
import modelDao.modelDaoImpl.SellerDaoImplJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoImplJDBC(DB.getConnection());
    }
    
}
