package modelDao;

import db.DB;
import modelDao.modelDaoImpl.SellerDadoImplJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDadoImplJDBC(DB.getConnection());
    }
    
}
