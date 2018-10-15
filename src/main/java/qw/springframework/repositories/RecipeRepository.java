package qw.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import qw.springframework.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
