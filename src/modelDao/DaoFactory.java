package modelDao;

import modelDao.modelDaoImpl.SellerDadoImplJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDadoImplJDBC();
    }
    
}
