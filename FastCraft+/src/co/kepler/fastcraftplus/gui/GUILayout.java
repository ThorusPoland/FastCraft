package co.kepler.fastcraftplus.gui;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.inventory.Inventory;

/**
 * Holds buttons and their locations.
 */
public class GUILayout {
	protected final Map<Integer, GUIButton> pendingButtons;
	protected Map<Integer, GUIButton> buttons;
	protected final GUI gui;
	
	/**
	 * Create a new InvButtonLayout.
	 */
	public GUILayout(GUI gui) {
		pendingButtons = new HashMap<Integer, GUIButton>();
		buttons = new HashMap<Integer, GUIButton>();
		this.gui = gui;
		gui.setLayout(this);
	}
	
	/**
	 * Get the button in the specified inventory slot.
	 * @param slot The inventory slot to get the button from.
	 * @return Returns the button in the specified inventory slot.
	 */
	public GUIButton getButton(int slot) {
		assert slot >= 0;
		return buttons.get(slot);
	}
	
	/**
	 * Get the button in the specified row and column.
	 * @param row The row to get the button from.
	 * @param col The column to get the button from.
	 * @return Returns the button in the specified row and column.
	 */
	public GUIButton getButton(int row, int col) {
		return getButton(getSlot(row, col));
	}
	
	/**
	 * Get the button in the specified inventory slot.
	 * This button is not yet active in the GUI.
	 * @param slot The inventory slot to get the button from.
	 * @return Returns the button in the specified inventory slot.
	 */
	public GUIButton getPendingButton(int slot) {
		assert slot >= 0;
		return pendingButtons.get(slot);
	}
	
	/**
	 * Get the button in the specified row and column.
	 * This button is not yet active in the GUI.
	 * @param row The row to get the button from.
	 * @param col The column to get the button from.
	 * @return Returns the button in the specified row and column.
	 */
	public GUIButton getPendingButton(int row, int col) {
		return getPendingButton(getSlot(row, col));
	}
	
	/**
	 * Adds a button to the layout at a given row and column.
	 * This button will not yet be active in the GUI.
	 * @param button The button to add.
	 * @param slot The slot index of the button.
	 */
	public void setPendingButton(int slot, GUIButton button) {
		assert slot >= 0;
		if (button == null) {
			pendingButtons.remove(slot);
		} else {
			pendingButtons.put(slot, button);
		}
	}
	
	/**
	 * Adds a button to the layout at a given row and column.
	 * This button will not yet be active in the GUI.
	 * @param button The button to add.
	 * @param row The row of the button.
	 * @param col The column of the button.
	 */
	public void setPendingButton(int row, int col, GUIButton button) {
		setPendingButton(getSlot(row, col), button);
	}
	
	/**
	 * Removes a button from the layout at a given row and column.
	 * The button will not yet be active in the GUI.
	 * @param row The row to remove the button from.
	 * @param col The column to remove the button from.
	 */
	public void removePendingButton(int row, int col) {
		setPendingButton(row, col, null);
	}
	
	/**
	 * Apply the button layout to an inventory.
	 * @param inv The inventory to apply the layout to.
	 */
	public void updateGUI() {
		buttons = new HashMap<Integer, GUIButton>(pendingButtons);
		Inventory inv = gui.getInventory();
		inv.clear();
		int invSize = inv.getSize();
		for (int i : buttons.keySet()) {
			GUIButton button = buttons.get(i);
			if (i >= invSize || !button.isVisible(this)) continue;
			inv.setItem(i, buttons.get(i).getItem());
		}
	}
	
	/**
	 * Get the inventory slot index given a row and a column.
	 * @param row The row to find the index of.
	 * @param col The column to find the index of.
	 * @return Returns the inventory slot index of the row and column.
	 */
	public static int getSlot(int row, int col) {
		assert 0 <= row && row < 9 && 0 <= col;
		return row * 9 + col;
	}
	
	/**
	 * Get the row and column of an inventory slot index.
	 * @param slot The slot to find the row and column of.
	 * @return Returns the row and column of a given slot index.
	 */
	public static int[] getSlotPos(int slot) {
		return new int[]{slot / 9, slot % 9};
	}
}
