blueprint for Tofu {
  construct(volumn, firmness) = {
    Tofu's volumn = volumn; 
    Tofu's firmness = firmness; 
    Tofu's cookingMethod = "raw";
  }

  fry() = {
    cookingMethod = "fry"; 
  }

  stinky() = {
    cookingMethod = "stinkied"; 
  }
}

tofu = make Tofu(100, "extra firm"); 
tofu does fry(); 
tofu's volumn; 