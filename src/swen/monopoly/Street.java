package swen.monopoly;

/**
 * @author caihuai
 *
 */
public class Street extends Property {
  private int numHouses;
  private int numHotels;
  private int rent; // in $
  private ColourGroup colourGroup;

  /**
   * @param name
   * @param price
   * @param rent
   */
  public Street(String name, int price, int rent) {
    super(name, price);
    this.rent = rent;
    colourGroup = null;
  }

  /**
   * @param group
   */
  public void setColourGroup(ColourGroup group) {
    colourGroup = group;
  }

  /**
   * Get colour group to which this street belongs. Will return null if
   * setColourGroup not already called.
   *
   * @return the colour of group
   */
  public ColourGroup getColourGroup() {
    return colourGroup;
  }

  public int getRent() {
    return rent;
  }

  /**
   * @return number of houses
   */
  public int getHouses() {
    return numHouses;
  }

  /**
   * @return number of hotels
   */
  public int getHotels() {
    return numHotels;
  }

  /**
   * Override default equals() method.
   *
   * @param o
   * @return boolean
   */
  public boolean equal(Street o) {
    if (o instanceof Street) {
      return super.equals(o);
    }
    return false;
  }
}
