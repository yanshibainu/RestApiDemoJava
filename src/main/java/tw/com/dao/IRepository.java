package tw.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepository<E,ID> extends JpaRepository<E, ID>{

}
