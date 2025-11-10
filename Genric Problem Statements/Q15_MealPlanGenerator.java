interface MealPlan {}
class VegetarianMeal implements MealPlan {}
class VeganMeal implements MealPlan {}
class KetoMeal implements MealPlan {}
class Meal<T extends MealPlan> { private T plan; Meal(T plan){this.plan=plan;} }
class MealPlanGenerator {
    public static <T extends MealPlan> void generateMealPlan(T plan){ System.out.println("Generated: "+plan.getClass().getSimpleName()); }
    public static void main(String[] args){ generateMealPlan(new VeganMeal()); }
}