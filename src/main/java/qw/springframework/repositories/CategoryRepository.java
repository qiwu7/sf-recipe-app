package qw.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import qw.springframework.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
