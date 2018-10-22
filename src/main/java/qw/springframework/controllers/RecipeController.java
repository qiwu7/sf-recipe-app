package qw.springframework.controllers;

import qw.springframework.services.RecipeService;

public class RecipeController {

    private final RecipeService recipeService;


    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }
}
