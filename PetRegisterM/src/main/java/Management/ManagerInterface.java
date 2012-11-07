package Management;

import java.util.List;

import Humans.Human;

public interface ManagerInterface<TEntity> {

	public TEntity get(int id);
	public List<TEntity> getAll();
	public boolean save(TEntity obj);
	public boolean delete(TEntity obj);

	

}