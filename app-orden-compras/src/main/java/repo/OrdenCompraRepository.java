package repo;

import db.OrdenCompra;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional                                       //Integer: el tipo de @ID
public class OrdenCompraRepository implements PanacheRepositoryBase<OrdenCompra, Integer> {

}
