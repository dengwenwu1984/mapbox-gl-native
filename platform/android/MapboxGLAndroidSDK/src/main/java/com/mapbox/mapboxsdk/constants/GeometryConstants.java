package com.mapbox.mapboxsdk.constants;

/**
 * Contains constants used throughout the sdk classes.
 *
 * @since 6.0.0
 */
public class GeometryConstants {

  /**
   * The <a href='http://en.wikipedia.org/wiki/Earth_radius#Equatorial_radius'>equatorial radius</a>
   * value in meters
   *
   * @since 6.0.0
   */
  public static final int RADIUS_EARTH_METERS = 6378137;

  /**
   * A Mercator project has a finite longitude values, this constant represents the lowest value
   * available to represent a geolocation.
   *
   * @since 6.0.0
   */
  public static final double MIN_LONGITUDE = -180;

  /**
   * A Mercator project has a finite longitude values, this constant represents the highest value
   * available to represent a geolocation.
   *
   * @since 6.0.0
   */
  public static final double MAX_LONGITUDE = 180;

  /**
   * While on a Mercator projected map the width (longitude) has a finite values, the height
   * (latitude) can be infinitely long. This constant restrains the lower latitude value to -90 in
   * order to preserve map readability and allows easier logic for tile selection.
   *
   * @since 6.0.0
   */
  public static final double MIN_LATITUDE = -90;

  /**
   * While on a Mercator projected map the width (longitude) has a finite values, the height
   * (latitude) can be infinitely long. This constant restrains the upper latitude value to 90 in
   * order to preserve map readability and allows easier logic for tile selection.
   *
   * @since 6.0.0
   */
  public static final double MAX_LATITUDE = 90;

  /**
   * Maximum latitude value in Mercator projection.
   *
   * @since 6.0.0
   */
  public static final double MAX_MERCATOR_LATITUDE = 85.05112877980659;

  /**
   * Minimum latitude value in Mercator projection.
   *
   * @since 6.0.0
   */
  public static final double MIN_MERCATOR_LATITUDE = -85.05112877980659;

  private GeometryConstants() {
    // Private constructor to prevent initializing of this class.
  }
}
