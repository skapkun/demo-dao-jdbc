package modelDao;

import java.util.List;

import modelEntities.Seller;

public interface SellerDao {
    void insert (Seller seller);//responsável por inserir objeto
    void update(Seller seller);
    void deleteById (Integer id);
    Seller findById (Integer id);
    List<Seller> findAll();
}
