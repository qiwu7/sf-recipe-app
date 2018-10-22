package qw.springframework.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import qw.springframework.domain.Recipe;
import qw.springframework.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.debug("I am in recipe service");

        Set<Recipe> recipes = new HashSet<>();

        recipeRepository.findAll().forEach(recipes::add);
        return recipes;
    }

    @Override
    public Recipe findById(Long id) {
        return null;
    }
}
