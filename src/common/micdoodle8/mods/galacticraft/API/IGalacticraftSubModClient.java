package micdoodle8.mods.galacticraft.API;

import micdoodle8.mods.galacticraft.core.GCCoreLocalization;

public interface IGalacticraftSubModClient 
{
	public String getDimensionName();
	
	public GCCoreLocalization getLanguageFile();
	
	public String getPlanetSpriteDirectory();
	
	public IPlanetSlotRenderer getSlotRenderer();
	
	/**
	 * @return false if this submod extends another planet, true if this is a planet itself.
	 */
	public boolean isMoon();
	
	/**
	 * Used for rendering planet on map.
	 * 
	 * @return Size of the planet. Generally around 15.
	 */
	public float getPlanetSize();
	
	/**
	 * Used for rendering planet's location on the map.
	 * 
	 * @return Distance from the center of the map.
	 */
	public float getDistanceFromCenter();
	
	/**
	 * Get the sinusoidal phase shift (offset from default planet revolution) when rendering the 
	 * planet on the map.
	 * 
	 * @return Phase shift of planet for planet's revolution around the sun.
	 */
	public float getPhaseShift();
	
	/**
	 * ... AKA the year length in terms of Earth's. (e.g. Mars would return 1.88F, since it
	 * has a year of 1.88 times earth's)
	 * 
	 * @return Stretch value for planet's revolution around the sun.
	 */
	public float getStretchValue();
}
