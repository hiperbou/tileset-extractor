package platformer.renderer;

import platformer.gl.GlRenderer;
import platformer.tmx.TileSet;

import javax.annotation.Nonnull;

/**
 * @author Andre Michelle
 */
public interface RendererContext
{
	/**
	 * @return The width of the viewport in tile-units (number of columns)
	 */
	int width();

	/**
	 * @return The height of the viewport in tile-units (number of rows)
	 */
	int height();

	/**
	 * @return The width of the map in tile-units (number of columns)
	 */
	int mapWidth();

	/**
	 * @return The height of the map in tile-units (number of rows)
	 */
	int mapHeight();

	/**
	 * @return The tile's width (map)
	 */
	int tileWidth();

	/**
	 * @return The tile's height (map)
	 */
	int tileHeight();

	/**
	 * @return The width of the viewport in pixels
	 */
	int pixelWidth();

	/**
	 * @return The height of the viewport in pixels
	 */
	int pixelHeight();

	/**
	 * @return The offset on the x-axis of the viewport in pixels
	 */
	int offsetX();

	/**
	 * @return The offset on the y-axis of the viewport in pixels
	 */
	int offsetY();

	/**
	 * @return All available tileSets
	 */
	@Nonnull
	TileSet[] tileSets();

	/**
	 * @return The ImageRenderer to render images in GL context
	 */
	@Nonnull
	GlRenderer imageRenderer();

	/**
	 * @return The currentTime for animations
	 */
	int currentTime();
}