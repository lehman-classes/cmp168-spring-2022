public abstract class Pet implements FoodEater {

  private String favoriteFood;
  private String favoriteToy;
  private int maintenanceLevel;
  private boolean goesOutside;

  public Pet() {
    // default values ”unknown food” , ”unknown toy” , 0, false
    this.favoriteFood = "unknown food";
    this.favoriteToy = "unknown toy";
    this.maintenanceLevel = 0;
    this.goesOutside = false;
  }

  public Pet(String favoriteFood, String favoriteToy, int maintenanceLevel, boolean goesOutside) {
    this.favoriteFood = favoriteFood;
    this.favoriteToy = favoriteToy;
    this.maintenanceLevel = maintenanceLevel;
    this.goesOutside = goesOutside;
  }

  public abstract void play();

  public String getFavoriteFood() {
    return favoriteFood;
  }

  public void setFavoriteFood(String favoriteFood) {
    this.favoriteFood = favoriteFood;
  }

  public String getFavoriteToy() {
    return favoriteToy;
  }

  public void setFavoriteToy(String favoriteToy) {
    this.favoriteToy = favoriteToy;
  }

  public int getMaintenanceLevel() {
    return maintenanceLevel;
  }

  public void setMaintenanceLevel(int maintenanceLevel) {
    this.maintenanceLevel = maintenanceLevel;
  }

  public boolean goesOutside() {
    return goesOutside;
  }

  public void setGoesOutside(boolean goesOutside) {
    this.goesOutside = goesOutside;
  }

  @Override
  public String toString() {
    return "Pet []";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Pet other = (Pet) obj;
    if (favoriteFood == null) {
      if (other.favoriteFood != null)
        return false;
    } else if (!favoriteFood.equals(other.favoriteFood))
      return false;
    if (favoriteToy == null) {
      if (other.favoriteToy != null)
        return false;
    } else if (!favoriteToy.equals(other.favoriteToy))
      return false;
    if (goesOutside != other.goesOutside)
      return false;
    if (maintenanceLevel != other.maintenanceLevel)
      return false;
    return true;
  }

}
