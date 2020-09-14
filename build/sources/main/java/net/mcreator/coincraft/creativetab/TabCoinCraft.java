
package net.mcreator.coincraft.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.coincraft.item.ItemPlatinumCoin;
import net.mcreator.coincraft.ElementsCoinCraft;

@ElementsCoinCraft.ModElement.Tag
public class TabCoinCraft extends ElementsCoinCraft.ModElement {
	public TabCoinCraft(ElementsCoinCraft instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabcoincraft") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemPlatinumCoin.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
