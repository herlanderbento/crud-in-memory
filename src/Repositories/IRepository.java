package Repositories;

import java.util.List;

public interface IRepository<E> {
    public void save(E entity);
    public void delete(long id);
    public List<E> list();
    public void update(E entity);
}
