public class CookieDistributor {

  private int numPeople;
  private int numCookies;

  public CookieDistributor() {
    this.numPeople = 0;
    this.numCookies = 0;
  }

  public CookieDistributor(int numPeople, int numCookies) {
    if (numCookies < 0) {
      this.numCookies = 0;
    }
    if (numPeople < 0) {
      this.numPeople = 0;
    }
    this.numPeople = numPeople;
    this.numCookies = numCookies;
  }

  public int getNumCookiesPerPerson() {
    return numCookies / numPeople;
  }

  public void increaseNumPeople() {
    this.numPeople += 1;
  }

  public void increaseNumPeople(int people) {
    this.numPeople = people;
  }

  public void increaseNumCookies() {
    this.numCookies += 1;
  }

  public void increaseNumCookies(int cookies) {
    this.numCookies = cookies;
  }

  public int getNumPeople() {
    return numPeople;
  }

  public void setNumPeople(int numPeople) {
    this.numPeople = numPeople;
  }

  public int getNumCookies() {
    return numCookies;
  }

  public void setNumCookies(int numCookies) {
    this.numCookies = numCookies;
  }

  @Override
  public String toString() {
    return "CookieDistributor [numCookies=" + numCookies + ", numPeople=" + numPeople + "]";
  }

}
