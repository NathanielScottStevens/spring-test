package hello;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by nathaniel.stevens on 4/28/17.
 */
public interface UserRepository extends CrudRepository<User, Long> {

}
